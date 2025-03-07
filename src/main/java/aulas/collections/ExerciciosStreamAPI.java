package aulas.collections;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExerciciosStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
        System.out.println("Imprima todos os elementos dessa lista de String: ");
//        numerosAleatorios.stream().forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
        //numerosAleatorios.stream().forEach(s -> System.out.println(s));
        //numerosAleatorios.forEach(System.out::println);
//        System.out.println("Pegue os 5 primeiros numeros e coloque dentro de um Set: ");
//        numerosAleatorios.stream()
//                .limit(5)
//                .collect(Collectors.toSet())
//                .forEach(System.out::println);
//        Set<String> collectSet = numerosAleatorios.stream()
//                .limit(5)
//                .collect(Collectors.toSet());

        System.out.println("Transforme esta lista de String em uma lista de numeros inteiros.");
//        numerosAleatorios.stream()
//                .map(new Function<String, Integer>() {
//                    @Override
//                    public Integer apply(String s) {
//                        return Integer.parseInt(s);
//                    }
//                });
//
//        numerosAleatorios.stream()
//                .map(Integer::parseInt)
//                .collect(Collectors.toList())
//                .forEach(System.out::println);
////    }
//        List<Integer> collectList = numerosAleatorios.stream()
//                .map(Integer::parseInt)
//                .collect(Collectors.toList());
        System.out.println("Pegue os numeros pares e maiores que 2 e coloque em uma lista");

//        List<Integer> numerosPares = numerosAleatorios.stream()
//                .map(Integer::parseInt)
//                .filter(new Predicate<Integer>() {
//                    @Override
//                    public boolean test(Integer i) {
//                        if(i % 2 == 0 && i > 2) return true;
//                        return false;
//                    }
//                }).collect(Collectors.toList());
//        System.out.println(numerosPares);
//
//        List<Integer> numerosPares = numerosAleatorios.stream()
//                .map(Integer::parseInt)
//                .filter(i -> (i % 2 == 0 && i > 2))
//                .collect(Collectors.toList());
//        System.out.println(numerosPares);
        System.out.println("Mostre a media dos numeros: ");
//        numerosAleatorios.stream()
//                .mapToInt(new ToIntFunction<String>() {
//                    @Override
//                    public int applyAsInt(String s) {
//                        return Integer.parseInt(s);
//                    }
//                });

//        numerosAleatorios.stream()
//                .mapToInt(Integer::parseInt)
//                .average()
//                .ifPresent(new DoubleConsumer() {
//                    @Override
//                    public void accept(double v) {
//                        System.out.println(v);
//                    }
//                });
//
//        numerosAleatorios.stream()
//                .mapToInt(Integer::parseInt)
//                .average()
//                .ifPresent(v -> System.out.println(v));
        System.out.println("Remova os valores impares: ");
        List<Integer> lista = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

//        lista.removeIf(new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer in) {
//                if(in % 2 == 1)return true;
//                return false;
//            }
//        });

//        lista.removeIf(in -> in % 2 == 1);
//        System.out.println(lista);

//        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante");
//        List<Integer> sublista = lista.subList(3,lista.size());
//        //System.out.println(sublista);
//
//        List<Integer> listaSemRepetidos = sublista.stream().distinct().collect(Collectors.toList());
//        System.out.println("Retirando os numeros repetidos da lista.");
//        System.out.println(listaSemRepetidos);

//        System.out.println();
//        System.out.println("Mostrar o maior valor da lista  " + Collections.max(lista));
//        System.out.println("Mostrar o menor valor da lista  " + Collections.min(lista));
          //lista.removeIf(in -> in % 2 != 1);
//        Integer total = lista.stream().mapToInt(Integer::intValue).sum();
//        System.out.println("Excluir os numeros impares e soma-los: "+ total);
//        System.out.println();
//        System.out.println("Mostre a lista na ordem numerica: ");
//        System.out.println(lista.stream().sorted().collect(Collectors.toList()));

        System.out.println("Agrupar os numeros impares e multiplos de 3 e 5 -- ");
        //String multiplos = lista.stream().filter(value -> (value % 3 == 0 || value % 5 == 0)).toString();
        System.out.println(lista.stream()
                .distinct()
                .collect(Collectors.groupingBy(p -> p % 3 == 0 || p % 5 == 0)));
    }
}
