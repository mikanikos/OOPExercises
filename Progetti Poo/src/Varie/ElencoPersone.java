package Varie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Persona {

	private String nome;
	private int eta;

	public Persona(String nome, int eta) {
		this.nome = nome;
		this.eta = eta;
	}

	public int getEta() {
		return this.eta;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public boolean equals(Object o){
		Persona p = (Persona) o;
		return (this.nome.equals(p.getNome()) && this.eta == p.getEta());
	}
	
	public int haschCode(){
		return this.eta + this.nome.hashCode();
	}

}


public class ElencoPersone {
	
	private List<Persona> elenco;
	
	public ElencoPersone(){
		this.elenco = new ArrayList<Persona>();
	}
	
	public void aggiungiPersona(Persona persona) {
		this.elenco.add(persona);
	}
	
	public Map<Integer, List<Persona>> eta2persona() {
		Map<Integer, List<Persona>> eta2persona = new HashMap<Integer, List<Persona>>();
		// scrivere il codice di questo metodo
		// deve ritornare una mappa che ha per chiave un eta'
		// per valore una lista delle persone di elenco con eta' uguale alla chiave
		/*if(this.elenco.isEmpty() == false){
			List<Integer> listaEta = new ArrayList<Integer>();
			for(Persona persona : this.elenco){
				if(persona != null ){
					if(listaEta.contains(persona.getEta()) == false){
						listaEta.add(persona.getEta());
					}
				}
			}
			for(Integer eta : listaEta){
				List<Persona> listePersone = new ArrayList<Persona>();
				for(Persona persona : this.elenco){
					if(persona != null){
						if(persona.getEta()==eta)
							if(listePersone.contains(persona) == false)
								listePersone.add(persona);
					}
				}
				eta2persona.put(eta, listePersone);
			}
		}*/
		for(Persona p : this.elenco) {
			List<Persona> lista = eta2persona.get(p.getEta());
			if(lista == null) {
				lista = new ArrayList<>();
				eta2persona.put(p.getEta(), lista);
			}
			lista.add(p);
		}
		return eta2persona;
	}
}