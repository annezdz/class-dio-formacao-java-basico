package aulas.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

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


    }
}
