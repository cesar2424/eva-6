
package entidad;



public class Usuario {
	

private String usename;
private String password;

public Usuario(String usename,String password) {
	
if(usename.trim().equals("")|| usename == null) {
	throw new IllegalArgumentException("ingrese usuario");
	
}

if(password.trim().equals("")|| password == null) {
	throw new IllegalArgumentException("ingrese password");
	
}
	this.usename =usename;
	this.password = password;
	
}
    public String getUsename() {
	return usename;
}

    public String getPassword() {
	return password;
}
	
    public void guardarUsuario() {
		 
		 try {
            String strSql2  = "INSERT INTO Usuario VALUES ('"+usename+"','"+password+"')";
            
            conexion.conectar();
			 conexion.sentencia = conexion.con.prepareStatement(strSql2);
			 conexion.sentencia.execute(strSql2);
			 System.out.println("usuario Almasenado");
			 conexion.desconectar();
			 
			 
		 } catch(Exception e) {
			 System.out.println("Error metodo guardarUsuario");			 	 
			 
		 }
   }
}