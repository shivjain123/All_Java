public class Line_1_2_3 {
    public static void main(String[] args) {
        String line1 = "Nah nah nah nah nah nah nah nah nah yeah";
        String line2 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
        String line3 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";

        System.out.println();

        if (line1.equals(line2)) {
            System.out.println("Line 1 is equal to Line 2.");
        } else {
            System.out.println("Line 1 is not equal to Line 2.");
        }

        System.out.println();

        if (line2.equals(line3)) {
            System.out.println("Line 2 is equal to Line 3.");
        } else {
            System.out.println("Line 2 is not equal to Line 3.");
        }

        System.out.println();
    }
}
