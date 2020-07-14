package awake.ejerplo.poo;

public class Pelota {
	//atributos	
	String modelo;  
	String color; 
	String deporte;
	float peso; 
	float radio; 
	boolean Pateada = false;
	
	//intanciar 
	public Pelota() {
		modelo="adidas";  
		color="rojo";
		deporte="no defino";
		peso=100; 
		radio=200; 
	}
	//contructor
	public Pelota(String modelo, String color, String deporte, float peso, float radio) {
		this.modelo = modelo;
		this.deporte = deporte;
		this.peso = peso;
		this.radio = radio;
	}
	
	public String obtenerModelo() {
		return modelo; 
	}
	
	public String obtenerColor() {
		return color;
	}
	public void patearPelota() {
		System.out.println("Haz pateado la pelota");
	}
	public float obtenerPeso() {
		return peso;
	}
	
	public void estaPateada() {
		this.Pateada = true;
		System.out.println("haz pateado nuevamente la pelota");
	}
	
	public void estado() {
		if(this.Pateada ==true)
		System.out.println("La pelota se ha pateado");
		else
		System.out.println("No haz pateado la pelota");
	}
	public void informacion() {
		System.out.println("Soy solo una pelota");
	}
	

	
	

}
