package Javadocs;

/**
 * La clase Persona.
 */
public class Persona {
	
	/** El nombre de la persona. */
	protected String nombre;
	
	/** El correo de la persona. */
	protected String correo;

	/**
	 * Recoge el nombre.
	 *
	 * @return el nombre de la asignatura
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Insertas el nombre.
	 *
	 * @param nombre nuevo del estudiante
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Recoge el correo.
	 *
	 * @return el correo de la persona
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * Inserta el correo.
	 *
	 * @param correo nuevo de la persona
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * Instante de una nueva persona.
	 *
	 * @param nombre, nombre de la persona
	 * @param correo, correo de la persona
	 */
	public Persona(String nombre, String correo) {
		this.nombre = nombre;
		this.correo = correo;
	}

	/**
	 * To string.
	 *
	 * @return los datos del la clase persona en un string
	 */
	@Override
	public String toString() {
		return "Persona: nombre = " + nombre + ", correo = " + correo;
	}

}
