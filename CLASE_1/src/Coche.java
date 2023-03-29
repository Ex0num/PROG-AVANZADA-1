
public class Coche {
	
	private Motor motorActual;
	private Rueda ruedaDelanteraIzq;
	private Rueda ruedaDelanteraDer;
	private Rueda ruedaTraseraIzq;
	private Rueda ruedaTraseraDer;
	private Puerta puertaDelanteraIzq;
	private Puerta puertaDelanteraDer;
	private Ventana ventanaDelanteraIzq;
	private Ventana ventanaDelanteraDer;
	
	public Coche ()
	{
		this.motorActual = new Motor();
		this.ruedaDelanteraIzq = new Rueda();
		this.ruedaDelanteraDer = new Rueda();
		this.ruedaTraseraIzq = new Rueda();
		this.ruedaTraseraDer = new Rueda();
		this.puertaDelanteraIzq = new Puerta();
		this.puertaDelanteraDer = new Puerta();
		this.ventanaDelanteraIzq = new Ventana();
		this.ventanaDelanteraDer = new Ventana();
	}
	
	/*
	 *  (Chequea que las puertas estén cerradas, que las ruedas estén infladas y arranca el motor. 
	 *  Si falla algo, se informara lo ocurrido por consola)
	 */
	public void arrancar()
	{
		//Chequeando puertas cerradas
		if (this.puertaDelanteraIzq.getPuertaAbierta() == false && this.puertaDelanteraDer.getPuertaAbierta() == false)
		{
			//Chequeando ruedas infladas
			if (this.ruedaDelanteraIzq.getRuedaInflada() == true &&
				this.ruedaDelanteraDer.getRuedaInflada() == true &&
				this.ruedaTraseraIzq.getRuedaInflada() == true &&
				this.ruedaTraseraDer.getRuedaInflada() == true)
			{
				
				//Chequeando motor ya prendido
				if (this.motorActual.getMotorPrendido() == false)
				{
					System.out.println("¡El auto arranco correctamente!");
					
					this.ventanaDelanteraIzq.setVentanaAbierta(true);
					this.ventanaDelanteraDer.setVentanaAbierta(true);
					
					this.motorActual.setMotorPrendido(true);
				}
				else
				{
					System.out.println("¡El motor ya esta prendido!");
				}	
			}
			else
			{
				System.out.println("¡Hay una rueda sin inflar!");
			}	
		}
		else	
		{
			System.out.println("¡Hay una puerta mal cerrada!");
		}
	}

	/*
	 *  (Chequea que el coche este andando, apaga el motor, abre las 
	 *	puertas y cierra las ventanas. Si falla algo, se informara lo ocurrido por consola) y control (debe informar el estado de las ruedas). 
	 */
	public void parar()
	{
		//Chequea que el coche este andando
		if (this.motorActual.getMotorPrendido() == true)
		{
			this.motorActual.setMotorPrendido(false);
			
			this.puertaDelanteraIzq.setPuertaAbierta(true);
			this.puertaDelanteraDer.setPuertaAbierta(true);
			
			this.ventanaDelanteraIzq.setVentanaAbierta(false);
			this.ventanaDelanteraDer.setVentanaAbierta(false);
			
			System.out.println("La rueda Delantera Izq esta inflada: " + this.ruedaDelanteraIzq.getRuedaInflada());
			System.out.println("La rueda Delantera Der esta inflada: " + this.ruedaDelanteraDer.getRuedaInflada());
			System.out.println("La rueda Trasera Izq esta inflada: " + this.ruedaTraseraIzq.getRuedaInflada());
			System.out.println("La rueda Trasera Der esta inflada: " + this.ruedaTraseraDer.getRuedaInflada());
			
			System.out.println("¡El auto se apago correctamente!");
		}
		else
		{
			System.out.println("¡El motor ya esta apagado!");
		}
	}

	/*Entry point*/
	public static void main (String[] args)
	{
		System.out.println("Probando coches:");
		Coche coche1 = new Coche(); 
		
		coche1.arrancar();
		coche1.arrancar();
		coche1.parar();
		coche1.parar();
		
		System.out.println("-------------------------------------");
		
		System.out.println("Probando autos:");
		
		Auto auto1 = new Auto("AOE 195",Auto.EnumMarca.FORD,"2010",1155000);
		Auto auto2 = new Auto("WFX 323",Auto.EnumMarca.FORD,"2008",2342000);

		System.out.println("AUTO 1 -> TO STRING -> " + auto1.toString());
		
		System.out.println("AUTO 1 -> EQUALS TRY 1 -> AUTO 2 = " + auto1.equals(auto2));
		auto1.setPatente("AEA 191");
		auto2.setPatente("AEA 191");
		System.out.println("AUTO 1 -> EQUALS TRY 2 -> AUTO 2 = " + auto1.equals(auto2));
		
		System.out.println("AUTO 1 -> HASHCODE -> " + auto1.hashCode() + " AUTO 2 -> HASHCODE -> " + auto2.hashCode());
		
	}
}
