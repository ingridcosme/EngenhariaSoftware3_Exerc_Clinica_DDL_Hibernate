package model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "consulta")
public class Consulta {

	@ManyToOne(targetEntity = Paciente.class)
	@JoinColumn(name = "paciente_consulta")
	@NotNull
	private Paciente paciente;
	
	@ManyToOne(targetEntity = Medico.class)
	@JoinColumn(name = "medico_consulta")
	@NotNull
	private Medico medico;
	
	@Id
	@Column(name = "data_consulta")
	@NotNull
	private LocalDate data;
	
	@Id
	@Column(name = "hora_consulta")
	@NotNull
	private LocalTime hora;
	
	public Paciente getPaciente() {
		return paciente;
	}
	
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	public Medico getMedico() {
		return medico;
	}
	
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public LocalTime getHora() {
		return hora;
	}
	
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	@Override
	public String toString() {
		return "Consulta [paciente=" + paciente + ", medico=" + medico + ", data=" + data + ", hora=" + hora + "]";
	}
	
}
