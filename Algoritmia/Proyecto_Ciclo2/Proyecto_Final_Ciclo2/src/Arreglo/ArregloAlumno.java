package Arreglo;

import java.io.*;
import java.util.ArrayList;
import Clases.Alumno;

public class ArregloAlumno {
	private ArrayList<Alumno> alumno;
	
	public ArregloAlumno() {
		alumno = new ArrayList<Alumno>();

		cargarAlumnos();
	}
	
	public void adicionar(Alumno x) {
		alumno.add(x);
		grabarAlumnos();
	}
	public void eliminar(Alumno x) {
		alumno.remove(x);
		grabarAlumnos();
	}
	public int tamaño() {
		return alumno.size();
	}
	public Alumno obtener(int i) {
		return alumno.get(i);
	}
	public Alumno buscar(int codigo) {
		for (int i = 0; i < alumno.size(); i++) {
			if (alumno.get(i).getCodAlumno() == codigo)
				return alumno.get(i);
		}
		return null;
	}
	
	public int codigoCorrelativo() {
		if (alumno.size() == 0) return 202010001;
		return alumno.get(alumno.size()-1).getCodAlumno() + 1;
	}
	public void ActualizarArchivo() {
		grabarAlumnos();
	}
	
	private void grabarAlumnos() {
		try {
			PrintWriter pw;
			String linea;
			Alumno x;
			pw = new PrintWriter(new FileWriter("Archivos/alumnos.txt"));
			for (int i = 0; i< alumno.size(); i++) {
				x = alumno.get(i);
				linea = x.getCodAlumno() + ";" +
					    x.getNombres() + ";" +
						x.getApellidos() + ";" +
						x.getDni() + ";" +
						x.getEdad() + ";" +
						x.getCelular() + ";" +
						x.getEstado();
				pw.println(linea);
			}
			pw.close();
		}
		catch (Exception e) {
		}
	}
	private void cargarAlumnos() {
		try {
			BufferedReader br;
			String linea, nombres, apellidos, dni;
			String[] s;
			int codAlumno, edad, celular, estado;
			br = new BufferedReader(new FileReader("Archivos/alumnos.txt"));
			while ((linea = br.readLine()) != null) {
				s = linea.split(";");
				codAlumno = Integer.parseInt(s[0]);
				nombres = s[1];
				apellidos = s[2];
				dni = s[3].trim();
				edad = Integer.parseInt(s[4]);
				celular = Integer.parseInt(s[5]);
				estado = Integer.parseInt(s[6]);
				adicionar(new Alumno(codAlumno, nombres, apellidos, dni, edad, celular, estado));
			}
			br.close();
		}
		catch (Exception e) {
		}
	}
}
