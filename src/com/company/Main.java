package com.company;

/* Create an array to hold the numbers 1-10.
Loop through that array and sum the numbers 1-10, then print that total to the screen.
Create an array to hold 10 number inputs from the user and print that total to the screen.
Get 10 number inputs from the user, store them in an array and get the average of those 10 numbers.
Create an array to store 3 names, loop through that array to print out the names.
Create an array with the following values: [2,5,9,0,2,1,8,5,4] Loop through the array and print out the index each time the value equals 5.
=========================================
7. Declare an array with the numbers 1-10. Print the numbers 1-10 backwards from the array.
8. Given the following array: ['w','t','y','h','k']
Loop through the array and replace the the letter 't' with the word "hello" once it's found.
9. Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4] 
Write a program that will print out all matching pairs from arrays 1 and 2.
Expected output:
(7,7) and (6,6)
*/

import java.util.Scanner;
//import java.util.Random;

public class Main {

    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

    int[] num, num_inputs;
    double[] num_inputs_avg;
    String[] with_names;

	num = new int[10]; //Create an array to hold the numbers 1-10.
	num_inputs = new int[10]; //Create an array to hold 10 number inputs from the user
    num_inputs_avg = new double[10];

    with_names = new String[3];

	double sum=0, sum_inputs=0;
	double avg_inputs=0;

	for (int i=0; i<10; i++) //Loop through that array and sum the numbers 1-10.
	{
		num[i] = i+1;
		sum = sum + num[i];
	}

	System.out.println("The array backwards is: "); //Print the numbers 1-10 backwards from the array.
	for (int i=9; i>=0; i--)
		System.out.println(num[i]);


	System.out.println("Sum from 1 to 10 is: " + sum); //then print that total of 1-10 to the screen.

	System.out.println("\nEnter 10 integer number inputs to add together. ");

	for (int i=0; i<10; i++) //Create an array to hold 10 number inputs from the user and print that total to the screen.
	{
		System.out.print("Enter number " + (i+1) + ": ");
		num_inputs[i]= scanner.nextInt();
		sum_inputs = sum_inputs + num_inputs[i];
	}

	System.out.println("Sum of user inputs is: " + Math.round(sum_inputs));

	System.out.println("\nEnter 10 integer number inputs to get average. ");

	sum_inputs = 0;

	for (int i=0; i<10; i++) //Get 10 number inputs from the user, store them in an array and get the average of those 10 numbers.
	{
		System.out.print("Enter number " + (i+1) + ": ");
		num_inputs_avg[i]= scanner.nextDouble();
		sum_inputs = sum_inputs + num_inputs_avg[i];
	}

	avg_inputs = sum_inputs / 10;
	System.out.println("Average of user inputs is: " + avg_inputs);

	System.out.println("\nEnter 3 names to store in the array. ");

	for (int i=0; i<3; i++){
		System.out.print("\nEnter name #" + (i+1) + ": ");
		with_names[i]= scanner.next();
	}

	System.out.print("\nYour names are:");

	for (int i=0; i<3; i++) {
		System.out.print(" " + with_names[i] + " ");
	}

// Create an array with the following values: [2,5,9,0,2,1,8,5,4]
// Loop through the array and print out the index each time the value equals 5.

	int[] arr = {2,5,9,0,2,1,8,5,4};
	System.out.println("Positions in array containing value of 5 are: ");

	for (int i=0; i < arr.length; i++){
		if (arr[i] == 5)
		System.out.println(i);
	}

//Given the following array: ['w','t','y','h','k']
//Loop through the array and replace the the letter 't' with the word "hello" once it's found.

    String[] string_arr = {"w","t","y","h","k"};
	for (int i=0; i<string_arr.length;i++)
		if (string_arr[i].equals("t"))
			string_arr[i] ="hello";

	System.out.println("The array of Strings contains: ");
	for (String myValue:string_arr)
		System.out.println(myValue);


//Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4] 
//Write a program that will print out all matching pairs from arrays 1 and 2.

    int[] arr_1 = {1,7,6,5,9} , arr_2 = {2,7,6,3,4};
    System.out.println("Matching pairs between two arrays are: ");
    for (int myValue1:arr_1)
    	for (int myValue2:arr_2)
			if (myValue1 == myValue2)
				System.out.println("(" + myValue1 + "," + myValue2 + ")");

    }
}
