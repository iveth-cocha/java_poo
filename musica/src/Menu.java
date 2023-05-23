import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //objetos
        Genero generoa=new Genero("rock","120bpm",1950,"USA","Chuck Berry","Festival de California");
        Genero jazz=new Genero("jazz","853bpm",1920,"USA","Nina Simone","Festival de JAZZ");
        Genero generod=new Genero("pop","153bpm",200,"USA","Lady Gaga","Festival de Pop");
        Genero bachata=new Genero("bachata","897bpm",2005,"Cuba","Romeo Santos","Festival de bachata");
        Genero generof=new Genero("pasillo","123bpm",1990,"Ecuador","Julio Jaramillo","Pasillo Ecuatoriano");


        //selecciono el de rojo(uso get)
        System.out.println(jazz.getAnio());
        System.out.println(generoa.getAnio());
        System.out.println(bachata.getAnio());
        //suma de años
        System.out.println(jazz.getAnio()+generoa.getAnio()+bachata.getAnio());
        System.out.println("----------------------------------------------------");
        //uso de set
        System.out.println("Ingrese el año de origen del jazz: ");
        int aniotem=sc.nextInt();
        jazz.setAnio(aniotem);
        System.out.println();

        System.out.println("----------------------------------------------------");
        //imprimir por punteros
        generof.imprimirDatos();
        System.out.println("*******");
        jazz.imprimirDatos();



    }
}
