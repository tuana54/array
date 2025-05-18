package arrray;
import java.util.Scanner;

public class arrayExample {

	public static void main(String[] args) {
		//Matris boyutunu sizin belirlediğiniz matris değerlerini ise kullanıcının girdiği bir algoritma yazınız.
		Scanner input=new Scanner(System.in);
		System.out.println("matrisin satır sayısını giriniz:");
		int satir=input.nextInt()	;
		System.out.println("matrisin sütun sayısını giriniz:");
		int sutun=input.nextInt();
		
		int matris[][]=new int[satir][sutun];
		System.out.println("matrisin elementlerini giriniz:");
		for(int i=0;i<matris.length;i++) {
			for(int j=0;j<matris[i].length;j++) {
				System.out.print("matris[" + i + "][" + j + "]: ");
				matris[i][j]=input.nextInt();
			}
		}
	}

}
