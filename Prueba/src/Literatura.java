public class Literatura {
    //defino los atributos que se necesitaran
    String nombre;
    String genero;
    String autor;
    String pais_autor;

    int num_paginas;

    //costructores

    public Literatura(String nombre, String genero, String autor, String pais_autor, int num_paginas) {
        this.nombre = nombre;
        this.genero = genero;
        this.autor = autor;
        this.pais_autor = pais_autor;
        this.num_paginas = num_paginas;
    }
// setters and getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPais_autor() {
        return pais_autor;
    }

    public void setPais_autor(String pais_autor) {
        this.pais_autor = pais_autor;
    }

    public int getNum_paginas() {
        return num_paginas;
    }

    public void setNum_paginas(int num_paginas) {
        this.num_paginas = num_paginas;
    }

    public void Imprimir(){
        System.out.println("Titulo: "+this.nombre);
        System.out.println("Genero: "+this.genero);
        System.out.println("Autor: "+this.autor);
        System.out.println("Pais de origen: "+this.pais_autor);
        System.out.println("N. hojas: "+this.num_paginas);
    }
}





