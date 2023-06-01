
public class Student {

	private String studentName;
	private int studentId;
	private int[] arrMarks;
	
	
		
		//Constructor
		public Student() {
			int arrMarks [] = new int[5];
			this.studentName = "Mustafa";
			this.studentId = 120200063;
			this.arrMarks = new int[] {15 , 20, 100 ,-100, 50};
		}
		
		public Student(String studentName,int studentId,int[] arrMarks) {
			this.studentName = studentName;
			this.studentId = studentId;
			this.arrMarks = arrMarks;
		}
		
		public String getName() {
			return this.studentName;
		}
		
		public int getId() {
			return this.studentId;
		}
		
		public int[] getArrMarks() {
			return this.arrMarks;
		}
		public String setName(String studentName) {
			return this.studentName;
		}
		
		public int setId(int studentId) {
			return this.studentId;
		}
		
		public int[] setArrMarks(int[] arrMarks) {
			return this.arrMarks;
		}
		public int[] validateMarks(int[] arrMarks) {
			int a = arrMarks.length;
			int k = 0;
			for(int i=0; i<arrMarks.length; i++) {
				
				if(arrMarks[i]<0 || arrMarks[i]>100) {
					a = a - 1;
					continue;
				}
			}
				int[] newArr = new int[a];
			
				for(int j=0; j<arrMarks.length; j++) {
					if(arrMarks[j]<0 || arrMarks[j]>100) {
						continue;
					}
					newArr[k]=arrMarks[j];
					k++;
				
			}
			return newArr;
			}
			
			
			
			
		
		
		

	

}
