package aulas.collections;

import java.util.*;

public class ExerciseMap1Population {
    public static void main(String[] args) {
        System.out.println("*** Crie um dicionario com dados de estados / populacao ***");
        Map<String , Double> estadosPopulacao = new HashMap<>(){{
            put("PE",9616.621);
            put("AL",3351.543);
            put("CE",9187.103);
            put("RN",3534.265);
            put("SP",46289.333);
            put("MG",21292.666);
            put("RJ",17366.189);
            put("BA",14930.634);
            put("PR",11516.840);
            put("RS",11422.973);
            put("PA",8690.745);
            put("SC",7252.502);
            put("MA",7114.598);
        }};
        System.out.println(estadosPopulacao.toString());
        System.out.println();
        System.out.println("*** Substitua a populacao do estado do RN por 3.534.165 *** ");
        estadosPopulacao.put("RN", 3534.165);
        System.out.println(estadosPopulacao.toString());
        System.out.println();
        System.out.println("Confira se o estado da PB está no dicionario, caso nao adicione PB - 4039.277");
        if(estadosPopulacao.containsKey("PB")){
            return;
        }else{
            estadosPopulacao.put("PB",4039.277);
        }
        System.out.println(estadosPopulacao.toString());
        System.out.println();
        System.out.println("*** Exiba a populacao de PB *** " + estadosPopulacao.get("PB"));
        System.out.println();
        System.out.println("*** Exiba todos os estados e suas populacoes na ordem informada ***");
        Map<String, Double> listadosPorInsercao = new LinkedHashMap<>(){{
            put("PE",9616.621);
            put("AL",3351.543);
            put("CE",9187.103);
            put("RN",3534.265);
            put("SP",46289.333);
            put("MG",21292.666);
            put("RJ",17366.189);
            put("BA",14930.634);
            put("PR",11516.840);
            put("RS",11422.973);
            put("PA",8690.745);
            put("SC",7252.502);
            put("MA",7114.598);
        }};
        System.out.println(listadosPorInsercao.toString());
        System.out.println();
        System.out.println("*** Exiba os estados e suas populacoes em ordem alfabetica *** ");
        Map<String, Double> listadoPorOrdemAlfabetica = new TreeMap<>(listadosPorInsercao);
        System.out.println(listadoPorOrdemAlfabetica.toString());
        System.out.println();
        System.out.println("*** Exiba o estado com a menor populacao e sua quantidade *** ");
        Double menosPopuloso = Collections.min(estadosPopulacao.values());
        Set<Map.Entry<String, Double>> entries = estadosPopulacao.entrySet();
        String estadoMenosPopuloso = "";

        for(Map.Entry<String, Double> entry : entries){
            if(entry.getValue().equals(menosPopuloso)){
                estadoMenosPopuloso = entry.getKey();
                System.out.println("Estado menos populoso: " + estadoMenosPopuloso + " - " + menosPopuloso);
            }
        }
        System.out.println();
        System.out.println("*** Exiba o estado com a maior populacao e sua quantidade *** ");
        Double maisPopuloso = Collections.max(estadosPopulacao.values());
        String estadoMaisPopuloso = "";

        for(Map.Entry<String, Double> entry: entries){
            if(entry.getValue().equals(maisPopuloso)){
                estadoMaisPopuloso = entry.getKey();
                System.out.println("Estado mais populoso: " + estadoMaisPopuloso + " - " + maisPopuloso);
            }
        }
        System.out.println();
        Double soma = 0d;
        Iterator<Double> iterator = estadosPopulacao.values().iterator();
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma+=next;
        }
        System.out.println(" *** Exiba a soma da populacao desses estados *** " + Math.round(soma));
        System.out.println();
        System.out.println(" *** Exiba a media da populacao desse dicionario *** "
                + Math.round(soma/estadosPopulacao.size()));
        System.out.println();
        Iterator<Double> it = estadosPopulacao.values().iterator();
        while (it.hasNext()){
            Double next = it.next();
            if(next < 4000.000){
                it.remove();
            }
        }
        System.out.println("*** Remova os estados com populacao menor que 4.000.000 ***");
        System.out.println(estadosPopulacao.toString());
        System.out.println();
        System.out.println("*** Apague o dicionario e verifique se esta vazio ***");
        estadosPopulacao.clear();
        System.out.println(estadoMaisPopuloso.isEmpty());


    }
}
