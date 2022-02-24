package models;

public class Usuario {

	public String nombre;
	public String contr;

	/**
	 * Crea la clase Usuario
	 * 
	 * @param nombre
	 * @param contr
	 */
	public Usuario(String nombre, String contr) {
		super();
		this.nombre = nombre;
		this.contr = contr;
	}

	/**
	 * Devuelve el nombre de usuario
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre de usuario
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve la contrase�a del usuario
	 * 
	 * @return
	 */
	public String getContr() {
		return contr;
	}

	/**
	 * Establece la contrase�a de un usuario
	 * 
	 * @param contr
	 */
	public void setContr(String contr) {
		this.contr = contr;
	}
}
