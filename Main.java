/*
* This is the standard Main.java starting point.
*
* @author  Curtis Edwards
* @version 1.0
* @since   2024-04-07
*/

/**
* This is the Main program.
*/
final class Main {
    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException if instantiation is attempted
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(String[] args) {
        // constants
        final String fruitsString = "fruits: ";
        final String poppedString = "popped: ";
        final String coloursString = "colours: ";
        final String shapesString = "shapes: ";
        final String lengthString = "length: ";
        final String isEmptyString = "is empty: ";
        final String peakString = "peak: ";
        final String clearingStackString = "Clearing stack...";

        final CurtisStack fruits = new CurtisStack();
        fruits.push("apple");
        fruits.push("banana");
        fruits.push("cherry");
        System.out.println(fruitsString + fruits.showStack());
        System.out.println(peakString + fruits.peak());
        System.out.println(poppedString + fruits.popItem());
        System.out.println(fruitsString + fruits.showStack());
        fruits.clear();
        System.out.println(clearingStackString);
        System.out.println(fruitsString + fruits.showStack());
        System.out.println("");

        final CurtisStack colours = new CurtisStack();
        colours.push("red");
        colours.push("green");
        colours.push("blue");
        System.out.println(coloursString + colours.showStack());
        System.out.println(peakString + clours.peak());
        System.out.println(poppedString + colours.popItem());
        System.out.println(poppedString + colours.popItem());
        System.out.println(peakString + clours.peak());
        System.out.println(coloursString + colours.showStack());
        colours.clear();
        System.out.println(clearingStackString);
        System.out.println(coloursString + colours.showStack());
        System.out.println("");

        final CurtisStack shapes = new CurtisStack();
        shapes.push("square");
        shapes.push("triangle");
        shapes.push("circle");
        System.out.println(shapesString + shapes.showStack());
        System.out.println(peakString + shapes.peak());
        shapes.clear();
        System.out.println(clearingStackString);
        System.out.println(peakString + shapes.peak());
        System.out.println("");

        System.out.println("\nDone.");
    }
}
