import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;



public class EjemploEjercicio4 {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		EntradaSalida es = new EntradaSalida();
		String nombreFichero=null;
		
		// TODO Auto-generated method stub
		
		System.out.println("Introduzca el nombre del fichero: ");
		nombreFichero=es.leerTextoDeTeclado();
		
		crearFicheroBinario(nombreFichero);
		// es.leer();
		
		}
		
		private static void crearFicheroBinario(String nombreFichero) throws FileNotFoundException, IOException {
	       
			
			String ruta ="src/";
			String dividido[];
			String linea;
			
			
			
			//File fichero=new File(ruta+nombreFichero);
			// fichero=File(ruta);
             
		     //fichero.createNewFile();
			try (BufferedReader reader=new BufferedReader(new FileReader(nombreFichero));
					DataOutputStream filtroEscritura=new DataOutputStream(new FileOutputStream(".bin"));
					
					){
				EntradaSalida es = new EntradaSalida();
				linea=reader.readLine();
				while ( linea!=null){
					dividido=linea.split(";");
					filtroEscritura.writeInt(Integer.parseInt(dividido[0]));
					filtroEscritura.writeUTF(dividido[1]);
					filtroEscritura.writeInt(Integer.parseInt(dividido[2]));
					System.out.println("Leído: "+ linea);
					linea=reader.readLine();
				}
			
	

} catch (FileNotFoundException e) {
	System.out.println("No pudo crearse el fichero");
}
		}
		

}