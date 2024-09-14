/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demophone;

/**
 *
 * @author HP
 */
abstract class MobilePhone implements PhoneCall {
    abstract void sendSMS(String R, String msg);
    abstract void savingContacts(String name,String phoneNumber);
   
    
}
