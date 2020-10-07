package Uf1;

import java.io.File;

public class Ejemplo2 {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Creacion de ficheros");
        File libro = new File("/home/dam2a/Escriptori/libro.xml");
        System.out.println("nombre"+libro.getName());
        System.out.println("Directorio Padre:" + libro.getParent());
        System.out.println("Ruta absoluta:" + libro.getAbsolutePath());


        System.out.println();
        System.out.println("Existe un fichero llamado libro.xml??");
        System.out.println("Existe?"+libro.exists());

    }
}
