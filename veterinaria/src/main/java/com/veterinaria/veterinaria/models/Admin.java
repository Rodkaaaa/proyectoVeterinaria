package com.veterinaria.veterinaria.models;

public class Admin extends Persona {
    static int IdAutoAdmin = 0;
<<<<<<< HEAD
    private int _id;
=======
    private int _id ;
>>>>>>> 38e3859f3ff155b4054ab8cafb28e9060c5c7f79
    private String _NomAdmin, _contraseniaAdmin;
    private Persona _persona;

    
    public Admin() {
        super();
    }

    public Admin(String _NomAdmin, String _contraseniaAdmin, Persona _persona) {
        this._id = ++this.IdAutoAdmin;
        this._NomAdmin = _NomAdmin;
        this._contraseniaAdmin = _contraseniaAdmin;
        this._persona = _persona;
    }


    public Admin(String nombre, String apellido, String email, String rut, int telefono, int _id, String _NomAdmin,String _contraseniaAdmin,
            Persona _persona) {
        super(nombre, apellido, email, rut, telefono);
        this._id = _id;
        this._NomAdmin = _NomAdmin;
        this._contraseniaAdmin = _contraseniaAdmin;
        this._persona = _persona;
    }



    public String get_contraseniaAdmin() {
        return _contraseniaAdmin;
    }

    public void set_contraseniaAdmin(String _contraseniaAdmin) {
        this._contraseniaAdmin = _contraseniaAdmin;
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
