package Basic_A0;

import java.util.ArrayList;
import java.util.Arrays;

public class Basic_A0 {

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<String>();

        cities.add("Vienna");
        cities.add("Graz");
        cities.add("Linz");
        cities.add("Wels");
        cities.add("Klagenfurt");
        cities.add("Sankt Pölten");

        System.out.println(cities);

        ArrayList<Integer> temp = new ArrayList<>();

        temp.add(10);
        temp.add(22);
        temp.add(15);
        temp.add(30);
        temp.add(32);
        temp.add(18);

        ArrayList<Object> data = new ArrayList();

        // data.addAll(cities);
        // data.addAll(temp);

        Citie object = new Citie("Klagenfurt", 20);
        Citie object2 = new Citie("Vienna", 15);

        data.add(object);
        data.add(object2);

        

        }
    }


