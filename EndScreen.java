import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EndScreen extends JFrame implements ActionListener{

    JButton endButton,playAgainButton;
    JLabel result;

    EndScreen(String winner) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Tic Tac Toe - End");
        this.setResizable(false);
        result=new JLabel(winner);
        result.setHorizontalAlignment(JLabel.CENTER);
        playAgainButton =new JButton("Play Again");
        playAgainButton.setPreferredSize(new Dimension(150, 25));
        playAgainButton.addActionListener(this);
        endButton = new JButton("Exit");
        endButton.setPreferredSize(new Dimension(150, 25));
        endButton.addActionListener(this);
        result.setFont(new Font("Arial",Font.BOLD, 35));
        // Create a panel to hold the button
        JPanel result_ = new JPanel();
        result_.add(result);
        result_.setBounds(0, 105, 300, 45);
        JPanel end=new JPanel();
        end.add(endButton);
        end.setBounds(0, 237, 150, 25);
        JPanel play=new JPanel();
        play.add(playAgainButton);
        play.setBounds(150, 237, 150, 25);
        // Add the panel to the frame
        this.add(result_);
        this.add(end);
        this.add(play);
        // Set the size of the frame
        this.setSize(300, 300);
        this.setLayout(null);
        this.setLocationRelativeTo(null); // Center the frame
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == endButton) {
            this.dispose(); // Close the home screen
        }
        else if(e.getSource() == playAgainButton){
            this.dispose();
            new MyFrame();
        }
    }
}
