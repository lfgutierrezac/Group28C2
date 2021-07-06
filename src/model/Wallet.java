package model; 

public class Wallet { 
    public static final int LIMITE_BILLETERA = 500000; // límite establecido para la billetera
    public static final int TOPE_TRANSACCION = 200000; // tope máximo para consignaciones y retiros

    private int saldo; 
    private boolean tieneLimite; // servirá para saber si mi billetera tiene un límite
    private double meta; // servirá para definir una meta de ahorro
    private boolean topeTransaccion; 

    // Contructor
    public Wallet(boolean limite, boolean tope) { 
        saldo = 0; // recien creada la billetera el saldo sera "cero"
        tieneLimite = limite; // al crear el objeto de la calse Wallet se definirá si la billetera tendrá límite
        meta = 0; // recien creada la billetera la meta sera "cero"
        topeTransaccion = tope;
    }

    // Leer el saldo 
    public int getSaldo(){ 
        return saldo;
    } 

    // Definir meta de ahorro
    public String definirMeta(int valor){
        if (tieneLimite && LIMITE_BILLETERA < valor){ // evalúa si se ha establecido un límite y si este es menor al valor de la meta requerido
            return "La meta supera el límite";
        }
        if (valor <= 0) { // evalúa si el valor de la meta es nulo o negativo
            return "El valor ingresado no es válido";
        }
        if (valor <= saldo) { // evalúa si el valor de la meta es menor al saldo actual
            return "Ya ha superado este valor";       
        }
        meta = valor; // Si ninguna de las condiciones actuales se cumple entonces se establece la meta = valor
        return "Nueva meta agregada!";
    }

    // verificar meta
    public boolean verificarMeta(){
        if (saldo >= meta && meta > 0) { // evalua si la meta se ha cumplido y si es mayor que "cero"
            return true;
        }
        return false;
    }

    // Agregar saldo (consignar)
    public String putSaldo(int valor){
        if (valor > TOPE_TRANSACCION && tieneLimite && topeTransaccion){
            return "No puede superar el valor máximo de transacción: " + TOPE_TRANSACCION;
        }
        if (saldo + valor > LIMITE_BILLETERA && tieneLimite) { // Evaluamos si la suma del saldo y el nuevo valor supera el límite y si existe un limite de saldo
            return "No puede superar el límite: " + LIMITE_BILLETERA;
        }
        saldo += valor; // Si no se cumple la condición anterior se agrega el valor consignado al saldo
        if (verificarMeta()) { // se evalúa si se ha cumplido la meta de ahorro
            meta = 0; // se establece la meta nuevamente en "cero"
            System.out.println("Ha superado la meta!");
        }
        return "Operación exitosa, el nuevo saldo es: " + saldo;
    }
  
    // Sacar dinero de la billetera (retirar)
    public String extMoney(int valor){ // retirar. Si el saldo es menor a lo que se se quiere retirar no se puede retirar
        if (valor > TOPE_TRANSACCION && tieneLimite && topeTransaccion){
            return "No puede superar el valor máximo de transacción: " + TOPE_TRANSACCION;
        }
        if (saldo - valor < 0){
            return "Saldo insuficiente, monto máximo: " + saldo;
        }
        saldo -= valor;
        return "Operación exitosa, nuevo saldo: " + saldo;
    }

    public String extSaldo(int valor){ // retirar. Si el saldo es menor a lo que se se quiere entonces retirar el saldo disponible
        if (valor > saldo){
            int saldoAnterior = saldo; // variable temporal para almacenar el saldo disponible que puede retirarse
            saldo = 0;
            return "Solo retiró: " + saldoAnterior + ". Nuevo saldo: " + saldo;
        }
        saldo -= valor;
        return "Operación exitosa, nuevo saldo: " + saldo;
    } 

    // Transferir dinero
    public String transfMoney(Wallet wallet, int valor){
        if (valor > TOPE_TRANSACCION && tieneLimite && topeTransaccion){
            return "No puede superar el valor máximo de transacción: " + TOPE_TRANSACCION;  
        }
        if (saldo - valor < 0){
            return "Saldo insuficiente, monto máximo: " + saldo;
        }
        wallet.saldo += valor;
        saldo -= valor;
        return "Operación exitosa";   
    }

    // Romper el límite le cuestra 10.000 (cambiar limite de true a false)
    public String breakLimite(){
        if (!tieneLimite){
            return "Su cuenta no tiene límite.";
        }
        if (saldo >= 10000){
            tieneLimite = true;
            saldo -= 10000;
            return "Cambio exitoso. Nuevo saldo: " + saldo;
        }
        return "El cambio no es posible, saldo insuficiente";
    }
}
