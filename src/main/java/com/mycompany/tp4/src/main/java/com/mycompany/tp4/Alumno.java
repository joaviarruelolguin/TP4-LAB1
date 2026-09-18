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
    private HashSet<Materia> materias;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        materias = new HashSet<>();
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

    public void agregarMateria(Materia m) {
        if (materias.contains(m)) {
            System.out.println("No puedes inscribir dos veces en la misma materia a un alumno");
        } else {
            materias.add(m);
            System.out.println(nombre + " " + apellido + " Inscripto exitosamente en: " + m.getNombre());
        }

    }

    public int cantidadMaterias() {

        int cantidad = materias.size();
        return cantidad;
    }

    @Override
    public String toString() {
        return this.apellido + " " + this.nombre;
    }

}
