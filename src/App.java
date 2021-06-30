public class App { // public quiere decir que esta clase puede referenciarse desde otras partes del programa
    // Crear atributos: por lo general estos son privados y se especifica el tipo de dato y el nombre de la variable:
    private String nombre;
    private int edad;
    private double estatura;
    private float peso;
    private char inicial;
    private String direccionVivienda;

    public static void main(String[] args) throws Exception { 
        // void permite que las funciones no retornen un valor
        // static tiene que ver con como se puede acceder a las funciones
        // throws Exceptions quiered decir que puede lanzar excepciones
        System.out.println("Hello, World!"); // esta linea es para imprmir

        // Operadores aritméticos:
        int resultado = 5 + 4;
        double resultado2 = 5 / 4;
        double resultado3 = 12 % 4;
        resultado++; // Incremento: es igual a resultado = resultado + 1
        resultado--; // Decremento: es igual a resultado = resultado - 1
        resultado = -resultado; // significa que se niega el valor (el valor se vuelve negativo, multiplicarlo por -1)
        resultado = +resultado; // significa que se pone positivo el valor

        // Operadores lógicos
        boolean respuesta = 5 > 4;
        respuesta = 25 != 12;
        respuesta = true;
        respuesta = 15 > 12 && 5 < 2; // and
        respuesta = 15 > 12 || 5 < 2; // or
        // Operadores Bit a bit
        //&
        //^ puerta XOR
        //|
        //-----------------------------------------

        //Estructuras de control
        if (respuesta) {
            // Es lo que se va a ejecutar si se cumple la condición "respuesta"
        }
        if (respuesta) {
            // Es lo que se va a ejecutar si se cumple la condición "respuesta"            
        } else {
            // Es lo que se va a ejecutar si no se cumple la condición "respuesta"   
        }

        int valor = 3;
        // switch es como hacer un if anidado
        switch (valor) {// valor es el valor que se quiere
            case 1: // si valor es == 1 se evalua el bloque de código
                // bloque de código
                break;
            case 2: // si valor es == 2 se evalua el bloque de código
                // bloque de código
                break;       
            default:
                break;
        }
        //Ciclos o bucles
        while (valor != 3) { // entre paréntesis se escribe la condición
            //bloque de código que se ejecuta mientras la condición se cumple    
        }
        do {
            //bloque de código
        }   while (valor != 3) 
                // bloque de código
            
        for (String string : args) { //en una lista "args"va a tomar cada elemento "string"
            //bloque de código
        }
        for (int i = 0; i < args.length; i++) {// (declara variable; condición; incremento)
            //bloque de código que se ejecuta mientras se cumple la condición     
        }
        for(;;){} // este es un for infinito, se ejecutará por siempre
    }   
}
