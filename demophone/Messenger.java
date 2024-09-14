/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demophone;

/**
 *
 * @author HP
 */
public class Messenger implements VideoCall {
    
    @Override
    public void openCamera(String camera)
    {
        System.out.println("Opening: ");
    }
    @Override
        public void call(String phoneNumber)
        {
            System.out.println("calling: "+phoneNumber);
        }
        public void Filter(String F)
        {
            System.out.println("Selecting filter: "+F);
        }

}
