package br.com.wolfes.model;

import java.util.ArrayList;

public class InformacoesJogadores {

	private ArrayList<Atleta> atletas;
	
	public InformacoesJogadores(){
		atletas = new ArrayList<Atleta>();
	}

	public ArrayList<Atleta> getAtletas() {
		return atletas;
	}

	public void setAtletas(ArrayList<Atleta> atletas) {
		this.atletas = atletas;
	}
	
}
