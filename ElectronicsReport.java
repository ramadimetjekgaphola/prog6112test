/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * @author Student
 */
package com.mycompany.electronicsreport;
import java.util.*;
public class ElectronicsReport{

    public static void main(String[] args) {
    
 
    String[] cities = {"CAPE TOWN","PORT ELIZABETH","PRETORIA"};

    int[][] sales = {{1000,2000,3000},
                    {2000,3000,4000},
                    {1500,1100,1200}};
     System.out.println("------------------------");
    System.out.println("GAMING CONSOLE REPORT");
    System.out.println("-------------------------");
    System.out.println("CITY\t\tPS5\tXBOX\tSWITCH\tTOTAL");

    int[] totals = new int[(cities.length)];
        int highestTotal = 0;
        String topCity = "";

        
        for (int i = 0; i < cities.length; i++) {
            int total = 0;
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
            totals[i] = total;

          
           System.out.println(cities[i] + " " + sales[i][0] + " " + sales[i][1] + " " + sales[i][2] + " " + total);

      
            if (total > highestTotal) {
                highestTotal = total;
                topCity = cities[i];
            }
        }
        
        System.out.println("\nCITY WITH MOST SALES: " + topCity);
    }
}
