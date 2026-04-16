
import javax.swing.*;
import java.awt.*;

public class FlowersFrame extends JFrame {
    int PANEL_WIDTH = 600;
    int PANEL_HEIGHT = 600;

    public FlowersFrame() {
        JPanel panel = new FlowersPanel();
        panel.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        panel.setBackground(Color.green);
        this.add(panel);
        this.setVisible(true);
    }
}
