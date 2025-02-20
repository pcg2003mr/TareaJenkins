package Javadocs;


import java.util.HashMap;

/**
 * La clase Estudiante.
 * @see Persona#
 */
public class Estudiante extends Persona {
	
	/** Los creditos del estudiante. */
	private final int CREDITOS = 240;
	
	/** Los apellidos del estudiante en un solo String. */
	protected String apellidos;
	
	/** El dni del estudiante. */
	protected String dni = "";
	
	/** La calificacion del estudiante en forma numerica. */
	protected double calificacion = 0;
	
	/** Los creditos del esrudiante. */
	protected int creditos = 0;
	
	/** Las asignaturasa las que atiende el estudiante*/
	protected HashMap<String, Double> asignaturas = new HashMap<>();
	
	/** El id para identificar al estudiante. */
	private static int id = 0;
	
	/**
	 * Instante de un nuevo estudiante.
	 *
	 * @param nombre, el nombre del estudiante
	 * @param apellidos, los apellidos del estudian
	 * @param correo, el correo del estudiante
	 * @param dni, el dni del estudiante
	 */
	public Estudiante(String nombre, String apellidos, String correo, String dni) {
		super(nombre, correo);
		this.apellidos = apellidos;
		this.dni = dni;
	}

	/**
	 * Obtener id.
	 *
	 * @return el dni en int
	 */
	public static int obtenerId() {
		return id++;
	}

	/**
	 * Anadir nota.
	 *
	 * @param cred, los creditos
	 * @param nota, la nota del estudiante
	 * @param nombreAsignatura, el nombre asignatura
	 * @throws IllegalArgumentException the illegal argument exception
	 */
	public void anadirNota(int creds, String nota, String nombreAsignatura) throws IllegalArgumentException {
		double notaModulo;
		if (nota.equals("Sobresaliente"))
			notaModulo = 9.5;
		else if (nota.equals("Notable"))
			notaModulo = 7.5;
		else if (nota.equals("Bien"))
			notaModulo = 6.0;
		else if (nota.equals("Suficiente"))
			notaModulo = 4.0;
		else if (nota.equals("Insuficiente"))
			notaModulo = 1.5;
		else
			throw new IllegalArgumentException();

		if (notaModulo > 5 && !asignaturas.containsKey(nombreAsignatura)) {
			creditos += creds;
		}

		asignaturas.put(nombreAsignatura, notaModulo); 
		
		actualizarNota(notaModulo);
	}

	/**
	 * Actualizar nota.
	 *
	 * @param nota, la nota nueva
	 * @return la nueva calificacion en double
	 */
	private double actualizarNota(double nota) {
		double sumaNotas = 0;
		
		for (Double notaAsig : asignaturas.values()) {
			sumaNotas += notaAsig;
		}

		this.calificacion = sumaNotas / asignaturas.size();

		return calificacion;
	}

	/**
	 * Puede gradruarse.
	 *
	 * @return true, si los creditos son mayor igual a 240 y la nota es mayor o igual a 6 
	 */
	public boolean puedeGradruarse() {
		return (creditos >= CREDITOS) && (calificacion >= 6.0);
	}

	/**
	 * Obtener el año del curso.
	 *
	 * @return el año del curso del estudiante en string
	 */
	public String obtenerAnoCurso() {
		if (creditos < 60)
			return "Primero";
		else if (creditos < 120)
			return "Segundo";
		else if (creditos < 180)
			return "Tercero";
		else
			return "Cuarto";
	}
}
