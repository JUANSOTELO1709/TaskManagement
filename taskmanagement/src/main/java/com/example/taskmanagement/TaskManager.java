package com.example.taskmanagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

// Importa la clase Task
import com.example.taskmanagement.model.Task;

public class TaskManager extends JFrame {
    private List<Task> tasks = new ArrayList<>();
    private DefaultListModel<String> listModel = new DefaultListModel<>();
    private JList<String> taskList;

    public TaskManager() {
        setTitle("Task Manager");
        setSize(600, 400); // Aumentar el tamaño de la ventana para más espacio
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel para ingresar nuevas tareas
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(5, 2)); // Aumentar a 5 filas

        inputPanel.add(new JLabel("Title:"));
        JTextField titleField = new JTextField();
        inputPanel.add(titleField);

        inputPanel.add(new JLabel("Description:"));
        JTextField descriptionField = new JTextField();
        inputPanel.add(descriptionField);

        inputPanel.add(new JLabel("Completed:"));
        JCheckBox completedCheckBox = new JCheckBox();
        inputPanel.add(completedCheckBox);

        inputPanel.add(new JLabel("Number of Stages:"));
        JTextField stagesField = new JTextField();
        inputPanel.add(stagesField);

        JButton addButton = new JButton("Add Task");
        inputPanel.add(addButton);

        add(inputPanel, BorderLayout.NORTH);

        // Lista para mostrar tareas
        taskList = new JList<>(listModel);
        add(new JScrollPane(taskList), BorderLayout.CENTER);

        // Acción del botón para agregar tarea
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String title = titleField.getText();
                String description = descriptionField.getText();
                boolean completed = completedCheckBox.isSelected();
                int stages;

                try {
                    stages = Integer.parseInt(stagesField.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number for stages.");
                    return;
                }

                Task task = new Task(title, description, completed, stages);
                tasks.add(task);
                listModel.addElement(title + " - " + stages + " Stages");

                titleField.setText("");
                descriptionField.setText("");
                completedCheckBox.setSelected(false);
                stagesField.setText("");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TaskManager taskManager = new TaskManager();
            taskManager.setVisible(true);
        });
    }
}
