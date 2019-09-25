package com.danbatista.VO;

public class usuarioVO {
	
	
	public usuarioVO() {
	
	}
	private String nome;
	private String email;
	private String senha;
	private String graduacao;
    private Integer id;
    
    
    public usuarioVO(String nome, String email, String senha, String graduacao, Integer id) {
    	this.nome = nome;
    	this.email=email;
    	this.senha = senha;
    	this.graduacao = graduacao;
    	this.id = id;
    }
    
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getGraduacao() {
		return graduacao;
	}

	public void setGraduacao(String graduacao) {
		this.graduacao = graduacao;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	
	
}
