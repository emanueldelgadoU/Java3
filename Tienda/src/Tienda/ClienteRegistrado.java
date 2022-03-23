package Tienda;

import java.time.LocalDate;
import org.apache.commons.codec.digest.DigestUtils;


public class ClienteRegistrado extends Cliente {


	protected String email;
	protected String password;
	protected LocalDate fechaNacimiento;
	protected LocalDate fechaRegistro;
	protected static double descuento=5;
	
	
	public ClienteRegistrado(String nombre, String apellido, String dni, String localidad, String direccion,
			String email, String password, LocalDate fechaNacimiento) {
		super(nombre, apellido, dni, localidad, direccion );
		this.email=email;
		this.password=password;
		this.fechaNacimiento=fechaNacimiento;
		this.fechaRegistro=LocalDate.now();
	}
	
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public LocalDate getFechaRegistro() {
		return fechaRegistro;
	}


	public static double getDescuento() {
		return descuento;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ClienteRegistrado [nombre=");
		builder.append(nombre);
		builder.append(", apellido=");
		builder.append(apellido);
		builder.append(", dni=");
		builder.append(dni);
		builder.append(", localidad=");
		builder.append(localidad);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append(", email=");
		builder.append(email);
		builder.append(", password=");
		builder.append(password);
		builder.append(", fechaNacimiento=");
		builder.append(fechaNacimiento);
		builder.append(", fechaRegistro=");
		builder.append(fechaRegistro);
		builder.append("]");
		return builder.toString();
	}


	public static void setDescuento(double descuento) {
		ClienteRegistrado.descuento = descuento;
	}


	@Override
	public double decuento() {
		return descuento;
	}


}
