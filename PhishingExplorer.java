import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class PhishingExplorer {
    public static void main(String[] args) {
        // Crea una lista de palabras y frases con su valor de puntos correspondiente
        HashMap<String, Integer> palabrasClave = new HashMap<>();
        palabrasClave.put("Banco", 3);
        palabrasClave.put("PayPal", 3);
        palabrasClave.put("Amazon", 3);
        palabrasClave.put("Apple", 3);
        palabrasClave.put("Microsoft", 3);
        palabrasClave.put("Facebook", 3);
        palabrasClave.put("Instagram", 3);
        palabrasClave.put("Twitter", 3);
        palabrasClave.put("LinkedIn", 3);
        palabrasClave.put("Netflix", 3);
        palabrasClave.put("eBay", 2);
        palabrasClave.put("Chase", 2);
        palabrasClave.put("Citibank", 2);
        palabrasClave.put("Wells Fargo", 2);
        palabrasClave.put("American Express", 2);
        palabrasClave.put("Visa", 2);
        palabrasClave.put("Mastercard", 2);
        palabrasClave.put("Contraseña", 3);
        palabrasClave.put("Verificación de cuenta", 3);
        palabrasClave.put("Actualización de cuenta", 3);
        palabrasClave.put("Problemas de seguridad", 3);
        palabrasClave.put("Phishing", 3);
        palabrasClave.put("Correo electrónico", 2);
        palabrasClave.put("Mensaje de texto", 2);
        palabrasClave.put("Llamada telefónica", 2);
        palabrasClave.put("Oferta especial", 2);
        palabrasClave.put("Descuento", 2);
        palabrasClave.put("Gratis", 2);
        palabrasClave.put("Urgente", 2);
        palabrasClave.put("Dell", 2);

        // Abre el archivo de texto y busca las palabras y frases de la lista
        try {
            File archivo = new File("lista.txt");
            Scanner scanner = new Scanner(archivo);
            int totalPuntos = 0;
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                for (String palabra : palabrasClave.keySet()) {
                    if (linea.contains(palabra)) {
                        int puntos = palabrasClave.get(palabra);
                        totalPuntos += puntos;
                        System.out.println(palabra + " - Ocurrencias: " + linea.split(palabra).length + " - Puntos: " + puntos);
                    }
                }
            }
            System.out.println("Total de puntos: " + totalPuntos);
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no se encontró");
            e.printStackTrace();
        }
    }
}
