package pe.edu.pe.lp2exa1leonardomatoss.service;
import java.util.List;
import java.util.Map;

import pe.edu.pe.lp2exa1leonardomatoss.entity.Usuario;

public interface UsuarioService {
	public Usuario read(String nomuser);
	public List<Map<String, Object>> readAll();

}
