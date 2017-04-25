public class Runner {

	public static void main(String[] arguments) {
		
		// Some test data
		int[] testData = {4, 5, 7, 2, 0, -9};
		
		Sorted s = new SortingExercises(testData);
		
		// Ensure the original data is preserved
		for (int i = 0; i < testData.length; i++) {
			System.out.print(testData[i] + ", ");
		}
		
		//TODO Test the rest of your methods here.
	
		System.out.println();
		for (int i = 0; i < testData.length; i++) {
			System.out.print(s.get(i) + ", ");
		}
		
		System.out.println();
		
		s.add(4);
		
		for (int i = 0; i < s.getIndex().length; i++) {
			System.out.print(s.get(i) + ", ");
		}
		System.out.println();
	
	}



}