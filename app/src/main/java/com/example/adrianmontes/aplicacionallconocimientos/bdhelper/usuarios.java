package com.example.adrianmontes.aplicacionallconocimientos.bdhelper;

/**
 * Created by adrian.montes on 19/10/2017.
 */

public class usuarios {

    private int usuario,edad;
    private String nombre,apellidos;


    public usuarios(int edad, String nombre, String apellidos) {
        this.usuario = usuario;
        this.edad = edad;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getUsuario() {
        return usuario;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
}
