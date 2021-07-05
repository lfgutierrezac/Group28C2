package view;

import model.Wallet; // Asi se referencia o importa la clase Wallet desde el paquete model. Esto se crea automáticamente al autocompletar Wallet cuando se llama la clase

public class Vista {
    public static void main(String[] args) { // esta línea se crea escribiendo main
        // Vamos a crear un objeto de la clase Wallet
        // Primero llamamos a Wallet y creamos el objeto llamando el constructor Wallet:
        Wallet wallet1 = new Wallet(true); // Abre un espacio de memoria para el objeto wallet 1 y se crea con el constructor Wallet(boolean)
        Wallet wallet2 = new Wallet(false); // ctr + espacio ayuda a autocompletar. Cuando se autocompleta Wallet el módulo se importa automáticamente

        String saldo1 = wallet1.putSaldo(600000); // Así se llama un método del objeto, siempre que se cree una variable se debe definir el tipo de variable, en este caso es String
        System.out.println(saldo1); // imprime los valores de la función, es decir, lo que se especifica en el return
        String retiro1 = wallet1.extSaldo(50000); // Llamar el método extSaldo para extraer dinero del objeto wallet1
        System.out.println(retiro1);
        // System.out.println(wallet1.getSaldo()); // esta linea se crea con sysout
        String limite1 = wallet1.breakLimite(false);
        System.out.println(limite1);

        String saldo2 = wallet2.putSaldo(600000);
        System.out.println(saldo2);
        // String saldo21 = wallet2.extSaldo(650000);
        // System.out.println(saldo21);
        // System.out.println( wallet2.getSaldo());
        String limite2 = wallet2.breakLimite(true);
        System.out.println(limite2);
    }
}
