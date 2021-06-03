package aulas.oo.part03.heranca.exemplo003;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exemplo003 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int contPar = 0;
        int contImpar = 0;
        int positivo = 0;
        int negativo = 0;

        List<Integer> numeros = new ArrayList<>();
        for(int i = 0; i < 5;i++){
            numeros.add(leitor.nextInt());
        }
        for(int j = 0; j < numeros.size();j++){
            if(numeros.get(j) % 2 == 0){
                contPar++;
            }else{
                contImpar++;
            }
            if(numeros.get(j) < 0 && numeros.get(j) != 0){
                negativo++;
            }else if(numeros.get(j) > 0){
                positivo ++;
            }
        }
        System.out.println(contPar + " valor(es) par(es)");
        System.out.println(contImpar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");
    }

}
