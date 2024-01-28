import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FindingNumbers {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\dsdsk\\IdeaProjects\\FindingNumbers\\Numbers.txt");
        Scanner num = new Scanner(file);

        ArrayList<Integer> find = new ArrayList<>();

        // Initialize maximum and minimum with the first element of the ArrayList
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        while (num.hasNextInt()) {
            find.add(num.nextInt());
        }

        for (int j = 0; j < find.size(); j++) {
            if (find.get(j) > maximum) {
                maximum = find.get(j);
            }
            if (find.get(j) < minimum) {
                minimum = find.get(j);
            }
        }

        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);

        int sum = 0;
        for (int k = 0; k < find.size(); k++) {
            sum += find.get(k);
        }
        System.out.println("Sum: " + sum);

        int avg = 0;
        if (find.size() > 0) {
            avg = sum / find.size();
        }
        System.out.println("Average: " + avg);
    }
}

