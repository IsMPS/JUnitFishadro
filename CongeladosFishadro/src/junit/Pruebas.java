package junit;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.event.ActionEvent;

import javax.swing.JFrame;

import org.junit.jupiter.api.Test;

import models.Producto;
import models.Usuario;
import utils.Almacen;
import vistas.Cesta;
import vistas.Login;
import vistas.MenuPrincipal;
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
	
	@Test
	void testRegisterContraseñas() {
		boolean iguales = reg.comprobarContr("a", "a");
		assertTrue(iguales);
	}

	@Test
	void testCesta() {
		Producto p1 = new Producto("Gambas peladas", 5.76,
				"Las gambas peladas de Pescanova son perfectas para cualquier ocasión.", 1);
		Almacen.productos.add(p1);
		p1.setnProductos(2);
		Almacen.cesta.add(p1);
		Cesta cesta = new Cesta(pantalla,0);
		assertEquals(cesta.getTotal(),(5.76*2));
	}
	
	@Test
	void testMenuPrincipal() {
		Producto p1 = new Producto("Gambas peladas", 5.76,
				"Las gambas peladas de Pescanova son perfectas para cualquier ocasión.", 1);
		Almacen.productos.add(p1);
		MenuPrincipal menu = new MenuPrincipal(pantalla,0);
		assertEquals(menu.getNombre(),"Gambas peladas");
	}
	
}
