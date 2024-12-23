import java.util.Scanner;

public class PizzaTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Pizza randomPizza = new Pizza();
        System.out.println("Randomly Generated Pizza: " + randomPizza);

        try {
            System.out.print("Enter number of pizzas to order: ");
            int n = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < n; i++) {
                System.out.print("Enter number of slices: ");
                int slices = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter meat choice (CHICKEN, PEPPERONI, SAUSAGE): ");
                String meatInput = scanner.nextLine().toUpperCase();

                System.out.print("Enter vegetable choice (ONION, PEPPER, MUSHROOM, OLIVE, TOMATO): ");
                String vegInput = scanner.nextLine().toUpperCase();

                try {
                    MeatChoice meatChoice = MeatChoice.valueOf(meatInput);
                    VegChoice vegChoice = VegChoice.valueOf(vegInput);

                    Pizza customPizza = new Pizza(slices, meatChoice, vegChoice);
                    System.out.println("Ordered Pizza: " + customPizza);
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid meat or vegetable choice. Try again.");
                } catch (InvalidPizzaChoiceException e) {
                    System.out.println(e.getMessage());
                }
            }
        } finally {
            scanner.close();
        }
    }
}
