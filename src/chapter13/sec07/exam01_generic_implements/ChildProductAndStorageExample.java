package chapter13.sec07.exam01_generic_implements;

public class ChildProductAndStorageExample {
	public static void main(String[] args) {
		
		ChildProduct<Tv, String, String> product = new ChildProduct<>();
		product.setKind(new Tv());
		product.setModel("Smart TV");
		product.setCompany("Samsung");
		
		Storage<Tv> storage = new StorageImpl<Tv>(100); // 100대(capacity)까지 저장할 수 있다는 뜻
		storage.add(new Tv(), 0);
		Tv tv = storage.get(0);
		
	}
}
