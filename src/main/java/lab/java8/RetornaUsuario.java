package lab.java8;

import java.util.List;
import java.util.Arrays;

public class RetornaUsuario {
	public static void main(String ... args) {
		Usuario user1 = new Usuario("Edmundo de Azevedo Batista", 120);
		Usuario user2 = new Usuario("Walison Moreira", 1200);
		Usuario user3 = new Usuario("Guilherme Freitas Pacheco", 900);
		
		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		
		for (Usuario u : usuarios)  {
			System.out.println(u.getNome());
		}	
	}
}
