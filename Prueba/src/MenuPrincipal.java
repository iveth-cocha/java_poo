
public class MenuPrincipal {
    public static void main(String[] args) {
        //cracion de instancias
        Literatura libro1=new Literatura("Cometas en el cielo","Realismo social", "Kaled Hoseini", "Siria",316);
        Literatura libro2=new Literatura("Amigo se escribe con H","Juvenil", "Elena Iturralde", "Ecuador",60);
        Literatura libro3=new Literatura("El tunel","Realismo social", "Ernesto Sabato", "Chile",120);
        Literatura libro4=new Literatura("Travesuras de una niña mala","Romance", "Vargas Llosa", "Peru",350);
        Literatura libro5=new Literatura("Sigue mi voz","Romance", "Ariana Godoy", "Venezuela",263);
//mostrar la informacion de las instancias
        System.out.println("--------Literatura--------------");
        System.out.println("1) ");
        libro1.Imprimir();
        System.out.println("2) ");
        libro2.Imprimir();
        System.out.println("3) ");
        libro3.Imprimir();
        System.out.println("4) ");
        libro4.Imprimir();
        System.out.println("5) ");
        libro5.Imprimir();

    }
}