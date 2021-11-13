package com.unla.ApiRestMesaDeAyuda.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.ApiRestMesaDeAyuda.entities.User;
import com.unla.ApiRestMesaDeAyuda.repositories.IUserRepository;
import com.unla.ApiRestMesaDeAyuda.services.IUserService;



@Service("userService")
public class UserService implements IUserService {
	
	@Autowired
	@Qualifier("userRepository")
	private IUserRepository userRepository;
	
	@Override
	public List<User> getAll() {
		return userRepository.findAll();
	}

	@Override
	public User findByIdUser(long idUser) {
		
		return userRepository.findByIdUser(idUser);
	}

	@Override
	public User insert(User user) {
		return userRepository.save(user);
	}

	@Override
	public User update(User user) {
		User c = userRepository.findByIdUser(user.getIdUser());
        if (null == c){
            return null;
        }
      
        return userRepository.save(c);
	}

	@Override
	public boolean remove(long idUser) {
		try {
			userRepository.deleteById(idUser);
			return true;
		}catch (Exception e) {
			return false;
		}
	}
}
