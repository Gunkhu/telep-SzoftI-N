/*
* File: Solution.java
* Author: Csorba Péter
* Copyright: 2026, Csorba Péter
* Group: Szoft I/N
* Date: 2026-03-09
* Github: https://github.com/Gunkhu/
* Licenc: MIT
*/
package com.example;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static List<String> task01(){
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
        }
        return cityList;
    }
    public static void printCity(List<String> cityList){
        for(String city : cityList){
            System.out.printf("%15s\n", city);
        }
    }
}
