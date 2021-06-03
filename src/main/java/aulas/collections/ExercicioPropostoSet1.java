package aulas.collections;

import java.util.*;

public class ExercicioPropostoSet1 {
    public static void main(String[] args) {
        Set<ArcoIris> meuArcoIris = new LinkedHashSet<>(){{
            add(new ArcoIris("Vermelho"));
            add(new ArcoIris("Laranja"));
            add(new ArcoIris("Amarelo"));
            add(new ArcoIris("Verde"));
            add(new ArcoIris("Azul"));
            add(new ArcoIris("Indigo"));
            add(new ArcoIris("Violeta"));
        }};

        System.out.println("*** Exiba todas as cores uma abaixo da outra: ");
        for(ArcoIris arcoIris : meuArcoIris){
            System.out.println(arcoIris.getNome());
        }
        System.out.println();
        System.out.println("*** Exiba a quantidade de cores do arco iris: " + meuArcoIris.size());
        Set<ArcoIris> listaOrdemAlfabetica = new TreeSet<>(meuArcoIris);
        System.out.println("*** Lista ordenada em ordem alfabética ***");
        for(ArcoIris arcoIris : listaOrdemAlfabetica){
            System.out.println(arcoIris.getNome());
        }
        System.out.println("*** Exiba as cores em uma ordem desordenada ");
        Set<ArcoIris> listaDesordenada = new HashSet<>(meuArcoIris);
        for(ArcoIris arcoIris : listaDesordenada){
            System.out.println(arcoIris.getNome());
        }

        System.out.println("*** Exibe a lista na ordem reversa");
        List<ArcoIris> listaInversa = new ArrayList<>(meuArcoIris);
        Collections.reverse(listaInversa);
        for(ArcoIris arcoIris : listaInversa){
            System.out.println(arcoIris.getNome());
        }

        Iterator<ArcoIris> iterator = listaOrdemAlfabetica.iterator();
        while(iterator.hasNext()){

            ArcoIris next = iterator.next();

            if(!next.getNome().startsWith("v") && !next.getNome().startsWith("V")){
                iterator.remove();
            }
        }
        System.out.println("Exiba todas as cores que iniciam com a letra V e remove as cores que não iniciam com v");

        for(ArcoIris arcoIris : listaOrdemAlfabetica){
            System.out.println(arcoIris.getNome());
        }

        System.out.println("*** Apague todo o conjunto: ");
        meuArcoIris.clear();
        System.out.println("*** Confira se o conjunto está vazio: " + meuArcoIris.isEmpty());

    }
}
class ArcoIris implements Comparable<ArcoIris>{

    private String nome;

    public ArcoIris(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "ArcoIris{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public int compareTo(ArcoIris o) {
        return this.getNome().compareTo(o.getNome());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArcoIris arcoIris = (ArcoIris) o;
        return Objects.equals(nome, arcoIris.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}

