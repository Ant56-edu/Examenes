package controladores;

import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
import java.util.Scanner;


/* Clase controladora del programa
 * 27-01-2025
 * @author AJCS
 */

public class Inicio {
	
	public static Scanner entrada = new Scanner(System.in);
	
	/* Método iniciador del programa
	 * 27-01-2025
	 * AJCS
	 */
	
	public static void main(String[] args) {
		
		MenuInterfaz menuInterfaz = new MenuImplementacion();
		menuInterfaz.menu();

	}

}
