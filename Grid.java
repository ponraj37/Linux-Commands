package basic_programs;

// Write a Java program to print the following grid.

public class Grid {

	public static void main(String[] args) {
		
		int n=10;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("-");
			}
			System.out.println();
		}

	}

}
