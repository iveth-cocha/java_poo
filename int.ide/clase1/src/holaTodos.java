//libreria de suma
import java.util.Scanner;
public class holaTodos {

    public static void main(String[] args){
        Scanner entrada = new Scanner( System.in );
        //variables
         int a;
         int b;
         int res, men, prod;

        System.out.print( "ingrese un número: " ); //imprime
        a = entrada.nextInt(); // entrada de dato
        System.out.print( "ingrese otro número: " );
        b = entrada.nextInt();

        res=a+b;
        men=a-b;
        prod=a*b;

        System.out.printf( "La suma es %d\n", res );
        System.out.printf("La resta es %d\n", men ) ;
        System.out.printf("El producto es %d\n", prod ) ;
    }
}
