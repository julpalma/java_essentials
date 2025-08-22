import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {

        public static void readFileFromUrl(String docUrl) throws Exception {
            // Fetch document
            URL url = new URL(docUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            List<String[]> rows = new ArrayList<>();
            String line;
            System.out.print("File is " + in.readLine());

            while ((line = in.readLine()) != null) {
                System.out.print("Print line of document" + line);
            }
            in.close();

        }

    public static void readFileFromPath(String path) {

        try {
            //Create a file object
            File file = new File(path);

            //Create a Scanner object to read from the file
            Scanner scanner = new Scanner(file);

            //Loop through each line of the file
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.print("Printing line from file: " + line);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error while reading a file from path " + path);
            throw new RuntimeException(e);
        }

    }
}




