package pertemuan03_04;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloCheckBox extends JFrame {

    // Declare all input fields and components as class-level variables for easy access
    private JTextField textFieldName;
    private JTextField textFieldPhone;
    private JRadioButton rbMale;
    private JRadioButton rbFemale;
    private JCheckBox checkBoxWNA;
    private JList<String> listAccountTypes;
    private JSlider sliderTransactionFrequency;
    private JTextArea txtOutput;
    private JPasswordField passwordField;
    private JPasswordField confirmPasswordField;
    private JSpinner spinnerBirthDate;  // Spinner for birthdate

    public HelloCheckBox() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Input Nama
        JLabel labelName = new JLabel("Nama:");
        labelName.setBounds(15, 20, 350, 10);

        textFieldName = new JTextField();
        textFieldName.setBounds(15, 40, 350, 30);

        // Input Nomor HP
        JLabel labelPhone = new JLabel("Nomor HP:");
        labelPhone.setBounds(15, 80, 350, 10);

        textFieldPhone = new JTextField();
        textFieldPhone.setBounds(15, 100, 350, 30);

        // Input Password
        JLabel labelPassword = new JLabel("Password:");
        labelPassword.setBounds(15, 140, 350, 10);

        passwordField = new JPasswordField();
        passwordField.setBounds(15, 160, 350, 30);

        // Input Confirm Password
        JLabel labelConfirmPassword = new JLabel("Confirm Password:");
        labelConfirmPassword.setBounds(15, 200, 350, 10);

        confirmPasswordField = new JPasswordField();
        confirmPasswordField.setBounds(15, 220, 350, 30);

        // Input Tanggal Lahir dengan JSpinner
        JLabel labelBirthDate = new JLabel("Tanggal Lahir:");
        labelBirthDate.setBounds(15, 260, 350, 10);

        // Use SpinnerDateModel to create a date spinner
        SpinnerDateModel dateModel = new SpinnerDateModel();
        spinnerBirthDate = new JSpinner(dateModel);
        spinnerBirthDate.setBounds(15, 280, 350, 30);

        // Format the date to be more readable (e.g., "dd-MM-yyyy")
        JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(spinnerBirthDate, "dd-MM-yyyy");
        spinnerBirthDate.setEditor(dateEditor);

        // Pilihan Jenis Kelamin
        JLabel labelGender = new JLabel("Jenis Kelamin:");
        labelGender.setBounds(15, 320, 350, 10);

        rbMale = new JRadioButton("Laki-Laki");
        rbMale.setBounds(15, 340, 100, 30);

        rbFemale = new JRadioButton("Perempuan");
        rbFemale.setBounds(120, 340, 100, 30);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(rbMale);
        genderGroup.add(rbFemale);

        // CheckBox Warga Negara Asing
        checkBoxWNA = new JCheckBox("Warga Negara Asing");
        checkBoxWNA.setBounds(15, 380, 200, 30);

        // Pilihan Jenis Tabungan dengan JList
        JLabel labelAccountType = new JLabel("Jenis Tabungan:");
        labelAccountType.setBounds(15, 420, 200, 30);

        String[] accountTypes = {"Tabungan Simpanan", "Tabungan Haji", "Tabungan Pendidikan", "Tabungan Investasi"};
        listAccountTypes = new JList<>(accountTypes);
        listAccountTypes.setBounds(15, 450, 350, 70);
        listAccountTypes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Input Frekuensi Transaksi Per Bulan dengan JSlider
        JLabel labelTransactionFrequency = new JLabel("Frekuensi Transaksi per Bulan:");
        labelTransactionFrequency.setBounds(15, 530, 200, 30);

        // Slider with range from 1 to 100
        sliderTransactionFrequency = new JSlider(JSlider.HORIZONTAL, 1, 100, 1);
        sliderTransactionFrequency.setBounds(220, 530, 150, 50);
        sliderTransactionFrequency.setMajorTickSpacing(10);
        sliderTransactionFrequency.setMinorTickSpacing(1);
        sliderTransactionFrequency.setPaintTicks(true);
        sliderTransactionFrequency.setPaintLabels(true);

        // Tombol Simpan
        JButton button = new JButton("Simpan");
        button.setBounds(15, 600, 100, 30);

        txtOutput = new JTextArea();
        txtOutput.setBounds(15, 640, 350, 100);

        // Action for button click
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder output = new StringBuilder();
                String nama = textFieldName.getText();
                String nomorHP = textFieldPhone.getText();
                String jenisKelamin = rbMale.isSelected() ? "Laki-Laki" : rbFemale.isSelected() ? "Perempuan" : "Tidak Dipilih";
                String jenisTabungan = listAccountTypes.getSelectedValue() != null ? listAccountTypes.getSelectedValue() : "Tidak Dipilih";
                int frekuensiTransaksi = sliderTransactionFrequency.getValue();

                // Format the birthdate output
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                String tanggalLahir = dateFormat.format(spinnerBirthDate.getValue());

                output.append("Nama: ").append(nama).append("\n");
                output.append("Nomor HP: ").append(nomorHP).append("\n");
                output.append("Jenis Kelamin: ").append(jenisKelamin).append("\n");
                output.append("Tanggal Lahir: ").append(tanggalLahir).append("\n");
                output.append("Jenis Tabungan: ").append(jenisTabungan).append("\n");
                output.append("Frekuensi Transaksi per Bulan: ").append(frekuensiTransaksi).append("\n");

                if (checkBoxWNA.isSelected()) {
                    output.append("Status: Warga Negara Asing\n");
                } else {
                    output.append("Status: Warga Negara Lokal\n");
                }

                // Retrieve password and confirm password
                String password = new String(passwordField.getPassword());
                String confirmPassword = new String(confirmPasswordField.getPassword());

                // Check if passwords match
                if (password.equals(confirmPassword)) {
                    output.append("Password Status: Passwords match\n");
                } else {
                    output.append("Password Status: Passwords do not match\n");
                }

                txtOutput.setText(output.toString());
            }
        });

        // Add components to JFrame
        this.add(labelName);
        this.add(textFieldName);
        this.add(labelPhone);
        this.add(textFieldPhone);
        this.add(labelPassword);
        this.add(passwordField);
        this.add(labelConfirmPassword);
        this.add(confirmPasswordField);
        this.add(labelBirthDate);
        this.add(spinnerBirthDate);  // Add the birthdate spinner
        this.add(labelGender);
        this.add(rbMale);
        this.add(rbFemale);
        this.add(checkBoxWNA);
        this.add(labelAccountType);
        this.add(listAccountTypes);
        this.add(labelTransactionFrequency);
        this.add(sliderTransactionFrequency);
        this.add(button);
        this.add(txtOutput);

        // Menu Bar
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Options");

        // Reset Menu
        JMenuItem resetMenuItem = new JMenuItem("Reset");
        resetMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Reset all fields to default
                textFieldName.setText("");
                textFieldPhone.setText("");
                passwordField.setText("");
                confirmPasswordField.setText("");
                genderGroup.clearSelection();
                checkBoxWNA.setSelected(false);
                listAccountTypes.clearSelection();
                sliderTransactionFrequency.setValue(1);  // Reset slider to 1
                spinnerBirthDate.setValue(new Date());  // Reset spinner to current date
                txtOutput.setText("");
            }
        });
        menu.add(resetMenuItem);

        // Exit Menu
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Exit the application
            }
        });
        menu.add(exitMenuItem);

        menuBar.add(menu);
        this.setJMenuBar(menuBar); // Set the menu bar

        // Frame settings
        this.setSize(400, 800);  // Adjust the frame height to accommodate all components
        this.setLayout(null);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                HelloCheckBox h = new HelloCheckBox();
                h.setVisible(true);
            }
        });
    }
}
