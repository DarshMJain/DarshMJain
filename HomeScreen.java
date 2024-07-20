import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeScreen extends JFrame implements ActionListener {

    JButton startButton;

    HomeScreen() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Tic Tac Toe - Home");
        this.setResizable(false);

        // Create start button
        startButton = new JButton("Start Game");
        startButton.setPreferredSize(new Dimension(100, 50));
        startButton.addActionListener(this);

        // Create a panel to hold the button
        JPanel panel = new JPanel();
        panel.setBounds(100, 100, 100, 50);
        panel.add(startButton);

        // Add the panel to the frame
        

        // Set the size of the frame
        this.setSize(300, 300);
        this.setLayout(null);
        this.setLocationRelativeTo(null); // Center the frame
        this.setVisible(true);
        this.add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            this.dispose(); // Close the home screen
            new MyFrame(); // Open the game screen
        }
    }

    public static void main(String[] args) {
        new HomeScreen(); // Start with the home screen
    }
}
