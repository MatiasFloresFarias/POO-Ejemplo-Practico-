package awake.ejerplo.poo;

public class PelotaDefutbol extends Pelota {
	
	public PelotaDefutbol() {
		this.color="Blanco";
		this.peso=300;
		this.modelo="naiky";
		this.deporte="Futbol";
				
	}
	public void detalle() {
		System.out.println("La pelota utilizada es de " +this.deporte +" y su color es: " + this.color);
	}
	//polimorfism 
	
	public void informacion() {
		System.out.println("ahora soy una pelota de: " + this.deporte);
	}
	
	

}
