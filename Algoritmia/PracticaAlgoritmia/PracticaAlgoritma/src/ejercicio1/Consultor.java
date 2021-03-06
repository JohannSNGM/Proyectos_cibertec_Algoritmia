package ejercicio1;

public class Consultor {
	private int codigo, HorasTrab;
	private String nombre;
	private double TarifHoras;
	
	//Contador
	private static int contador;
	
	//Acumulador
	private static double SumaSueldos;
	
	//Variable static
	static final double AFP;
	static final double EPS;
	
	//Bloques de inicializacion
	static{
		contador=0;
		SumaSueldos=0;
		AFP=0.1;
		EPS=0.05;
	}
	
	//Inicializa atributos
	public Consultor(int codigo, int HorasTrab, String nombre, double TarifHoras){
		this.codigo= codigo;
		this.HorasTrab = HorasTrab;
		this.nombre=nombre;
		this.TarifHoras = TarifHoras;
		contador++;
		SumaSueldos = SumaSueldos + calcularSueldoBruto();
	}
	
	//Contructor de tres parametros
	public Consultor(int codigo, int HorasTrab, String nombre){
		this(codigo ,HorasTrab, nombre ,65 );
	}
	
	//Contructor sin parametros
	public Consultor(){
		this(333,30,"Juan");
	}
	
	//Setter y Getters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getHorasTrab() {
		return HorasTrab;
	}

	public void setHorasTrab(int horasTrab) {
		HorasTrab = horasTrab;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getTarifHoras() {
		return TarifHoras;
	}

	public void setTarifHoras(double tarifHoras) {
		TarifHoras = tarifHoras;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Consultor.contador = contador;
	}

	public static double getSumaSueldos() {
		return SumaSueldos;
	}

	public static void setSumaSueldos(double sumaSueldos) {
		SumaSueldos = sumaSueldos;
	}

	public static double getAfp() {
		return AFP;
	}

	public static double getEps() {
		return EPS;
	}

	
	//M?todos
	public double calcularSueldoBruto(){
		return HorasTrab*TarifHoras;
	}
	
	public double calcularDescuentoAFP(){
		return calcularSueldoBruto()*AFP;
	}
	
	public double calcularDescuentoEPS(){
		return calcularSueldoBruto()*EPS;
	}
	
	public double calcularSueldoNeto(){
		return calcularSueldoBruto()-calcularDescuentoAFP()-calcularDescuentoEPS();
	}
	
}
