/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demophone;

/**
 *
 * @author HP
 */
public class Samsung extends MobilePhone{
    @Override
     public void sendSMS(String R, String msg)
     {
         System.out.println("Sending "+R+" message: "+msg);
     }
     @Override
    public void savingContacts(String name,String phoneNumber)
    {
        System.out.println("Saving "+name+ "Number: "+phoneNumber);
    }
    @Override
        public void call(String phoneNumber)
        {
            System.out.println("calling: "+phoneNumber);
        }

   
    
    
}
