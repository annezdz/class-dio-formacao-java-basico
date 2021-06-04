package aulas.collections;

import java.util.*;

public class ExercicioSetDIOOrdenacao {
    public static void main(String[] args) {

        System.out.println("Ordem aleatoria");
        Set<Linguagens> minhasLinguagens = new HashSet<>(){{
            add(new Linguagens("Java",1995,"Intellij"));
            add(new Linguagens("C#",2000,"Rider"));
            add(new Linguagens("Python",1989,"PyCharm"));
            add(new Linguagens("Kotlin",2017,"Intellij/Android"));
            add(new Linguagens("Go",2009,"GoLand/Android"));

        }};
        for(Linguagens linguagens : minhasLinguagens){
            System.out.println(linguagens.getNome() + " - " + linguagens.getAno() + " - " + linguagens.getIde());
        }
        System.out.println("**** Ordem de Insercao ***");
        Set<Linguagens> ordemInsercao = new LinkedHashSet<>(){{
            add(new Linguagens("Java",1995,"Intellij"));
            add(new Linguagens("C#",2000,"Rider"));
            add(new Linguagens("Python",1989,"PyCharm"));
        }};
        for(Linguagens linguagens : ordemInsercao){
            System.out.println(linguagens.getNome() + " - " + linguagens.getAno() + " - " + linguagens.getIde());
        }

        System.out.println();
        System.out.println("*** Ordem natural ***");
        Set<Linguagens> listaOrdemNatural = new TreeSet<>(ordemInsercao);
        for(Linguagens linguagens : listaOrdemNatural){
            System.out.println(linguagens);
        }
        System.out.println();
        System.out.println("*** Ordena por IDE *** ");
        Set<Linguagens> ordenaPorIde = new TreeSet<>(new ComparatorIde());
        ordenaPorIde.addAll(minhasLinguagens);
        for(Linguagens linguagens : ordenaPorIde){
            System.out.println(linguagens);
        }

        System.out.println();
        System.out.println("*** Ordena por ano de criação e nome ***");
        Set<Linguagens> ordenaPorAnoENome = new TreeSet<>(new ComparatorAnoNome());
        ordenaPorAnoENome.addAll(minhasLinguagens);
        for(Linguagens linguagens : ordenaPorAnoENome){
            System.out.println(linguagens);
        }
        System.out.println();
        System.out.println("*** Ordena por nome, ano de criação e IDE");
        Set<Linguagens> ordenaPorNomeAnoIde = new TreeSet<>(new ComparatorNomeAnoIde());
        ordenaPorNomeAnoIde.addAll(minhasLinguagens);
        for(Linguagens linguagens : ordenaPorNomeAnoIde){
            System.out.println(linguagens);
        }
    }
}

class Linguagens implements Comparable<Linguagens> {

    private String nome;
    private Integer ano;
    private String ide;

    public Linguagens(String nome, Integer ano, String ide) {
        this.nome = nome;
        this.ano = ano;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAno() {
        return ano;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public String toString() {
        return "Linguagens{" +
                "nome='" + nome + '\'' +
                ", ano='" + ano + '\'' +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Linguagens that = (Linguagens) o;
        return Objects.equals(nome, that.nome) && Objects.equals(ano, that.ano) && Objects.equals(ide, that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, ano, ide);
    }

    @Override
    public int compareTo(Linguagens o) {
        return this.getNome().compareTo(o.getNome());
    }
}

class ComparatorIde implements Comparator<Linguagens>{

    @Override
    public int compare(Linguagens o1, Linguagens o2) {
        return o1.getIde().compareToIgnoreCase(o2.getIde());
    }
}

class ComparatorAnoNome implements Comparator<Linguagens>{

    @Override
    public int compare(Linguagens o1, Linguagens o2) {
        int ano = Integer.compare(o1.getAno(),o2.getAno());
        if(ano != 0 )return ano;
        return o1.getNome().compareToIgnoreCase(o2.getNome());
    }
}

class ComparatorNomeAnoIde implements Comparator<Linguagens>{

    @Override
    public int compare(Linguagens o1, Linguagens o2) {
        int nome = o1.getNome().compareTo(o2.getNome());
        if(nome !=0 ) return nome;
        int ano = Integer.compare(o1.getAno(),o2.getAno());
        if(ano != 0) return ano;
        return o1.getIde().compareTo(o2.getIde());
    }
}