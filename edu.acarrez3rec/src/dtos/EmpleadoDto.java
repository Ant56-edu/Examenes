package dtos;

/**
 * Clase encargada de manejar los tipos de datos de los empleados y como son mostrados al ser pedidos
 * acarrez
 * 03/03/2025
 */

public class EmpleadoDto {

	long id;
	String nombre;
	String apellido1;
	String apellido2;
	String dni;
	String iban;
	
	@Override
	public String toString() {
		return "%%%%" + "\nNombre=" + nombre + ", Apellidos=" + apellido1 + " ," + apellido2 + ", dni=" + dni + ", iban="
				+ iban.substring(0, 3) + "\n%%%%";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}
	
}
