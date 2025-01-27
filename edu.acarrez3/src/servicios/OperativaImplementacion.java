package servicios;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import controladores.Inicio;
import dto.VajillaDTO;

/* Clase que maneja la operativa del programa
 * 27-01-2025
 * AJCS
 */
public class OperativaImplementacion implements OperativaInterfaz {

	String nombre;
	String descripcion;
	int cantidad;
	String codigoAux;
	LocalDateTime[] aux;
	boolean noFchBaja;
	VajillaDTO dto = new VajillaDTO();
	List<VajillaDTO> lista = new ArrayList<VajillaDTO>();
	
	/* Método para la dada de alta de productos
	 * 27-01-2025
	 * AJCS
	 */
	public void alta() {
		
		//Limpiado de buffer
		Inicio.entrada.nextLine();
		
		System.out.println("Escriba el nombre del elemento: ");
		nombre = Inicio.entrada.nextLine();
		dto.setNombreElemento(nombre);
		System.out.println("Escriba la descripción del elemento: ");
		descripcion = Inicio.entrada.nextLine();
		dto.setDescripcionElemento(descripcion);
		System.out.println("Escriba la cantidad de stock del elemento: ");
		cantidad = Inicio.entrada.nextInt();
		dto.setCantidadElemento(cantidad);
		dto.setCodigoElemento(dto.getNombreElemento() + dto.getIdElemento());
		dto.setFchAlta(LocalDateTime.now());
		dto.setIdElemento(dto.getIdElemento()+1);
	    lista.addLast(dto);
	    System.out.println(lista.toString());
	}

	/* Método para la modificación del stock de productos
	 * 27-01-2025
	 * AJCS
	 */
	public void modificacion() {
		
		//Limpiado de buffer
		Inicio.entrada.nextLine();
		
		//Para la comprobación de la fecha de baja
				if (dto.getFchBaja() == LocalDateTime.now()) {
					noFchBaja = false;
				}
		
		System.out.println("Escriba el código del elemento a modificar: ");
		codigoAux = Inicio.entrada.nextLine();
		if (codigoAux.equals(dto.getCodigoElemento()) && noFchBaja == false) {
			System.out.println("Escriba la cantidad de stock del elemento: ");
			cantidad = Inicio.entrada.nextInt();
			dto.setCantidadElemento(cantidad);
			System.out.println(lista.toString());
		} else {
			System.out.println("No se ha podido encontrar el elemento buscado.");
		}
		
	}

	/* Método para la dada de baja de productos
	 * 27-01-2025
	 * AJCS
	 */
	public void baja() {
		
		//Limpiado de buffer
		Inicio.entrada.nextLine();
		
		//Para la comprobación de la fecha de baja
				if (dto.getFchBaja() == LocalDateTime.now()) {
					noFchBaja = false;
				}
		
		System.out.println("Escriba el código del elemento a modificar: ");
		codigoAux = Inicio.entrada.nextLine();
		if (codigoAux.equals(dto.getCodigoElemento())  && noFchBaja == false) {
			dto.setFchBaja(LocalDateTime.now());
			System.out.println("Elemento dado de baja con éxito.");
			System.out.println(lista.toString());
		} else {
			System.out.println("No se ha podido encontrar el elemento buscado.");
		}
		
	}
	
}
