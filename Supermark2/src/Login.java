import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {
	
	private String email;
	private String contra;
	
	public Login(String email, String contra) {
		
		this.email = email;
		this.contra = contra;
	}
	
	
	public Usuario ingresar() throws SQLException {
		
		Usuario user = null;
		Conexion conexion = new Conexion();
		
		String sql = "select * from usuario where email_usuario="+"'"+
		this.email+"'"+" and contrasenia_usuario="+"'"+this.contra+"'";
		//System.out.println(sql);
		
		ResultSet rs = conexion.devuelveConsulta(sql);
		
		while(rs.next()) {
			System.out.println("Ingreso Exitoso!!!!");
			
			int id_user=rs.getInt("id_usuario"); //nombre de columna
			String nombre=rs.getString("nombre_usuario");
			String apellido=rs.getString("apellido_usuario");
			String email=rs.getString("email_usuario");
			String pass=rs.getString("contrasenia_usuario");	
			int tipo_usuario=rs.getInt("id_tipo_usuario");
			boolean tiene_tarj=rs.getBoolean("tiene_tarjeta_usuario");	
			user = new Usuario (id_user, nombre, apellido,email, pass, tipo_usuario,tiene_tarj);
			
		}
		return user;
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
}