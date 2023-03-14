import java.io.*;
import java.util.zip.GZIPOutputStream;

public class GZIPCompressor {

  public static void main(String[] args) {
    try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Podaj nazwę pliku do skompresowania: ");
      String filename = reader.readLine();
      String compressedFilename = filename + ".gz";

      FileInputStream fileInputStream = new FileInputStream(filename);
      FileOutputStream fileOutputStream = new FileOutputStream(compressedFilename);
      GZIPOutputStream gzipOutputStream = new GZIPOutputStream(fileOutputStream);

      byte[] buffer = new byte[1024];
      int bytesRead;
      while ((bytesRead = fileInputStream.read(buffer)) > 0) {
        gzipOutputStream.write(buffer, 0, bytesRead);
      }

      fileInputStream.close();
      gzipOutputStream.finish();
      gzipOutputStream.close();
      System.out.println("Plik " + filename + " został skompresowany do pliku " + compressedFilename);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}