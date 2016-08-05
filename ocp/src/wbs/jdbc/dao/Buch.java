package wbs.jdbc.dao;

import java.io.Serializable;

public class Buch implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public Buch(String isbn, String titel, String autor, double preis) {
		super();
		this.isbn = isbn;
		this.titel = titel;
		this.autor = autor;
		this.preis = preis;
	}
	public Buch() {
			super();
	}

	private String isbn = "";
	private String titel = "";
	private String autor = "";
	private double preis = 0.0;
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitel() {
		return titel;
	}
	public void setTitel(String titel) {
		this.titel = titel;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public double getPreis() {
		return preis;
	}
	public void setPreis(double preis) {
		this.preis = preis;
	}
	
	@Override
	public String toString() {
		return "Buch [isbn=" + isbn + ", titel=" + titel + ", autor=" + autor + ", preis=" + preis + "]";
	}
	
}
