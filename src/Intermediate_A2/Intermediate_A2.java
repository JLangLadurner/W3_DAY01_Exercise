package Intermediate_A2;

import java.util.ArrayList; //import for ArrayList!!
import java.util.Collections;

public class Intermediate_A2 {

    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<String>();

        animals.add("dog");
        animals.add("bird");
        animals.add("cat");
        animals.add("cow");

        for (String animal : animals) {
            System.out.println(animal);
        }

        /*animals.remove(2); //removes

        for (String animal : animals){
            System.out.println(animal);
        }*/
        /*animals.add(2,"cats");
        for (String animal : animals){
            System.out.println(animal);
        }
         animals.set(1, "birdie");

        for (String i : animals){
            System.out.println(animals);
        }*/
        System.out.println("==============");
        Collections.reverse(animals);
        for (String animal : animals){
            System.out.println(animal);
        }



    }
}
