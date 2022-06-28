package br.ufes.testes.hamcrest;

public class Tarefa {

	private Long id;
	private String resumo;
	private String descricao;
	private int ano;

	public Tarefa() {}

	public Tarefa( Long id, String resumo, String descricao, int ano ) {
		super();
		this.id = id;
		this.resumo = resumo;
		this.descricao = descricao;
		this.ano = ano;
	}

	public Tarefa( String resumo ) {
		this.resumo = resumo;
	}

	public Long getId() {
		return id;
	}

	public void setId( Long id ) {
		this.id = id;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo( String resumo ) {
		this.resumo = resumo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao( String descricao ) {
		this.descricao = descricao;
	}

	public int getAno() {
		return ano;
	}

	public void setAno( int ano ) {
		this.ano = ano;
	}

}
