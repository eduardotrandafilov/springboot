package dio.web.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.web.api.model.Usuario;
import dio.web.api.repository.UserRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	@Autowired
	private UserRepository repository;
	@GetMapping()
	public List<Usuario>getUsers(){
		return repository.listAll();  
	}
	@GetMapping("/{username}")
	public Usuario getOne(@PathVariable("username")String username) {
		return repository.finByUsername(username);
	}
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable("id")Integer id) {
		repository.remove(id);
	}
	@PostMapping()
	public void postUser(@RequestBody Usuario usuario) {
		repository.save(usuario);
	}
}
