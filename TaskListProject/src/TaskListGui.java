import javax.swing.*;
import java.awt.*;

public class TaskListGui extends JFrame {
    public TaskListGui() {
        super("Task List");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(450,650);

        setLocationRelativeTo(null);

        setLayout(null);

        setResizable(false);

        addGuiComponents();
    }

    private void addGuiComponents() {
        JTextField searchField= new JTextField();

        //location of searchfield
        searchField.setBounds(15,15,351,45);

        searchField.setFont(new Font("Dialog", Font.PLAIN, 24));

        add(searchField);
    }
}
