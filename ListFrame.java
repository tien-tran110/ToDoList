import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

public class ListFrame extends JFrame implements ActionListener{

    private TitleBar title;
    private ButtonPanel button;
    private List list;
    private JButton addTask;

    ListFrame(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame fr = new JFrame("To-do List App");
        fr.setSize(400, 800);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        title = new TitleBar();
        fr.add(title, BorderLayout.NORTH);
        button = new ButtonPanel();
        fr.add(button, BorderLayout.SOUTH);
        list = new List();
        fr.add(list, BorderLayout.CENTER);
        fr.setVisible(true);

        addTask = button.getAddedTask();
        addTask.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        Task task = new Task();
        list.add(task);
        list.updateIndex();
        revalidate();
        
    }  
}