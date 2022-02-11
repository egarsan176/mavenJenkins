package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Usuario;

@SpringBootTest
class NuevaVersionBdApplicationTests {
	
	private Usuario usuario;
	
	@BeforeEach
	public void init() {
		this.usuario = new Usuario("estefgar");
	}
	
	@Test
	void testGetUserName() {
		assertEquals("estefgar", usuario.getUserName());
	}


	
	

}
