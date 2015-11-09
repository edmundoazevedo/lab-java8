package lab.java8;

public class Usuario {
	
	public String nome;
	public int pontos;
	public boolean moderador;
	
	public Usuario (String nome, int pontos) {
		this.pontos = pontos;
		this.nome = nome;
		this.moderador = false;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getPontos() {
		return pontos;
	}
	
	public boolean getModerador() {
		return moderador;
	}
	
	public void tornaModerador() {
		this.moderador = true;
	}

}
