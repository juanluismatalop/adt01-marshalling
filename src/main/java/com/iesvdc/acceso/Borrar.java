package com.iesvdc.acceso;

import java.io.File;

public class Borrar {

    public static void main(String []args){

        if (args.length!=4) {
            usage();
        } else {
            if(args[0].equals("-f") && (args[2].equals("-n")) || args[2].equals("-e")){
                // lógica del programa
                //necesitamos buscar los archivos con nombre o extension que queremos eliminar 
                

            } else {
                usage();
            }
        }
    }

    private static void usage(){
        System.out.println("Uso del programa:");
        System.out.println("java Borrar -f carpeta " +
            "[-n nombre_archivo | -e extension]");
    }
    private static void archivoBorrar(File archivo){
        if (archivo.isDirectory()) {
            File[] files = archivo.listFiles();
            if (archivo != null) {
                for(File file : files){
                    if(archivo.getName().endsWith(args[2])){
                        if (archivo.getName().equals(args[2])) {
                            archivo.delete();
                        }
                    }

                }
            }
    }
}
