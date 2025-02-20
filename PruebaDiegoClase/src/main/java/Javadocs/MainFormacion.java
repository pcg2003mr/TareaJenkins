package Javadocs;

import java.util.Scanner;

/**
 * La clase MainFormacion.
 */
public class MainFormacion {

	/**
	 * El metodo principal.
	 *
	 * @param args, los argumentos del metodo
	 */
	public static void main(String[] args) {

		int opcion;
		Estudiante estudiante = new Estudiante("Eufrasio", "Nava", "eufrasi@gmail.com", "74584927M");
		try (Scanner sc = new Scanner(System.in)) {

			do {
				System.out.println();
				System.out.println("Introduce una opcion");
				System.out.println("1. Anadir nota");
				System.out.println("2. ¿Puede graduarse?");
				System.out.println("3. Obtener ano curso");
				System.out.println("4. Salir");
				System.out.println();
				opcion = Integer.parseInt(sc.nextLine());

				switch (opcion) {

				case 1:
					System.out.println("Introduce el nombre de la asignatura");
					String nombre = sc.nextLine();
					System.out.println("Introduce la nota de la asignatura");
					String nota = sc.nextLine();
					System.out.println("Introduce los creditos de la asignatura");
					int creditos = Integer.parseInt(sc.nextLine());

					try {
						estudiante.anadirNota(creditos, nota, nombre);
					} catch (IllegalArgumentException ex) {
						System.out.println("Nota no valida");
					}
					break;

				case 2:
					boolean grad = estudiante.puedeGradruarse();

					if (grad) {
						System.out.println("El estudiante puede graduarse");
					} else {
						System.out.println("El estudiante no puede graduarse, " + "debe ir a recuperacion");
					}
					break;

				case 3:
					System.out.println("El estudiante esta en el curso de " + estudiante.obtenerAnoCurso());
					break;

				case 4:
					break;

				default:
					System.out.println("Opcion no valida");
				}

			} while (opcion != 4);

		} catch (Exception ex) {
			System.out.println("Excepcion capturada");
		}
	}

}
