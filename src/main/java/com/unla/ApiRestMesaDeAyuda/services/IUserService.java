package com.unla.ApiRestMesaDeAyuda.services;

import java.util.List;

import com.unla.ApiRestMesaDeAyuda.entities.User;
import com.unla.ApiRestMesaDeAyuda.models.Reclamo;
import com.unla.ApiRestMesaDeAyuda.models.Denuncia;



public interface IUserService {
	
	public List<User> getAll();
	
	public List<Denuncia> obtenerDenuncias();
	
	public List<Reclamo> obtenerReclamos();
	
	public List<Reclamo> obtenerReclamosPorEstado(String estado);
	
	public List<Denuncia> obtenerDenunciasPorEstado(String estado);
   
	public User findByIdUser(long idUser);
	
	public User insert(User user);
	
	public User update(User user);
	
	public boolean remove(long idUser);

}
