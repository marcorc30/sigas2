package org.lasalle.sigas.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="candidato")
public class Candidato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Nome é obrigatório")
	private String nome;
	
	@NotBlank(message = "Data de nascimento é obrigatória")
	@Column(name = "data-nascimento")
	private LocalDateTime dataNascimento;
	
//	@NotBlank(message="Sexo é obrigatório")
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	
	@NotBlank(message="Parentesco é obrigatório")
	private String parentesco;
	
	@Embedded
	private Endereco endereco;
	
	@NotBlank(message="Instituição de origem é obrigatório")
	@Column(name = "instituicao-origem")
	private String instituicaoOrigem;
	
	@NotBlank(message="Curso é obrigatório")
	@Column(name="curso-pretendido")
	private String cursoPretendido;
	
	@NotBlank(message = "Série é obrigatório")
	private String serie;
	
	@NotBlank(message = "Turno é obrigatório")
	private String turno;
	
	@Column(name="mora-perto-escola")
	private Boolean moraPertoEscola;
	
	@Column(name="possui-irmaos-colegio")
	private Boolean possuiIrmaosColegio;
	
	@Column(name="possui-deficiencia")
	private Boolean possuiDeficiencia;
	
	@Column(name="cadunico") 
	private Boolean cadUnico;
	
	@Column(name="transferencia-renda")
	private Boolean transferenciaRenda;
	
	private String cid;
	
	@Column(name="descricao_cadunico")
	private String descricaoCadUunico;
	
	@Column(name="programa_transferencia_renda")
	private String programaTransferenciaRenda;
	
	@ManyToOne
	@JoinColumn(name="id-responsavel")
	private Responsavel responsavel;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDateTime getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDateTime dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String getParentesco() {
		return parentesco;
	}

	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getInstituicaoOrigem() {
		return instituicaoOrigem;
	}

	public void setInstituicaoOrigem(String instituicaoOrigem) {
		this.instituicaoOrigem = instituicaoOrigem;
	}

	public String getCursoPretendido() {
		return cursoPretendido;
	}

	public void setCursoPretendido(String cursoPretendido) {
		this.cursoPretendido = cursoPretendido;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public Boolean getMoraPertoEscola() {
		return moraPertoEscola;
	}

	public void setMoraPertoEscola(Boolean moraPertoEscola) {
		this.moraPertoEscola = moraPertoEscola;
	}

	public Boolean getPossuiIrmaosColegio() {
		return possuiIrmaosColegio;
	}

	public void setPossuiIrmaosColegio(Boolean possuiIrmaosColegio) {
		this.possuiIrmaosColegio = possuiIrmaosColegio;
	}

	public Boolean getPossuiDeficiencia() {
		return possuiDeficiencia;
	}

	public void setPossuiDeficiencia(Boolean possuiDeficiencia) {
		this.possuiDeficiencia = possuiDeficiencia;
	}

	public Boolean getCadUnico() {
		return cadUnico;
	}

	public void setCadUnico(Boolean cadUnico) {
		this.cadUnico = cadUnico;
	}

	public Boolean getTransferenciaRenda() {
		return transferenciaRenda;
	}

	public void setTransferenciaRenda(Boolean transferenciaRenda) {
		this.transferenciaRenda = transferenciaRenda;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getDescricaoCadUunico() {
		return descricaoCadUunico;
	}

	public void setDescricaoCadUunico(String descricaoCadUunico) {
		this.descricaoCadUunico = descricaoCadUunico;
	}

	public String getProgramaTransferenciaRenda() {
		return programaTransferenciaRenda;
	}

	public void setProgramaTransferenciaRenda(String programaTransferenciaRenda) {
		this.programaTransferenciaRenda = programaTransferenciaRenda;
	}

	public Responsavel getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidato other = (Candidato) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	
}
