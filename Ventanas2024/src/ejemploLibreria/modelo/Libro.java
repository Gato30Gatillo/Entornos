package ejemploLibreria.modelo;

public class Libro implements Comparable <Libro> {

	private String titulo;
	private String autor;
	private String anoPublicacion;
	private String editorial;
	private String referenciaBibliografica;
	
	Libro(){
		
	}
	
	public Libro(String titulo, String autor, String anoPublicacion, String editorial, String referenciaBibliografica){
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

	public String getAnoPublicacion() {
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

	public void setAnoPublicacion(String string) {
		this.anoPublicacion = string;
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
