import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        BoxCompareDouble<Double> box = new BoxCompareDouble<>();
        for (int i = 0; i <n ; i++) {
            Double input = Double.parseDouble(scanner.nextLine());
            box.add(input);

        }

        Double input = Double.parseDouble(scanner.nextLine());

        box.print(input);
    }
}