package arreglo;

public class ArregloEdades {

	private int edades[];
	private int indice;

	public ArregloEdades() {
		edades = new int[10];
		indice = 0;
	}

	public int obtenerEdad(int p) {
		return edades[p];
	}
	
	public void establecerEdad(int edad, int posicion) {
		if (posicion >= 0 && posicion < edades.length) {
			edades[posicion] = edad;
		}
	}

	public int tamaño() {
		return indice;
	}

	public void adicionarEdad(int numero) {
		if (edades.length == indice)
			ampliarArreglo();
		edades[indice] = numero;
		indice++;
		System.out.println(edades[0]);
	}

	private void ampliarArreglo() {
		int aux[] = edades;
		edades = new int[indice + 10];
		for (int i = 0; i < indice; i++) {
			edades[i] = aux[i];
		}
	}

	public int posicionEdad() {
		int pos = -1;
		int contador = 0;
		for (int i = 0; i < tamaño(); i++) {
			if (obtenerEdad(i) % 10 == 0) {
				contador++;
			}
			if (contador == 3) {
				pos = i;
			}
		}

		return pos;
	}

	public int TerceraEdadMultiplo10() {
		int pos = posicionEdad();
		int edad = -1;
		if (pos >= 0) {
			edad = obtenerEdad(pos);
		}
		return edad;
	}

	public int sumaMayores() {
		int suma = 0;
		for (int i = 0; i < tamaño(); i++) {
			if (obtenerEdad(i) > 17) {
				suma += obtenerEdad(i);
			}

		}
		
		return suma;
	}

	public int sumaMenores() {
		int suma = 0;
		for (int i = 0; i < tamaño(); i++) {
			if (obtenerEdad(i) < 18) {
				suma += obtenerEdad(i);
			}
		}
		return suma;
	}

	public void reemplazar() {
		for (int i = 0; i < tamaño(); i++) {
			intercambiar(TerceraEdadMultiplo10(), sumaMayores());
		}
	}

	private void intercambiar(int a, int b) {
		int aux = a;
		a = b;
		b = aux;
	}

	public void eliminar(int posicion) {
		int tamaño = tamaño();
		int aux[] = new int[tamaño - 1];
		
		int contador = 0;
		for (int i = 0; i < tamaño(); ++i) {
			if (i != posicion) {
				aux[contador] = obtenerEdad(i);
				contador++;
			}
		}
		
		indice--;
		edades = aux;
	}
	
	public void reemplazarEdad() {
		int posicion = posicionEdad();
		int suma = sumaMenores();
		
		if (posicion >= 0) {
			establecerEdad(posicion, suma);
		}
	}
	
	public void eliminarEdad() {
		int posicion = posicionEdad();
		
		if (posicion >= 0) {
			eliminar(posicion);
		}
	}
	
	public void incrementarEdad() {
		int posicion = posicionEdad();
		
		if (posicion >= 0) {
			int indicePenultimo = tamaño() - 2;
			if (indicePenultimo >= 0) {
				establecerEdad(obtenerEdad(posicion) + obtenerEdad(indicePenultimo), posicion);
			}
		}
	}
	
	public String mostrar() {
		String arreglo = "";
		for (int i = 0; i < tamaño(); ++i) {
			arreglo += obtenerEdad(i) + ",";
		}
		
		return arreglo;
	}
}