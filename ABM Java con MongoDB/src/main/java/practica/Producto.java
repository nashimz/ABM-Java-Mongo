package practica;
import com.mongodb.BasicDBObject;;
public class Producto {
    private int idProducto;
	private String tipo;
	private String descripcion;
	private String laboratorio;
	private long codigo;
	private double precio;
	
	public Producto(String tipo, String descripcion, String laboratorio, long codigo, double precio) {
		super();
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.laboratorio = laboratorio;
		this.codigo = codigo;
		this.precio = precio;
	}
	
	
	
public Producto(int idProducto, String tipo, String descripcion, String laboratorio, long codigo, double precio) {
		super();
		this.idProducto = idProducto;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.laboratorio = laboratorio;
		this.codigo = codigo;
		this.precio = precio;
	}





public int getIdProducto() {
	return idProducto;
}



public void setIdProducto(int idProducto) {
	this.idProducto = idProducto;
}



public void setPrecio(double precio) {
	this.precio = precio;
}



public BasicDBObject toDBObjectProducto() {
		
		BasicDBObject dBObjectProducto = new BasicDBObject();

		dBObjectProducto.append("tipo", this.getTipo());
		dBObjectProducto.append("descripcion", this.getDescripcion());
		dBObjectProducto.append("laboratorio", this.getLaboratorio());
		dBObjectProducto.append("codigo", this.getCodigo());
		dBObjectProducto.append("precio", this.getPrecio());
		
		return dBObjectProducto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	
}
