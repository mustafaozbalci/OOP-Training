public class Test {
	
	public static void main(String[]args) {
		
		int[] arrMarks1 = {30,2133,40,-5,-50};
		Student test = new Student();
		test.setName("Ahmet");
		test.setId(211);
		test.setArrMarks(arrMarks1);
		for(int i=0; i<test.validateMarks(arrMarks1).length; i++) {
			System.out.println(test.validateMarks(arrMarks1)[i]);
		}
		
		
	}
}