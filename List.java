import java.awt.*;
import javax.swing.JPanel;

public class List extends JPanel{

    List(){
        GridLayout grid = new GridLayout(10, 1);
        grid.setVgap(5);
        //this.setPreferredSize(new Dimension(400, 600));
        this.setLayout(grid);
        this.setBackground(Color.LIGHT_GRAY);
  
    }
    //function to add number/priority of tasks
    public void updateIndex(){
        Component[] listIndex = this.getComponents();
        
        for(int i = 0;i < listIndex.length;i++){
            if(listIndex[i] instanceof Task){
                if(((Task) listIndex[i]).changeState()){
                    this.remove(listIndex[i]);       
                }
                else{
                    ((Task)listIndex[i]).getIndex(i+1);
                }
            }
                validate();
                revalidate();
                repaint();
        }
    
    } 
}
