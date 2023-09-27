package com.alexey_k;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void changeList(List<String> list){
        list.add("newLine1");
    }

    public static void main(String[] args) {
        List<String> list1 = List.of("line1", "java2", "line3", "java4");//List.of makes list IMMUTABLE
        //changeList(list1);
        System.out.println(list1);

        for (int i = 0; i < list1.toArray().length; i++){
            //System.out.println(list1.get(i));;
        }

        for (int i = 1; i <= list1.toArray().length; i++){
            var array = list1.toArray();
            //System.out.println(array[array.length - i]);;
        }

        for (int i = list1.toArray().length-1; i >= 0 ; i--){
            //System.out.println(list1.get(i));;
        }
        for (String s : list1) { //foreach
            //System.out.println(s);
        }

        int i = 0;
        while (i < list1.toArray().length){
            //System.out.println(i);
            i++;
        }

        do {
            //System.out.println(i); //do some action before while started
        }while (i < list1.toArray().length);

        for (String s : list1) {
            if (s.startsWith("j")){
                //System.out.println(s);
            }
        }

        for (String s : list1) {
            if (!s.startsWith("j")){
                continue;//after continue the NEW iteration will start, code will not reach println
            }
            System.out.println(s);
            break;//will print only first found element
        }

    }

}
