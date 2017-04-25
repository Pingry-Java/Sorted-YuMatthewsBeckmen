public abstract class Sorted {
	
	/**
	 * Member representing the items in this collection. For simplicity, assume
	 * that this array will never have to hold over 100 items.
	 */
	private int[] items;
	
	/**
	 * Takes in an array of original data that is not necessarily sroted, makes a sorted
	 * copy, and stores the sorted copy in item. The original data, including order is preserved.
	 */
	public Sorted(int[] originalData) {
		items = sort(originalData);
	}
	
	/**
	 * Add the new int to the correct position in the array.
	 */
	public abstract void add(int n);
	
	/**
	 * Return the item at position i.
	 */
	public int get(int i){
		return items[i];
	}
	
	public int[] getIndex(){
		return items;
	}
	
	public void set(int index, int value){
		items[index] = value;
	}
	
	public void setIndex(int[] newItems){
		items = newItems;
	}
	
	/**
	 * Takes in an int array, makes a sorted copy, ad returns it.
	 * The original data MUST be preserved.
	 * Implement this using one of our sort algorithms.
	 */
	public abstract int[] sort(int[] originalData);

	
}