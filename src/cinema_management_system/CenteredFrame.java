package cinema_management_system;
import javax.swing.JFrame;
public class CenteredFrame extends JFrame {
    public CenteredFrame() {
        // Set frame properties
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Center the frame on the screen
        setLocationRelativeTo(null);
    }
}