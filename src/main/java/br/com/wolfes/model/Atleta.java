package br.com.wolfes.model;

public class Atleta {

	private String nome;
	private String apelido;
	private String foto;
	private int atleta_id;
	private int rodada_id;
	private int clube_id;
	private int posicao_id;
	private int status_id;
	private double pontos_num;
	private double preco_num;
	private double variacao_num;
	private double media_num;
	private int jogos_num;
	private Scout scout;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public int getAtleta_id() {
		return atleta_id;
	}

	public void setAtleta_id(int atleta_id) {
		this.atleta_id = atleta_id;
	}

	public int getRodada_id() {
		return rodada_id;
	}

	public void setRodada_id(int rodada_id) {
		this.rodada_id = rodada_id;
	}

	public int getClube_id() {
		return clube_id;
	}

	public void setClube_id(int clube_id) {
		this.clube_id = clube_id;
	}

	public int getPosicao_id() {
		return posicao_id;
	}

	public void setPosicao_id(int posicao_id) {
		this.posicao_id = posicao_id;
	}

	public int getStatus_id() {
		return status_id;
	}

	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}

	

	public double getPreco_num() {
		return preco_num;
	}

	public void setPreco_num(double preco_num) {
		this.preco_num = preco_num;
	}

	public double getVariacao_num() {
		return variacao_num;
	}

	public void setVariacao_num(double variacao_num) {
		this.variacao_num = variacao_num;
	}

	

	public double getPontos_num() {
		return pontos_num;
	}

	public void setPontos_num(double pontos_num) {
		this.pontos_num = pontos_num;
	}

	public double getMedia_num() {
		return media_num;
	}

	public void setMedia_num(double media_num) {
		this.media_num = media_num;
	}

	public int getJogos_num() {
		return jogos_num;
	}

	public void setJogos_num(int jogos_num) {
		this.jogos_num = jogos_num;
	}

	public Scout getScout() {
		return scout;
	}

	public void setScout(Scout scout) {
		this.scout = scout;
	}

	
}
