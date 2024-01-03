package br.com.arq.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import br.com.arq.entity.Users;

public class UsersDto {
	
	  private static DateTimeFormatter dataFormat =   DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); 
 
			private Long id;
			private String nome;
			private String email;
			private String password;
			private String token;
			private String status;
			private String evento;
			private LocalDateTime dataCriacao;
			private LocalDateTime dataAtualizacao;
			
			public UsersDto(String nome, String email, String password, String token, String status, String evento,
					LocalDateTime dataCriacao, LocalDateTime dataAtualizacao) {
				super();
				this.nome = nome;
				this.email = email;
				this.password = password;
				this.token = token;
				this.status = status;
				this.evento = evento;
				this.dataCriacao = dataCriacao;
				this.dataAtualizacao = dataAtualizacao;
			}






			public Users ConvertDtoEntityCreate() {
				Users entity = new Users(null, this.getNome(),this.getEmail(), 
						                this.getPassword(), this.getToken(), this.getStatus(),
						                this.getEvento(), this.getDataCriacao(), this.getDataAtualizacao());
				return entity;	
			}
			
			public Users ConvertDtoEntityUpdate() {
				Users entity = new Users(this.getId(), this.getNome(),this.getEmail(), 
						                this.getPassword(), this.getToken(), this.getStatus(),
						                this.getEvento(), this.getDataCriacao(), this.getDataAtualizacao());
				return entity;	
			}
			
			
			@Override
			public String toString() {
				return "Users [id=" + id + ", nome=" + nome + ", email=" + email + ", password=" + password + ", token=" + token
						+ ", status=" + status + ", evento=" + evento + ", dataCriacao=" +dataFormat.format(dataCriacao) + ", dataAtualizacao="
						+ dataFormat.format(dataAtualizacao) + "]";
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
			
			
}
