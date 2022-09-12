
public class Videojuego implements Entregable{
	
	private String titulo;
	private int horas;
	private boolean entregado;
	private String genero;
	private String compañia;
	
	/**
	 * Constructor por defecto
	 */
	public Videojuego() {
		titulo="";
		horas=10;
		entregado=false;
		genero="";
		compañia="";
	}
	
	/**
	 * Constructor con el titulo y horas estimadas. El resto por defecto
	 * @param t
	 * @param h
	 */
	public Videojuego(String t, int h) {
		titulo=t;
		horas=h;
		entregado=false;
		genero="";
		compañia="";
	}
	/**
	 * Constructor por parametro excepto entregado
	 * @param t
	 * @param h
	 * @param g
	 * @param c
	 */
	public Videojuego(String t, int h, String g, String c) {
		titulo=t;
		horas=h;
		entregado=false;
		genero=g;
		compañia=c;
	}
	
	//GETTERS
	public String getTitulo() {
		return titulo;
	}
	public int getHoras() {
		return horas;
	}
	public String getGenero() {
		return genero;
	}
	public String getCompañia() {
		return compañia;
	}
	
	//SETTERS
	public void setTitulo(String t) {
		titulo=t;
	}
	public void setHoras(int h) {
		horas=h;
	}
	public void setGenero(String g) {
		genero=g;
	}
	public void setCompañia(String c) {
		compañia=c;
	}
	//Metodos de la interfaz
	public void entregar() {
		entregado=true;
	}
	public void devolver() {
		entregado=false;
	}
	public boolean isEntregado() {
		return entregado;
	}
	
	public String compareTo(Object a) {
		String aux;
		Videojuego v=(Videojuego) a;
		if(v.getHoras()>horas) {
			aux=v.getTitulo();
		}
		else {
			aux=titulo;
		}
		return aux;
	}
	
	/**
	 * Metodo toString
	 */
	public String toString() {
		String aux="";
		String e="";
		if(entregado==true) {
			e=" Entregado";
		}
		else {
			e=" NO Entregador";
		}
		aux=aux+" Título-> "+titulo+" Horas estimadas-> "+horas+e+" Genero-> "+genero+" Compañia-> "+compañia;
		return aux;
	}
}
