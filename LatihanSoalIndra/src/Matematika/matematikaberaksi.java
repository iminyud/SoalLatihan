/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matematika;

/**
 *
 * @author hp
 */
public class matematikaberaksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           matematika m  = new matematika();
        
        m.pertambahan(20 , 20);
        m.pengurangan(10,5);
        m.perkalian(10,20);
        m.pembagian(21,2);
        
        MatematikaCanggih mc = new MatematikaCanggih();
        mc.pertambahan(12.5, 28.7, 14.2);
        mc.pertambahan(12, 28, 14);
        mc.pertambahan(23,34);
        //mcpertambahan(3.4,4.9);
       
        
    }
    
}
