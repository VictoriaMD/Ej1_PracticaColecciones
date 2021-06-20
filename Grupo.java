package tp1_colecciones.ej1;

import java.util.ArrayList;

public class Grupo {

	private String nombre;
	private ArrayList<String> integrantes;
	
	public Grupo(String nombre) {
		this.setNombre(nombre);
	    this.integrantes = new ArrayList<String>();
	}

	
	public String getNombre() {
		return nombre;
	}

	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public int getCantidadIntegrantes(){
		return this.integrantes.size();
	}
	
	
	public void agregarIntegrante(String nombreIntegrante){
		if (this.buscarIntegrante(nombreIntegrante)==null){
			this.integrantes.add(nombreIntegrante);
			System.out.println(nombreIntegrante + " fue asignada al grupo " + this.getNombre());
		} else {
			System.out.println("Ese integrante ya está en la lista");
		}
	}
	
	
	public String buscarIntegrante(String nombreIntegrante){
		String nombreBuscado = null;
		int i = 0;
		while(i < this.integrantes.size() && nombreBuscado==null){
			if (this.integrantes.get(i).equals(nombreIntegrante)){
				nombreBuscado = this.integrantes.get(i);
			}
			i++;
		}
		return nombreBuscado;
	}
	
	
	private int obtenerPosicionIntegrante(String nombreIntegrante){
		int aux = -1;
		if(this.buscarIntegrante(nombreIntegrante)!=null){
			aux = this.integrantes.indexOf(nombreIntegrante);
		}
		return aux;
	}
	
	
	public String obtenerIntegrante(int posicion){
		String nombreADevolver = null;
		if(posicion >= 1){
			nombreADevolver = this.integrantes.get(posicion -1);
		}
		return nombreADevolver;
	}
	
	
	public String removerIntegrante(String nombreIntegrante){
		String nombreADevolver = this.buscarIntegrante(nombreIntegrante);
		if(nombreADevolver!=null){
			this.integrantes.remove(nombreIntegrante);
			System.out.println("El integrante "+ nombreIntegrante + " fue removido.");
		} else {
			System.out.println("No se puede remover integrante.");
		}
		return nombreADevolver;
	}
	
	
	private void mostrarIntegrantes(){
		System.out.println("Cantidad de integrantes: " + this.getCantidadIntegrantes());
		System.out.println("Integrantes: ");
		for(String s : integrantes){
			System.out.println(s);
		}
	}
	
	
	public void mostrar(){
		System.out.println("Nombre del grupo: " + this.getNombre());
		this.mostrarIntegrantes();
	}
	
	
	public void vaciar(){
		for(int i = this.integrantes.size() -1; i >= 0; i--){
			this.integrantes.remove(i);
		}
	}
}
