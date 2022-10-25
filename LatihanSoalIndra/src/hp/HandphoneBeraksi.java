/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hp;

/**
 *
 * @author hp
 */
public class HandphoneBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Handphone h = new Handphone();
        
        h.hidupkan();
        h.lakukanPanggilan();
        h.kirimSMS();
        h.matikan();
    }
    
}
