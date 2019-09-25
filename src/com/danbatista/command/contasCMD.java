package com.danbatista.command;

import org.hibernate.validator.constraints.NotEmpty;

public class contasCMD {

	@NotEmpty
	private String nomeConta;
	@NotEmpty
	private String contapai;
	@NotEmpty
	private Integer ptes;
	@NotEmpty
	private Integer ptdir;

	private Integer acalcular; // Pontua��o que est� a calcular
	@NotEmpty
	private Integer opcao; // Lado em que a pontua��o est� a calcular | Esquerda - 1 | Direita - 2
	@NotEmpty
	private Integer tipoconta; // Pro - 1 | Enterprise - 2
	@NotEmpty
	private Integer ladoconta; // Lado a qual a conta est� cadastrada -| Esquerda - 1 | Direita - 2

	private Integer total;
	private Integer binario;
	private Integer indicacaoDireta;

	public contasCMD(String nomeConta, String contapai, Integer ptes, Integer ptdir, Integer acalcular, Integer opcao,
			Integer tipoconta, Integer ladoconta, Integer total, Integer binario, Integer indicacaoDireta) {
		super();
		this.nomeConta=nomeConta;      
		this.contapai=contapai;         
		this.ptes=ptes;            
		this.ptdir=ptdir ;          
		this.acalcular=acalcular ;       
		this.opcao= opcao;           
		this.tipoconta= tipoconta;       
		 this.ladoconta= ladoconta;       
		 this.total=total ;           
		 this.binario= binario;         
		 this.indicacaoDireta=indicacaoDireta ; 
		

	}

	public String getNomeConta() {
		return nomeConta;
	}

	public void setNomeConta(String nomeConta) {
		this.nomeConta = nomeConta;
	}

	public String getContapai() {
		return contapai;
	}

	public void setContapai(String contapai) {
		this.contapai = contapai;
	}

	public Integer getPtes() {
		return ptes;
	}

	public void setPtes(Integer ptes) {
		this.ptes = ptes;
	}

	public Integer getPtdir() {
		return ptdir;
	}

	public void setPtdir(Integer ptdir) {
		this.ptdir = ptdir;
	}

	public Integer getAcalcular() {
		return acalcular;
	}

	public void setAcalcular(Integer acalcular) {
		this.acalcular = acalcular;
	}

	public Integer getOpcao() {
		return opcao;
	}

	public void setOpcao(Integer opcao) {
		this.opcao = opcao;
	}

	public Integer getTipoconta() {
		return tipoconta;
	}

	public void setTipoconta(Integer tipoconta) {
		this.tipoconta = tipoconta;
	}

	public Integer getLadoconta() {
		return ladoconta;
	}

	public void setLadoconta(Integer ladoconta) {
		this.ladoconta = ladoconta;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getBinario() {
		return binario;
	}

	public void setBinario(Integer binario) {
		this.binario = binario;
	}

	public Integer getIndicacaoDireta() {
		return indicacaoDireta;
	}

	public void setIndicacaoDireta(Integer indicacaoDireta) {
		this.indicacaoDireta = indicacaoDireta;
	}

}
