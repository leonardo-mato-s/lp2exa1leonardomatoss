package pe.edu.pe.lp2exa1leonardomatoss.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.pe.lp2exa1leonardomatoss.dao.Detalle_pedidoDao;
import pe.edu.pe.lp2exa1leonardomatoss.entity.Detalle_pedido;
@Repository

public class Detalle_pedidoDaoImp implements Detalle_pedidoDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String sql ="select * from detalle_pedido";
		return jdbcTemplate.queryForList(sql);
	}
	@Override
	public int create(Detalle_pedido d) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int update(Detalle_pedido d) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Detalle_pedido read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}