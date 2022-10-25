/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

/**
 *
 * @author hp
 */
public class Bank {
    int saldo;
    void simpanUang(int sld){
        saldo = saldo + sld;
        System.out.println("Saldo saat ini : Rp." +saldo);
    }
     void ambilUang(int sld){
        saldo = saldo - sld;
        System.out.println("Saldo saat ini : Rp." +saldo);
    }
     void getSaldo(int sld){
        System.out.println("Saldo saat ini : Rp." +saldo);
    }

    void getSaldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
