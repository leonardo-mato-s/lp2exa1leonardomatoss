package pe.edu.pe.lp2exa1leonardomatoss.entity;

public class Detalle_pedido {
	private int idetalle_pedido;
	private String precio;
	private String cantidad;
	private int idplatos;
	private int idpedidos;
	public Detalle_pedido() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Detalle_pedido(int idetalle_pedido, String precio, String cantidad, int idplatos, int idpedidos) {
		super();
		this.idetalle_pedido = idetalle_pedido;
		this.precio = precio;
		this.cantidad = cantidad;
		this.idplatos = idplatos;
		this.idpedidos = idpedidos;
	}
	public int getIdetalle_pedido() {
		return idetalle_pedido;
	}
	public void setIdetalle_pedido(int idetalle_pedido) {
		this.idetalle_pedido = idetalle_pedido;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public int getIdplatos() {
		return idplatos;
	}
	public void setIdplatos(int idplatos) {
		this.idplatos = idplatos;
	}
	public int getIdpedidos() {
		return idpedidos;
	}
	public void setIdpedidos(int idpedidos) {
		this.idpedidos = idpedidos;
	}
	

}
