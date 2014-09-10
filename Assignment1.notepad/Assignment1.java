

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		
		double weight;
		double height;
		double age;
		int Man;
		int Woman;
		
		//Prompt the user for weight, height, and age.
		System.out.println("Enter weight in pounds");
		Scanner wt=new Scanner(System.in);
		weight=wt.nextInt();
		
		System.out.println("Enter height in inches");
		Scanner ht=new Scanner(System.in);
		height=ht.nextInt();
		
		System.out.println("Enter age");
		Scanner ag=new Scanner(System.in);
		age=ag.nextInt();

		//Calculate the BMP for both men and women and divide by 230.
		Man= (int)(66+(6.3*weight)+(12.9*height)-(6.8 * age))/230;
		Woman = (int)(655 + (4.3 * weight) + (4.7 * height) - (4.7 * age))/230;
		
		System.out.println("If you are a woman, you should eat "+Woman+
				" chocolate bars to maintain your weight."+"\nIf you are a man, you should eat "
				+Man +" chocolate bars to maintain your weight.");
	}

}