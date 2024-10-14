import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerExample {
    public static void main (String[]args){
        JFrame frame = new JFrame("MouseListener Example");

        JLabel label = new JLabel("Arahkan dan Klik"    );
        label.setBounds(50,50,300,30);

        label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label.setText("MouseClicked at: ("+e.getX()+","+e.getY()+")");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                label.setText("MousePressed at: ("+e.getX()+","+e.getY()+")");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                label.setText("MouseReleased at: ("+e.getX()+","+e.getY()+")");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                label.setText("MouseEntered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label.setText("MouseExited");
            }
        });
        frame.add(label);

        frame.setSize(400, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
