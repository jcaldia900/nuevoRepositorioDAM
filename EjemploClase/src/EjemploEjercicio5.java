import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class EjemploEjercicio5 {
	private static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombreFichero;
		System.out.println("Introduce el nombre del fichero:");
		nombreFichero=teclado.nextLine();
		
		crearFichero(nombreFichero);
		
		

	}
private static void crearFichero(String nombreFichero) {
	
	EntradaSalidaej5 es = new EntradaSalidaej5();
	
		
		ArrayList<String> ISBN = new ArrayList<String>();
		ArrayList<String> Titulo = new ArrayList<String>();
		ArrayList<String> Autor = new ArrayList<String>();
		ArrayList<Integer> Num_Ejemplares = new ArrayList<Integer>();
		String dividido[];
		
	
		     //crea el fichero
		try (// FileOutputStream flujoEscritura = new FileOutputStream(nombreFichero);
				 BufferedReader bufferLectura = new BufferedReader(new FileReader("src/"+nombreFichero+".csv"));
				// (donde vas a escribir el objeto)
				ObjectOutputStream filtroEscritura = new ObjectOutputStream(new FileOutputStream(nombreFichero+".obj"));){
			
			// Escribir los objetos
			String linea=bufferLectura.readLine();
			//para que ejecute todas las lineas y no solo 1 
			
			while(linea!=null) {
				dividido= linea.split(";");
				ISBN.add(dividido[0]);
				Titulo.add(dividido[1]);
				Autor.add(dividido[2]);
				Num_Ejemplares.add(Integer.parseInt(dividido[3]));
				// para que no entre en bucle y siga pasando de linea
			   linea=bufferLectura.readLine();
				
				}
		
			for (int i = 0; i < ISBN.size(); i++) {
				
				Libro libro = new Libro(ISBN.get(i),Titulo.get(i),Autor.get(i),Num_Ejemplares.get(i));
				System.out.println(1);
				filtroEscritura.writeObject(libro);
				System.out.println(2);
				
			}
			 filtroEscritura.close();
			
		

		} catch (FileNotFoundException e) {
			System.out.println("No pudo crearse el fichero");
			
		} catch (IOException e) {
			System.out.println("Error al escribir en el fichero");
	
		
		}
}

}
