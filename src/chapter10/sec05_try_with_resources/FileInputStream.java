package chapter10.sec05_try_with_resources;

public class FileInputStream implements AutoCloseable{
	// field
	private String file;
	
	// constructor
	public FileInputStream(String file) {
		this.file = file;
	}
	
	// method
	public void read() {
		System.out.println(file + "을 읽습니다.");
	}
	
	
	@Override
	public void close() throws Exception {
		System.out.println("파일을 닫습니다.");
	}

}
