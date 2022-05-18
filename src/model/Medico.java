package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "medico")
public class Medico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo_medico")
	@NotNull
	private long idMedico;
	
	@Column(name = "nome_medico")
	@NotNull
	private String nome;
	
	@OneToOne(targetEntity = Endereco.class)
	@JoinColumn(name = "endereco_medico")
	@NotNull
	private Endereco endereco;
	
	@Column(name = "contato_medico")
	@NotNull
	private String contato;
	
	@Column(name = "especialidade_medico")
	@NotNull
	private String especialidade;
	
	public long getIdMedico() {
		return idMedico;
	}
	
	public void setIdMedico(long idMedico) {
		this.idMedico = idMedico;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public String getContato() {
		return contato;
	}
	
	public void setContato(String contato) {
		this.contato = contato;
	}
	
	public String getEspecialidade() {
		return especialidade;
	}
	
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	@Override
	public String toString() {
		return "Medico [idMedico=" + idMedico + ", nome=" + nome + ", endereco=" + endereco + ", contato=" + contato
				+ ", especialidade=" + especialidade + "]";
	}
	
}
