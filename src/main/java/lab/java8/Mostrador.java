package lab.java8;

import java.util.function.Consumer;

public class Mostrador implements Consumer<Usuario> {
	
	/*	
	Consumer<Usuario> mostrador = (Usuario u) ->
		System.out.println(u.getNome()); */
	
	/*
	  Consumer<Usuario> mostrador = (Usuario u) -> {
		System.out.println(u.getNome())
	}; */
	
	
	  Consumer<Usuario> mostrador = u ->
		System.out.println(u.getNome()); 
	
	/* 
	 usuarios.forEach(u -> System.out.println(u.getNome()));  */
	
	/* usuarios.forEach(u -> u.tornaModerador()); */
	

	@Override
	public void accept(Usuario t) {
		// TODO Auto-generated method stub
		
	}
}
