package Uf1;

import java.io.File;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la direccion:");
        String ruta = sc.nextLine();
        File f = new File(ruta);
        boolean path_Existe=false;

        while (path_Existe !=true)
        if (f.exists()== true){
            path_Existe=true;
            String[] archivos = f.list();
            for (int i = 0; i < archivos.length; i++) {
                System.out.println(archivos[i]);
            }
            System.out.println(" \n --------------------------------- \n");

            File[] roots = File.listRoots();
            for (File root : roots) {
                System.out.println(root);
            }
        }else{
            System.out.println("path invalido pon uno nuevo:");
            ruta=sc.nextLine();
            f = new File(ruta);
        }


    }
}
