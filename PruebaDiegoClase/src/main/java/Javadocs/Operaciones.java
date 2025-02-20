package Javadocs;
public class Operaciones {

	//En el return lo cambiamos de num1 * num1 a num2 * num2
    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }
	
    //No hay cambio
	public static double dividir(int numerador, int denominador) {
		if (denominador == 0) {
			throw new IllegalArgumentException("Denominador no debe ser 0");
		}
		return (double) numerador / (double) denominador;
	}
	
	//Cambiamos el int max de 0 a vector[0]
	public static int encontrarMaximo(int vector[]) {
		int max = vector[0];
		for (int i = 1; i < vector.length; i++) {
			if (max < vector[i])
				max = vector[i];
		}
		return max;
	}
	
	//Cambiamos el double sum de 1 a 0
	public static double media(int[] numbers) {
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) { 
            sum += numbers[i];
        }

        double average = sum / numbers.length; 
        return average;
	}
	
	//Cambiamos los usos de sarray a arr
	public static int[] sortArray(int [] arr) {
		int[] sarray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
	}
}