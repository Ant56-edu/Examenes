package servicios;

import controladores.Inicio;
import dtos.EmpleadoDto;

/**
 * Clase encargada de manejar la operativa del programa
 * acarrez
 * 03/03/2025
 */

public class OperativaImplementacion implements OperativaInterfaz {

	boolean valido;

	/**
	 * Método encargado de la dada de alta de empleados
	 * acarrez
	 * 03/03/2025
	 */
	
	@Override
	public void alta() {

		Inicio.entrada.nextLine(); //Limpiado de buffer
		
		EmpleadoDto dto = new EmpleadoDto();
		String ibanAux;

		System.out.println("Escriba su nombre completo: ");
		String nombreCompleto = Inicio.entrada.nextLine();
		String nCompArray[] = nombreCompleto.split(" ");
		if (nCompArray.length == 3) {
			dto.setNombre(nCompArray[0]);
			dto.setApellido1(nCompArray[1]);
			dto.setApellido2(nCompArray[2]);
		} else if (nCompArray.length == 2) {
			dto.setNombre(nCompArray[0]);
			dto.setApellido1(nCompArray[1]);
			dto.setApellido2("");
		}
		
		System.out.println("Escriba el número de su DNI: ");
		int dniNumero = Inicio.entrada.nextInt();
		Inicio.entrada.nextLine(); //Limpiado de buffer
		System.out.println("Escriba la letra de su DNI: ");
		String dniLetra = Inicio.entrada.nextLine();
		verificar(dniLetra, dniNumero);
		dto.setDni(dniNumero + dniLetra);
		System.out.println("Escriba su IBAN (sin espacios): ");
		ibanAux = Inicio.entrada.nextLine();
		if (ibanAux.length() == 24) {
			dto.setIban(ibanAux);
		} else {
			valido = false;
		}
		if (valido == true) {
			dto.setId(Inicio.listaEmpleados.size() + 1);
			Inicio.listaEmpleados.add(dto);
			System.out.println("Empleado dado de alta con éxito.");
		} else {
			System.out.println("Emplado no dado de alta. El DNI o el IBAN no són válidos");
		}
	}
	
	/**
	 * Método encargado de la dada de baja de los empleados
	 * acarrez
	 * 03/03/2025
	 */

	@Override
	public void baja() {
		Inicio.entrada.nextLine(); //Limpiado de buffer
		System.out.println("Escriba el DNI del empleado a dar de baja: ");
		String dniBaja = Inicio.entrada.nextLine();

		for (EmpleadoDto empleado : Inicio.listaEmpleados) {
			if (empleado.getDni() == dniBaja) {
				Inicio.listaEmpleados.remove(empleado);
				break;
			} else {
				System.out.println("No hay ningún empleado asociado a este DNI.");
				break;
			}
		}

	}

	/**
	 * Método encargado de mostrar la lista de empleados
	 * acarrez
	 * 03/03/2025
	 */
	
	@Override
	public void listar() {

		for (EmpleadoDto empleado : Inicio.listaEmpleados) {
			System.out.println(empleado.toString());
		}

	}
	
	/**
	 * Método encargado de modificar el IBAN del empleado
	 * acarrez
	 * 03/03/2025
	 */

	@Override
	public void modificar() {
		Inicio.entrada.nextLine(); //Limpiado de buffer
		
		System.out.println("Escriba el DNI para poder modificar sus datos: ");
		String dniMod = Inicio.entrada.nextLine();

		for (EmpleadoDto empleado : Inicio.listaEmpleados) {
			if (empleado.getDni() == dniMod) {
				System.out.println("Escriba su nuevo IBAN: ");
				String ibanAux = Inicio.entrada.nextLine();
				if (ibanAux.length() == 24) {
					empleado.setIban(ibanAux);
				} else {
					System.out.println("EL IBAN introducido no es válido.");
				}
				break;
			} else {
				System.out.println("No hay ningún empleado asociado a este DNI.");
				break;
			}
		}

	}
	
	/**
	 * Método encargado de la verificación de DNI
	 * acarrez
	 * 03/03/2025
	 */

	public void verificar(String letra, int numero) {
		String letraAux = null;

		int resultado = (numero % 23);

		switch (resultado) {
		case 0: {
			letraAux = "T";
			break;
		}
		case 1: {
			letraAux = "R";
			break;
		}
		case 2: {
			letraAux = "W";
			break;
		}
		case 3: {
			letraAux = "A";
			break;
		}
		case 4: {
			letraAux = "G";
			break;
		}
		case 5: {
			letraAux = "M";
			break;
		}
		case 6: {
			letraAux = "Y";
			break;
		}
		case 7: {
			letraAux = "F";
			break;
		}
		case 8: {
			letraAux = "P";
			break;
		}
		case 9: {
			letraAux = "D";
			break;
		}
		case 10: {
			letraAux = "X";
			break;
		}
		case 11: {
			letraAux = "B";
			break;
		}
		case 12: {
			letraAux = "N";
			break;
		}
		case 13: {
			letraAux = "J";
			break;
		}
		case 14: {
			letraAux = "Z";
			break;
		}
		case 15: {
			letraAux = "S";
			break;
		}
		case 16: {
			letraAux = "Q";
			break;
		}
		case 17: {
			letraAux = "V";
			break;
		}
		case 18: {
			letraAux = "H";
			break;
		}
		case 19: {
			letraAux = "L";
			break;
		}
		case 20: {
			letraAux = "C";
			break;
		}
		case 21: {
			letraAux = "K";
			break;
		}
		case 22: {
			letraAux = "E";
			break;
		}
		default:
			break;
		}

		if (letra.equals(letraAux) && numero > 9999999) {
			valido = true;
		}
	}

}
