package aulas.oo.part01.paradigma.exemplo001;

import java.util.Scanner;

public class SeisNumerosImpares {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int x = leitor.nextInt();
        int count = 6;
        while(count != 0){
            if(x % 2 == 1){
                System.out.println(x);
                x+=1;
                count --;
            }else{
                x+=1;
            }
        }
    }
}
