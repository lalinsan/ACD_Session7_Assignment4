/*
 * Student: Eduardo Aguirre
 * Session 7
 * Assignment 4
 * Java Class that runs a selection sort on the elements of an Array in Descending order
 *  
 */


import java.util.Arrays; //Import the Arrays Class from the Java Library
import java.util.Scanner; //Import the Scanner Java Class that allows the User to Input

public class SortingInsertDemo 
{
	public static void main (String [] args) //Main method to start the Program
	{
		//Array of Integers
		int myArray[]; //Variable to store the Array
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in); //Creates an instance of the Scanner
		System.out.print ("What is the size of the Array ? "); // Prompts the user to enter the size of the array
		int size=sc.nextInt(); //Stores the value entered by the user in the size variable
		if (size>10)
		{
			System.out.println("The size of the Array mut be lower than 20");
			System.out.println("Thanks for trying ");
		}
		else 
		{
			myArray = new int [size]; // assigns the size of the array to the variable my Array
			System.out.println ("Enter number on the Array : "); //Prompts the user to enter the Array numbers
			for (int i=0; i<size; i++) //Loops to store the values on the Array as per defined array size 
			    {
					myArray[i]=sc.nextInt(); //Assigns the value to myArray
				}
				
			System.out.println ("============ Before Sorting ===========");
			System.out.println ("=======================================");
			System.out.println (Arrays.toString(myArray));  //
			System.out.println ("=======================================");
				
			insertionSort(myArray); //Executes method to sort the Array
				
			System.out.println ("====== After Sorting Descending =======");
			System.out.println ("=======================================");
			System.out.println (Arrays.toString(myArray));
			System.out.println ("=======================================");
	
		}
							
	}

	public static void insertionSort (int[ ] myArray) //Method to sort array values in Ascending order
	{
		int i; //Variable used by outer for loop
		int j; //variable used by the nested (inner) loop
		int key; //variable to key to put the value in the right location
		
		for (j=1; j<myArray.length; j++)
		{
			key=myArray[j]; 
			for (i=j-1; (i>=0) && (myArray[i]<key); i--) //Smaller values are moved up
			{
				myArray [i+1]= myArray[i];
				
			}
			myArray [i+1]= key; //Puts the key in the right location
			
		}
			
	}
	
}
