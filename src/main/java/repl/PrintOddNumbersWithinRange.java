package repl;

public class PrintOddNumbersWithinRange {
    /**
     * method that counts down within a given range and returns all the odd numbers within the range
     * @param start where we start counting down from
     * @param end where we can stop counting down
     * @return a string containing the odd numbers withing the range
     */
    public static String printOddNumbersWithinRange(int start, int end){
        // initialize where we will store our response
        String response = "";

        // loop thru starting at the given start and ending at the given end
        for (int index = start; index >= end; index--) {

            //check if index is odd
            if(index % 2 != 0){

                //add the index to our response because its an odd number
                response += index;
            }
        }

        return response;
    }

    public static void main(String[] args) {
        System.out.println(printOddNumbersWithinRange(20, 3));
    }
}
