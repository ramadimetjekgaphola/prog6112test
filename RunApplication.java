/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */

    import java.util.Scanner;
    
    
public class RunApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter console type: ");
        String type = sc.nextLine();
        System.out.print("Enter store name: ");
        String store = sc.nextLine();
        System.out.print("Enter total sales: ");
        int sales = sc.nextInt();
        ConsoleSales sale = new ConsoleSales(type, store, sales);
        sale.printReport();
    }
}
    

