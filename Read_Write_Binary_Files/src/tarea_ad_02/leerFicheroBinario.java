/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_ad_02;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Jairo
 */
public class leerFicheroBinario {
    
    public static void main (String[] args) throws IOException {
    
        //Create the file and data flow
    //CREACION DE FICHERO Y FLUJOS
    File fich = new File ("C:\\Users\\Jairo\\Desktop\\datosAlumnos.dat");
    FileInputStream fileIn = new FileInputStream(fich);
    DataInputStream datosEntrada = new DataInputStream(fileIn);
    
    //Create the attributes
    //CREACION DE ATRIBUTOS
    String curso, nombre, localidad;
    
    //Read the information
    //LECTURA DE INFORMACION
    try{
    while(true){
        curso = datosEntrada.readUTF();
        nombre = datosEntrada.readUTF();
        localidad = datosEntrada.readUTF();
        System.out.println("Curso: "+curso +"\t\tNombre: "+nombre+"\t\tLocalidad: "+localidad);
        }
    }catch(EOFException e){
        System.out.println("\nFin del fichero");
    }
    //Close the data flow
    //CERRAR FLUJO DE DATOS
    datosEntrada.close();    
    fileIn.close();

    }
}
