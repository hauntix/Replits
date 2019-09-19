package repl;

public class Contains {
    /**
     *
     * @param names an array of strings
     * @param element a string that we are going to look for in the array
     * @return returns true if the element is in the array else it returns false
     */
    public static boolean contains(String[] names, String element){

        // loop thru the array
        for (int index = 0; index < names.length; index++) {

            // check if the string at the current index contains the element we are looking for
            if(names[index].contains(element))
                // we return true as have found our element
                return true;
        }

        // if when were done looping thu the array and the element is never found we want to return false
        return false;
    }

    public static void main(String[] args) {
        String[] names = {"a","b","c","d","e"};

        System.out.println(contains(names, "c"));
        System.out.println(contains(names, "z"));
    }
}
