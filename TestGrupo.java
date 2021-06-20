package tp1_colecciones.ej1;

import java.util.ArrayList;

public class TestGrupo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Grupo g = new Grupo("Trabajo Practico N° 1");
		g.agregarIntegrante("Andrea");
		g.agregarIntegrante("Paula");
		g.agregarIntegrante("Luciana");
		g.agregarIntegrante("Victoria");
		g.agregarIntegrante("Fulanita");
		System.out.println("******************");
		comprobarIntegrante("Victoria", g);
		comprobarIntegrante("Daniela", g);
		System.out.println("******************");
		g.mostrar();
		System.out.println("******************");
		g.removerIntegrante("Fulanita");
		g.removerIntegrante("Fulanita");
		System.out.println("******************");
		g.mostrar();
		g.vaciar();
		g.mostrar();
		
		
	 
	}
	
	public static void comprobarIntegrante(String nombre, Grupo grupo){
		String integrante = grupo.buscarIntegrante(nombre);
		if(integrante!=null){
			System.out.println("El integrante buscado se encuentra en la lista.");
		} else {
			System.out.println("El integrante buscado no se encuentra en la lista.");
		}
	}
}
