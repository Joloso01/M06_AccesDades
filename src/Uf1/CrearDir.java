package Uf1;

import java.io.File;
import java.util.Scanner;

public class CrearDir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la direccion:");
        String ruta = sc.nextLine();
        File directorio = new File(ruta);

        directorio.mkdir();
        if (!directorio.exists()){
            System.out.println("El directorio " + directorio.getName()+ " ha sido creado.");
        }else {
            System.out.printf("El directorio %s ya existe!",directorio.getName());
        }
    }
}
