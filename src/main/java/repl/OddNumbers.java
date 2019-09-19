package repl;

public class OddNumbers {
    /**
     * Method for getting odd numbers from 1 - 20
     *
     * @return returns a string containing the odd numbers from 1- 20
     *         and formats so that each number is on a new line
     */
    public static String oddNumbers(){
        String response = "***Output***";
        int num = 1;

        while (num <= 20){
            // check if num modulo 2's remainder isn't 0 if true then num is odd
            if(num % 2 != 0 )
                //adds i to our response string because it is odd and not 0
                response += "\n" + num;

            num++;
        }

        //Do not write below here
        return response;
    }






    public static void main(String[] args) {
        System.out.println(oddNumbers());
    }
}
