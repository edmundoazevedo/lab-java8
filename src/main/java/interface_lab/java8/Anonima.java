package interface_lab.java8;

public interface Anonima {
	
	// Forma antes do Lambda
	/*
	Validador<String> validadorCEP = new Validador<String>() {
		
		@Override
		public boolean valida(String t) {
			return t.matches("[0-9]{5}-[0-9]{3}");
		}
	}; */
	
	// Mostrando Lambda
	/*
	Validador<String> validadorCEP = t -> {
		return t.matches("[0-9]{5}-[0-9]{3}");
	}; */
	
	// Mostrando Lambda no seu estado mais primitivo
	Validador<String> validadorCEP = t ->
		t.matches("[0-9]{5}-[0-9]{3}");
		
}
