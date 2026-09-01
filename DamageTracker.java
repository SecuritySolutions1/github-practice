import java.util.Scanner;

public class DamageTracker {

    public static int calculateTotal(int[] damage) {
        int total = 0;

        for (int i = 0; i < damage.length; i++) {
            total = total + damage[i];
        }

        return total;
    }

    public static void displayResult(int total) {
        if (total >= 100) {
            System.out.println("That was a strong attack.");
        }
        else {
            System.out.println("That was a weak attack.");
        }
    }
	
	public static int findHighest(int[] damage) {
    int highest = damage[0];

    for (int i = 1; i < damage.length; i++) {
        if (damage[i] > highest) {
            highest = damage[i];
        }
    }

    return highest;
}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many hits? ");
        int hits = input.nextInt();

        int[] damage = new int[hits];

        for (int i = 0; i < damage.length; i++) {
            System.out.print("Enter damage for hit " + (i + 1) + ": ");
            damage[i] = input.nextInt();
        }

        int total = calculateTotal(damage);
		int highest = findHighest(damage);

        Attack attack = new Attack("Player attack", total);

        attack.displayAttack();
		System.out.println("Highest single hit: " + highest);
        displayResult(total);

        input.close();
    }
}