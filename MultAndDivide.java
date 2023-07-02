public class MultAndDivide {
    public static void main(String[] args) {
        double subtotal = 30;
        double tax = 0.0875;

        double total = subtotal + (subtotal * tax);
        double perPerson = total / 4;

        System.out.println("The Total is " + total + ".");
        System.out.println("The Cost Per Person is " + perPerson + ".");
    }
}