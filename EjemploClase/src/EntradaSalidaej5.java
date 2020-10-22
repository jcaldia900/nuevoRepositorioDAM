import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class EntradaSalidaej5 {

	public static final String SEPARADOR = ",";

	public static void main(String[] args) {
	 
	 BufferedReader bufferLectura = null;
	 try {
	  // Abrir el .csv en buffer de lectura
	  bufferLectura = new BufferedReader(new FileReader("libros.csv"));
	  
	  // Leer una linea del archivo
	  String linea = bufferLectura.readLine();
	  
	  while (linea != null) {
	   // Sepapar la linea le�da con el separador definido previamente
	   String[] campos = linea.split(SEPARADOR); 
	   
	   System.out.println(Arrays.toString(campos));
	   
	   // Volver a leer otra l�nea del fichero
	   linea = bufferLectura.readLine();
	  }
	 } 
	 catch (IOException e) {
	  e.printStackTrace();
	 }
	 finally {
	  // Cierro el buffer de lectura
	  if (bufferLectura != null) {
	   try {
	    bufferLectura.close();
	   } 
	   catch (IOException e) {
	    e.printStackTrace();
	   }
	  }
	 }
	}

}
