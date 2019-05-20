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

        for (String i : animals) {
            System.out.println(animals);
        }

        animals.remove(2); //removes

        for (String i : animals){
            System.out.println(animals);
        }
        animals.add(2,"cats");
        for (String i : animals){
            System.out.println(animals);
        }
         animals.set(1, "birdie");

        for (String i : animals){
            System.out.println(animals);
        }

        Collections.reverse(animals);
        for (String i : animals){
            System.out.println(animals);
        }



    }
}
