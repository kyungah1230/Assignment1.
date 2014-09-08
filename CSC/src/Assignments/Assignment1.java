package Assignments;

import java.util.Scanner;
/**
 * Chapter 2 Problem 8
 * Write a program that will allow user to input his or her
 * weight in pounds, height in inches, and ages in years.
 * Then calculate the BMR using 
 * Woman's BMR = 655 + (4.3 x weight) + (4.7 x height in inches) - (4.7 x age in years)
 * Man's BMR = 66 + (6.3 x weight) + (12.9 x height in inches) - (6.8 x age in years)
 * Then output the number of chocolate bars that are 230 calories each
 * that should be consumed to maintain one's weight for both a woman and man.
 * 
 * @author geonheeko
 * Date: 9/3/2014
 *
 *Algorithm:
 *1.Prompt the user for weight, height, and age.
 *2.Calculate the BMP for both men and women
 *3.Divide BMP by 230
 */
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
