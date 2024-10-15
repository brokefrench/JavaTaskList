import javax.swing.*;

public class Launcher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TaskListGui().setVisible(true);
            }
        });

        TaskListController controller = new TaskListController();


    }
}
