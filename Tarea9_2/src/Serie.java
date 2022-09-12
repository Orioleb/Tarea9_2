
public class Serie implements Entregable{
	private String titulo;
	private int ntemporadas;
	private boolean entregado;
	private String creador;
	
	/**
	 * Constructor por defecto
	 */
	public Serie() {
		titulo="";
		ntemporadas=3;
		entregado=false;
		creador="";
	}
	/**
	 * Constructor con titulo y creador y el resto por defecto
	 * @param titulo
	 * @param creador
	 */
	public Serie(String titulo, String creador) {
		this.titulo=titulo;
		ntemporadas=3;
		entregado=false;
		this.creador=creador;
	}
	/**
	 * Constructor por parametro
	 * @param titulo
	 * @param ntemporadas
	 * @param creador
	 */
	public Serie(String titulo, int ntemporadas, String creador) {
		this.titulo=titulo;
		this.ntemporadas=ntemporadas;
		entregado=false;
		this.creador=creador;
	}
	
	//GETTERS
	
	public String getTitulo() {
		return titulo;
	}
	
	public int getNtemporadas() {
		return ntemporadas;
	}
	
	public String getCreador() {
		return creador;
	}
	
	
	//SETTERS
	
	public void setTitulo(String t) {
		titulo=t;
	}
	
	public void setNtemporadas(int n) {
		ntemporadas=n;
	}
	
	public void setCreador(String c) {
		creador=c;
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
	/**
	 * Metodo que compara cual de las dos series tiene mas temporadas y devuelve un string
	 * @param s
	 * @return
	 */
	public String compareTo(Object a) {
		String aux="";
		Serie s=(Serie)a;
		if(s.getNtemporadas()>ntemporadas) {
			aux=s.getTitulo();
		}
		else 
			if(s.getNtemporadas()<ntemporadas) {
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
		aux=aux+" Título-> "+titulo+" Número de temporadas-> "+ntemporadas+e+" Creador-> "+creador;
		return aux;
	}

}
