public class Main {
    public static void main(String[] args) {
        int[] initialHealth = {100, 200, 150};
        int[] deltas = {-20, -50, 30};

        int initialHealthValue = calculateInitialHealth(initialHealth, deltas);
        System.out.println("Initial Health: " + initialHealthValue);
    }

    public static int calculateInitialHealth(int[] initialHealth, int[] deltas) {
        int n = initialHealth.length;
        int sum = 0;

        for (int i = n - 1; i >= 0; i--) {
            sum += deltas[i];
            if (sum < 0) {
                initialHealth[i] -= sum;
                sum = 0;
            }
        }

        return initialHealth[0];
    }
}
