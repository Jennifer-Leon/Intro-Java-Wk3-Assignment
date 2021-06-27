import java.lang.reflect.Array;
import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Create an array of int called ages that contains the following values: 3,
		// 9, 23, 64, 2, 8, 28, 93.
		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93 };

		// a. Programmatically subtract the value of the first element in the array from
		// the value in the last element of the array (i.e. do not use ages[7] in your
		// code). Print the result to the console.
		System.out.println(ages[ages.length - 1] - ages[0]);

		// b. Add a new age to your array and repeat the step above to ensure it is
		// dynamic (works for arrays of different lengths).
		int[] agesWithAdditionalNumber = { 3, 9, 23, 64, 2, 8, 28, 52, 93 };
		System.out.println(agesWithAdditionalNumber[agesWithAdditionalNumber.length - 1] - agesWithAdditionalNumber[0]);

		// c. Use a loop to iterate through the array and calculate the average age.
		// Print the result to the console.
		int length = ages.length;
		int sum = 0;
		for (int i = 0; i < ages.length; i++) {
			sum += ages[i];
		}
		double average = sum / length;
		System.out.println("Average of Ages: " + average);

		// 2. Create an array of String called names that contains the following values:
		// “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };

		// a. Use a loop to iterate through the array and calculate the average number
		// of letters per name. Print the result to the console.
		int sumNameLength = 0;
		for (String name : names) {
			sumNameLength += name.length();
		}
		double averageLettersInName = sumNameLength / names.length;
		System.out.println(averageLettersInName);

		// b. Use a loop to iterate through the array again and concatenate all the
		// names together, separated by spaces, and print the result to the console
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		// 3. How do you access the last element of any array?
		String lastElement = "\n" + names[names.length - 1];
		System.out.println(lastElement);

		// 4. How do you access the first element of any array?
		String firstElement = names[0];
		System.out.println(firstElement);

		// 5. Create a new array of int called nameLengths. Write a loop to iterate over
		// the previously created names array and add the length of each name to the
		// nameLengths array.
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		System.out.println(Arrays.toString(nameLengths));
		// 6. Write a loop to iterate over the nameLengths array and calculate the sum
		// of all the elements in the array. Print the result to the console.
		int totalNumberOfNumbers = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			totalNumberOfNumbers = totalNumberOfNumbers + nameLengths[i];
		}
		System.out.println(totalNumberOfNumbers);
	}

	// 7. Write a method that takes a String, word, and an int, n, as arguments and
	// returns the word concatenated to itself n number of times. (i.e. if I pass in
	// “Hello” and 3, I would expect the method to return “HelloHelloHello”).

	public static void main1(String args[]) {
		String word1 = " ";
		word1 = word1.concat(" ");
		word1 = word1.concat(" ");
		System.out.println(word1);
				
	}
	// 8. Write a method that takes two Strings, firstName and lastName, and returns
	// a full name (the full name should be the first and the last name as a String
	// separated by a space).

	public static void fullName(String firstName, String lastName) {
			System.out.println(firstName + " " + lastName);
				
					}

	// 9. Write a method that takes an array of int and returns true if the sum of
	// all the ints in the array is greater than 100.
	public static boolean isItMoreThenOneHundred(int array) {
		int sum = 0;
		for (int i = 0; i < Array.getLength(i); i++)
			;
		if (sum >= 100) {
			return true;
		} else {
			return false;
		}
	}
	// 10. Write a method that takes an array of double and returns the average of
	// all the elements in the array.

	public static double averageOfElements(double[] array) {
		double sum = 0;
		for (int i = 0; i < Array.getLength(i); i++) {
			sum = ((sum + array.length) / array.length);
		}
		return sum;
	}

	// 11. Write a method that takes two arrays of double and returns true if the
	// average of the elements in the first array is greater than the average of the
	// elements in the second array.
	public static boolean doubleAverageOfArrays(double array1, double array2) {
		if (array1 > array2) {
			return true;
		} else {
			return false;
		}
	}
	// 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and
	// a double moneyInPocket, and returns true if it is hot outside and if
	// moneyInPocket is greater than 10.50.

	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (moneyInPocket >= 10.50 && isHotOutside == !false) {
			return true;
		} else {
			return false;
		}
	}

	// 13. Create a method of your own that solves a problem. In comments, write
	// what the method does and why you created it.
	public static boolean completeClass(boolean attendAllClasses, double earnSeventyPercentOrHigher) {
		if (attendAllClasses == true && earnSeventyPercentOrHigher >= 70.00) {
			return true;
		} else {
			return false;

		}
	}

	}
