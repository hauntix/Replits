package repl;

public class SumOfArrayOfElements {
    static int sum = 0;

    /**
     *
     * @param ints asks for an array of ints
     * @return returns the total sum of all the numbers in the array of ints
     */
    public static int getSum(int[] ints){

        // loop thu the ints array
        for (int index = 0; index < ints.length; index++) {

            //add the number from the ints array located at the current index to sum
            sum += ints[index];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("The sum is: " + getSum(numbers));
    }
}
