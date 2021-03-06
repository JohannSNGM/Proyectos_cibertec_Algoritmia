package semana_02;

public class Pelota {
	private String Codigo, Marca;
	private double PesoGramos,PresionLibras,DiamCentim, Precio;
	
	//Contructor 
	public Pelota(){
		Codigo = "";
		Marca= "";
		PesoGramos = 0;
		PresionLibras = 0;
		DiamCentim = 0;
		Precio = 0;
	}
	
	public Pelota(String Codigo,  String Marca, double PesoGramos, double PresionLibras, double DiamCentim, double Precio){
		this.Codigo= Codigo;
		this.Marca = Marca;
		this.PesoGramos=PesoGramos;
		this.PresionLibras= PresionLibras;
		this.DiamCentim=DiamCentim;
		this.Precio=Precio;
	}

	
	//Setters y Getters
	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public double getPesoGramos() {
		return PesoGramos;
	}

	public void setPesoGramos(double pesoGramos) {
		PesoGramos = pesoGramos;
	}

	public double getPresionLibras() {
		return PresionLibras;
	}

	public void setPresionLibras(double presionLibras) {
		PresionLibras = presionLibras;
	}

	public double getDiamCentim() {
		return DiamCentim;
	}

	public void setDiamCentim(double diamCentim) {
		DiamCentim = diamCentim;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}
	
	
	//M?todos
	public double calcularRadio(){
		return DiamCentim/2;
	}
	
	public double calcularVolumen(){
		return (4*3.1416*calcularRadio()*calcularRadio()*calcularRadio()/3);
	}
	
	public double calcularDesc(){
		return Precio*0.10;
	}
	
	public double calcularImporte(){
		return Precio-calcularDesc();
	}
	
	public String concatenacion(){
		return (Codigo.substring(0,2) + "-"+Marca.substring((Marca.length()-3),Marca.length()));
	}
	
	
	
}
