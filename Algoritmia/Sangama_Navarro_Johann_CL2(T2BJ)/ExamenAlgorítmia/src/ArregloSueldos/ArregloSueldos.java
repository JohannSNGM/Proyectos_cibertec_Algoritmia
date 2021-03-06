package ArregloSueldos;

public class ArregloSueldos {
	
	private int indice;
	private int [] n;
	
	public ArregloSueldos(){
		n = new int [5];
		indice = 0;
	}
	
	public int tamanio(){
		return indice;
	}
	
	public int obtener(int i){
		return n[i];
	}
	
	public void adicionar(int numero){
		if(indice==n.length)
			ampliarArreglo();
		n[indice] = numero;
		indice++;
		System.out.println(numero+"\n");
	}
	
	private void ampliarArreglo(){
		int [] aux = n;
		n = new int[indice+5];
		for (int i=0;i<indice;i++){
			n[i]=aux[i];
		}
	}

	public int posicionUltimoSueldoMenorQue1000(){
		for(int i = indice-1; i>0;i--)
			if(n[i]<1000)
				return i;
		return -1;
	}
	
	public int sumaSueldosMayoresQue850(){
		int suma =0;
		for (int i=0 ;i<n.length; i++){
			if(obtener(i)>850)
				suma=suma+n[indice];
		}
				return suma;
	}
	
	public void reemplazarUltimoSueldoMenorQue1000(){
		for (int i = indice-1; i>0;i--)
			Intercambiar(posicionUltimoSueldoMenorQue1000(),sumaSueldosMayoresQue850());		
	}
	
	public int incrementarSueldosMenoresQue1200(){
		int contador=0;	
		for (int i = 0; i<n.length;i++){
			if (obtener(i)<1200)contador++;
		}	
		return contador;
	}
	
	public void eliminarUltimoSueldoMenorQue1000(){
		int posicion = posicionUltimoSueldoMenorQue1000();
		
		if(posicion!=-1)
			eliminar(posicion);
	}
	
	private void eliminar( int pos){
		for(int i = pos; i<indice-1;i++)
			n[i] = n[i+1];
		indice--;
	}
	private void Intercambiar(int a, int b){
		int aux = a;
		a = b;
		b = aux; 
	}
	
	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}
	
	
}