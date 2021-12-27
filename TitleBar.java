import java.awt.*;
import java.awt.event.*;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class TitleBar extends JPanel implements FocusListener {

    private JTextField titleText;

    TitleBar(){
        this.setPreferredSize(new Dimension(400, 60));
        this.setBackground(Color.BLUE);
        this.setVisible(true);

        titleText = new JTextField("To-do Title");
        titleText.setBackground(Color.BLUE);
        titleText.setBorder(BorderFactory.createEmptyBorder());
        titleText.setPreferredSize(new Dimension(200, 50));
        titleText.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
        titleText.setHorizontalAlignment(JTextField.CENTER);
        this.add(titleText);
        titleText.addFocusListener(this);
    }
    @Override
    public void focusGained(FocusEvent e){
        if(titleText.getText().equals("To-do Title")){
            titleText.setText("");

        }
    }
    @Override
    public void focusLost(FocusEvent e){
        if(titleText.getText().isEmpty()){
            titleText.setText("To-do Title");
            
        }
    }  
    
}
