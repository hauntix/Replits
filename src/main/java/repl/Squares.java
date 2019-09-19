package repl;

public class Squares {
    /**
     *
     * @return return the string containing the numbers 1 -10
     */
    public static String squares(){
        String response = "*** Output ***";

        // loop from 1 - 10
        for(int num = 1; num <= 10; num++)
            // add a new line then the number times itself (to get the square) to our response string
            response += "\n" + num*num;

        return response;
    }

    public static void main(String[] args) {
        System.out.println(squares());
    }
}
