package com.veterinaria.veterinaria.models;

public class Admin extends Persona {
    static int IdAutoAdmin = 0;
    private int _id = ++this.IdAutoAdmin;
    private String _NomAdmin, _contraseñáAdmin;
    private Persona _persona;
    private String _contraseñáAdmin;

    
    public Admin() {
        super();
    }

    public Admin(String _NomAdmin,String _contraseñáAdmin, Persona _persona) {
        this._id = ++this.IdAutoAdmin;
        this._NomAdmin = _NomAdmin;
        this._contraseñáAdmin= _contraseñáAdmin
        this._persona = _persona;
    }


    public Admin(String nombre, String apellido, String email, String rut, int telefono, int _id, String _NomAdmin,
            Persona _persona) {
        super(nombre, apellido, email, rut, telefono);
        this._id = _id;
        this._NomAdmin = _NomAdmin;
        this._persona = _persona;
    }





    public int get_id() {
        return _id;
    }

    public String get_NomAdmin() {
        return _NomAdmin;
    }


    public void set_NomAdmin(String _NomAdmin) {
        this._NomAdmin = _NomAdmin;
    }


    public Persona get_persona() {
        return _persona;
    }


    public void set_persona(Persona _persona) {
        this._persona = _persona;
    }

    @Override
    public String toString() {
        return "Admin [_id=" + _id + ", _NomAdmin=" + _NomAdmin + ", _persona=" + _persona + "]";
    }
    
    
}
