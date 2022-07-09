
/*public class Producto {

	private String nombre_p;
	private double precio;
	private int stock;
	public Producto(String nombre_p, double precio, int stock) {
		
		this.nombre_p = nombre_p;
		this.precio = precio;
		this.stock = stock;
	}
	public String getNombre_p() {
		return nombre_p;
	}
	public void setNombre_p(String nombre_p) {
		this.nombre_p = nombre_p;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}	
	
}*/
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