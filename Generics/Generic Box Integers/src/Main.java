import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        IntegerBox<Integer> box = new IntegerBox<>();
        for (int i = 0; i <n ; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            box.add(input);

        }

        box.print();
    }
}
