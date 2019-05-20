package Basic_A1;

import java.util.*;
import java.util.Collections;

public class Basic_A1 {

    public static void main (String[] args){

        ArrayList<String> cities = new ArrayList<String>();

        cities.add("Vienna");
        cities.add("Graz");
        cities.add("Linz");
        cities.add("Wels");
        cities.add("Klagenfurt");
        cities.add("Sankt Pölten");

        Collections.sort(cities);
    //prints list of cities
        for( String i :  cities){
            System.out.println(i);
        }

        cities.add(0,"Innsbruck");


        ArrayList<String> villages = new ArrayList<String>();

        villages.add("Scharzach");
        villages.add("Telfs");
        villages.add("Pfaffenhofen");

        Collections.sort(villages);

        //prints villages
        /*for(String i : villages){
            System.out.println(i);
        }*/

        ArrayList<String> joinedList  = new ArrayList<String>();

        joinedList.addAll(cities);
        joinedList.addAll(villages);

        //prints index of joindedList
        for( int i = 0; i < joinedList.size(); i++){

            System.out.println(joinedList);

        }

        for(String i : joinedList){

            System.out.println(i);

        }


    }
}
