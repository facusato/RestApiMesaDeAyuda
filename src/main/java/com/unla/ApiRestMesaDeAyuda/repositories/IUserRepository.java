package com.unla.ApiRestMesaDeAyuda.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unla.ApiRestMesaDeAyuda.entities.User;



@Repository("userRepository")
public interface IUserRepository extends JpaRepository<User,Serializable> {
	
	public abstract User findByIdUser(long idUser);

}
