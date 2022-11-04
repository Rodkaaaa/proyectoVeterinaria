package com.veterinaria.veterinaria;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.veterinaria.veterinaria.models.Admin;
import com.veterinaria.veterinaria.models.Persona;
import com.veterinaria.veterinaria.models.Usuario;

@SpringBootApplication
public class VeterinariaApplication {

	public static void main(String[] args) {
		Persona persona1 = new Persona("Frederick", "Cid","asd@ads","123123",12345);
		Persona persona2 = new Persona("jav","jav","qwe@qwe","1234-4",12345);
		System.out.println(persona1.toString());
		System.out.println(persona2.toString());

		Usuario usua1 = new Usuario("fred","1234",persona1);
		System.out.println(usua1.toString());

		Admin admin1 = new Admin("fred","1234",persona1);
		Admin fake = new Admin(null,null,null);
		System.out.println(admin1.toString());
		System.out.println(admin1.validar(admin1.get_NomAdmin(),admin1.get_contraseniaAdmin(),persona1.getNombre()));
		System.out.println(fake.validar(fake.get_NomAdmin(),fake.get_contraseniaAdmin(),persona1.getNombre())); 
		System.out.println(usua1.validar(usua1.get_NomUsuario(),usua1.get_contraseniaUsuario(),persona1.getNombre()));
		Admin adminCompleto = new Admin("frederick","cid","asd@asd","123-123",123,"fred","1234");
		System.out.println(adminCompleto.toStringSuper());
 		//int opc = 1;
		Scanner sc = new Scanner(System.in);
		String nombre,apellido, email, rut,nombreUsuario,password;
		int telefono;
		/* System.out.println("ingrese su nombre");
		nombre = sc.next();
		System.out.println("ingrese su apellido");
		apellido = sc.next();
		System.out.println("ingrese su email");
		email = sc.next();
		System.out.println("ingrese su rut");
		rut = sc.next();
		System.out.println("ingrese su telefono");
		telefono = sc.nextInt(); */
		System.out.println("ingrese su nombre Usuario");
		nombreUsuario = sc.nextLine();
		
		System.out.println("ingrese su contraseña");
		password = sc.nextLine();
/* 			Admin adminRandom = new Admin(nombre, apellido, email, rut, telefono, nombreUsuario, contrasenia);*/
		adminCompleto.set_NomAdmin(nombreUsuario);
		adminCompleto.set_contraseniaAdmin(password);

		nombreUsuario = adminCompleto.get_NomAdmin();
		password = adminCompleto.get_contraseniaAdmin();
		System.out.println(adminCompleto.get_NomAdmin().getClass().getSimpleName());
		System.out.println(adminCompleto.get_contraseniaAdmin().getClass().getSimpleName());
		System.out.println(adminCompleto.getNombre());
		System.out.println(adminCompleto.get_NomAdmin());
		System.out.println(adminCompleto.get_contraseniaAdmin());
		System.out.println(adminCompleto.toStringSuper());
		System.out.println(adminCompleto.validar(nombreUsuario,password,adminCompleto.getNombre()));
		
	}

}
