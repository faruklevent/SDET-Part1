package aa_assignments.assignment06;

public class Question1 {

	public static void main(String[] args) {
		/* Write a Java program to print the following pattern
		1				
		1 2
		1 2 3
		1 2 3 4
		1 2 3 4 5		
		1 2 3 4 5 6		
		1 2 3 4 5 6 7
		1 2 3 4 5 6		
		1 2 3 4 5	
		1 2 3 4		
		1 2 3
		1 2
		1
		*/
		int k;
		
		for(int i=1; i<=13 ; i++) {
			
			if(i<=7) { k=i;		  }			
			else 	 { k=7-(i%7); }
			
			for(int j=1; j<=k; j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
