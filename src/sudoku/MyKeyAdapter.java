package sudoku;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class MyKeyAdapter extends KeyAdapter{
private JTextField field;
private int a;

public MyKeyAdapter(JTextField field){
    this.field=field;
}

@Override
public void keyPressed(KeyEvent e){
    if (field.isEditable()){
    field.setText("");
    }
}
        
        
@Override
    public void keyReleased(KeyEvent e) {
        a = 1;
        int key = e.getKeyChar();
        for (int i = 0; i < 9; i++) {
            if (key == (49+i)) {
                a = 2;
                
            }
        }
        if (a == 1&&field.isEditable()) {
            field.setText("");
        }
    }
}
