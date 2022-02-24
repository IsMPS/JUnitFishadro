package junit;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JFrame;

import org.junit.jupiter.api.Test;

import models.Usuario;
import utils.Almacen;
import vistas.Login;
import vistas.Register;

class Pruebas {
	private JFrame pantalla;
	private Login log = new Login();
	private Register reg = new Register(pantalla);

	@Test
	void testLogin() {
		Almacen.usuarios.add(new Usuario("a", "a"));
		boolean dentro = log.comprobarLogin("a", "a");
		assertTrue(dentro);
	}
	
	void testRegisterContraseñas() {
		boolean iguales = reg.comprobarContr("a", "a");
		assertTrue(iguales);
	}

}
