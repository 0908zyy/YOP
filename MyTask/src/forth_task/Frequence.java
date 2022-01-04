package forth_task;
import java.util.Scanner;

public class Frequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Ente the integers between 1 and 100: ");
		int n,i;
		int[] count=new int[101];
		do {
			n=input.nextInt();
			++count[n];
		}while(n!=0);
		
		for(i=1;i<101;i++) {
			if(count[i]==0) {
				continue;
			}
			else if(count[i]==1) {
				System.out.println(i+" occurs "+count[i]+" times ");
			}
			else {
				System.out.println(i+" occurs "+count[i]+" times ");
			}
		}
			
	}
}
