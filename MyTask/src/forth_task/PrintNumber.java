package forth_task;
import java.util.Scanner;

public class PrintNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter 10 numbers: ");
		
		int[] arr=new int[11];
		int count=0;
		int temp=input.nextInt();
		while(temp!=0) {
			boolean flag=false;
			for(int i=0;i<count;i++) {
				if(arr[i]==temp) {
					flag=true;
					break;
				}
			}
			if(!flag) {
				arr[count]=temp;
				count++;
			}
			temp=input.nextInt();
		}
		System.out.println("The number of distinct number id: "+count);
		System.out.print("The distinct numbers are: ");
		for(int j=0;j<count;j++) {
			System.out.printf("%d ", arr[j]);
		}


	}

}
