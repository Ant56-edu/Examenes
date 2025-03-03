package controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.EmpleadoDto;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;

/**
 * Clase controladora del programa
 * @author acarrez
 * 03/03/2025
 */

public class Inicio {

	static public List<EmpleadoDto> listaEmpleados = new ArrayList<>();
	static public Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		MenuInterfaz menuInterfaz = new MenuImplementacion();
		
		menuInterfaz.menuPrincipal();

	}

}
