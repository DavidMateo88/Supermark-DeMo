/*import java.util.Scanner;

public class Carrito {

	public Carrito() {
		int cantProdTotal = 5;
		int codProd [] = new int[]{100, 200, 300, 400, 500};
		String nombres[] = new String[] {"p_a","p_b","p_c","p_d","p_e"};
		int precios[] = new int[] {150, 250, 350, 450, 550};
		
		
		Scanner teclado = new Scanner(System.in);
		
		int codProdCarrito[] = new int [10];
		int cantCarrito[] = new int [10];
		int subtCarrito[] = new int [10];
		
		int cantLineas = 0;
		
		int op;
		
		do {
			System.out.println("Menu de opciones");
			System.out.println("================");
			System.out.println("1 - mostar productos");
			System.out.println("2 - mostrar carrito");
			System.out.println("3 - agregar producto");
			System.out.println("4 - salir");
			System.out.print("ingrese la opcion deseada");
			op = teclado.nextInt ();
			
			switch (op) {
				case 1: mostrarProductos(codProd,nombres, precios, cantProdTotal);//llamar productos
					break;
				
				case 2:mostrarCarrito(codProd, nombres, precios,
						codProdCarrito, cantCarrito, subtCarrito, cantLineas);// llamar carrito
					break;
				
				case 3: if (cantLineas<9) {
					cantLineas = AgregarCarrito(codProd, nombres, precios,
							codProdCarrito, cantCarrito, subtCarrito, cantLineas, teclado);
				} else {
					System.out.println("carrito lleno");
				}
					break;
				}
			
			} while (op !=40);
		
		int sumaTotal = mostrarCarrito(codProd, nombres, precios,
				codProdCarrito, cantCarrito, subtCarrito, cantLineas);
		System.out.println("el total es: "+sumaTotal);//llamar carrito
			//clcular total
			//mostrar total
		
		
	}
	
	public static void mostrarProductos (int[] cp, String[] np, int[] pp, int cant) {
		
		int i;
		System.out.println();
		System.out.println("lista productos");
		System.out.println("===============");
		for (i=0;i<cant;i++) {
			System.out.println(cp[i] + "-" + np[i] + "-" + pp[i]);
		}
	}
	
public static int mostrarCarrito (int[] cp, String[] np, int[] pp,
		int[] cp_linea,int[] cantLinea,int[] subt,int cantLineas) {
		
		int i, suma = 0;
		System.out.println();
		System.out.println("carrito compras");
		System.out.println("===============");
		for (i=0;i<cantLineas;i++) {
			int h = buscarProd(cp_linea[i], cp);
			System.out.println(cp[i] + "-" + np[h] + "-" + pp[h]
					+ "-" + cantLinea[i] + "-" + subt[i]);
			
			suma = suma + subt[i];
		}
		return suma;
	}
	public static int buscarProd(int codBus, int[] productos) {
		int posicion = -1;
		for (int i=0;i<5;i++) {
			if (codBus == productos[i]) {
			posicion = i;
		}
	}
	return posicion;
}

public static int AgregarCarrito (int[] cp, String[] np, int[] pp,
		int[] cp_linea,int[] cantLinea,int[] subt,int cantLineas,
		Scanner teclado) {
	
	System.out.println("ingrese codigo de producto");
	int cod = teclado.nextInt();

	int posi = buscarProd(cod, cp);
	if (posi == -1) {
		System.out.println("producto no existe");
	return cantLineas;
}

	System.out.println("ingrese cantidad");
	int cant = teclado.nextInt();
	
	cp_linea[cantLineas]= cod;
	cantLinea[cantLineas]= cant;
	subt[cantLineas] = pp[posi] * cant;
	return (cantLineas + 1);
}
}*/
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Carrito {

	private ArrayList<Producto> arrayProd;
	
	public Carrito() {
		
		this.arrayProd = new ArrayList<Producto>();
	}

	public void agragaProducto(Producto p) {
		this.arrayProd.add(p);
	}
	
	public void recorrerCarrito() {
		
		for (int i=0;i<this.arrayProd.size();i++) {
			
		System.out.println(arrayProd.get(i).toString());
			
		}
		
	}
	
	
    public String devuelveDetalle() {
		
    	String cadena = "";
		for (int i=0;i<this.arrayProd.size();i++) {
			
		    cadena = cadena+arrayProd.get(i).toString()+"\n";
			
		}
		
		return cadena;
		
	}
	
	public void autorizarCompra(Usuario user) throws SQLException {
		String sql;
		double total=0;
		Calendar fecha = new GregorianCalendar();
		
		int anio = fecha.get(Calendar.YEAR);
	    int mes = fecha.get(Calendar.MONTH);
	    int dia = fecha.get(Calendar.DAY_OF_MONTH);
	    String fechaActual=anio+"-"+mes+"-"+dia;
	    
	    for (int i=0;i<this.arrayProd.size();i++) {
	    	total +=(arrayProd.get(i)).getPrecio()*arrayProd.get(i).getCantidad();
	    }
	    
	    String detalle = devuelveDetalle();
	 
			
		sql = "insert into ventas values (null,"+
				"'"+fechaActual+"','"+detalle+"',"+"'"+total+"',"+"'"+user.getId_usuario()+"');";
		/*"insert into ventas values (null,"+
		user.getId_usuario()+",'"+fechaActual+"','"+detalle+"','"+total+"');";*/
			
			//System.out.println(sql);
			
		Conexion conexion = new Conexion();
		conexion.realizaConsulta(sql);
		System.out.println();
		System.out.println("COMPRA REGISTRADA CON EXITO");
		System.out.println();	
			
				
	}
}