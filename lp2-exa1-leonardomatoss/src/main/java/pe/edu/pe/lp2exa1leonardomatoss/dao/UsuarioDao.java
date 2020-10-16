package pe.edu.pe.lp2exa1leonardomatoss.dao;
import java.util.List;
import java.util.Map;

import pe.edu.pe.lp2exa1leonardomatoss.entity.Usuario;

public interface UsuarioDao {
	Usuario read(String nomuser);
	List<Map<String, Object>> readAll();
	

}
