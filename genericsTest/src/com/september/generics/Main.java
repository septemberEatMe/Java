package com.september.generics;
import java.util.*;

/**
 * @author Vitalii September
 * В Джавке 5 использовали Массивы и приведение типов
 * С дженериками стало легче тперь тип приводится автоматически
 */

public class Main {
    public static void main(String[] args) {
        //==============Так было до Java 5=========================
        List interMilan = new ArrayList();
        interMilan.add("Icardi");
        interMilan.add("Handanovich");
        interMilan.add("Barella");
        interMilan.add(123.2);

        String name = (String) interMilan.get(0); //каждый раз необходимо использовать приведение типа

        System.out.println(name);
        System.out.println();

        //=========
        List <String> forzaInter = new ArrayList<>();
        forzaInter.add("Nicola Barella");
        //Треню триксы из питона
        String [] stalkers = "Pazza Inter Amala".split(" ");
        for (String s : stalkers)
            forzaInter.add(s); // из массива сталкерс добавим в forzaInter

        String nameF = forzaInter.get(0);
        System.out.println(nameF + " Этот элемент хранится в forzainter.get(0)");
        System.out.println();

        for (String s: forzaInter)
            System.out.println(s);
        //reverse string Аеее without StringBuilder and
        char[] reverse = forzaInter.get(0).toCharArray();
        for (int i = reverse.length -1 ;i >= 0; i--)
            System.out.print(reverse[i]);

        //reverse string with StringBuilder
        StringBuilder as = new StringBuilder();
        String st = "REVRSEMEPLEASE";
        as.append(st);
        System.out.println();
        System.out.println(as.reverse());
    }

}

