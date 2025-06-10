//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double totalCost;
        double summerCost = 12.35;
        double winterCost = 24.86;
        double springCost = 32.13;
        double fallCost = 11.54;
        totalCost = summerCost + winterCost + springCost + fallCost;
        System.out.println("Summer cost: $" + summerCost);
        System.out.println("Winter cost: $" + winterCost);
        System.out.println("Spring cost: $" + springCost);
        System.out.println("Fall cost: $" + fallCost);
        System.out.println("Your total yearly maintenance cost: $" + totalCost);
    }
}