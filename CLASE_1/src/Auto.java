

/* ============= EJERCICIO 1* =============*/
public class Auto {

	/*Attributes*/
	private String patente;
	private EnumMarca marca;
	private String modelo;
	private int precio;
	
	public enum EnumMarca
	{
	    FORD, CHEVROLET, NISSAN, TOYOTA, MITSUBISHI
	}
	
	/*Getters*/
	public String getPatente()
	{
		return this.patente;
	}
	
	public EnumMarca getMarca()
	{
		return this.marca;
	}
	
	public String getModelo()
	{
		return this.modelo;
	}
	
	public int getPrecio()
	{
		return this.precio;
	}
	
	/*Setters*/
	public void setPatente(String patenteRecibida)
	{
		this.patente = patenteRecibida;
	}
	
	public void setMarca(EnumMarca marcaRecibida)
	{
		this.marca = marcaRecibida;
	}
	
	public void setModelo(String modeloRecibido)
	{
		this.modelo = modeloRecibido;
	}
	
	public void setPrecio(int precioRecibido)
	{
		this.precio = precioRecibido;
	}
	
	/*Constructors*/
	public Auto() 
	{}
	
	public Auto(String patenteRecibida, EnumMarca marcaRecibida, String modeloRecibido, int precioRecibido) 
	{
		this.patente = patenteRecibida;
		this.marca = marcaRecibida;
		this.modelo = modeloRecibido;
		this.precio = precioRecibido;
	}
	
	/*Overrides*/
	@Override public String toString()
	{
		return patente + ' ' + marca + ' ' + modelo + ' ' + precio;
	}
	
	@Override public boolean equals(Object objRecibido)
	{
		boolean resultado = false;
		
		//If it's not a null object and the class matches
		if (objRecibido != null && objRecibido.getClass() == this.getClass())
		{
			//The only field that differ an 'Auto' from other
			Auto autoRecibidoCasteado = (Auto) objRecibido;
			if (autoRecibidoCasteado.getPatente() == this.getPatente())
			{
				resultado = true;
			}
		}
		
		return resultado;
	}
	
	@Override public int hashCode()
	{
		int numeroPrimo = 7;
		int result = numeroPrimo * this.getPrecio();
		result = result + numeroPrimo * precio;
		return result;
	}
}
