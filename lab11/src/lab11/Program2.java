package lab11;
//Program1
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Program2 extends JFrame implements ActionListener {
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 100;
    private static final int FRAME_X_ORIGIN = 300;
    private static final int FRAME_Y_ORIGIN = 300;
    
    private JLabel result;
    private JTextField one,two;

    public static void main(String[] args) 
    {
        Program2 p = new Program2();
        p.setVisible(true);

    }
    
    public Program2()
    {
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setResizable(false);
        setTitle("Lab11Program1");
        setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);
        
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        one = new JTextField();        
        one.setColumns(3);
        contentPane.add(one);
        
        JLabel mult = new JLabel("x");
        contentPane.add(mult);
        
        two = new JTextField();        
        contentPane.add(two);
        two.setColumns(3);
        
        JButton button = new JButton("=");
        button.addActionListener(this);
        contentPane.add(button);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        result = new JLabel("");
        contentPane.add(result);
            
    }
    public void actionPerformed(ActionEvent e) 
    {
        try 
        {
            if(e.getSource() instanceof JButton)
                {            
                    result.setText(String.valueOf(Double.parseDouble(one.getText().strip())*Double.parseDouble(two.getText().strip())));
                }
        }
        catch(Exception ex)
        {
            result.setText("Please enter number in text field.");
        }        
    }

}
