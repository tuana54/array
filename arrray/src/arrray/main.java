package arrray;

public class main {
	public static void printArray(double array[]) {
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
	public static void main(String[] args) {
		double mylist[]= {1.9,2.9,3.4,3.5};
		/*for(int i=0;i<mylist.length;i++) {
			System.out.println(mylist[i]);
		}*/
		printArray(mylist);
	}
	
	
}
