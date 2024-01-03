package br.com.arq.entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="users")
public class Users {
   @JsonIgnore
   @Transient
   private static DateTimeFormatter dataFormat =   DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); 

    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nome;
	@Column(length=250,unique=true)
	private String email;
	private String password;
	private String token;
	private String status;
	private String evento;
	private LocalDateTime dataCriacao;
	private LocalDateTime dataAtualizacao;
	
	public Users() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Users(Long id) {
		super();
		this.id = id;
	}



	public Users(Long id, String nome, String email, String password, String token, String status, String evento,
			LocalDateTime dataCriacao, LocalDateTime dataAtualizacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.password = password;
		this.token = token;
		this.status = status;
		this.evento = evento;
		this.dataCriacao = dataCriacao;
		this.dataAtualizacao = dataAtualizacao;
	}


	@Override
	public String toString() {
		return "Users [id=" + id + ", nome=" + nome + ", email=" + email + ", password=" + password + ", token=" + token
				+ ", status=" + status + ", evento=" + evento + ", dataCriacao=" +dataFormat.format(dataCriacao) + ", dataAtualizacao="
				+ dataFormat.format(dataAtualizacao) + "]";
	}



	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public LocalDateTime getDataAtualizacao() {
		return dataAtualizacao;
	}
	public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getEvento() {
		return evento;
	}
	public void setEvento(String evento) {
		this.evento = evento;
	}
	
	
	
}
