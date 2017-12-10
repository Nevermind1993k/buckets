import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter capacity: ");
        Scanner sc = new Scanner(System.in);
        int capacity;

        while (true) {
            capacity = sc.nextInt();
            if (capacity < 10 || capacity > 200) {
                System.out.println("Capacity must be more then 10 or less then 200");
            } else {
                break;
            }

        }

        System.out.println(Bucket.getCountOfWays(capacity));

    }
}
