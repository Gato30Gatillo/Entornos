package iesjandula.proyectounidad4.ejercicio45;

public class Libro implements Comparable <Libro> {

	private String titulo;
	private String autor;
	private int anoPublicacion;
	private String editorial;
	private String referenciaBibliografica;
	
	Libro(){
		
	}
	
	Libro(String titulo, String autor, int anoPublicacion, String editorial, String referenciaBibliografica){
		this.titulo=titulo;
		this.autor=autor;
		this.anoPublicacion=anoPublicacion;
		this.editorial=editorial;
		this.referenciaBibliografica=referenciaBibliografica;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getAnoPublicacion() {
		return anoPublicacion;
	}

	public String getEditorial() {
		return editorial;
	}

	public String getReferenciaBibliografica() {
		return referenciaBibliografica;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setAnoPublicacion(int anoPublicacion) {
		this.anoPublicacion = anoPublicacion;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public void setReferenciaBibliografica(String referenciaBibliografica) {
		this.referenciaBibliografica = referenciaBibliografica;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", anoPublicacion=" + anoPublicacion + ", editorial="
				+ editorial + ", referenciaBibliografica=" + referenciaBibliografica + "]";
	}

	@Override
	public int compareTo(Libro o) {
		// TODO Auto-generated method stub
		int compare;
		compare=referenciaBibliografica.compareTo(o.getReferenciaBibliografica());
		return compare;
	}
}
