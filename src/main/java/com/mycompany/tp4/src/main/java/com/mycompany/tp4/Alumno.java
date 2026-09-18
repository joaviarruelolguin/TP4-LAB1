/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp4;

import java.util.HashSet;
import java.util.Objects;

/**
 *
 * @author cynth
 */
public class Alumno {

    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet <Materia> carpeta;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        carpeta = new HashSet<>();
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
      public void agregarMateria(Materia m){
          if(carpeta.contains(m)){
              System.out.println("Materia ya registrada");
          } else{
              carpeta.add(m);
          }
    }
    
}
