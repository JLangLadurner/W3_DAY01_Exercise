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

        Citie obj1 = new Citie("Klagenfurt", 20);
        Citie obj2 = new Citie("Vienna", 14);
        Citie obj3 = new Citie("Bratislava", 22);
        Citie obj4 = new Citie("Linz", 13);

        ArrayList<Citie> data = new ArrayList();

        data.add(obj1);
        data.add(obj2);
        data.add(obj3);
        data.add(obj4);

        for (Citie ct : data) {

            System.out.println("The temperature in " + ct.name + " is " + ct.temp + " C");

        }
    }
}


