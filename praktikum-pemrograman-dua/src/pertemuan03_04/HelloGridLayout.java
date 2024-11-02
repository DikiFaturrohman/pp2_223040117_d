package pertemuan03_04;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class HelloGridLayout extends JFrame implements ActionListener {
    private JButton buttonA;
    private JButton buttonB;
    private JButton buttonC;
    private JButton buttonD;
    private JButton buttonE;
    private JButton buttonF;
    private JButton buttonG;
    private JButton buttonH;
    private JButton buttonI;

    private JButton[] buttons;
    private boolean gameOver;

    public HelloGridLayout(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        gameOver = false;

        buttonA = new JButton("");
        buttonB = new JButton("");
        buttonC = new JButton("");
        buttonD = new JButton("");
        buttonE = new JButton("");
        buttonF = new JButton("");
        buttonG = new JButton("");
        buttonH = new JButton("");
        buttonI = new JButton("");

        this.setLayout(new GridLayout(3, 3));

        this.add(buttonA);
        this.add(buttonB);
        this.add(buttonC);
        this.add(buttonD);
        this.add(buttonE);
        this.add(buttonF);
        this.add(buttonG);
        this.add(buttonH);
        this.add(buttonI);

        this.setSize(300, 300);

    }

    public void actionPerformed(ActionEvent e){
        if (!gameOver){
            JButton button = (JButton) e.getSource();
            if (button.getText().isEmpty()){
                button.setText("0");
                checkWinner();
                if (!gameOver){
                    for (int i = 0; i< buttons.length;i++){
                        if (buttons[1].getText().isEmpty()){
                            buttons[1].setText("X");
                            break;
                        }
                    }
                    checkWinner();
                }
            }
        }
    }
    public void checkWinner(){
        String winner = "";
        if(!buttonA.getText().isEmpty()
        && buttonA.getText().equals(buttonB.getText())
                && buttonA.getText().equals(buttonC.getText())
        ){
            winner = buttonA.getText();
            buttonA.setForeground(Color.RED);
            buttonB.setForeground(Color.RED);
            
        }
    }

}
