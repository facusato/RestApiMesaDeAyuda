package com.unla.ApiRestMesaDeAyuda.models;



import lombok.Data;

@Data
public class Reclamo {
	
	private long idReclamo;
	private String descripcion;
	private String estado;
    private long idPedido;

}
