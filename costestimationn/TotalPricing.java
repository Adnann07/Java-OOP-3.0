/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package costestimationn;

/**
 *
 * @author HP
 */
public class TotalPricing {
    public Book bookObj;
    public TotalPricing(Book bookObj)
    {
        this.bookObj=bookObj;
    }
    public void finalCost(int numberOfPages,int costPerPage)
    {
        int totalprice=numberOfPages*costPerPage;
        System.out.println(totalprice);
    }
    
}
