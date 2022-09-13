import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DayOne {

    public static void main(String[] args) {
        Path path = Paths.get("C:/_Projects/advent-of-code-2021/src/inputAdventOfCode1.txt");
        try {
            int lengte = Files.lines(path).toArray().length;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
