package biblioteca;

public class Librosnuevos {
	
	//Introduccion de constructor
	protected String titulo, isbn, autor, editorial;
	protected boolean alquilado; 

	protected Librosnuevos(String titulo, String isbn, String autor, String editorial) {
		
		this.titulo = titulo;
		this.isbn=isbn;
		this.autor = autor;
		this.editorial = editorial;
		this.alquilado=false;
	}
	
	public String getIsbn() { return isbn; }
    public boolean isAlquilado() { return alquilado; }
    public void setAlquilado(boolean alquilado) { this.alquilado = alquilado; }
    
    

	protected String getTitulo() {
		return titulo;
	}

	protected void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	protected String getAutor() {
		return autor;
	}

	protected void setAutor(String autor) {
		this.autor = autor;
	}

	protected String getEditorial() {
		return editorial;
	}

	protected void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	@Override
	public String toString() {
		return "Librosnuevos [titulo=" + titulo + ", isbn=" + isbn + ", autor=" + autor + ", editorial=" + editorial
				+ ", alquilado=" + alquilado + "]";
	}

	
	
}
