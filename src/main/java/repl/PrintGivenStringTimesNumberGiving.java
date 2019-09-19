package repl;

public class PrintGivenStringTimesNumberGiving {
    /**
     *
     * @param str string to be repeated
     * @param n how many times to repeat it
     * @return gives us a string with the user given str repeated n amount of times
     */
    public static String printGivenStringTimesNumberGiven(String str, int n){
        // initialize where we will store the response
        String response = "";

        // loop thru "n" times
        for (int index = 0; index < n; index++) {

            // add the user supplied str to our response
            response += str;
        }

        return response;
    }

    public static void main(String[] args) {
        System.out.println(printGivenStringTimesNumberGiven("ha", 5));
    }
}
