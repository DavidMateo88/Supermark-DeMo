import java.sql.SQLException;
import java.util.Scanner;

public class Registro {
	
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	private String pass;
	//private int tipo;
	//private boolean tieneT;
	
	
	public Registro() { //pido los datos aqui!!
		Scanner entrada = new Scanner(System.in);
	
		
		System.out.println("Ingrese nombre: ");
		this.nombre=entrada.next();
		
		System.out.println("Ingrese apellido: ");
		this.apellido=entrada.next();
		
		System.out.println("Ingrese email: ");
		this.email=entrada.next();
		
		System.out.println("Ingrese telefono: ");
		this.telefono=entrada.next();
		
		System.out.println("Ingrese password: ");
		this.pass=entrada.next();
		
	}
	
	public Usuario validarReg() throws SQLException {
		
		if(this.nombre!=""&&this.apellido!=""&&
		   this.email!=""&&this.pass!="") { //podriamos buscar si el email esta en la bdd
			
			String sql = "insert into usuario values(null,"+"'"+this.nombre+"',"+
			"'"+this.apellido+"',"+"'"+this.email+"',"+"'"+this.telefono+"',"+"'"+this.pass+"',"+"1,true);";
			
			Conexion conexion = new Conexion();
			conexion.realizaConsulta(sql);
			System.out.println("Usuario cargado");
		}
		
		else {
			System.out.println("DATOS MAL INGRESADOS");
		}
		return null;
		
}
	
	
	
	

}