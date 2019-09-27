package banderas;

import java.util.Scanner;

public class Banderas {

    public static void main(String[] args) {
        
//        double numeroDecimal=1.5478;
//        //El numero que tenemos en la variable de arriba, 
//        //se nos mostrara con 2 decimales
//        System.out.printf("El numero es: %.2f\n", numeroDecimal);
//      
//        String saludo=String.format("El numero es: %.4f\n", numeroDecimal);
//        System.out.println(saludo);         
        

//                      //Operadores MONARIOS Aritmeticos

//        int numero = 10;
//            //incrementa 1 numero (+)
//        numero++;
//        numero++;
//            //decremeta 1 numero (-)
//        numero--;
//            //cambio de signo (+ o -)
//        numero= -numero;
//        System.out.printf("%d \n",numero);
//        
//                       //Operadores BINARIOS Aritmeticos

//        int operando1=10;
//        int operando2=5;
//        
//        int suma =operando1+operando2;
//        int resta =operando1-operando2;
//        int multiplicacion =operando1*operando2;
//        int division =operando1/operando2;
//        int resto=operando1%operando2;  //Nos saca el resto de la division
//        
//        System.out.printf("%d\n",resto);
//        
//        
//        
//                        //Operador de ASIGNACION

//        int numeroAsig=5;
//        
//        numeroAsig += 5;    //numeroAsig = numeroAsig +5;
//        System.out.printf("%d\n",numeroAsig);
//        
//        numeroAsig -= 5;    //numeroAsig = numeroAsig -5;
//        System.out.printf("%d\n",numeroAsig);
//        
//        numeroAsig *= 5;    //numeroAsig = numeroAsig *5;
//        System.out.printf("%d\n",numeroAsig);
//        
//        numeroAsig /= 5;    //numeroAsig = numeroAsig /5;
//        System.out.printf("%d\n",numeroAsig);
//        
//        numeroAsig %= 5;    //numeroAsig = numeroAsig %5;
//        System.out.printf("%d\n",numeroAsig);
//        
//        
//                        //EJEMPLO Acumulador de Bebidas

//        Scanner teclado= new Scanner(System.in);
//        
//        int factura=0;
//        System.out.println("Introduce el numero de bebida");
//        int bebidas;
//        bebidas=teclado.nextInt();
//        factura +=(bebidas*2);    //0+1
//        
//        System.out.println("Quieres otra mas?");
//        bebidas=teclado.nextInt();
//        factura +=(bebidas*2);    
//        
//        System.out.printf("Tu factura es : %d\n",factura);
        
        
                //RELACION O COMPARACION --> solo con variable BOOLEAN
        
        boolean decision = true;
        int numero1=10;
        int numero2=5;
        
        //valor1<numero2 MENOR QUE
        decision= numero1<numero2;
        System.out.println(decision);
        
        //valor1>valor2 MAYOR QUE 
        decision= numero1>numero2;
        System.out.println(decision);
        
        //valor1<=valor2 MENOR O IGUAL
        decision= numero1<=numero2;
        System.out.println(decision);
        
         //valor1>=valor2 MAYOR O IGUAL
        decision= numero1>=numero2;
        System.out.println(decision);
        
        // == comparaciones entre numeros
        decision= numero1==numero2;
        System.out.println(decision);
        
        //  != si es diferente
        decision= numero1!=numero2;
        System.out.println(decision);
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
