import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton[] buttons;
    int n;
    int chances=9;
    String result="";
    char[][] grid={{' ',' ',' '},
                   {' ',' ',' '},
                   {' ',' ',' '}};
    MyFrame() {
        this.setTitle("Tic Tac Toe");
        this.setResizable(false);

        // Create a panel to hold the buttons in a grid layout
        JPanel panel = new JPanel(new GridLayout(3, 3));

        // Create buttons array
        buttons = new JButton[9];

        // Create and add buttons to the panel
        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            buttons[i].setPreferredSize(new Dimension(100, 100)); // Set preferred size
            buttons[i].setFont(new Font("Arial", Font.ROMAN_BASELINE, 70));
            buttons[i].addActionListener(this); // Add ActionListener to each button
            panel.add(buttons[i]);
        }

        // Add the panel to the frame
        this.getContentPane().add(panel);

        // Set the size of the frame
        this.setSize(300, 300);

        this.setLocationRelativeTo(null); // Center the frame
        this.setVisible(true);
    }

    // ActionListener implementation
    public void actionPerformed(ActionEvent e) {
        // Handle button clicks
       
        for (int i = 0; i < 9; i++) {
                if (e.getSource() == buttons[i]) {
                buttons[i].setEnabled(false);
                if(chances%2==1)
                buttons[i].setText("X");
                else
                buttons[i].setText("O");
                chances--;
                n=i+1;
                Game game=new Game();
                grid=game.main(this,grid,chances);
                break;
            }
        }
        if(Game.Win(grid)){
            for (int i = 0; i < buttons.length; i++) {
                buttons[i].setEnabled(false);
            }
            this.dispose();
            if(chances%2==0)
            result="Player 1 wins";
            else
            result="Player 2 wins";
            new EndScreen(result);
        }
        else if(chances==0){
            this.dispose();
            new EndScreen("draw");
        }
}
    public int move(){
        int move= n;
        return move;
    }
}
