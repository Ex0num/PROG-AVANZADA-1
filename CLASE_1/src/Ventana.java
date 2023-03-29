
/* ============= EJERCICIO 2* =============*/
public class Ventana {

	/*Attributes*/
	private boolean ventanaAbierta;
	
	/*Constructor*/
	public Ventana()
	{
		ventanaAbierta = false;
	}
	
	/*Getters*/
	public boolean getVentanaAbierta()
	{
		return this.ventanaAbierta;
	}
	
	/*Setters*/
	public void setVentanaAbierta(boolean ventanaAbierta)
	{
		this.ventanaAbierta = ventanaAbierta;
	}

	/*Methods*/
	public void abrirVentana()
	{
		this.setVentanaAbierta(true);
	}
	public void cerrarVentana()
	{
		this.setVentanaAbierta(false);
	}

}
