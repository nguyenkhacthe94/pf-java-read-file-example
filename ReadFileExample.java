import java.util.Scanner;
import java.io.*;

public class ReadFileExample {
    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);

            if (!file.exists()) throw new FileNotFoundException();

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();

            System.out.println("Total = " + sum);
        } catch (Exception e) {
            System.err.println("File is not valid or not exist");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter file location: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readfileEx = new ReadFileExample();
        readfileEx.readFileText(path);
    }
}
