import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class InicioUsuario {
	private Conexion conexion;
	
	public InicioUsuario() {
		
		conexion = new Conexion();	
	}
	
	public void menu(Usuario user) throws SQLException {
		
		System.out.println();
		System.out.println("Hola "+user.getNombre()+" gracias por elegirnos");
		System.out.println();
		Scanner entrada = new Scanner(System.in);	
		int opcion = 0;

		do {
		System.out.println("Ingrese una opcion: ");
		System.out.println();
		System.out.println("1 - Seleccionar productos\r\n"
				+ "2 - ver  listado de productos seleccionados.\r\n"
				+ "3 - Autorizar la compra de los productos seleccionados\r\n"
				+ "");
		
		opcion = entrada.nextInt();
		
		
		switch(opcion) {
		case 1 : 
			
			String sql = "select * from categoria";
			ResultSet rs = conexion.devuelveConsulta(sql);		
			
			//empiezo preguntando la categoria
			
			while(rs.next()) {
				
				int id_cat = rs.getInt("id_categoria");
				String nom_cat = rs.getString("nombre_categoria");
				System.out.println("Categoria: "+id_cat);
				System.out.println(nom_cat);
				System.out.println();
				
			}
			
			System.out.println("Ingrese el codigo de la categoria: ");
			int opc = entrada.nextInt();
			
			String sql2 = "select id_producto, nombre_producto, precio_unit_producto "
					+ "from producto where id_categoria = " + "'"+opc+"';";
			//System.out.println(sql2);
			ResultSet rs2 = conexion.devuelveConsulta(sql2);
			
			while(rs2.next()) {
				
				int id_producto = rs2.getInt("id_producto");
				String nom_producto= rs2.getString("nombre_producto");
				double precio = rs2.getDouble("precio_unit_producto");
				
				System.out.println("Cod: "+id_producto);
				System.out.println("Producto: "+nom_producto);
				System.out.println("$: "+precio);
				System.out.println();
			}
			
			System.out.println("Seleccione id del producto : ");
			int idSel = entrada.nextInt();
			System.out.println();
			System.out.println("Cantidad de productos: ");
			int cantP = entrada.nextInt();
			System.out.println();
			
			String consultaStock = "Select * from producto "
					+ "where id_producto ="+"'"+idSel+"'";
			
			//System.out.println(consultaStock);
			ResultSet rs3 = conexion.devuelveConsulta(consultaStock);
			
			if(rs3.next()) {
				String nomP = rs3.getString("nombre_producto"); 
				int stockbd = rs3.getInt("stock_producto");
				double precioP = rs3.getDouble("precio_unit_producto");
				
				
				if(stockbd>cantP) {
				    //instancio un producto con toda esa data ya que si hay stock de ese prod
					Producto product = new Producto(idSel,nomP,cantP,precioP);
					user.agregaCarritoU(product); //agrego el producto al carrito asociado al usuario
					System.out.println("Producto agregado correctamente!");
					
				}
				else {
					System.out.println("Sin stock del Producto");
				}
			}
			
			break;
		case 2: 
			System.out.println("Productos en Carrito... ");
			
			Carrito carritoAux = user.getCarrito();
			carritoAux.recorrerCarrito();
			
			break;
		case 3: 
			
			Carrito carritoAux2= user.getCarrito();
			carritoAux2.autorizarCompra(user);
			
			break;
		
		default: 
			System.out.println("Opcion Incorrecta");
		    break;
		}
		
		} while(opcion != 0);
			
	}
	

}