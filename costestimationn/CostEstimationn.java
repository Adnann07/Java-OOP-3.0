/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package costestimationn;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class CostEstimationn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int numberOfPages=input.nextInt();
        int costPerPage=input.nextInt();
        Book b=new Book( numberOfPages, costPerPage);
        TotalPricing t=new TotalPricing(b);
        t.finalCost(numberOfPages, costPerPage);
    }
    
}
