import java.util.Scanner;
	
public class main {
    public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);

 
	    int i;
			System.out.print("Enter a number: ");
			i = scan.nextInt();
			
		if(i % 2 == 0){
			System.out.print("Number is even");
		}else{
			System.out.print("Number is odd");
		}
	}
}
