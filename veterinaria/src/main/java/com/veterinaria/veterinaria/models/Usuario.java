package com.veterinaria.veterinaria.models;

public class Usuario extends Persona {
    static int IdAutoUsuario = 0;
    private int _id ;
    private String _NomUsuario;
    private Persona _persona;

    
    public Usuario() {
        super();
    }


    public Usuario(String _NomUsuario, Persona _persona) {
        this._id = ++this.IdAutoUsuario;
        this._NomUsuario = _NomUsuario;
        this._persona = _persona;
    }




    public Usuario(String nombre, String apellido, String email, String rut, int telefono, int _id, String _NomUsuario,
            Persona _persona) {
        super(nombre, apellido, email, rut, telefono);
        this._id = _id;
        this._NomUsuario = _NomUsuario;
        this._persona = _persona;
    }


    

    public int get_id() {
        return _id;
    }

    public String get_NomUsuario() {
        return _NomUsuario;
    }

    public void set_NomUsuario(String _NomUsuario) {
        this._NomUsuario = _NomUsuario;
    }

    public Persona get_persona() {
        return _persona;
    }

    public void set_persona(Persona _persona) {
        this._persona = _persona;
    }


    @Override
    public String toString() {
        return "Usuario [_id=" + _id + ", _NomUsuario=" + _NomUsuario + ", _persona=" + _persona + "]";
    }
    
}
