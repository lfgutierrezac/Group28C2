package model; // model es un paquete, si Wallet se cambia de folder cambia el nombre del paquete al nombre del folder

public class Wallet { //vamos a manejar esta clase como una alcancía o cuenta de banco
    public static final int LIMITE_BILLETERA = 500000; // las constantes son públicas y static permite funcionar sin depender tanto de los objetos, final es la palabra que permite crear una constante, siempre se nombran en mayúscula
    public static final String TIPO_BILLETERA = "Personal";
    /**
     * Attributes
     * Nombre del cliente
     * Saldo
     * Interés Anual
     * Numero de cuenta
     * 
     */
    private int saldo; // recordar que los atributos son privados
    private boolean tieneLimite; // servirá para saber si mi billetera tiene un límite
    private double meta;

    // Contructor: sirve para crear los objeto sy permite funcionar de acuerdo a como la clase dice que debe funcionar
    public Wallet(boolean limite) { // usar ctor para crear esta línea de código, dentro de paréntesis van los parámetros a los cuales hay que definirle el tipo de dato
        super();
        saldo = 0; // recien creada la billetera el saldo sera "cero"
        tieneLimite = limite;
        meta = 0;
    }

    // Leer el saldo con una función o método, que por lo general son públicos
    public int getSaldo(){ // el tipo int es el tipo de valor que debe retornar la función, get es para traer valores y set para vambiar valores
        return saldo;
    } 

    // verificar meta
    public boolean verificarMeta(){
        if (saldo >= meta && meta > 0) {
            return true;
        }
        return false;
    }

    // Agregar saldo (consignar)
    public String putSaldo(int valor){
        if (saldo + valor > LIMITE_BILLETERA && tieneLimite) { // Evaluamos si la suma del saldo y el nuevo valor y existe un limite de saldo entonces no se puede almacenar el nuevo valor
            return "No puede superar el límite";
        }
        saldo += valor; // Si no se cumple la condición anterior salta a esta línea, en otros casos se requeriría un else
        if (verificarMeta()) {
            meta = 0;
            System.out.println("Ha superado la meta!");
        }
        return "Operación exitosa, el nuevo saldo es: " + saldo;
    }

    // Definir meta de ahorro
    public String definirMeta(int valor){
        if (tieneLimite && LIMITE_BILLETERA < valor){
            return "Error, la meta supera el límite";
        }
        if (valor <= 0) {
            return "El valor ingresado no es válido";
        }
        if (valor <= saldo) {
            return "Ya ha superado este valor";       
        }
        meta = valor;
        return "Nueva meta agregada!";
    }
    
    // Sacar dinero de la billetera

        public String extSaldo(int valor){ // retirar y si el saldo es menor a lo que se se quiere retirar no se puede retirar
            if (saldo - valor < 0){
                return "Saldo insuficiente, monto máximo: " + saldo;
            }
            saldo -= valor;
            return "Operación exitosa, nuevo saldo: " + saldo;
        }

        public String extMoney(int valor){ // retirar y si el saldo es menor a lo que se se quiere retirar lo que hay disponible
            if (valor > saldo){
                int saldoAnterior = saldo; // variable temporal para almacenar el saldo disponible que puede retirarse
                saldo = 0;
                return "Solo retiró: " + saldoAnterior + ". Nuevo saldo: " + saldo;
            }
            saldo -= valor;
            return "Operación exitosa, nuevo saldo: " + saldo;
        } 

    // Romper el límite le cuestra 10.000 (cambiar limite de true a false)
        public String breakLimite(){
            if (!tieneLimite){
                return "Error. Su cuenta no tiene límite.";
            }
            if (saldo >= 10000){
                tieneLimite = true;
                saldo -= 10000;
                return "Cambio exitoso. Nuevo saldo: " + saldo;
            }
            return "El cambio no es posible, saldo insuficiente";
        }
    
        


// https://github.com/marcof90/grupo88c2
// https://github.com/marcof90/grupo88c2.git

/**
 * public  String  breakLimit(int valor){
        if(saldo+valor > LIMITE_BILLETERA && tieneLimite)
            {
               if(saldo>=10000){
                tieneLimite=false;
                saldo=valor-10000;
                return  "SU NUEVO SALDO ES " + saldo;
               }
                
                return  "NO PUEDE SUPERAR EL LIMITE";
            }
        else{
            saldo+=valor;
            return "Operación exitosa, nuevo saldo" + saldo;
        }
    }
 */
}
