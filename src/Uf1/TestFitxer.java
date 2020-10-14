package Uf1;

import java.io.File;
import java.util.Scanner;

public class TestFitxer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la direccion del fichero:");
        String ruta = sc.nextLine();
        File f = new File(ruta);
        String nombreDelFichero;
        boolean existe=false;

        while (!existe)
        if(f.exists()){
            existe=true;
            nombreDelFichero=("Fichero: "+ f.getName());
            System.out.println(nombreDelFichero);
            System.out.println(f.getParent());
            System.out.println("Es un directorio: " + f.isDirectory());
            System.out.println("Es un fichero: " + f.isFile());
            System.out.println("Esta oculto: " + f.isHidden());
        }else{
            System.out.println("No existe el fichero");
            System.out.println("Elige otro:");
            ruta=sc.nextLine();
            f= new File(ruta);
        }
    }
}
