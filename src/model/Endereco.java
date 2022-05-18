package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;

@Entity
@Table(name = "endereco")
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo_endereco")
	@NotNull
	private long codigo;
	
	@Column(name = "logradouro_endereco")
	@NotNull
	private String logradouro;
	
	@Column(name = "numero_endereco")
	@NotNull
	private int numero;
	
	@Column(name = "cep_endereco")
	@NotNull
	private int cep;
	
	@Column(name = "complemento_endereco")
	@Null
	private String complemento;
	
	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getLogradouro() {
		return logradouro;
	}
	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getCep() {
		return cep;
	}
	
	public void setCep(int cep) {
		this.cep = cep;
	}
	
	public String getComplemento() {
		return complemento;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", numero=" + numero + ", cep=" + cep + ", complemento="
				+ complemento + "]";
	}
	
}
