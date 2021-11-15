package com.unla.ApiRestMesaDeAyuda.models;



import lombok.Data;

@Data
public class Denuncia {
	
	private long idDenuncia;
	
	private String categoria;
	//falsificación ilegal fraude inapropiado
	
	private String descripcion;
	
	private String estado;
	
	private Cliente cliente;

}
