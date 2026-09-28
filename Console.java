/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */

    public abstract class Console extends Consoles implements IConsoles {
    public Console(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales);
    }
    public String getConsoleType() { return consoleType; }
    public String getStore() { return storeName; }
    public int getTotalSales() { return totalSales; }
}
    

