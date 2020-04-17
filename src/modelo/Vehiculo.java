package modelo;

/**
 * Representa a un vehículo en alquiler
 * De esta clase no se crearán instancias
 * 
 * De un vehículo se conoce su matrícula, marca, modelo y el precio a pagar por
 * día de alquiler
 * 
 * Para todo vehículo se puede calcular su coste de alquiler que depende del nº
 * de días que se alquile (llamaremos a esta operación calcularPrecioAlquiler() )
 * 
 * Dos vehículos pueden compararse por su matrícula (es su orden natural)
 * 
 * Dos vehículos son iguales si además de pertenecer a la misma clase tienen la
 * misma matrícula
 * 
 */
public class Vehiculo {
	private String matricula;
	private String marca;
	private String modelo;
	private double precioDia;

	/**
	 * Constructor
	 */
	public Vehiculo(String matricula, String marca, String modelo,
	        double precioDia) {
		this.matricula = matricula.toUpperCase();
		this.marca = marca.toUpperCase();
		this.modelo = modelo.toUpperCase();
		this.precioDia = precioDia;

	}
	
	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}
	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return the precioDia
	 */
	public double getPrecioDia() {
		return precioDia;
	}
	/**
	 * @param precioDia the precioDia to set
	 */
	public void setPrecioDia(double precioDia) {
		this.precioDia = precioDia;
	}

	/**
	 * Redefinici�n de este m�todo
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
		{
			return false;
		}
		if (obj == this)
		{
			return true;
		}
		if (this.getClass() != obj.getClass())
		{
			return false;
		}
		Vehiculo ve = (Vehiculo) obj;
		return ve.getMatricula().equals(this.getMatricula());
	}

	/**
	 * Redefinición de hashCode()
	 * 
	 */
	@Override
	public int hashCode() {
		return matricula.hashCode() * 13;
	}
	
	@Override
	public String toString() {
		return this.getClas().toUpperCase() +
				"\nMatr�cula: " + this.getMatricula() +
				"\nMarca: " + this.getMarca()+
				"\nMarca: " + this.getMarca() +
				"\nModelo: " + this.getModelo() +
				"\nPrecio d�a alquiler: " + this.getPrecioDia() + "�";
	
	
}