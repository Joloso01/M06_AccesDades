package Uf1;

import java.io.File;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la direccion:");
        String path = sc.nextLine();
        File f = new File(path);
        String[] archivos = f.list();
        for (int i = 0; i < archivos.length; i++) {
            System.out.println(archivos[i]);
        }

        System.out.println(" \n --------------------------------- \n");

        File[] roots = File.listRoots();
        for (File root : roots) {
            System.out.println(root);
        }
    }
}
