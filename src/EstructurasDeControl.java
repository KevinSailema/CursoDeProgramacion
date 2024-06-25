public class EstructurasDeControl {

    public static void main(String[] args) {
        System.out.println("Cadena");

        /*
         * While: Es una estructura que me permite realizar procesos repetitivos mientras se
         * cumpla una condicion logica
         * Se define como haga mientras
         * En la estructura 
         */
        int enteroWhile = 0;
        int enteroWhile2 = 0;
        // 1) Forma de while con expresion algebraica
        
        while (enteroWhile <10) {
        	
        	System.out.println(enteroWhile + " valor dentro del while");
        	enteroWhile++;
        }
        enteroWhile = 0;
        while (enteroWhile <10 || enteroWhile2 < 5 ) {
        	
        	enteroWhile++;
        	enteroWhile2++;
        	System.out.println(enteroWhile + " valor dentro del while 2" + enteroWhile2);
        }
        // 2) Forma de while con variable booleana
        
        boolean banderasWhile = true;
        int valor = 0;
        // El simbolo "==" significa comparacion
        while (banderasWhile == true) {
        	System.out.println("El valor de la variable booleana es verdad " + valor);
        	valor++;
        	if (valor ==10) {
        		//banderasWhile = false;
        		break;
        	}
        }
        /*
         * Do While: Es una estructura que me permite realizar procesos repetitivos mientras se
         * cumpla una condicion logica
         * Se define como haga mientras
         * En la estructura 
         */
        boolean banderaWhile2 = true;
        int valor2 = 0;
        do {
			System.out.println("Dentro del segundo While " + valor2);
			valor2++;
			if (valor2 == 11) { 
				banderaWhile2 = false;
			}
		} while (banderaWhile2 == false);
        
        /*
         * La escturctura Switch es aquella estructura que me permite escoger
         * una opcion dependiendo de un valor determinado
         */
        
        String llave = "";
        llave = llave.toLowerCase();
        switch (llave) {
		case "valor1":
			System.out.println("Usted digito el 1");
			break;
		case "valor2":
			System.out.println("Usted digito el 2");
			break;
		case "valor3":
			System.out.println("Usted digito el 3");
			break;
		case "valor4":
			System.out.println("Usted digito el 4");
			break;
		default:
			System.out.println("Usted no digito ningun valor");
			break;
		}
        
        
    }
}
