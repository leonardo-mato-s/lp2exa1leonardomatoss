package pe.edu.pe.lp2exa1leonardomatoss.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.pe.lp2exa1leonardomatoss.entity.Usuario;
import pe.edu.pe.lp2exa1leonardomatoss.service.UsuarioService;

@RestController
@RequestMapping("Usuarios")
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;

	@GetMapping("/{id}")
	public Usuario read(@PathVariable String nomuser) {
		return usuarioService.read(nomuser);
	}

	@GetMapping("/all")
	public List<Map<String, Object>> readAll() {
		return usuarioService.readAll();
	};

}
