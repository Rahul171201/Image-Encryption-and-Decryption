import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ImageOperation {

  public static void main(String[] args) {
    System.out.println("Hi Rahul Here");

    JFrame f = new JFrame();
    f.setTitle("Image Encryption and Decryption");
    f.setSize(500, 500);
    f.setLocationRelativeTo(null);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Font font = new Font("Roboto", Font.BOLD, 25);
    // button
    JButton button = new JButton();
    button.setText("Open Image");
    button.setFont(font);

    // text field
    JTextField textField = new JTextField(10);
    textField.setFont(font);

    f.setLayout(new FlowLayout());

    f.add(button);
    f.add(textField);

    f.setVisible(true);
  }
}
