public class Menu {
    public static void main(String[] args) {
        //toda la inofrmcion se define en formlas, esos valores se usarona para explicar entre publico y privado
        figuras2D miFigura=new figuras2D(4,2);//defaul
        figuras2D miFigura2=new figuras2D(3,5);//default
        miFigura.setLado(6);//ingreso el valor que doy y con el cual se hacen los calculos
        miFigura2.setLado(3);
        System.out.println("----Cuadrado----");
        System.out.println(miFigura.areaCuadrado(7));
        System.out.println(miFigura.perimetroCuadrado());
        System.out.println("----Triangulo----");
        System.out.println(miFigura2.areaTriangulo());
        System.out.println(miFigura2.perimetroTriangulo());

    }

}
