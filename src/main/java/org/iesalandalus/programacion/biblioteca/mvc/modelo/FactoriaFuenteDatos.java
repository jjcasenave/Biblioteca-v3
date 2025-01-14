/**
 * Crea el enumerado FactoriaFuenteDatos que tendrá un método abstracto llamado crear y que tendrá una única instancia, 
 * por ahora, etiquetada como MEMORIA y que nos devolverá la implementación de la interfaz IFuenteDatos que anteriormente 
 * hemos creado (FactoriaFuenteDatosMemoria). Realiza un commit
 */
package org.iesalandalus.programacion.biblioteca.mvc.modelo;

import org.iesalandalus.programacion.biblioteca.mvc.modelo.negocio.ficheros.FactoriaFuenteDatosFicheros;

/**
 * @author Juanjo
 *
 */
public enum FactoriaFuenteDatos {
	
	FICHEROS {
		@Override
		public IFuenteDatos crear() {
			return new FactoriaFuenteDatosFicheros();
		}
	};

	
	FactoriaFuenteDatos() {
		
	}
	
	public abstract IFuenteDatos crear();
	
	
}