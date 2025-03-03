package servicios;

import controladores.Inicio;

/**
 * Clase encargada de manejar el menú (y submenús) asociado programa
 * acarrez
 * 03/03/2025
 */

public class MenuImplementacion implements MenuInterfaz {

	byte optUser;
	boolean esCerrado = false;
	OperativaInterfaz operativaInterfaz = new OperativaImplementacion();

	/**
	 * Método encargado del menú principal
	 * acarrez
	 * 03/03/2025
	 */
	
	public void menuPrincipal() {
		do {
			System.out.println("---------------------");
			System.out.println("1. Recursos humanos");
			System.out.println("2. Información personal");
			System.out.println("3. Cerrar aplicación");
			System.out.println("---------------------");
			optUser = Inicio.entrada.nextByte();

			switch (optUser) {
			case 1: {
				menuRH();
				break;
			}
			case 2: {
				menuInfoPersonal();
				break;
			}
			case 3: {
				esCerrado = true;
				break;
			}

			default:
				System.out.println("Esta opción no existe. Por favor, escoja una de la mostradas en el menú.");
				break;
			}
		} while (!esCerrado);
	}

	/**
	 * Método encargado del menú para RRHH
	 * acarrez
	 * 03/03/2025
	 */
	
	@Override
	public void menuRH() {
		do {
			System.out.println("---------------------");
			System.out.println("1. Alta de empleado");
			System.out.println("2. Baja de mepleado");
			System.out.println("3. Listar empleados");
			System.out.println("4. Volver al menú principal");
			System.out.println("---------------------");
			optUser = Inicio.entrada.nextByte();

			switch (optUser) {

			case 1: {
				operativaInterfaz.alta();
				break;
			}
			case 2: {
				operativaInterfaz.baja();
				break;
			}
			case 3: {
				operativaInterfaz.listar();
				break;
			}
			case 4: {
				esCerrado = true;
				break;
			}

			default:
				System.out.println("Esta opción no existe. Por favor, escoja una de la mostradas en el menú.");
				break;
			}
		} while (!esCerrado);
	}

	/**
	 * Método encargado del menú para cambios de información personal
	 * acarrez
	 * 03/03/2025
	 */
	
	@Override
	public void menuInfoPersonal() {
		do {
			System.out.println("---------------------");
			System.out.println("1. Modificar información");
			System.out.println("2. Volver al menú principaln");
			System.out.println("---------------------");
			optUser = Inicio.entrada.nextByte();

			switch (optUser) {
			case 1: {
				operativaInterfaz.modificar();
				break;
			}
			case 2: {
				esCerrado = true;
				break;
			}

			default: 
				System.out.println("Esta opción no existe. Por favor, escoja una de la mostradas en el menú.");
				break;
			}
		} while (!esCerrado);
	}

}
