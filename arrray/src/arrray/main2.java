package arrray;

public class main2 {

	public static void main(String[] args) {
		int numbers[]=new int[5];
		numbers[0]=10;
		numbers[1]=15;
		numbers[2]=20;
		numbers[3]=25;
		numbers[4]=30;
		
		System.out.println(numbers[3]);
		System.out.println(numbers.length);
		
		String cars[]= {"bmw","mercedes","toyota","ford"};
		cars[0]="hyundai";
		cars[3]="honda";
		for(int i=0;i<cars.length;i++) {
			System.out.println(cars[i]);
		}
	}
}
