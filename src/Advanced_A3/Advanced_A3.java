package Advanced_A3;

import java.util.ArrayList;

public class Advanced_A3 {

    public static void main (String [] args){

        City ct1 = new City ("Vienna", 1800000);
        City ct2 = new City ("Innsbruck", 200000);
        City ct3 = new City ("Eisenstadt", 10000);
        City ct4 = new City ("Salzburg", 100000);
        City ct5 = new City ("Bregenz", 40000);
        City ct6 = new City ("St. Pölten", 52000);
        City ct7 = new City ("Linz", 190000);
        City ct8 = new City ("Klagenfurt", 100000);
        City ct9 = new City ("Graz", 200000);


        ArrayList<City> capitals = new ArrayList<>();

        capitals.add(ct1);
        capitals.add(ct2);
        capitals.add(ct3);
        capitals.add(ct4);
        capitals.add(ct5);
        capitals.add(ct6);
        capitals.add(ct7);
        capitals.add(ct8);
        capitals.add(ct9);

        for(City capital : capitals){
            System.out.println("The city name is "+capital.cityName + " and it has " + capital.citizensNum+ " citizens");
        }






    }
}
