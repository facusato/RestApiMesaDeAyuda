package com.unla.ApiRestMesaDeAyuda.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unla.ApiRestMesaDeAyuda.entities.User;
import com.unla.ApiRestMesaDeAyuda.services.implementation.UserService;


@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	@Qualifier("userService")
	UserService userService;
	
	
	
	@GetMapping()
	public ResponseEntity<List<User>> obtenerUsers(){
		
		List<User> users=userService.getAll();
		if(users.isEmpty()) {
			ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(users);
	}
	
	@GetMapping("/{idUser}")
	public ResponseEntity<User> obtenerUserPorId(@PathVariable("idUser") long idUser){
		
		User c=userService.findByIdUser(idUser);
		if(c==null) {
			ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(c);
	}
	
	 @PostMapping()
	 public ResponseEntity<User> insertarUser( @RequestBody User user, BindingResult result){
	       
	        return ResponseEntity.status(HttpStatus.CREATED).body(userService.insert(user));
	 }
	 
	 @PutMapping("/{idUser}")
	    public ResponseEntity<User> actualizarUser(@PathVariable("idUser") Long idUser, @RequestBody User user){
		 	User userActualizado= userService.findByIdUser(idUser);
		 	userActualizado.setNombre(user.getNombre());
	        userActualizado.setPassword(user.getPassword());
	        return ResponseEntity.ok(userService.update(userActualizado));
	    }
	 
	 
	 @DeleteMapping("/{idUser}")
		public boolean borrarUser(@PathVariable("idUser") long idUser) {
			return userService.remove(idUser);
		}
}