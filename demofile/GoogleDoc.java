/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demofile;

/**
 *
 * @author HP
 */
public class GoogleDoc implements Editor{
    @Override
        public void openFile(String fileName)
        {
            System.out.println("opening: "+fileName);
        }
        public void changeFont(String F)
        {
            System.out.println("changing font: "+F);
        }

    
}
