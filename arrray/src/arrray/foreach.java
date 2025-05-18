package arrray;

public class foreach {

	public static void main(String[] args) {
		String car[]= {"mercedes","bmw","toyota","ford"};
		for(String i:car) {
			System.out.println(i);
		}
		int[][] matris= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
				
		};
		for(int u[]:matris) {
			for(int elem:u) {
				System.out.println(elem+" ");
			}
		}
	}
}
