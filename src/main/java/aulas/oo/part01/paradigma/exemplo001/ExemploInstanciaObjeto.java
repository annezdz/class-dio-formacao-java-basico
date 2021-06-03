package aulas.oo.part01.paradigma.exemplo001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ExemploInstanciaObjeto {

    public static void main(String[] args) throws IOException {
//
//        Pessoa pessoa = new Pessoa();
//
//        System.out.println(pessoa.getNome());
//        // Marco
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int valor1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int valor2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        double valor3 = Double.parseDouble(st.nextToken());

        double salary = 1 * 1;
        System.out.println("NUMBER = " + valor1);
        System.out.println("SALARY = U$ %.2F" + salary);



    }

}
