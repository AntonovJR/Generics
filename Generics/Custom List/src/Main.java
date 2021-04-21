import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SmartArray<String> smartArray = new SmartArray();
        String input = scanner.nextLine();
        while (!"END".equals(input)) {
            String[] tokens = input.split("\\s+");
            switch (tokens[0]) {
                case "Add":
                    smartArray.add(tokens[1]);
                    break;
                case "Remove":
                    smartArray.remove(Integer.parseInt(tokens[1]));
                    break;
                case "Contains":
                    System.out.println(smartArray.contains(tokens[1]));
                    break;
                case "Swap":
                    smartArray.swap(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
                    break;
                case "Greater":
                    smartArray.greater(tokens[1]);
                    break;
                case "Max":
                    System.out.println(String.valueOf(smartArray.getMax()));
                    break;
                case "Min":
                    System.out.println(String.valueOf(smartArray.getMin()));
                    break;
                case "Print":
                    smartArray.print();
                    break;
                case "Sort":
                    smartArray.sort();

            }

            input = scanner.nextLine();
        }
    }
}
