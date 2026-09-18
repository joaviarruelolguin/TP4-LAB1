package com.mycompany.trabajopractico4.lab1;

import java.util.HashSet;

public class Alumno {

    protected int legajo;
    protected String apellido;
    protected String nombre;
    protected HashSet<Materia> materias = new HashSet<>();

    public Alumno() {
    }

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
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
}
