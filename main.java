import java.util.Scanner;
public class main {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		int size;
		do{
			System.out.println("Enter the size: ");
			size = input.nextInt();
			if(size <1 || size >8) {
				System.out.println("Invalid size");
			}
		}
		while(size < 1  || size > 8);
		System.out.print("*");
		for(int i = 0; i < 2*size; i++) {
			System.out.print(" ");
		}
		System.out.print("*\n");

		for(int i = 1, f = 2 * size-3; i < size; i++, f-=2) {
			for(int n = 0; n < i; n++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(int x = 0; x < f+1; x++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.print("\n");
		}
		for (int x = 0; x < 2; x++) {
			for(int i = 1; i < size+1; i++) {
				System.out.print(" ");

			}
			System.out.print("**\n");
		}
		for(int i = 1, f = size -1, n = 2; i < size; i++, f--, n+=2) {
			for(int s = f; s > 0; s--) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(int x =0; x < n; x++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.print("\n");
		}
		System.out.print("*");
		for(int i = 0; i < 2*size; i++) {
			System.out.print(" ");
		}
		System.out.print("*\n");
	}
}
