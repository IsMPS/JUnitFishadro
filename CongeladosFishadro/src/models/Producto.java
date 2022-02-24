package models;

public class Producto {

	private String nombre;
	private double precio;
	private String descripci�n;
	private int foto;
	private int nProductos;

	public Producto(String nombre, double precio, String descripci�n, int foto) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.descripci�n = descripci�n;
		this.foto = foto;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public String getDescripci�n() {
		return descripci�n;
	}

	public int getFoto() {
		return foto;
	}

	public int getnProductos() {
		return nProductos;
	}

	public void setnProductos(int nProductos) {
		this.nProductos = nProductos;
	}

}
