/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package costestimationn;

/**
 *
 * @author HP
 */
public class Book {
    private int numberOfPages;
    private int costPerPage;
    public Book(int numberOfPages,int costPerPage)
    {
        this.numberOfPages=numberOfPages;
        this.costPerPage=costPerPage;
    }
    public int getNumberOfPages()
    {
        return numberOfPages;
    }
    public void setNumberOfPages(int numberOfPages)
    {
        this.numberOfPages=numberOfPages;
    }
    public int getCostPerPage()
    {
        return costPerPage;
    }
    public void setCostPerPage(int costPerPage)
    {
        this.costPerPage=costPerPage;
    }
    
}
