package aulas.collections;

import java.util.*;

public class ExemploOrdenacaoSet {
    /*Dadas as seguintes informações sobre minhas series favoritas,
    crie um conjunto e ordene este conjunto exibindo:
    (nome - genero - tempo de episodio


     */
    public static void main(String[] args) {
        System.out.println("Ordem aleatoria");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("GOT","Fantasia",60));
            add(new Serie("Dark","Drama",60));
            add(new Serie("How I met Your Mother","Comedia",30));
        }};
        for(Serie serie: minhasSeries){
            System.out.println(serie.getNome() +" - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("**** ordem de inserção ***");
        Set<Serie> minhasSeriesLinked = new LinkedHashSet<>(){{
            add(new Serie("GOT","Fantasia",60));
            add(new Serie("Dark","Drama",60));
            add(new Serie("How I met Your Mother","Comedia",30));
        }};
        for(Serie serie: minhasSeriesLinked){
            System.out.println(serie.getNome() +" - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
        System.out.println("*** Ordem natural TreeSet");
        Set<Serie> minhasSeriesTreeSet = new TreeSet<>(minhasSeriesLinked);
        System.out.println(minhasSeriesTreeSet);

        System.out.println();
        System.out.println("*** Ordem por nome/genero/tempoEpisodio");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroEpisodio());
        minhasSeries3.addAll(minhasSeries);
        for(Serie serie : minhasSeries3) System.out.println(serie.getNome() +" - " + serie.getGenero() + " - " +
                serie.getTempoEpisodio());

        System.out.println();
        System.out.println("*** Ordenar por genero *****");
        Set<Serie> listaOrdenadaGenero = new TreeSet<>(new ComparatorGenero());
        listaOrdenadaGenero.addAll(minhasSeries);
        for(Serie serie : listaOrdenadaGenero) System.out.println(serie.getNome() +" - " + serie.getGenero() + " - " +
                serie.getTempoEpisodio());


        System.out.println();
        System.out.println("*** Ordenar por Tempo de Episodio ****");
        Set<Serie> listaOrdenadaTempo = new TreeSet<>(new ComparatorDuracao());
        listaOrdenadaTempo.addAll(listaOrdenadaGenero);
        for(Serie serie : listaOrdenadaTempo) System.out.println(serie.getNome() +" - " + serie.getGenero() + " - " +
                serie.getTempoEpisodio());

    }
}
class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nome= '" + nome + '\'' +
                ", genero= '" + genero + '\'' +
                ", tempoEpisodio= " + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(tempoEpisodio, serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie o) {
        int tempoEpisodio =  Integer.compare(this.getTempoEpisodio(),o.getTempoEpisodio());
        if(tempoEpisodio !=0) return tempoEpisodio;
         return this.getGenero().compareTo(o.getGenero());
    }
}
class ComparatorNomeGeneroEpisodio implements Comparator<Serie>{

    @Override
    public int compare(Serie o1, Serie o2) {
        int nome = o1.getNome().compareTo(o2.getNome());
        if(nome != 0) return nome;
        int genero = o1.getGenero().compareTo(o2.getGenero());
        if(genero != 0) return genero;
        return Integer.compare(o1.getTempoEpisodio(),o2.getTempoEpisodio());
    }
}

class ComparatorGenero implements Comparator<Serie>{

    @Override
    public int compare(Serie o1, Serie o2) {
        int tempo =  o1.getGenero().compareToIgnoreCase(o2.getGenero());
        if(tempo != 0) return tempo;
        int nome = o1.getNome().compareTo(o2.getNome());
        if(nome != 0) return nome;
        return o1.getGenero().compareToIgnoreCase(o2.getGenero());
    }
}

class ComparatorDuracao implements Comparator<Serie>{

    @Override
    public int compare(Serie o1, Serie o2) {
        return Integer.compare(o1.getTempoEpisodio(),o2.getTempoEpisodio());
    }
}


