public class Order_Of_Operations {
    public static void main(String[] args) {

        System.out.println();

        int expression1 = 5 % 2 - (4 * 2 - 1);
        System.out.println("The First Expression is " + "5 % 2 - (4 * 2 - 1).");
        System.out.println();
        System.out.println("The Answer of the First Expression is " + expression1 + ".");
        System.out.println();

        int expression2 = (3 + (2 * 2 - 5)) + 6 - 5;
        System.out.println("The Second Expression is " + "(3 + (2 * 2 - 5)) + 6 - 5.");
        System.out.println();
        System.out.println("The Answer of the Second Expression is " + expression2 + ".");
        System.out.println();

        int expression3 = 5 * 4 % 3 - 2 + 1;
        System.out.println("The Third Expression is " + "5 * 4 % 3 - 2 + 1.");
        System.out.println();
        System.out.println("The Answer of the Third Expression is " + expression3 + ".");

        System.out.println();

    }
}