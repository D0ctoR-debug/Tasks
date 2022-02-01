import java.io.BufferedReader;
        import java.io.FileReader;
        import java.io.IOException;

public class FileManager {
    public int readNumberFromFile() {
        int[] array = null;
        int number = 0;
        try (BufferedReader in = new BufferedReader(new FileReader("FirstTask\\numbers.txt"))) {
            array = in.lines().mapToInt(Integer::parseInt).toArray();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        if (array != null) {
            number = array[0];
        }
        return number;
    }
}
