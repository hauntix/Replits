package repl;

public class GetAverage {
    /**
     *
     * @param ints asks for an array of ints
     * @return gives the average number from the array given
     */
    public static int getAverage(int[] ints){
        int sum = 0;

        //loop thru ints array
        for (int index = 0; index < ints.length; index++) {

            //add the number found in ints at the current index to sum
            sum += ints[index];
        }

        // get the average by dividing by the total number of ints and return it
        return sum / ints.length;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(getAverage(numbers));
    }
}
