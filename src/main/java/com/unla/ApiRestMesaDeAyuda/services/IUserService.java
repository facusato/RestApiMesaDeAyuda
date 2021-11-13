package com.unla.ApiRestMesaDeAyuda.services;

import java.util.List;

import com.unla.ApiRestMesaDeAyuda.entities.User;



public interface IUserService {
	
	public List<User> getAll();
   
	public User findByIdUser(long idUser);
	
	public User insert(User user);
	
	public User update(User user);
	
	public boolean remove(long idUser);

}
