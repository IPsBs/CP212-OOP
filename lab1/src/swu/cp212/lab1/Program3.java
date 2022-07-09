package swu.cp212.lab1;
import javax.swing.JFrame;
public class Program3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        JFrame window;
        window = new JFrame();
        window.setSize(640, 480);
        window.setTitle("My Third Java Program in Lab");
        window.setVisible(true);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
            System.out.println(ie.getMessage());
        }
        window.setVisible(false);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
            System.out.println(ie.getMessage());
            
        }
        window.setVisible(true);
    }

}