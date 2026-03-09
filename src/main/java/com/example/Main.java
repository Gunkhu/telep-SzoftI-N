/*
* File: Main.java
* Author: Csorba Péter
* Copyright: 2026, Csorba Péter
* Group: Szoft I/N
* Date: 2026-03-09
* Github: https://github.com/Gunkhu/
* Licenc: MIT
*/
package com.example;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        System.out.println("Település tárolása ....");
        List<String> cityList= Solution.task01();
        Solution.printCity(cityList);
    }
}