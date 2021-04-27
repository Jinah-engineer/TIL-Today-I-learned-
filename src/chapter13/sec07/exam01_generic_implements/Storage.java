package chapter13.sec07.exam01_generic_implements;

public interface Storage<T> {
	
	public void add(T item, int index);
	
	public T get(int index);
}
