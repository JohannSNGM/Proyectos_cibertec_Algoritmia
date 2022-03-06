package examen;

public class Vigilante {
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuestTrab() {
		return puestTrab;
	}

	public void setPuestTrab(String puestTrab) {
		this.puestTrab = puestTrab;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	private String nombre,puestTrab;
	private int dni;
	private double sueldo;
	
	public Vigilante(){
		nombre="";
		puestTrab="";
		dni=0;
		sueldo=0;
	}

	public Vigilante(String nombre,String puestTrab, int dni, double sueldo){
		this.nombre=nombre;
		this.puestTrab=puestTrab;
		this.dni=dni;
		this.sueldo=sueldo;
		
	}
	
	public String rangoSueldo(){
		if(sueldo<=1500){
			return "Sueldo menor o igual a 1500";
		}else{
			if(sueldo> 1500 && sueldo<2000){
				return "Sueldo es mayor que 1500 y menor que 2000";
			}else{
				return "Sueldo es mayor o igual que 2000";
			}
		}
	}
	
	public double sueldoNeto(){
		double sueldoNeto=0;
		if(puestTrab=="Supervisor"){
				sueldoNeto= sueldo*0.15;
		}else{
			if(puestTrab=="Agente"){
				sueldoNeto= sueldo*0.05;	
			}
		}
		return sueldoNeto;
	}
	
	public double incrementoSueldo(){
		double incremento=0;
		if(puestTrab=="Supervisor"){
			incremento=sueldoNeto()+sueldo;
			}else{
				if(puestTrab=="Agente"){
					incremento =sueldoNeto()+sueldo;	
					}
				}
		return incremento;
	}
	
	public double descuento(){
		double descuento=0;
		if(puestTrab=="Supervisor"){
			descuento=sueldo-sueldoNeto();
			}else{
				if(puestTrab=="Agente"){
					descuento=sueldo-sueldoNeto();	
					}
				}
		return descuento;
	}
	
}
