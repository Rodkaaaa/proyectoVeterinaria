package com.veterinaria.veterinaria.models;

public class Persona{
    //autoincrement de id y estructura
    static int IdAutoPersona = 0;
    private int _id;
    private String _nombre, _apellido, _email, _rut;
    private int _telefono;
    ///Constructor vacio
    public Persona() {
    }
    ///Constructor completo
    public Persona(String nombre, String apellido, String email, String rut, int telefono) {
        ///asignando el autoinvremete en preincrement :o impactado
        this._id = ++this.IdAutoPersona;
        this._nombre = nombre;
        this._apellido = apellido;
        this._email = email;
        this._rut = rut;
        this._telefono = telefono;
    }

    //Getters and Setters
    public int getId() {
        return _id;
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String nombre) {
        this._nombre = nombre;
    }

    public String getApellido() {
        return _apellido;
    }

    public void setApellido(String apellido) {
        this._apellido = apellido;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String email) {
        this._email = email;
    }

    public String getRut() {
        return _rut;
    }

    public void setRut(String rut) {
        this._rut = rut;
    }

    public int getTelefono() {
        return _telefono;
    }

    public void setTelefono(int telefono) {
        this._telefono = telefono;
    }
    ///metodo toString();
    @Override
    public String toString() {
        return "Persona [id=" + _id + ", nombre=" + _nombre + ", apellido=" + _apellido + ", email=" + _email + ", rut="
                + _rut + ", telefono=" + _telefono + "]";
    }

    
    
}