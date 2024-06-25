import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConversionNumeros {

    public static void main(String[] args) {
        // Crear un mapa para almacenar los valores
        Map<String, Integer> textoANumero = new HashMap<>();
        textoANumero.put("cero", 0);
        textoANumero.put("uno", 1);
        textoANumero.put("dos", 2);
        textoANumero.put("tres", 3);
        textoANumero.put("cuatro", 4);
        textoANumero.put("cinco", 5);
        textoANumero.put("seis", 6);
        textoANumero.put("siete", 7);
        textoANumero.put("ocho", 8);
        textoANumero.put("nueve", 9);
        textoANumero.put("diez", 10);
        
        // Agregar más números según sea necesario

        // Leer el texto desde la entrada estándar
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número en palabras (por ejemplo, 'cuatro'): ");
        String input = scanner.nextLine().toLowerCase();

        // Verificar si el texto está en el mapa y mostrar el número correspondiente
        if (textoANumero.containsKey(input)) {
            int numero = textoANumero.get(input);
            System.out.println("El número correspondiente es: " + numero);
        } else {
            System.out.println("Texto no reconocido.");
        }

        scanner.close();
    }
}