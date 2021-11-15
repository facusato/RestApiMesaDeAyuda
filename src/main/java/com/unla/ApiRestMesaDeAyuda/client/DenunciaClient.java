package com.unla.ApiRestMesaDeAyuda.client;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.unla.ApiRestMesaDeAyuda.models.Denuncia;

@FeignClient(name="a", url="http://localhost:8093")
@RequestMapping("/denuncia")
public interface DenunciaClient {
	
	@GetMapping()
	public ResponseEntity<List<Denuncia>> obtenerDenuncias();
	
	@GetMapping("/estado/{estado}")
	public ResponseEntity<List<Denuncia>> obtenerDenunciasPorEstado(@PathVariable("estado") String estado);
}
