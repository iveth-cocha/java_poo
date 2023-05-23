import java.util.Scanner;

public class bucle {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int a;
        System.out.print("ingrese un número: ");
        a = entrada.nextInt();
        System.out.println("La serie es:");
        for (int i=1;i<=a;i++){
            System.out.printf("%d  ", i);
        }
        System.out.println();
    }
}

