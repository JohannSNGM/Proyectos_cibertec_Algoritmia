package Arreglo;

import java.io.*;
import java.util.ArrayList;
import Clases.Retiro;

public class ArregloRetiro {
	private ArrayList<Retiro> retiro;
	
	public ArregloRetiro() {
		retiro = new ArrayList<Retiro>();
		cargarRetiros();
	}
	
	public void adicionar(Retiro x) {
		retiro.add(x);
		grabarRetiros();
	}
	public void eliminar(Retiro x) {
		retiro.remove(x);
		grabarRetiros();
	}
	public int tamaño() {
		return retiro.size();
	}
	public Retiro obtener(int i) {
		return retiro.get(i);
	}
	public Retiro buscar(int codigo) {
		for (int i = 0; i < retiro.size(); i++) {
			if (retiro.get(i).getNumRetiro() == codigo)
				return retiro.get(i);
		}
		return null;
	}
	
	public int codigoCorrelativo() {
		if (retiro.size() == 0) return 200001;
		return retiro.get(retiro.size()-1).getNumRetiro() + 1;
	}
	public void ActualizarArchivo() {
		grabarRetiros();
	}
	
	private void grabarRetiros() {
		try {
			PrintWriter pw;
			String linea;
			Retiro x;
			pw = new PrintWriter(new FileWriter("Archivos/retiros.txt"));
			for (int i = 0; i< retiro.size(); i++) {
				x = retiro.get(i);
				linea = x.getNumRetiro() + ";" +
					    x.getNumMatricula() + ";" +
						x.getFecha() + ";" +
						x.getHora();
				pw.println(linea);
			}
			pw.close();
		}
		catch (Exception e) {
		}
	}
	private void cargarRetiros() {
		try {
			BufferedReader br;
			int numRetiro, numMatricula;
			String fecha, hora, linea;
			String[] s;
			br = new BufferedReader(new FileReader("Archivos/retiros.txt"));
			while ((linea = br.readLine()) != null) {
				s = linea.split(";");
				numRetiro = Integer.parseInt(s[0]);
				numMatricula = Integer.parseInt(s[1]);
				fecha = s[2];
				hora = s[3];
				adicionar(new Retiro(numRetiro, numMatricula, fecha, hora));
			}
			br.close();
		}
		catch (Exception e) {
		}
	}
}
