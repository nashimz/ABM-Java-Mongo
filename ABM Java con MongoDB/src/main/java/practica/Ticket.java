package practica;
import java.time.LocalDate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mongodb.BasicDBObject;;
public class Ticket {
private LocalDate fecha;
private long numeroTicket;
private double total;
private String formaDePago;
private String sucursal;
private int cantidad;
private String cliente;
private String empleado;
private String empleadoCaja;
private String producto;
private String detalleProducto;
private String obraSocial;
public BasicDBObject toDBObjectTicket() {
	
	BasicDBObject dBObjectTicket= new BasicDBObject();

	dBObjectTicket.append("fecha", this.getFecha());
	dBObjectTicket.append("numeroTicket", this.getNumeroTicket());
	dBObjectTicket.append("total", this.getTotal());
	dBObjectTicket.append("formaDePago", this.getFormaDePago());
	dBObjectTicket.append("sucursal", this.getSucursal());
	
	
	dBObjectTicket.append("cantidad", this.getCantidad());
	dBObjectTicket.append("cliente", this.getCliente());
	dBObjectTicket.append("empleado", this.getEmpleado());
	dBObjectTicket.append("empleadoCaja", this.getEmpleadoCaja());
	dBObjectTicket.append("producto", this.getProducto());
	dBObjectTicket.append("detalleProducto", this.getDetalleProducto());
	dBObjectTicket.append("obraSocial", this.getObraSocial());
	
	return dBObjectTicket;
}

public Ticket(LocalDate localDate, long numeroTicket, double total, String formaDePago, String sucursal,int cantidad, String empleado, String empleadoCaja, String producto, String detalleProducto,String obraSocial,String cliente) {
	super();
	this.fecha = localDate;
	this.numeroTicket = numeroTicket;
	this.total = total;
	this.formaDePago = formaDePago;
	this.sucursal = sucursal;
	this.cantidad = cantidad;
	this.empleado = empleado;
	this.empleadoCaja = empleadoCaja;
	this.producto = producto;
	this.detalleProducto = detalleProducto;
	this.obraSocial = obraSocial;
	this.cliente = cliente;
}

public String getCliente() {
	return cliente;
}

public void setCliente(String cliente) {
	this.cliente = cliente;
}

public String getObraSocial() {
	return obraSocial;
}

public void setObraSocial(String obraSocial) {
	this.obraSocial = obraSocial;
}

public String getProducto() {
	return producto;
}

public void setProducto(String producto) {
	this.producto = producto;
}

public String getDetalleProducto() {
	return detalleProducto;
}

public void setDetalleProducto(String detalleProducto) {
	this.detalleProducto = detalleProducto;
}

public String getSucursal() {
	return sucursal;
}

public void setSucursal(String sucursal) {
	this.sucursal = sucursal;
}

public LocalDate getFecha() {
	return fecha;
}
public void setFecha(LocalDate fecha) {
	this.fecha = fecha;
}
public long getNumeroTicket() {
	return numeroTicket;
}
public void setNumeroTicket(long numeroTicket) {
	this.numeroTicket = numeroTicket;
}
public double getTotal() {
	return total;
}
public void setTotal(double total) {
	this.total = total;
}
public String getFormaDePago() {
	return formaDePago;
}
public void setFormaDePago(String formaDePago) {
	this.formaDePago = formaDePago;
}


public int getCantidad() {
	return cantidad;
}
public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}
public String getEmpleado() {
	return empleado;
}
public void setEmpleado(String empleado) {
	this.empleado = empleado;
}
public String getEmpleadoCaja() {
	return empleadoCaja;
}
public void setEmpleadoCaja(String empleadoCaja) {
	this.empleadoCaja = empleadoCaja;
}


}
