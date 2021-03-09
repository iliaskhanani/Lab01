package it.polito.tdp.parole.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Parole {
	
	LinkedList <String> elenco;
		
	public Parole() {
		this.elenco = new LinkedList <String>();
	}
	
	public void addParola(String p) {
		elenco.add(p);
	}
	
	public List<String> getElenco() {
		
		LinkedList <String> temp = new LinkedList <String> (elenco);
		Collections.sort(temp, new Comparatore());
		
		return temp;
	}
	
	public void reset() {
		elenco.clear();
	}
	
	public void cancella(String s) {
		elenco.remove(s);
	}

}
