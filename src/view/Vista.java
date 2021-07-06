package view;

import model.Wallet; // Asi se referencia o importa la clase Wallet desde el paquete model. Esto se crea automáticamente al autocompletar Wallet cuando se llama la clase

public class Vista {
    public static void main2(String[] args) { 

        // Crear objeto
        Wallet wallet1 = new Wallet(true,true); 
        Wallet wallet2 = new Wallet(false,false);

        // Consignar
        String saldo1 = wallet1.putSaldo(150000); 
        System.out.println(saldo1); 

        String transf1 = wallet1.transfMoney(wallet2,10000);
        System.out.println(transf1); 


    }
}
