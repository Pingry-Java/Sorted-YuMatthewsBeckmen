public class SortingExercises extends Sorted{
	
	public SortingExercises(int[] originalData){
		super(originalData);
	}
	
	public void add(int n){
		
		int[] array = new int[getIndex().length+1];
		int index = 0;
		for (int i = 0; i<array.length-1; i++){
			if(getIndex()[i]>n){
				index = i;
				break;
			}
		}
		
		for(int i = 0; i<index; i++){
			array[i] = getIndex()[i];
		}
		
		array[index] = n;
		
		for (int i = index+1; i<array.length; i++){
			array[i] = getIndex()[i-1];
		}
		
		setIndex(array);
	}
	
	public int[] sort(int[] data){
		
		// selection sort
		
		int[] sortedArray = new int[data.length];
		//Copy the contents
		for (int i = 0; i < data.length; i++)
			sortedArray[i] = data[i];
		int smallestIndex = 0;
		int temp;
		for(int i = 0; i<data.length-1; i++){
			smallestIndex = i;
			for(int j = i+1; j<data.length; j++){
				if (sortedArray[smallestIndex]>sortedArray[j]){
					smallestIndex = j;
				}
			}
			temp = sortedArray[i];
			sortedArray[i]=sortedArray[smallestIndex];
			sortedArray[smallestIndex]=temp;
		}
		return sortedArray;
	}
}