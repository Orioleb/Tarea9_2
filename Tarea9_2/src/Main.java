
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//GENERAMOS LISTAS
		Serie[] llistas;
		llistas=new Serie[5];
		Videojuego[] llistav;
		llistav=new Videojuego[5];
		//CREAMOS Y AÑADIMOS INSTANCIAS
		Serie s1=new Serie("LOST",6,"JUAN");
		Serie s2=new Serie("The walking dead",3,"Mark");
		Serie s3=new Serie("La vida",2,"Carlota");
		Serie s4=new Serie("Entourage",8,"Mark");
		Serie s5=new Serie("La vida",4,"Carlota");
		llistas[0]=s1;
		llistas[1]=s2;
		llistas[2]=s3;
		llistas[3]=s4;
		llistas[4]=s5;
		Videojuego v1=new Videojuego();
		Videojuego v2=new Videojuego("Call of duty", 100);
		Videojuego v3=new Videojuego();
		Videojuego v4=new Videojuego("Uncharted",150,"Aventuras","Ubisoft");
		Videojuego v5=new Videojuego();
		llistav[0]=v1;
		llistav[1]=v2;
		llistav[2]=v3;
		llistav[3]=v4;
		llistav[4]=v5;
		
		//Entregamos en algunas instancias
		llistas[1].entregar();
		llistas[2].entregar();
		llistas[4].entregar();
		llistav[0].entregar();
		llistav[3].entregar();
		//Contamos entregados en las distintas listas
		int conts=0;
		int contv=0;
		for(int i=0;i<llistas.length;i++) {
			if(llistas[i].isEntregado()==true) {
				conts++;
			}
		}
		for(int i=0;i<llistav.length;i++) {
			if(llistav[i].isEntregado()==true) {
				contv++;
			}
		}
		System.out.println("Hay "+conts+" series entregadas y "+contv+" videojuegos entregados");
		System.out.println(compare(llistav,llistas));
		
	}
	private static String compare(Videojuego[] v, Serie[] s) {
		String aux="";
		String aux2="";
		String f="";
		for(int i=0;i<v.length-1;i++) {
			aux=v[i].compareTo(v[i+1]);
		}
		for(int i=0;i<s.length-1;i++) {
			aux2=s[i].compareTo(s[i+1]);
		}
		f="El videojuego con mas horas es "+aux+" y la serie con mas temporadas es "+aux2;
		return f;
	}

}
