package entidad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class conexion {
	
	public static String bd ="bd";
	public static String login ="root";
	public static String pass ="";
	public static String url="jdbc:mysql://localhost:3176/"+bd;
	public static Connection con;
	public static PreparedStatement sentencia;
	
	
	public static void conectar() {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");	
				con =DriverManager.getConnection(url,login,pass);
			if(con!= null) {
			System.out.println("Conexion exitosa");
			}
			
		}catch(SQLException e) {		
			
			System.out.println("No pudo conectar");
		}
		catch (ClassNotFoundException e) {
			System.out.println(e);	
		 }
		}
	public static void desconectar()  throws SQLException{
		con.close();
		
	}
			
	
}