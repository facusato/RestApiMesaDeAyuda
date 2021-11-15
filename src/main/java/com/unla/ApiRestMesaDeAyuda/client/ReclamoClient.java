package com.unla.ApiRestMesaDeAyuda.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.unla.ApiRestMesaDeAyuda.models.Reclamo;

@FeignClient(name="RestApiCompra")
@RequestMapping("/reclamo")
public interface ReclamoClient {
	
	@GetMapping()
	public ResponseEntity<List<Reclamo>> obtenerReclamos();
	
	@GetMapping("/estado/{estado}")
	public ResponseEntity<List<Reclamo>> obtenerReclamosPorEstado(@PathVariable("estado") String estado);

}
