import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Ejercicio3 {
	//Utilizar ArrayList no leerlo todo
	// NO cargar memoria a todo 
	//mkdir

	public static final String COMILLAS = ",";

	public static void main(String[] args) {
	 
	 BufferedReader bufferLectura = null;
	 try {
	  // Abrir el .csv en buffer de lectura
	  bufferLectura = new BufferedReader(new FileReader("src/alumnos.csv"));
	  
	  // Leer una linea del archivo
	  String linea = bufferLectura.readLine();
	  
	  while (linea != null) {
	   // Sepapar la linea leída 
	   String[] campos = linea.split(COMILLAS); 
	   
	   System.out.println(Arrays.toString(campos));
	   
	   // Volver a leer otra línea del fichero
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
