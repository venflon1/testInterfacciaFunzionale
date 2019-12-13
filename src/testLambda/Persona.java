package testLambda;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Persona implements Comparable<Persona>{
	private String nome;
	private String cognome;
	private int eta;
	
	public Persona() {
		super();
	}
	
	public Persona(String nome, String cognome, int eta) {
		this();
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	@Override
	public int compareTo(Persona o) {
		String nomeCognome1 = this.cognome+this.nome;
		String nomeCognome2 = o.cognome+o.nome;
		
		return nomeCognome1.compareTo(nomeCognome2);
	}
	
	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + "]";
	}
}

