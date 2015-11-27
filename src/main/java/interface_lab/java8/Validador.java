package interface_lab.java8;

@FunctionalInterface
public interface Validador<T> {
	boolean valida(T t);
}
