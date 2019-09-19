package repl;

public class GetIndexByElement {

    /**
     *
     * @param names asks for an array of strings
     * @param element asks for the element to find the index for
     * @return gives us the index of where the element is in the given array
     */
    public static int getIndexByElement(String[] names, String element){
        int elementIndex = 0;

        // loop thru the names array
        for (int i = 0; i < names.length; i++) {

            //check if string at the current index matches the element given to us
            if(names[i].equals(element)){

                // since the element given matches the item in the array
                // we store the index so we can return it outside of the loop
                elementIndex = i;
            }
        }

        return elementIndex;

    }

    public static void main(String[] args) {
        String[] names = {"a","b","c","d","e"};
        System.out.println(getIndexByElement(names, "c"));
    }
}
