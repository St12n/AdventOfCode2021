package dayTwo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class DataImport {

    public static void main(String[] args) {

        List<String> dataInput = new ArrayList<>();
        try {
            var lines = Files.readAllLines(Path.of("C:\\_Projects\\advent-of-code-2021\\inputFiles\\inputAdventOfCode2.txt"));
            for (var line : lines) {
                dataInput.add(line);
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }

        int horizontalMovement = 0;
        int verticalMovement = 0;

        for (String data : dataInput) {
            String line[] = data.split(" ");
            switch (line[0]){
                case "forward":
                    horizontalMovement += Integer.parseInt(line[1]);
                    break;

                case "up":
                    verticalMovement -= Integer.parseInt(line[1]);
                    break;

                case "down":
                    verticalMovement += Integer.parseInt(line[1]);
                    break;

                default:
                    System.out.println("wrong input");

            }
        }

        System.out.println(horizontalMovement * verticalMovement);

    }
}
