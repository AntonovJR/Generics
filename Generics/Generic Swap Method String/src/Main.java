import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        SwapBox<String> box = new SwapBox<>();
        for (int i = 0; i <n ; i++) {
            String input = scanner.nextLine();
            box.add(input);

        }

        String[] input = scanner.nextLine().split("\\s+");
        box.swap(Integer.parseInt(input[0]),Integer.parseInt(input[1]));
        box.print();
    }
}
