import javax.swing.*;
import java.awt.event.*;

public class WindowListenerExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("WindowListener Example");
        JLabel label = new JLabel("Lakukan operasi pada jendela.");
        label.setBounds(50, 50, 300, 30);

        frame.addWindowListener(new WindowListener() {
            public void windowOpened(WindowEvent e) {
                label.setText("Window Opened.");
            }

            public void windowClosing(WindowEvent e) {
                label.setText("Window Closing.");
            }
            // Metode lain dari WindowListener dapat dideklarasikan di sini
            // Dijalankan ketika jendela benar-benar ditutup
            public void windowClosed(WindowEvent e) {
                System.out.println("Window Closed.");
            }

            // Dijalankan ketika jendela diminimalkan
            public void windowIconified(WindowEvent e) {
                label.setText("Window Minimized.");
            }

            // Dijalankan ketika jendela dipulihkan dari minimal
            public void windowDeiconified(WindowEvent e) {
                label.setText("Window Restored.");
            }

            // Dijalankan ketika jendela menjadi aktif (berfokus)
            public void windowActivated(WindowEvent e) {
                label.setText("Window Activated.");
            }

            // Dijalankan ketika jendela kehilangan fokus
            public void windowDeactivated(WindowEvent e) {
                label.setText("Window Deactivated.");
            }

// Menambahkan label ke frame

// Pengaturan frame lainnya

        });
        frame.add(label);

        frame.setSize(400,200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Komponen frame lainnya dan pengaturan
    }
}
