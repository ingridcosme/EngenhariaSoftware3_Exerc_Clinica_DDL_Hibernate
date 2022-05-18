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
@Table(name = "paciente")
public class Paciente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo_paciente")
	@NotNull
	private long idPaciente;
	
	@Column(name = "nome_paciente")
	@NotNull
	private String nome;
	
	@OneToOne(targetEntity = Endereco.class)
	@JoinColumn(name = "endereco_paciente")
	@NotNull
	private Endereco endereco;
	
	@Column(name = "telefone_paciente")
	@NotNull
	private String telefone;
	
	@Column(name = "numero_beneficiario")
	@NotNull
	private long numeroBeneficiario;
	
	public long getIdPaciente() {
		return idPaciente;
	}
	
	public void setIdPaciente(long idPaciente) {
		this.idPaciente = idPaciente;
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
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public long getNumeroBeneficiario() {
		return numeroBeneficiario;
	}
	
	public void setNumeroBeneficiario(long numeroBeneficiario) {
		this.numeroBeneficiario = numeroBeneficiario;
	}

	@Override
	public String toString() {
		return "Paciente [nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", numeroBeneficiario="
				+ numeroBeneficiario + "]";
	}
	
}
