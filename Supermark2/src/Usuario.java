/*import java.util.ArrayList;

public class Usuario {

	private int id_usuario;
	private String nombre;
	private String apellido;
	private String email;
	private String contra;
	private int tipo_usuario;
	private boolean tieneTarjeta;
	private ArrayList<Producto> arrayProductos;	
	
	public Usuario(int id_usuario, String nombre, String apellido, String email, String contra, int tipo_usuario,
			boolean tieneTarjeta) {

		this.id_usuario = id_usuario;
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.contra = contra;
		this.tipo_usuario = tipo_usuario;
		this.tieneTarjeta = tieneTarjeta;
	}
	public Usuario(Object object, String nombre2, String apellido2, String email2, String telefono, String pass, int i,
			boolean b) {
		// TODO Auto-generated constructor stub
	}
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContra() {
		return contra;
	}
	public void setContra(String contra) {
		this.contra = contra;
	}
	public int getTipo_usuario() {
		return tipo_usuario;
	}
	public void setTipo_usuario(int tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}
	public boolean isTieneTarjeta() {
		return tieneTarjeta;
	}
	public void setTieneTarjeta(boolean tieneTarjeta) {
		this.tieneTarjeta = tieneTarjeta;
	}	
}*/
//import java.util.ArrayList;

public class Usuario {

	private int id_usuario;
	private String nombre;
	private String apellido;
	private String email;
	private String contra;
	private int tipo_usuario;
	private boolean tieneTarjeta;
	private Carrito carrito;

	
	public Usuario(int id_usuario, String nombre, String apellido, String email, String contra, int tipo_usuario,
			boolean tieneTarjeta) {

		this.id_usuario = id_usuario;
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.contra = contra;
		this.tipo_usuario = tipo_usuario;
		this.tieneTarjeta = tieneTarjeta;
		this.carrito = new Carrito();
	}
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContra() {
		return contra;
	}
	public void setContra(String contra) {
		this.contra = contra;
	}
	public int getTipo_usuario() {
		return tipo_usuario;
	}
	public void setTipo_usuario(int tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}
	public boolean isTieneTarjeta() {
		return tieneTarjeta;
	}
	public void setTieneTarjeta(boolean tieneTarjeta) {
		this.tieneTarjeta = tieneTarjeta;
	}
	public Carrito getCarrito() {
		return carrito;
	}
	public void setCarrito(Carrito carrito) {
		this.carrito = carrito;
	}
	
	public void agregaCarritoU(Producto p) {
		this.carrito.agragaProducto(p);
	}
	
}