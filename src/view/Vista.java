package view;

import model.Wallet; // Asi se referencia o importa la clase Wallet desde el paquete model. Esto se crea automáticamente al autocompletar Wallet cuando se llama la clase

public class Vista {
    public static void main(String[] args) { 

        // Crear billeteras
        Wallet wallet1 = new Wallet(true); // Billetera con límite máximo de saldo = 500.000 y por tanto con tope de transacción = 200.000
        Wallet wallet2 = new Wallet(false); // Billetera sin límite máximo de saldo y sin tope de transacción.

        // Consignar en billetera 1
        String consig1 = wallet1.putSaldo(150000); // Consignar un valor inferior al límite y al tope de transacción
        System.out.println(consig1); 

        String consig11 = wallet1.putSaldo(250000); // Consignar un valor mayor al tope de transacción
        System.out.println(consig11); 

        String consig12 = wallet1.putSaldo(600000); // Consignar un valor mayor al límite
        System.out.println(consig12);    
        
        // Mostrar saldo de billetera 1
        int saldo1 = wallet1.getSaldo(); // Obtener el saldo de la billetera 1
        System.out.println(saldo1);           
       
        // Transferir de billetera 1 a billetera 2
        String transf2 = wallet1.transfMoney(wallet2,50000); // Transferir 50.000 desde la billetera 1 a la billetera 2
        System.out.println(transf2); 

        // Mostrar saldos de billetera 1 y billetera 2
        int saldo11 = wallet1.getSaldo(); // Consignar un valor mayor al límite
        System.out.println(saldo11); 

        int saldo2 = wallet2.getSaldo(); // Consignar un valor mayor al límite
        System.out.println(saldo2); 

    }
}
