package repl;

public class ArrayOfStrings {
    /**
     *
     * @param input an array of strings
     * @return a string with every item of the array on a new line
     */
    public static String printArray(String[] input){
        String response = "*** Output ***";

        // loop thru the array
        for(int i = 0; i<input.length; i++)
            // add a new line and add the string in the array at index position i to our response
            response += "\n" + input[i];

        return response;
    }

    public static void main(String[] args) {
        String [] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};

        System.out.println(printArray(breakfast));
    }
}
