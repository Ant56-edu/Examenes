package servicios;

import controladores.Inicio;

/* Clase para la selección de opciones del programa
 * 27-01-2025
 * AJCS
 */
public class MenuImplementacion implements MenuInterfaz{

	OperativaInterfaz operativaInterfaz = new OperativaImplementacion();

	int opcionUsuario = 0;
	boolean esCerrado = false;
	
	/* Método para la selección de opciones
	 * 27-01-2025
	 * AJCS
	 */
	public void menu() {
		
		do {
		System.out.println("---------------------------");
		System.out.println("1. Alta de elemento");
		System.out.println("2. Modificación de elemento");
		System.out.println("3. Eliminación de elemento");
		System.out.println("4. Cerrar programa");
		System.out.println("---------------------------");	
		System.out.println("Seleccione una de las opciones: ");
		opcionUsuario = Inicio.entrada.nextInt();
		
		switch (opcionUsuario) {
		case 1: {
			
			operativaInterfaz.alta();
			break;
			
		}
		
		case 2: {
			
			operativaInterfaz.modificacion();
			break;
			
		}
		
		case 3: {
			
			operativaInterfaz.baja();
			break;
			
		}
		
		case 4: {
			
			esCerrado = true;
			break;
			
		}
		
		default:
			System.out.println("Esta opción no existe. Por favor, seleccione una opción del menú");
			break;
		}
		
		} while (!esCerrado);
		
	}
	
}
