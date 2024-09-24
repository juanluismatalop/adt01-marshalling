package com.iesvdc.acceso;

import java.io.File;

public class Borrar {

    public static void main(String []args){

        if (args.length!=4) {
            usage();
        } else {
            if(args[0].equals("-f") && (args[1].equals("-n")) || args[1].equals("-e")){
                // lógica del programa
                System.out.println("Mandando directorio donde esta el archivo");
                String ruta = args[0];
                System.out.println("Obteniendo el archivo a borrar");
                String archivo = args[1];
                archivoBorrar(ruta, archivo);
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
    private static void archivoBorrar(String ruta, String archivo){
        String[] parts = archivo.split(".");
        File rutaFile = new File(ruta);
        File archivoFile = new File(archivo);
        if (rutaFile.isDirectory()) {
            if (archivoFile != null) {
                File[] files = archivoFile.listFiles();
                for(File file : files){
                    if(archivoFile.getName().endsWith(parts[1])){
                        if (archivoFile.getName().equals(parts[0])) {
                            archivoFile.delete();
                            System.out.println("Archivo borrado con exito");
                        }
                    }

                }
            }else{
                System.out.println("No se ha encontrado nada");
            }
        }
    }
}
