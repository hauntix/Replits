import repl.*;

public class Main {
    public static void main(String[] args) {
        // set up some variables to be used for testing our methods
        String [] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};

        System.out.println("/************************************************************/\n");
        System.out.println("OneToTen output:\n" + OneToTen.oneToTen());

        System.out.println("\n/************************************************************/\n");
        System.out.println("OddNumbers output:\n" + OddNumbers.oddNumbers());

        System.out.println("\n/************************************************************/\n");
        System.out.println("Squares output:\n" + Squares.squares());

        System.out.println("\n/************************************************************/\n");
        System.out.println("AreWeThereYet output:\n");
        String yes = "yEs";
        String no = "nO";
        System.out.println("is input is yEs: " + AreWeThereYet.areWeThereYet(yes));
        System.out.println("is input nO" + AreWeThereYet.areWeThereYet(no));

        System.out.println("\n/************************************************************/\n");
        System.out.println("ArrayOfStrings output:\n" + ArrayOfStrings.printArray(breakfast));


    }
}
