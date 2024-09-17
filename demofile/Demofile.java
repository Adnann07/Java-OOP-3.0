/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demofile;

/**
 *
 * @author HP
 */
public class Demofile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AdobeAcrobat a=new AdobeAcrobat();
        a.view("hello file");
        a.Highlight("ok");
        a.changeView(3, "max");
       GoogleDoc g=new GoogleDoc();
       g.changeFont("tokyo");
       g.openFile("abc");
    }
    
    
    
    
    
}
