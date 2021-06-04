package aulas.collections;

import java.util.*;

public class ExemploMapOrdenacao {
    public static void main(String[] args) {
        System.out.println("Ordem Aleatoria");

        Map<String, Livro> meusLivros = new HashMap<>() {{
            put("Hawking, Stephen", new Livro("Uma breve historia do tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do habito", 408));
            put("Haraki, Yuval Noah", new Livro("21 licoes para o seculo 21", 432));
            put("Haraki, Yuval Noah", new Livro("21 licoes para o seculo 21", 432));
            put("Martin, Robert", new Livro("Clean Code", 457));
            put("Gundecha, Unmesh", new Livro("Selenium WebDriver 3 - Practical Guide", 280));

        }};
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println();
        System.out.println("Ordem de inserção ");
        Map<String, Livro> livrosOrdenadosInsercao = new LinkedHashMap<>() {{
            put("Hawking, Stephen", new Livro("Uma breve historia do tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do habito", 408));
            put("Haraki, Yuval Noah", new Livro("21 licoes para o seculo 21", 432));
        }};
        for (Map.Entry<String, Livro> livro : livrosOrdenadosInsercao.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println();
        System.out.println("*** Ordem alfabetica autores ***");
        Map<String, Livro> ordenadoOrdemAlfabetica = new TreeMap<>(livrosOrdenadosInsercao);
        for (Map.Entry<String, Livro> livro : ordenadoOrdemAlfabetica.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue());

        System.out.println();
        System.out.println("*** Ordem alfabetica nomes dos livros ***");
        Set<Map.Entry<String, Livro>> ordenaOrdemAlfabetica = new TreeSet<>(new ComparatorNome());
        ordenaOrdemAlfabetica.addAll(meusLivros.entrySet());
        System.out.println(ordenaOrdemAlfabetica);

        System.out.println();
        System.out.println("*** Ordem por paginas ***");
        Set<Map.Entry<String, Livro>> ordenaPorPagina = new TreeSet<>(new ComparatorPaginas());
        ordenaPorPagina.addAll(meusLivros.entrySet());
        System.out.println(ordenaPorPagina);

    }

}
