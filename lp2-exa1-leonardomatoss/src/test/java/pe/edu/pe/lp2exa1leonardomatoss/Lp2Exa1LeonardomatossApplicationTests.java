package pe.edu.pe.lp2exa1leonardomatoss;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.pe.lp2exa1leonardomatoss.dao.Detalle_pedidoDao;

@SpringBootTest
class Lp2Exa1LeonardomatossApplicationTests {

	@Autowired
	private Detalle_pedidoDao   d;
	
	@Test
	void contextLoads() {
		System.out.println(d.readAll());
	}

	
}
