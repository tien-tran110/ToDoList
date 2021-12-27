import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class ButtonPanel extends JPanel{

    private JButton addTask;
    
    Border border = BorderFactory.createLineBorder(Color.BLACK);

    ButtonPanel(){
        this.setPreferredSize(new Dimension(200, 60));
        this.setVisible(true);
        addTask = new JButton(" + Add Task ");
        addTask.setBorder(border);
        addTask.setBackground(Color.lightGray);
        addTask.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
        this.add(addTask, BorderLayout.CENTER);

    
    }
    //function to add new task
    public JButton getAddedTask(){
        return addTask;
    }
        
}
