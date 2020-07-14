package awake.ejerplo.poo;

import java.util.Scanner;

//import awake.ejerplo.poo.Pelota;
//import awake.ejerplo.poo.PelotaDeTenis;

public class Main {

	public static void main(String[] args) {

		
/*		String nombre; 
		
		Pelota p;
		p=new Pelota();
		System.out.println("introduzca su color de tu pelota");
		Scanner teclado= new Scanner(System.in); 
		p.color = teclado.nextLine();
		System.out.println("Tu color es .." + p.color);
		
		System.out.println("introduzca su nombre"); 
		nombre = teclado.nextLine(); 
		System.out.println("Tu nombre es .." + nombre);
		
		*/
		Pelota p; 
		p =new Pelota();
		p.informacion();
		
		PelotaDeTenis t; 
		t = new PelotaDeTenis();
		t.informacion();
	
		PelotaDefutbol f;
		f = new PelotaDefutbol();
		f.informacion();
		
		
	/*	Pelota p; 
		p =new Pelota();
		String color=p.obtenerColor();
		System.out.println("El color de la pelota es: " + color);
		
		float peso=p.obtenerPeso();
		System.out.println("El peso de la pelota es :" +peso);
		
		//p.estaPateada();
		
		p.estado();
		p.estaPateada();
		p.estado();

		
		PelotaDeTenis t; 
		t = new PelotaDeTenis();
		System.out.println("La pelota es del deporte :" + t.deporte +"y el color de la pelota es : " +t.color);
		t.estado();
		
		PelotaDefutbol f;
		f = new PelotaDefutbol();
		f.detalle();
		f.estaPateada();
		*/
	}

}
