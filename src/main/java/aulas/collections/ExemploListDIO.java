package aulas.collections;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class ExemploListDIO {


    public static void main(String[] args) {

        // Dada uma lista com 7 notas de um aluno [7,8.5,9.3,5,7,0,3.6], faça:

        System.out.println("Crie uma lista e adicione sete notas: ");

        List<Double> notas = new ArrayList<>(); //Generics(jdk 5) - Diamond Operator
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);
        System.out.println(notas);
        System.out.println(notas.toString());

        //ArrayList<Double> notas = new ArrayList<>();
        //É recomendado programar voltado para a Interface e não para a implementação
        //List<Double> notas = new ArrayList<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));
        //List<Double> notas = Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6); //Dessa forma não se pode adicionar
        //ou remover elementos.
//
//        List<Double> notas = List.of(7d,8.5,9.3,5d,7d,0d,3.6);
//        notas.add(1d);
        System.out.println("********************************************************************************");
        System.out.println("Exiba a posição a nota 5.0: " + notas.indexOf(5d));
        System.out.println("********************************************************************************");
        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4,8d);
        System.out.println(notas);
        System.out.println("********************************************************************************");
        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d),6d);
        System.out.println(notas);
        System.out.println("********************************************************************************");
        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));
        System.out.println("********************************************************************************");
//        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
//        for(Double nota : notas){
//            System.out.println(nota);
//        }
        System.out.println("********************************************************************************");
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println("********************************************************************************");
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("********************************************************************************");
        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        System.out.println("********************************************************************************");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma+=next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);
        System.out.println("********************************************************************************");
        System.out.println("Exiba a média das notas: " + soma/(notas.size()));
        System.out.println("********************************************************************************");
      //  System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println("Remova a nota 0: " + notas);
        System.out.println("********************************************************************************");
        //System.out.println("Remova a nota que está na posição 0: ");
        notas.remove(0);
        System.out.println("Remova a nota que está na posição 0: " + notas);
        System.out.println("********************************************************************************");
        //System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7d) {
                iterator1.remove();
            }
            System.out.println("Remova as notas menores que 7 e exiba a lista: " + notas);
        }
//        System.out.println("********************************************************************************");
//        System.out.println("Apague toda a lista: ");
//        notas.clear();
//        System.out.println("********************************************************************************");
//        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

        //Exercicios utilizando o LinkedList:

        System.out.println("Crie uma nova lista chamada notas 2 e" +
                "coloque todos os elementos da list ArrayList nessa nova lista: ");

        LinkedList<Double> notas2 = new LinkedList<>(notas);
        System.out.println(notas2);

        System.out.println("Mostre a primeira nota da lista sem removê-la." + notas2.getFirst());

        System.out.println("Mostre a primeira nota da nova lista removendo-a: " + notas2.remove(0));
        System.out.println(notas2);


    }
}
