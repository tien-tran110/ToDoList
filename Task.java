import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;
import java.awt.BorderLayout;
import javax.swing.*;

public class Task extends JPanel implements ItemListener, FocusListener{

    private JLabel index;
    private JTextField task;
    private JCheckBox done;   

    Task(){

        this.setPreferredSize(new Dimension(40, 20));
        this.setBackground(Color.yellow);
        this.setLayout(new BorderLayout());

        index = new JLabel("");
        index.setPreferredSize(new Dimension(20,20));
        index.setHorizontalAlignment(JLabel.CENTER);
        this.add(index, BorderLayout.WEST);

        task = new JTextField("New task here");
        task.setForeground(Color.lightGray);
        task.setPreferredSize(new Dimension(20,20));
        this.add(task, BorderLayout.CENTER);
        task.addFocusListener(this);

        done = new JCheckBox();
        this.add(done, BorderLayout.EAST);
        done.addItemListener((ItemListener) this);

    }
    //function to get the index of task
    public void getIndex(int n){
        this.index.setText(n+"");
        this.revalidate();
    }

    @Override
    public void itemStateChanged(ItemEvent e){

        if(done.isSelected()){
            this.removeAll();
            this.setBackground(Color.LIGHT_GRAY);
            this.revalidate();
            repaint();
        }
    }

    public boolean changeState(){
        return done.isSelected();
    }

    @Override
    public void focusGained(FocusEvent e){
        if(task.getText().equals("New task here")){
            task.setText("");
            task.setForeground(Color.black);
        }
    }
    @Override
    public void focusLost(FocusEvent e){
        if(task.getText().isEmpty()){
            task.setText("New task here");
        }
    }  
    
}
