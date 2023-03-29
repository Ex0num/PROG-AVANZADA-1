
/* ============= EJERCICIO 2* =============*/
public class Motor {

	/*Attributes*/
	private boolean motorPrendido;
	
	/*Constructor*/
	public Motor()
	{
		motorPrendido = false;
	}
	
	/*Getters*/
	public boolean getMotorPrendido()
	{
		return this.motorPrendido;
	}

	/*Setters*/
	public void setMotorPrendido(boolean motorPrendidoRecibido)
	{
		this.motorPrendido = motorPrendidoRecibido;
	}
	
	/*Methods*/
	public void prenderMotor()
	{
		this.setMotorPrendido(true);
	}
	public void apagarMotor()
	{
		this.setMotorPrendido(false);
	}
}
