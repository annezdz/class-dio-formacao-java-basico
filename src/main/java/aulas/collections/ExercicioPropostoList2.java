package aulas.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioPropostoList2 {

    public static void main(String[] args) {
        List<String> questions = new ArrayList<>();
        questions.add("Telefonou para a vitima?");
        questions.add("Esteve no local do crime?");
        questions.add("Mora perto da vitima?");
        questions.add("Devia para a vitima?");
        questions.add("Ja trabalhou com a vitima?");
        System.out.println("Responda as perguntas com S ou N ");
        System.out.println(questions);
        Scanner scanner = new Scanner(System.in);
        List<String> respostas = new ArrayList<>();
        for(int i  = 0; i < questions.size();i++){
            String resposta = scanner.next();
            respostas.add(resposta);
        }
        int count = 0;
        Iterator<String> iterator = respostas.iterator();
        while (iterator.hasNext()){
            String it = iterator.next();
            if(it.startsWith("s")|| it.startsWith("S")){
                count++;
            }
        }
        switch (count){
            case 2:
                System.out.println("Suspeita");
                break;
            case 3:
            case 4:
                System.out.println("Cumplice");
                break;
            case 5:
                System.out.println("Assassino");
                break;
            default:
                System.out.println("Inocente");
        }
    }

}
