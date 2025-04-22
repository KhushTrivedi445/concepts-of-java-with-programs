package javaprograms;
import java.util.*;
public class District {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n= sc.nextInt();
		String name[]=new String[n];
		System.out.println("Enter the number of districts as the size you decided: ");
		for(int i=0;i<n;i++) {
				name[i]=sc.nextLine();
		}
		System.out.println("Enter the index you want to search: ");
		int index=sc.nextInt();
		getdistrict(index,name);
		
	}
	
	public static void getdistrict(int index,String name[]) {
		if(index>name.length) {
			System.out.println("Out of bounds");
		
		} else{
			System.out.println(name[index]);
			
		}
	}

}
