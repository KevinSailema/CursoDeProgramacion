
public class arregloBidimensional {

	public static void main(String[] args) {
		/*
		 * UN arreglo bidimensional, es aquella estructura de datos, la cual va
		 * a almacenar informacion, en filas y columnas. Estas filas y columnas
		 * van a tener posiciones determinadas y seran de tamano fijas.
		 * Cada uno de los elementos que se encuentran definidos dentor de un arreglo
		 * bidimensional o matriz se los accedera a traves de sus coordenadas
		 * de filas y columnas
		 */
		// [filas][columnas] nombreMatriz
		int [][] matrizEntera = new int [3][3];
		int [][] matrizEnteraRandom = new int[5][4];
		int [][] matrizxD = new int[5][4];
		
		// Lenado simple
		matrizEntera[0][0] = 5;
		matrizEntera[0][1] = 6;
		matrizEntera[0][2] = 7;
		matrizEntera[1][0] = 1;
		matrizEntera[1][1] = 2;
		matrizEntera[1][2] = 3;
		matrizEntera[2][0] = 8;
		matrizEntera[2][1] = 9;
		matrizEntera[2][2] = 10;
		
		System.out.println(matrizEntera);
		imprimirMatrizEntera(matrizEntera);
		matrizEnteraRandom = llenarMatrizEntera(matrizEnteraRandom.length, matrizEnteraRandom[0].length);
		imprimirMatrizEntera(matrizEnteraRandom);
	}

	public static void imprimirMatrizEntera(int[][] matrizEnteraRandom) {
		for(int i =0; i<matrizEnteraRandom.length;i++) {
			// matrizEntera[0].length significa tome el valor de las columnas
			for(int j=0; j<matrizEnteraRandom[0].length; j++) {
				System.out.print(matrizEnteraRandom[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

	private static int[][] llenarMatrizEntera(int filas, int columnas) {
		int [][] matrizRetorno = new int[filas][columnas];
		for(int i = 0; i < filas; i++) {
			for(int j=0; j<columnas; j++) {
				matrizRetorno[i][j] = (int)((Math.random()*24)+27);
			}
		}
		return matrizRetorno;
	}



}
