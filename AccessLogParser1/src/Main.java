import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fileCounter = 0;
        int dirCounter  = 0;

        while (true) {
            System.out.print("Введите путь к файлу или папке (или exit): ");
            String path = sc.nextLine().trim();
            if (path.equalsIgnoreCase("exit")) {
                System.out.println("Итог: файлов = " + fileCounter + ", папок = " + dirCounter);
                break;
            }

            File f = new File(path);
            if (!f.exists()) {
                System.out.println("Путь не существует. Попробуйте снова.");
                continue;
            }

            if (f.isDirectory()) {
                dirCounter++;
                System.out.println("Папка найдена. Это папка № " + dirCounter);
            } else {
                fileCounter++;
                System.out.println("Файл найден. Это файл № " + fileCounter);
            }
        }
    }
}