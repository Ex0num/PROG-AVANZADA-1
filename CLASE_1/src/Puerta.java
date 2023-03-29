
/* ============= EJERCICIO 2* =============*/
public class Puerta {

	/*Attributes*/
	private boolean puertaAbierta;
	
	/*Constructor*/
	public Puerta()
	{
		puertaAbierta = false;
	}
	
	/*Getters*/
	public boolean getPuertaAbierta()
	{
		return this.puertaAbierta;
	}
	
	/*Setters*/
	public void setPuertaAbierta(boolean puertaAbierta)
	{
		this.puertaAbierta = puertaAbierta;
	}

	/*Methods*/
	public void abrirPuerta()
	{
		this.setPuertaAbierta(true);
	}
	public void cerrarPuerta()
	{
		this.setPuertaAbierta(false);
	}

}
