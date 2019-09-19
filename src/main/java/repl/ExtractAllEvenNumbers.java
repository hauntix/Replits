package repl;

import java.util.Arrays;

public class ExtractAllEvenNumbers {

    /**
     *
     * @param numbers an array that holds a variety of even and odd numbers
     * @return return a string that lists all the even numbers sorted from smallest to biggest from the array given
     */
    public static String extractAllEvenNumbers(int[] numbers){

        // sort the given numbers array (sorts from smallest to largest
        Arrays.sort(numbers);

        // initialize where we will store our even numbers
        String evenNumbers = "";

        for (int index = 0; index < numbers.length; index++) {

            // check if number at current index is even
            if (numbers[index] % 2 == 0){

                // adds the even number at the current index to our string of even numbers
                // also adds a comma to the end for easier legibility
                evenNumbers += numbers[index] + ", ";
            }
        }

        // remove the last comma from the end of the string by using substring which is a method
        // that returns a string starting from the index position of 0 and ending at the 2nd to last index in the array
        evenNumbers = evenNumbers.substring(0, evenNumbers.length()-2);

        return evenNumbers;
    }

    public static void main(String[] args) {
        int[] input ={2, 5, 6, 7, 23, 4, 8, 12, 9};

        System.out.println(extractAllEvenNumbers(input));
    }
}
