package repl;

public class GetSecondToLastElementOfArray {
    /**
     *
     * @param names an array of strings
     * @return the second to last item of any size array
     */
    public static String getSecondToLastElement(String[] names) {
        // because the array could be of any size we get the size of the array
        // then because an array index starts at 0 we subtract 2 to get the second to last item in the array
        return names[names.length -2];

    }

    public static void main(String[] args) {
        String[] names = {"a","b","c","d","e"};

        System.out.println(getSecondToLastElement(names));
    }
}
