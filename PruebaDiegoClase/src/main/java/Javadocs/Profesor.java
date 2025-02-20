package Javadocs;


import java.util.HashMap;

/**
 * La clase Profesor.
 */
public class Profesor extends Persona {

	/** Las asignaturas impartidas por el profesor. */
	HashMap<String, String> asignaturasImpartidas;

	/**
	 * Instante de un nuevo profesor.
	 *
	 * @param nombre, nombre del profesor
	 * @param correo, correo del profesor
	 */
	public Profesor(String nombre, String correo) {
		super(nombre, correo);
		asignaturasImpartidas = new HashMap<>();
	}

	/**
	 * Anadir asignatura.
	 *
	 * @param ID, id de la asignatura
	 * @param nombre, nombre de la asignatura
	 * @return true, si no existe una asigantura con el id elegido o si el id elegido no es vacio
	 */
	public boolean anadirAsignatura(String ID, String nombre) {
		if (asignaturasImpartidas.containsKey(ID)) {
			return false;
		} else if (ID.isEmpty()) {
			return false;
		} else {
			asignaturasImpartidas.put(ID, nombre);
			return true;
		}
	}

	/**
	 * Obtener asignatura.
	 *
	 * @param idBuscado, el id que se usa para encontrar la asignatura
	 * @return el id de la asignatura buscada en string
	 */
	public String obtenerAsignatura(String idBuscado) {
		for (String id : asignaturasImpartidas.keySet()) {
			if (id.equals(idBuscado)) {
				return asignaturasImpartidas.get(id);
			}
		}

		return "";
	}

	/**
	 * Eliminar las asignaturas impartidas.
	 */
	public void eliminarAsignaturas() {
		asignaturasImpartidas.clear();
	}

	/**
	 * Obtener las asignaturas impartidas.
	 *
	 * @return todas las asignaturas impartidas
	 */
	public HashMap<String, String> getAsignaturasImpartidas() {
		return asignaturasImpartidas;
	}

	/**
	 * Pones las asignaturas impartidas.
	 *
	 * @param asignaturasImpartidas, las asignaturas que en profesor impartira
	 */
	public void setAsignaturasImpartidas(HashMap<String, String> asignaturasImpartidas) {
		this.asignaturasImpartidas = asignaturasImpartidas;
	}

}
