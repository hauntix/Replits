package repl;

public class AreWeThereYet {
    /**
     *
     * @param userInput variable containing the user input
     * @return returns true if the userInput contains yes
     */
    public static boolean areWeThereYet(String userInput){
        // checks if user input equals yes while ignoring upper/lower case
        // and returns true if it matches
        return userInput.equalsIgnoreCase("yes");
    }

    public static void main(String[] args) {
        System.out.println(areWeThereYet("Yes"));
        System.out.println(areWeThereYet("yEs"));
        System.out.println(areWeThereYet("no"));
    }
}
