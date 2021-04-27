package chapter13.sec07.exam01_generic_implements;

public class ChildProduct<K, V, C> extends Product<K, V>{
	private C company;

	public C getCompany() {
		return company;
	}

	public void setCompany(C company) {
		this.company = company;
	}
}
