package interface_lab.java8;

import java.awt.event.ActionEvent;

public interface Runnable {	
	
	new Thread(() -> {
		for (int i = 0; i <= 1000; i++) {
			System.out.println(i);
			
		}
	}).start();
	
	/*
	button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			System.out.println("evento do clique acionado");
		}
	});*/
	
	button.addActionListener(
			event -> System.out.println("evento do clique acionado")
			);
			
}
