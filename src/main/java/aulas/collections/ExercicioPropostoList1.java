package aulas.collections;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExercicioPropostoList1 {
    public static void main(String[] args) {
        List<Double> temperaturas = new ArrayList<>();
        temperaturas.add(27.6);
        temperaturas.add(26.6);
        temperaturas.add(24.6);
        temperaturas.add(21.4);
        temperaturas.add(23.6);
        temperaturas.add(22.7);
        System.out.println(temperaturas);


        List<Temperatura> listaTemperaturas = new ArrayList<>() {
            {
                add(new Temperatura("1 - Janeiro", 27.6));
                add(new Temperatura("2 - Fevereiro", 26.6));
                add(new Temperatura("3 - Março", 24.6));
                add(new Temperatura("4 - Abril", 21.4));
                add(new Temperatura("5 - Maio", 23.6));
                add(new Temperatura("6 - Junho", 22.4));
            }};
        //  System.out.println(listaTemperaturas);

        Iterator<Temperatura> iterator = listaTemperaturas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Temperatura next = iterator.next();
            soma += next.getTemperatura();
        }
        Double mediaSemestral = (double) soma / (listaTemperaturas.size());
        System.out.println("Calcular a media semestral das temperaturas: " + soma /(temperaturas.size()));

        Iterator<Temperatura> iterator1 = listaTemperaturas.iterator();
        while(iterator1.hasNext()){
            Temperatura next = iterator1.next();
            if(next.getTemperatura() < mediaSemestral){
                iterator1.remove();            }
        }
        System.out.println(" * " + listaTemperaturas.subList(0,listaTemperaturas.size()));

        System.out.println("Temperaturas acima da media: " + temperaturas);




    }




    }


class Temperatura implements Comparable<Temperatura> {

    private String mes;
    private Double temperatura;

    public Temperatura(String mes, Double temperatura) {
        this.mes = mes;
        this.temperatura = temperatura;
    }

    public String getMes() {
        return mes;
    }

    @Override
    public String toString() {
        return "Temperatura{" +
                "mes='" + mes + '\'' +
                ", temperatura=" + temperatura +
                '}';
    }

    public Double getTemperatura() {
        return temperatura;
    }

    @Override
    public int compareTo(Temperatura o) {
        return 0;
    }
}

