import java.awt.FlowLayout;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javafx.scene.control.TextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ImageOperation {

  public static void operate(int key, int operation) {
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.showOpenDialog(null);
    File file = fileChooser.getSelectedFile();
    // file FileInputStream

    try {
      FileInputStream fis = new FileInputStream(file);
      byte[] data = new byte[fis.available()]; // converts image file to byte stream array
      fis.read(data);

      int current = 0;
      for (byte b : data) {
        // System.out.println(b);
        data[current] = (byte) (b ^ key);
        current++;
      }

      FileOutputStream fos = new FileOutputStream(file);
      fos.write(data);
      fos.close();
      fis.close();
      if (operation == 0) JOptionPane.showMessageDialog(
        null,
        "Encyption Completed"
      ); else JOptionPane.showMessageDialog(null, "Decryption Completed");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    System.out.println("Welcome to Imager");

    // creating frame
    JFrame f = new JFrame();
    f.setTitle("Image Encryption and Decryption");
    f.setSize(350, 500);
    f.setLocationRelativeTo(null);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // creating font
    Font font = new Font("Roboto", Font.BOLD, 25);

    // encryption button
    JButton encryptButton = new JButton();
    encryptButton.setText("Encrypt");
    encryptButton.setFont(font);

    // decryption button
    JButton decryptButton = new JButton();
    decryptButton.setText("Decrypt");
    decryptButton.setFont(font);

    // label
    JLabel myLabel = new JLabel("Enter the key");

    // text field
    JTextField textField = new JTextField(10);
    textField.setFont(font);

    // setting layout
    f.setLayout(new FlowLayout());

    encryptButton.addActionListener(
      e -> {
        System.out.println("encryption button clicked");
        String text = textField.getText();
        int temp = Integer.parseInt(text);
        operate(temp, 0);
      }
    );

    decryptButton.addActionListener(
      e -> {
        System.out.println("decryption button clicked");
        String text = textField.getText();
        int temp = Integer.parseInt(text);
        operate(temp, 1);
      }
    );

    // adding features to the frame
    f.add(encryptButton);
    f.add(decryptButton);
    f.add(myLabel);
    f.add(textField);

    f.setVisible(true);
  }
}
