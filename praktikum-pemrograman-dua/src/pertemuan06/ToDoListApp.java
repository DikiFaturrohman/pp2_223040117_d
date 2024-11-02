package pertemuan06;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToDoListApp extends JFrame {
    private JTable taskTable;
    private DefaultTableModel tableModel;
    private JTextField taskTitleField;
    private JTextArea descriptionArea;
    private JRadioButton highPriorityRadio, mediumPriorityRadio, lowPriorityRadio;
    private JCheckBox completedCheckBox;
    private JComboBox<String> categoryComboBox;
    private JSlider progressSlider;
    private JSpinner dueDateSpinner;

    public ToDoListApp() {
        setTitle("Aplikasi To-Do-List");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create the menu bar
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenuItem addTaskItem = new JMenuItem("Tambah Tugas");
        menu.add(addTaskItem);
        menuBar.add(menu);
        setJMenuBar(menuBar);

        // Main Panel
        JPanel mainPanel = new JPanel(new BorderLayout());
        add(mainPanel);

        // Form Panel
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(9, 2, 10, 10));

        // Task Title
        formPanel.add(new JLabel("Judul Tugas:"));
        taskTitleField = new JTextField();
        formPanel.add(taskTitleField);

        // Description
        formPanel.add(new JLabel("Deskripsi:"));
        descriptionArea = new JTextArea(3, 20);
        JScrollPane descriptionScrollPane = new JScrollPane(descriptionArea);
        formPanel.add(descriptionScrollPane);

        // Priority (Radio Buttons)
        formPanel.add(new JLabel("Prioritas:"));
        JPanel priorityPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        highPriorityRadio = new JRadioButton("Tinggi");
        mediumPriorityRadio = new JRadioButton("Sedang");
        lowPriorityRadio = new JRadioButton("Rendah");
        ButtonGroup priorityGroup = new ButtonGroup();
        priorityGroup.add(highPriorityRadio);
        priorityGroup.add(mediumPriorityRadio);
        priorityGroup.add(lowPriorityRadio);
        priorityPanel.add(highPriorityRadio);
        priorityPanel.add(mediumPriorityRadio);
        priorityPanel.add(lowPriorityRadio);
        formPanel.add(priorityPanel);

        // Completed (CheckBox)
        formPanel.add(new JLabel("Selesai:"));
        completedCheckBox = new JCheckBox();
        formPanel.add(completedCheckBox);

        // Category (ComboBox)
        formPanel.add(new JLabel("Kategori:"));
        String[] categories = {"Pekerjaan", "Pribadi", "Lainnya"};
        categoryComboBox = new JComboBox<>(categories);
        formPanel.add(categoryComboBox);

        // Progress (Slider)
        formPanel.add(new JLabel("Progress:"));
        progressSlider = new JSlider(0, 100, 0);
        progressSlider.setMajorTickSpacing(25);
        progressSlider.setPaintTicks(true);
        progressSlider.setPaintLabels(true);
        formPanel.add(progressSlider);

        // Due Date (Spinner)
        formPanel.add(new JLabel("Waktu:"));
        dueDateSpinner = new JSpinner(new SpinnerDateModel());
        formPanel.add(dueDateSpinner);

        // Add Task Button
        JButton addTaskButton = new JButton("Tambah Tugas");
        formPanel.add(addTaskButton);

        mainPanel.add(formPanel, BorderLayout.WEST);

        // Task Table
        String[] columnNames = {"Judul", "Deskripsi", "Prioritas", "Kategori", "Selesai", "Progress", "Waktu"};
        tableModel = new DefaultTableModel(columnNames, 0);
        taskTable = new JTable(tableModel);
        JScrollPane tableScrollPane = new JScrollPane(taskTable);
        mainPanel.add(tableScrollPane, BorderLayout.CENTER);

        // Action Listener for Add Task Button
        addTaskButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTask();
            }
        });

        // Action Listener for Menu Item
        addTaskItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Reset form
                resetForm();
            }
        });
    }

    private void addTask() {
        String title = taskTitleField.getText();
        String description = descriptionArea.getText();

        // Priority
        String priority = "Rendah";
        if (highPriorityRadio.isSelected()) {
            priority = "Tinggi";
        } else if (mediumPriorityRadio.isSelected()) {
            priority = "Sedang";
        }

        String category = (String) categoryComboBox.getSelectedItem();
        boolean completed = completedCheckBox.isSelected();
        int progress = progressSlider.getValue();
        Object dueDate = dueDateSpinner.getValue();

        // Add to table
        tableModel.addRow(new Object[]{title, description, priority, category, completed, progress, dueDate});

        // Clear the form
        resetForm();
    }

    private void resetForm() {
        taskTitleField.setText("");
        descriptionArea.setText("");
        highPriorityRadio.setSelected(true);
        completedCheckBox.setSelected(false);
        categoryComboBox.setSelectedIndex(0);
        progressSlider.setValue(0);
        dueDateSpinner.setValue(new java.util.Date());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ToDoListApp app = new ToDoListApp();
            app.setVisible(true);
        });
    }
}
