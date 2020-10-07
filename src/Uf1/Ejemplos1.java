package Uf1;

import java.io.File;

public class Ejemplos1 {
    public static void main(String[] args) {
        File f = new File(".");
        String[] archivos = f.list();
        for (int i = 0; i < archivos.length; i++) {
            System.out.println(archivos[i]);
        }

        System.out.println(" \n --------------------------------- \n");

        File[] roots = File.listRoots();
        for(File root:roots){
            System.out.println(root);
        }
   }
}
