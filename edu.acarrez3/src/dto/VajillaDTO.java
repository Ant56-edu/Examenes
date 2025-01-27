package dto;

import java.time.LocalDateTime;

/* Clase que devuelve, establece e imprime valores asociados al programa
 * 27-01-2025
 * AJCS
 */

public class VajillaDTO {

	long idElemento;
	String codigoElemento = "aaaaa";
	String nombreElemento = "aaaaa";
	String descripcionElemento = "aaaaa";
	String fchPorDefecto = "9999-12-31T00:00:00";
	int cantidadElemento = 0;
	LocalDateTime fchAlta = LocalDateTime.parse(fchPorDefecto);
	LocalDateTime fchBaja = LocalDateTime.parse(fchPorDefecto);
	
	/* Método que devuelve el identificador de un elemento de la lista
	 * 27-01-2025
	 * AJCS
	 */
	public long getIdElemento() {
		return idElemento;
	}
	
	/* Método que establece el Identificador de un elemento de la lista
	 * 27-01-2025
	 * AJCS
	 */
	public void setIdElemento(long idElemento) {
		this.idElemento = idElemento;
	}
	
	/* Método que devuelve el código de un elemento de la lista
	 * 27-01-2025
	 * AJCS
	 */
	public String getCodigoElemento() {
		return codigoElemento;
	}
	
	/* Método que establece de un elemento de la lista
	 * 27-01-2025
	 * AJCS
	 */
	public void setCodigoElemento(String codigoElemento) {
		this.codigoElemento = codigoElemento;
	}
	
	/* Método que devuelve el nombre de un elemento de la lista
	 * 27-01-2025
	 * AJCS
	 */
	public String getNombreElemento() {
		return nombreElemento;
	}
	
	/* Método que establece de un elemento de la lista
	 * 27-01-2025
	 * AJCS
	 */
	public void setNombreElemento(String nombreElemento) {
		this.nombreElemento = nombreElemento;
	}
	
	/* Método que devuelve la descripción de un elemento de la lista
	 * 27-01-2025
	 * AJCS
	 */
	public String getDescripcionElemento() {
		return descripcionElemento;
	}
	
	/* Método que establece la descripción de un elemento de la lista
	 * 27-01-2025
	 * AJCS
	 */
	public void setDescripcionElemento(String descripcionElemento) {
		this.descripcionElemento = descripcionElemento;
	}
	
	/* Método que devuelve la cantidad de un elemento de la lista
	 * 27-01-2025
	 * AJCS
	 */
	public int getCantidadElemento() {
		return cantidadElemento;
	}
	
	/* Método que establece la cantidad de un elemento de la lista
	 * 27-01-2025
	 * AJCS
	 */
	public void setCantidadElemento(int cantidadElemento) {
		this.cantidadElemento = cantidadElemento;
	}
	
	/* Método que devuelve la fecha de alta de un elemento de la lista
	 * 27-01-2025
	 * AJCS
	 */
	public LocalDateTime getFchAlta() {
		return fchAlta;
	}
	
	/* Método que establece la fecha de alta de un elemento de la lista
	 * 27-01-2025
	 * AJCS
	 */
	public void setFchAlta(LocalDateTime fchAlta) {
		this.fchAlta = fchAlta;
	}
	
	/* Método que devuelve la fecha de baja de un elemento de la lista
	 * 27-01-2025
	 * AJCS
	 */
	public LocalDateTime getFchBaja() {
		return fchBaja;
	}
	
	/* Método que establece la fecha de baja de un elemento de la lista
	 * 27-01-2025
	 * AJCS
	 */
	public void setFchBaja(LocalDateTime fchBaja) {
		this.fchBaja = fchBaja;
	}
	
	@Override
	/* Método que devuelve los valores asociados a los elementos de la lista
	 * 27-01-2025
	 * AJCS
	 */
	public String toString() {
		return "VajillaDTO [idElemento=" + idElemento + ", nombreElemento=" + nombreElemento + ", cantidadElemento="
				+ cantidadElemento + "]";
	}
	
	
	
	
	
}
