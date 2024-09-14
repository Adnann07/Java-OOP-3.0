/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demophone;

/**
 *
 * @author HP
 */
public class DemoPhone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Samsung s=new Samsung();
        s.call("12345678");
        s.savingContacts("adnan", "123");
        s.sendSMS("adnan", "hello");
        Messenger m=new Messenger();
        m.Filter("tokyo");
        m.call("emon");
        m.openCamera("back camera");
    }
    
}
