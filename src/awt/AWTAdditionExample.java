package awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTAdditionExample {
    private Frame frame;
    private TextField num1Field;
    private TextField num2Field;
    private Label resultLabel;

    public AWTAdditionExample() {
        // Create frame
        frame = new Frame("AWT Addition Example");
        num1Field = new TextField(10);
        num2Field = new TextField(10);

        // Create a button for adding numbers
        Button addButton = new Button("Add");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performAddition();
            }
        });

        // Create a label to display the result
        resultLabel = new Label("Result: ");

        frame.setLayout(new FlowLayout());

        // Add components to the frame
        frame.add(new Label("Enter Number 1: "));
        frame.add(num1Field);
        frame.add(new Label("Enter Number 2: "));
        frame.add(num2Field);
        frame.add(addButton);
        frame.add(resultLabel);

        // Set the frame size and make it visible
        frame.setSize(300, 200);
        frame.setVisible(true);

        // Handle window close event
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    private void performAddition() {
        try {
            // Get numbers from text fields
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());

            // Calculate the sum
            double sum = num1 + num2;

            // Display the result
            resultLabel.setText("Result: " + sum);
        } catch (NumberFormatException e) {
            // Handle invalid input
            resultLabel.setText("Invalid input. Please enter valid numbers.");
        }
    }

    public static void main(String[] args) {
        new AWTAdditionExample();
    }
}
