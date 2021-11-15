package com.unla.ApiRestMesaDeAyuda.models;

import lombok.Data;

@Data
public class Cliente {
	
	private long idCliente;
	private String usuario;
	private String password;
	private String nombre;
	private String apellido;
	private long dni;
	private String email;

}
