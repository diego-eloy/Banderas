package banderas;
public class Banderas {

    public static void main(String[] args) {
        
        double numeroDecimal=1.5478;
        //El numero que tenemos en la variable de arriba, 
        //se nos mostrara con 2 decimales
//        System.out.printf("El numero es: %.2f\n", numeroDecimal);
//        
//        String saludo=String.format("El numero es: %.4f\n", numeroDecimal);
//        System.out.println(saludo); 
//        
        
        
        //Operadores MONARIOS Aritmeticos
        int numero = 10;
            //incrementa 1 numero (+)
        numero++;
        numero++;
            //decremeta 1 numero (-)
        numero--;
            //cambio de signo (+ o -)
        numero= -numero;
        System.out.printf("%d \n",numero);
        
        //Operadores BINARIOS Aritmeticos
        int operando1=10;
        int operando2=5;
        
        int suma =operando1+operando2;
        int resta =operando1-operando2;
        int multiplicacion =operando1*operando2;
        int division =operando1/operando2;
        int resto=operando1%operando2;  //Nos saca el resto de la division
        
        System.out.printf("%d\n",resto);
        
        
        
        //Operador de ASIGNACION
        int numeroAsig=5;
        
        numeroAsig += 5;    //numeroAsig = numeroAsig +5;
        System.out.printf("%d\n",numeroAsig);
        
        numeroAsig -= 5;    //numeroAsig = numeroAsig -5;
        System.out.printf("%d\n",numeroAsig);
        
        numeroAsig *= 5;    //numeroAsig = numeroAsig *5;
        System.out.printf("%d\n",numeroAsig);
        
        numeroAsig /= 5;    //numeroAsig = numeroAsig /5;
        System.out.printf("%d\n",numeroAsig);
        
        numeroAsig %= 5;    //numeroAsig = numeroAsig %5;
        System.out.printf("%d\n",numeroAsig);
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
