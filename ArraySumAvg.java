import java.util.Scanner;

class ArraySumAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        float avg = (float) sum / n;

        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + avg);

        sc.close();
    }
}
