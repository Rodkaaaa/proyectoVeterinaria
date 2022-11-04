package com.veterinaria.veterinaria.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.veterinaria.veterinaria.models.Admin;
// se borra el public xdxd
class TestAdmin {
    @Test
    void TestValidarAdmin(){
        Admin TestAdmin = new Admin();
        assertEquals("usuario Logeado, bienvenido: "  + TestAdmin.getNombre(), TestAdmin.validar(null,null,null) ); 
    }

    @Test
    void TestValidarAdminDos(){
        Admin TestAdmin = new Admin();
        assertEquals("usuario incorrecto", TestAdmin.validar(TestAdmin.get_NomAdmin(),TestAdmin.get_contraseniaAdmin(),null) ); 
    }
}
