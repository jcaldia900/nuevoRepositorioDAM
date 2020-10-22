import java.io.Serializable;

public class Libro implements Serializable{
	
	
	private String ISBN;
	private String Titulo;
	private String Autor;
	private int Num_ejemplares;
	public Libro(String iSBN, String titulo, String autor, int num_ejemplares) {
		super();
		ISBN = iSBN;
		Titulo = titulo;
		Autor = autor;
		Num_ejemplares = num_ejemplares;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	public int getNum_ejemplares() {
		return Num_ejemplares;
	}
	public void setNum_ejemplares(int num_ejemplares) {
		Num_ejemplares = num_ejemplares;
	}
	@Override
	public String toString() {
		return "Libro [ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", Num_ejemplares=" + Num_ejemplares
				+ "]";
	}


	

}
