package repl;


public class OneToTen {
    /**
     * Method for getting a string with the numbers 1 - 10
     * string formatted so that each number is on a line of its own
     *
     * @return returns the string containing the numbers 1 -10
     */
    public static String oneToTen(){
        // variable where we store our answer
        String response = "***Output***";
        //loop from 1 - 10
        for(int i = 1; i <= 10; i++){
            // we add a new line to the string before adding our number
            response += "\n" +i ;
        }

        return response;
    }


    public static void main(String[] args) {
        System.out.println(oneToTen());
    }
}
