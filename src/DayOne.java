import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DayOne {

    public static void main(String[] args) {

        List<Integer> dataInput = new ArrayList<>();
        try {
            var lines = Files.readAllLines(Path.of("C:/_Projects/advent-of-code-2021/src/inputAdventOfCode1.txt"));
            for (var line : lines) {
                dataInput.add(Integer.parseInt(line));
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
        int amountIncreased = 0;

        for (int i = 0; i < dataInput.size() -1; i++){
            if (dataInput.get(i) < dataInput.get(i+1)) {
                amountIncreased++;
            }
        }
        System.out.println(amountIncreased);
    }




//        Path path = Paths.get("C:/_Projects/advent-of-code-2021/src/inputAdventOfCode1.txt");
//        try {
//            int lengte = Files.lines(path).toArray().length;
//            System.out.println(lengte);
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//    }
}
