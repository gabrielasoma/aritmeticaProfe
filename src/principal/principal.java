
package principal;

import java.util.Scanner;
import operaciones.operacion;
/*mirar el debbung , rest , static*/
/*aritmetica, el programa principal llama a otros metodos de otra clase para hacer las operaciones, solicita 2 numeros por teclado*/
public class principal {
    public static void main(String[] args) {
        
        System.out.println("Aritmetica");
        
        //declaro un tipo de clase scanner para leer los datos de entrada
        Scanner lectura = new Scanner(System.in);
        
        //declaro un objeto de clase operacion para poder acceder
        operacion arit = new operacion();
        
        System.out.println("Introduce el primer valor");     
        int a= lectura.nextInt();
        System.out.println("Introduce el segundo valor");
        int b= lectura.nextInt();
        
        int rest = arit.sumar(a,b);    
        
        System.out.println("Operacion de suma de "+a+" + "+b+ " es = "+ operacion.sumar(a,b));
        System.out.println("Operacion de resta de "+a+" - "+b+ " es = "+ operacion.resta(a,b));
        System.out.println("Operacion de mutiplicacion de "+a+" * "+b+ " es = "+ operacion.multiplicacion(a,b));
        System.out.println("Operacion de division de "+a+" / "+b+ " es = "+ operacion.division(a,b));
    }
}
