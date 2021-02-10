package practiceTest;

import java.util.Scanner;

public class ArrayAge {
	public static void main(String[] args) {
		int Children=0,Adult=0,SC=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of people");
		int size=sc.nextInt();
		int[] ages = new int[size];
		System.out.println("Enter ages of "+size+" people");
		for(int j=0;j<size;j++)
		{
			ages[j] = sc.nextInt();
		}

		for(int i=0;i<size;i++)
		{
			int age = ages[i];
			if(age<18) {
				Children++;
			}
			else if(age>=18 && age<=54)
			{
				Adult++;

			}
			else if(age>55) {
				SC++;
			}



		}

		System.out.println("Children : "+Children);
		System.out.println("Adult : "+Adult);
		System.out.println("Senior Citizen : "+SC);
	}
}

