package entidad;

public class Persona {
	
	private String rut;
	private String nombre;
	private String apellido;
	private int telefono;
	private String FechaIngreso;

	public Persona(String rut, String nombre,String apellido,int telefono, String FechaIngreso)
	
	{
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.FechaIngreso = FechaIngreso;
		
	}
	
	public String getRut() {
		return rut;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getApellidot() {
		return apellido;
	}
	public int getTelefono() {
		return telefono;
	}
	public String getFechaIngreso() {
		return FechaIngreso;
	}

	

	@Override
	public String toString() {
		return "Persona [rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono
				+ ", FechaIngreso=" + FechaIngreso + "]";
	}
	 public void inprPersona(){
		 
		 System.out.println("Rut :" + this.rut);
		 System.out.println("Nombre :" + this.nombre);					
		 System.out.println("Apellido :" + this.apellido);
		 System.out.println("Telefono:" + this.telefono);
		 System.out.println("FechaIngreso :" + this.FechaIngreso);
		 
	 }
      
	 public void guardarPersona() {
		 
		 try {
             String strSql  = "INSERT INTO Persona VALUES ('"+rut+"','"+nombre+"','"+apellido+"',"+telefono+",'"+FechaIngreso+"')";
             
             conexion.conectar();
			 conexion.sentencia = conexion.con.prepareStatement(strSql);
			 conexion.sentencia.execute(strSql);
			 System.out.println("Datos Almasenados");
			 conexion.desconectar();
			 
			 
		 } catch(Exception e) {
			 System.out.println("Error metodo guardarPersona");			 	 
			 
		 }
	 }
	

	
}
