package com.unla.ApiRestMesaDeAyuda.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="user")
@Data@AllArgsConstructor  @NoArgsConstructor @Builder
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idUser;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="password")
	private String password;

	
	//lista de reclamos
	//lista de denuncias
	
}
