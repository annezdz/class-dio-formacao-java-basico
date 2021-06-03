package aulas.oo.part03.encapsulamento.exemplo001;

import java.util.*;

public class Exemplo001 {

    public static void main(String[] args) {

        int cont = 0;
        Scanner leitor = new Scanner(System.in);
        List<Double> numeros = new ArrayList<>();
        for(int i = 0; i < 6; i++){
            numeros.add(leitor.nextDouble());
        }
        for(int j = 0; j < numeros.size(); j++){
            if(numeros.get(j) > 0 && numeros.get(j) != 0){
                cont++;
            }
        }
        System.out.println(cont + " valores positivos");
    }
}
