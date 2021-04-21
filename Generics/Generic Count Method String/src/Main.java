import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        BoxCompare<String> box = new BoxCompare<>();
        for (int i = 0; i <n ; i++) {
            String input = scanner.nextLine();
            box.add(input);

        }

        String input = scanner.nextLine();

        box.print(input);
    }
}