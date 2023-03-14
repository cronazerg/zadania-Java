import javax.swing.*;

class Sprawdzacz extends Thread {
  JTextArea okno;
  volatile boolean zakonczyc;

  public Sprawdzacz(JTextArea comp) {
    okno = comp;
    zakonczyc = false;
  }

  public void run() {
    while (!zakonczyc) {
      try {
        String tekst = okno.getText();
        if (tekst.contains("cholera")) {
          JOptionPane.showMessageDialog(okno, "Znaleziono słowo 'cholera' w tekście!");
        }
        sleep(10000);
      } catch (Exception e) {
      }
    }
  }
}