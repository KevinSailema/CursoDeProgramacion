
public class ArreglosYEstructurasdeDatos {

	public static void main(String[] args) {
		/*
		 *  Asignacion de espacio de memoria
		 *  Es decir se completa la matriz con valores nulos
		 *  o ceros para que se verifique los datos de una estructura
		 *  de datos.
		 */
		String [] matriz1 = new String [10];
		int [] matriz2 = new int [10];
		char [] matriz3 = new char [10];
		String [] matriz4 = new String [10];
		int [] matriz5 = new int [10];
		char [] matriz6 = new char [10];
		double [] matriz7 = new double [10];
		
		matriz1 = llenarMatrizTexto(matriz1.length);
		matriz2 = llenarMatrizEntero(matriz2.length);
		matriz3 = llenarMatrizCaracter(matriz3.length);
		matriz4 = llenarMatrizTexto(matriz4.length);
		matriz5 = llenarMatrizEntero(matriz5.length);
		matriz6 = llenarMatrizCaracter(matriz6.length);
		matriz7 = llenarMatrizDouble(matriz7.length);
		
	}



	public static double[] llenarMatrizDouble(int length) {
		// Matriz entre 20 y 70
		double [] arregloALlenar = new double[length];
		for(int i = 0; i < length; i++) {
			arregloALlenar[i]= (char)(Math.random()*50+50);
		}
		return arregloALlenar;
	}



	private static int[] llenarMatrizEntero(int length) {
		int [] arregloALlenar = new int[length];
		for(int i = 0; i < length; i++) {
			arregloALlenar[i]= (int)(Math.random()*50+50);
		}
		return arregloALlenar;
	}

	private static String[] llenarMatrizTexto(int length) {
		String[] palabrasAleatorias = {"T1","T2","T3","T4","T5","T6","T7","T8","T9","T10"};
		String [] arregloALlenar = new String[length];
		for(int i = 0; i < length; i++) {
			arregloALlenar[i]= palabrasAleatorias[(int)(Math.random()*11)];
		}
		return arregloALlenar;
	}

	public static char[] llenarMatrizCaracter(int length) {
		char [] arregloALlenar = new char[length];
		for(int i = 0; i < length; i++) {
			arregloALlenar[i]= (char)(Math.random()*50+50);
		}
		return arregloALlenar;
	}


}
