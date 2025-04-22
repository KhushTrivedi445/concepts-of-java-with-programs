package javaprograms;
import java.util.*;

public class NPrimeNumbers { 
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many pime numbers you want: ");
		int n=sc.nextInt();
		int count=0;
		int num=2;
		
		while(count<n) {
				int flag=0;
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					flag=1;
					break;
					
					
				}
			}
			
			if(flag==0) {
				System.out.println(num);
				count++;
			}
			num++;
			
		}
		
	}

}
