package aulas.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {
        /*
        Dadas as seguintes informacoes sobre meus gatos, crie uma lista
        e ordene esta lista exibindo:
        (nome - idade - cor);

        Gato1 = nome: Jon, idade: 18, cor: preto
        Gato2 = nome: Simba, idade: 6, cor: tigrado
        Gato3 = nome: Jon, idade: 12, cor: amarelo
         */

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 18,"Preto"));
            add(new Gato("Simba", 6,"Tigrado"));
            add(new Gato("Jon", 12,"Amarelo"));
        }};
      //  System.out.println(meusGatos);

        System.out.println("Ordem de inserção");
        System.out.println(meusGatos);

        System.out.println("Ordem aleatoria:");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem natural: ");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);


        System.out.println("Ordem idade");
        Collections.sort(meusGatos,new ComparatorIdade());
        System.out.println(meusGatos);


        System.out.println("Ordem cor");
        Collections.sort(meusGatos,new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("Ordem nome/cor/idade");
        Collections.sort(meusGatos, new ComparatorNomeCorIdade());
    }
}
class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;

    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato o) {
        return this.getNome().compareToIgnoreCase(o.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato o1, Gato o2) {
        return Integer.compare(o1.getIdade(),o2.getIdade());
    }
}
class ComparatorCor implements  Comparator<Gato>{

    @Override
    public int compare(Gato o1, Gato o2) {
        return o1.getCor().compareToIgnoreCase(o2.getCor());
    }
}
class ComparatorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato o1, Gato o2) {
        int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
        if (nome != 0) return nome;
        int cor = o1.getCor().compareToIgnoreCase(o2.getCor());
        if (cor != 0) return cor;
        return Integer.compare(o1.getIdade(), o2.getIdade());
    }
}