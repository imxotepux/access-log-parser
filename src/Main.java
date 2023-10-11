import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        guessGame();
    }

    public static void guessGame() {
        int counterN = 0;

        while (true) {
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean isDirectory = file.isDirectory();
            boolean fileExists = file.exists();
            if ((!fileExists) || (isDirectory)) {
                System.out.println("Путь указан не верно");
                continue;

            } else {
                System.out.println("Путь указан верно");
                counterN = counterN + 1;
                System.out.println("Это файл номер " + counterN);
            }
        }
    }
}