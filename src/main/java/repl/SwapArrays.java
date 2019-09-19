package repl;

import java.util.Arrays;

public class SwapArrays {

    /**
     * method that takes an array and reverses it
     * @param stringArray array you want to reverse
     * @return the reversed array
     */
    public static String[] swap(String[] stringArray){

        // store size of the array being given
        int stringArraySize = stringArray.length;

        // set the counter to size minus 1 that way we can count down from the last index of our array
        int counter = stringArraySize - 1;

        // create an array that will hold our reverse version of the array given
        String[] swappedArray = new String[stringArraySize];

        // loop thru the arrays
        for (int index = 0; index < stringArraySize; index++) {

            // set the value at counter in our swapped array to the value of the current index of stringArray
            swappedArray[counter] = stringArray[index];

            //subtract 1 from counter to move down to the next index point for swapped array
            counter--;
        }

        return swappedArray;
    }

    public static void main(String[] args) {
        String[] exampleArray = {"A", "B","C", "D", "E"};

        System.out.println(Arrays.toString(swap(exampleArray)));
    }
}
