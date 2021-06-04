package aulas.collections;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
        /*Dado os modelos dos carros e seus respectivos consumos na estrada, faça:
        modelo = gol - consumo = 14,4 km/l
        *
        * */
        /* Map carrosPopulares2020 = new HashMap(); Antes do Java 5
        Map<String, Double> carrosPopulares = new HashMap<>(); Diamond Generics jdk5
        HashMap<String, Double> carrosPopulares = new HashMap<>();
        Map<String,Double> carrosPopulares2020 = Map.of("gol",14.4,"uno",15.7);
        * */
        System.out.println("Crie um dicionario que relacione os modelos e seus respectivos consumos:");
        Map<String , Double> carrosPopulares = new HashMap<>(){{
            put("gol",14.4);
            put("uno",15.6);
            put("mobi",16.1);
            put("hb20",14.5);
            put("kwid",15.6);
        }};
        System.out.println(carrosPopulares.toString());
        System.out.println();
        System.out.println("*** Subsitua o consumo do gol por 15,2 km/l  ***");
        carrosPopulares.put("gol",15.2);
        System.out.println(carrosPopulares.toString());
        System.out.println();
        System.out.println("*** Confira se o modelo Tucson está no dicionário:  ***"
                + carrosPopulares.containsKey("tucson"));
        System.out.println();
        System.out.println("*** Exiba o consumo do Uno *** " + carrosPopulares.get("uno"));
        System.out.println();
        //System.out.println("*** Exiba o terceiro modelo adicionado: ***");Não tem como fazer no Map
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println("*** Exiba os modelos: *** " + modelos);
        System.out.println();
        System.out.println("*** Exiba os consumos dos carros: *** ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);
        System.out.println();
        System.out.println("*** Exiba o modelo mais economico e seu consumo: *** ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for(Map.Entry<String, Double> entry: entries){
            if(entry.getValue().equals(consumoMaisEficiente)){
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }



    }
}
