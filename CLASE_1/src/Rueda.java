
/* ============= EJERCICIO 2* =============*/
public class Rueda {

	/*Attributes*/
	private boolean ruedaInflada;
	
	/*Constructor*/
	public Rueda()
	{
		ruedaInflada = true;
	}
	
	/*Getters*/
	public boolean getRuedaInflada()
	{
		return this.ruedaInflada;
	}
	
	/*Setters*/
	public void setRuedaInflada(boolean ruedaInfladaRecibida)
	{
		this.ruedaInflada = ruedaInfladaRecibida;
	}

	/*Methods*/
	public void inflarRueda()
	{
		this.setRuedaInflada(true);
	}
	public void desinflarRueda()
	{
		this.setRuedaInflada(false);
	}
}
