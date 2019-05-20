package Advanced_A3;

import java.util.*;

public class AustrianCities {
    //research: https://www.tutorialkart.com/java/how-to-print-all-elements-of-an-arraylist-in-java/

    ArrayList<City>capitals;

    AustrianCities (ArrayList<City>capitals){
        this.capitals = capitals;
    }
    //print out name with for each loop:
    /*public void printCityNames(){
        capitals.forEach(City ->{
            System.out.println(City.cityName);
        });
    }*/

    //research: http://www.java2s.com/Code/Java/Collections-Data-Structure/SortedIterator.htm
    public void printCityNames(){
        ListIterator<City>listIterator = capitals.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next().cityName);

        }
    }

    public void printCityCitizenNumbers(){
        capitals.forEach(City ->{
            System.out.println(City.citizensNum);
        });
    }

    public void printAllCityData(){
        System.out.println("Austrian Capital Cities");
        System.out.println("======================");
        capitals.forEach(City ->{
            System.out.println(City.cityName+ "" +City.citizensNum);
        });

    }


}
