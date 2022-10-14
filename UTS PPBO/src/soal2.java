
import java.util.Scanner;

/*
 created by 21343008_Maharani Safitri
 */
public class soal2 {
    public static void main(String[]args){

		try (Scanner input = new Scanner(System.in)) {
			int n;
			
			System.out.println("Nama: Maharani Safitri");
			System.out.println("Nim: 21343008");
                        System.out.println("UTS: PRATIKUM PEMROGRAMAN BERORINTASI OBJEK");
			System.out.println("-------------------------------------------------");
			System.out.println("Masukan Jumlah baris: ");
			n = input.nextInt();
			
			System.out.println();	
			
			for(int a=1; a<=n; a++) {
				for(int b=1; b<=a; b++) {
					System.out.print(" ");
				}
				for(int b=a; b<=n; b++) {
					System.out.print(" #");
				}
				System.out.println();
			}
			
			for(int c=1; c<=n; c++) {
				for(int d=c; d<=n; d++) {
					System.out.print(" ");
				}
				for(int d=1; d<=c; d++) {
					System.out.print(" *");
				}
				System.out.println();
			}
		}
	}

}