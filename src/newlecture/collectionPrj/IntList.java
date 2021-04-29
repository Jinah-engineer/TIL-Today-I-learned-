package newlecture.collectionPrj;

public class IntList {
	private int[] nums;
	private int current;
	
	public IntList() {
		nums = new int[3];
		current = 0;
	}
	
	public void add(int i) {
		nums[current] = i;
		current++;
	}

	public void clear() {
		current = 0;
	}

	public int size() {
		return current;
	}

	public int get(int i) {
		if (current <= i) {
			throw new IndexOutOfBoundsException();
		}
		return nums[i];
	}

}
