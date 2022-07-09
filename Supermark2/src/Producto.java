
public class Producto {

	private int id_p;
	private int cantidad;
	private String nombre;
	private double precio;
	

	public Producto(int id_p, String nombre,int cantidad, double precio) {
		super();
		this.id_p = id_p;
		this.cantidad = cantidad;
		this.nombre = nombre;
		this.precio = precio;
	}
	public int getId_p() {
		return id_p;
	}
	public void setId_p(int id_p) {
		this.id_p = id_p;
	}

	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Producto [Cod: " + id_p + ", cant: " + cantidad + ", Prod: " + nombre + ", $: " + precio + "]";
	}
	
	
	
}