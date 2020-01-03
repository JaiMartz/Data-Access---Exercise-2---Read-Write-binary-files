/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_ad_02;

/**
 *
 * @author Jairo
 */
public class Alumnos {
    
    private String curso;
    private String nombre;
    private String localidad;
    
    public Alumnos(){
    }
    public Alumnos(String curs, String nom, String loc){
        this.curso = curs;
        this.nombre = nom;
        this.localidad=loc;
    }
    public String getCurso(){
        return curso;
    }
    public void setCurso(String curs){
        this.curso=curs;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nom){
       this.nombre=nom;
    }
    public String getLocalidad(){
        return localidad;
    }
    public void setLocalidad(String loc){
        this.localidad=loc;
    }
}
