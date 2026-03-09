package com.example;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void task01(){

        List<String> cityList = new ArrayList<>();

        try(Scanner sc = new Scanner(System.in)){
            String city;
            do{
                System.out.print("Település: ");
                 city = sc.nextLine();
                 if(!city.equals("vege")){
                    cityList.add(city);
                 }
                 
            }while(!city.equals("vege"));
            System.out.println(cityList.size());

        }
    }
}
