package awake.ejerplo.poo;

public class PelotaDeTenis extends Pelota {
	
	public PelotaDeTenis() {
		
		deporte = "Tenis";
		this.color="Verde";
	}
	public void informacion() {
		System.out.println("Ahora soy una pelota de tenis: " + this.deporte);
	}
}
