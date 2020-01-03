/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_ad_02;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author Jairo
 */
public class escribirFicheroBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        //Create the binary file  (CHANGE THE DIRECTORY)
        //Creamos el fichero binario
        File fichero = new File ("C:\\Users\\Jairo\\Desktop\\datosAlumnos.dat");
        if(!fichero.exists()){
            fichero.createNewFile();
        }
        //Data flow
        //Flujo de datos
        FileOutputStream fileout = new FileOutputStream (fichero);
        DataOutputStream datosSalida = new DataOutputStream (fileout);
        
        //Create 5 alumn objects
        //CREAMOS LOS 5 OBJETOS ALUMNOS
        Alumnos alum1 = new Alumnos ("2DAM", "Jairo Martinez Garrido", "Granada");
        Alumnos alum2 = new Alumnos ("1DAM", "Miguel Urzua Castro", "Santander");
        Alumnos alum3 = new Alumnos ("2DAM", "Angela Melgares Cristo", "Motril");
        Alumnos alum4 = new Alumnos ("1DAM", "Yenai Rodriguez Grande", "Madrid");
        Alumnos alum5 = new Alumnos ("1DAM", "Ismael Vallejo Campos", "Alicante");
        
        //Create arraylist
        //CREAMOS ARRAYLIST
        ArrayList<Alumnos> listaAlumnos = new ArrayList<Alumnos>();
        listaAlumnos.add(alum1);
        listaAlumnos.add(alum2);
        listaAlumnos.add(alum3);
        listaAlumnos.add(alum4);
        listaAlumnos.add(alum5);
        

        //Add alumn objects into the flow and to the file
        //AÑADIMOS LOS OBJETOS DE ALUMNOS AL FLUJO Y POR TANTO AL FICHERO
        for(Alumnos alum: listaAlumnos){
            datosSalida.writeUTF(alum.getCurso());
            datosSalida.writeUTF(alum.getNombre());
            datosSalida.writeUTF(alum.getLocalidad());
        }
        
        
        //Close the data flow and files
        datosSalida.close();
        fileout.close();
        
        
    }
    
}
