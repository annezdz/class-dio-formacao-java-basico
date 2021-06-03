package aulas.collections;

import java.util.*;

public class ExemploSetDIO {

    /*
    Set notas = new HashSet(); // antes do Java 5
    HashSet<Double> notas = new HashSet<>();
    Set<Double> notas = new HashSet<>(); Generics (jdk 5) Diamond operator
    Set<Double> notas = Set.of(7d,8.5,9.3,5d,7d,0d,3.6);
     */

    public static void main(String[] args) {
        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));
        System.out.println(notas);
        //System.out.println("*** Exiba a posição da nota 5: ************"); não tem o método indexof
        //System.out.println("*** Adicione na lista a nota 8.0 na posição 4: ");não tem como fazer pois não usa posições
        //System.out.println("*** Substitua a nota 5.0 pela nota 6.0"); não tem como fazer pois não tem o método set
        System.out.println("*** Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));
        //System.out.println("*** Exiba a terceira nota adicionada");Não tem como fazer pois não tem o método get
        System.out.println("*** Exiba a menor nota: " + Collections.min(notas));
        System.out.println("*** Exiba a maior nota: " + Collections.max(notas));
        Iterator<Double> iterator= notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma+=next;
        }
        System.out.println("*** Exiba a soma dos valores : " + Math.round(soma));
        System.out.println("*** Exiba a media das notas :" + Math.round(soma/(notas.size())));
        notas.remove(0d);
        System.out.println("*** Remova a nota 0: " + notas);
        System.out.println("*** Remova a posição 0");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7d){
                iterator1.remove();
            }
        }
        System.out.println("*** Remova as notas menores que 7 e exiba a lista: " + notas);
        System.out.println("*** Exiba todas as notas na ordem em que foram informadas:");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);
        System.out.println("*** Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2); /* o TreeSet já ordena.
        Isso dá certo pois o Double tem o Comparator, se fosse um objeto sem a extensão do Comparator não funcionaria*/
        System.out.println(notas3);
        System.out.println("*** Apague todo o conjunto: ");
        notas.clear();
        System.out.println("Confira se o conjunto esta vazio: " + notas2.isEmpty());




    }
}
