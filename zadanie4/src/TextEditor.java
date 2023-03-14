import java.io.*;

public class TextEditor {

  public static void main(String[] args) {
    try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Podaj nazwę pliku do zapisania: ");
      String filename = reader.readLine();
      System.out.print("Wybierz kodowanie znaków (UTF-8, ISO-8859-2, windows-1250): ");
      String encoding = reader.readLine();

      OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(filename), encoding);
      System.out.println("Napisz tekst, który chcesz zapisać w pliku:");
      String text = reader.readLine();
      writer.write(text);
      writer.close();
      System.out.println("Tekst został zapisany w pliku " + filename + " w kodowaniu " + encoding);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}