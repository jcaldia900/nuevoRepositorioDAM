import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class EntradaSalida {
	
	 public String leerTextoDeTeclado() {
	        Scanner entrada = new Scanner(System.in);
	        return entrada.nextLine();
	    }
	 public int leerIntTeclado() {
	        Scanner entrada = new Scanner(System.in);
	        return entrada.nextInt();
	    }
	 public void leer() throws IOException {
		 boolean finDeFichero=false;
		 try(DataInputStream inputStream=new DataInputStream(new FileInputStream("nuevofichero.bin"))){
			 
			 while(!finDeFichero) {
				 
				 try {
					 
					 System.out.println("Codigo"+inputStream.readInt());
					 System.out.println("Nombre Pel"+inputStream.readUTF());
					 System.out.println("alquiler"+inputStream.readInt());
				 }catch(EOFException e){finDeFichero=true;}
				 
			 }
			 
		 }catch(FileNotFoundException e) {e.printStackTrace();}
		 
		 
		 
		 
	 }

}
