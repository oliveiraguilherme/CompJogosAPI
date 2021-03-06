package br.com.GamesPlat.api.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.GamesPlat.api.models.Usuario;
import br.com.GamesPlat.api.repository.UsuarioRepository;

public class UsuarioForm {

	@NotNull
	@NotEmpty
	private String username;
	@NotNull
	@NotEmpty
	private String login;
	@NotNull
	@NotEmpty
	private String password;
	@NotNull
	@NotEmpty
	private String email;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Usuario converter(UsuarioRepository usuarioRepository) {

		return new Usuario(this.login, this.username, this.password, this.email);
	}

}
