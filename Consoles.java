/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public abstract class Consoles {
    String consoleType;
    String storeName;
    int totalSales;
    Consoles(String consoleType, String storeName, int totalSales) {
        this.consoleType = consoleType;
        
        this.storeName = storeName;
        this.totalSales = totalSales;
    }
    
    
}
