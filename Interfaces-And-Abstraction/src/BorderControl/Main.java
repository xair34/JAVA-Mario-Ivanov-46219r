package BorderControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Identifieable> robots = new ArrayList<>();
        List<Identifieable> citizens = new ArrayList<>();

        String input = reader.readLine();
        while (!input.equals("End")){
            String[] tokens = input.split(" ");
            if (tokens.length == 2){
                Robot robot = new Robot(tokens[0], tokens[1]);
                robots.add(robot);
            } else {
                Person citizen = new Person(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                citizens.add(citizen);
            }
            input = reader.readLine();
        }

        String validationFakeId = reader.readLine();

        printFakeId(citizens, validationFakeId);
        printFakeId(robots, validationFakeId);

    }

    private static void printFakeId(List<Identifieable>list, String lastDigit) {
        for (Identifieable element : list) {
            if (element.getId().endsWith(lastDigit)) {
                System.out.println(element.getId());
            }
        }
    }
}
