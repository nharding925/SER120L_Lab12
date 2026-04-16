
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class FlowersPanel extends JPanel {
    private ArrayList<Flower> flowersArrayList;
    private ArrayList<Image> flowerImagesArrayList;
    private final int NUMBER_OF_IMAGE_FILES = 10;
    private int imageIndex = 0;

    public FlowersPanel() {
        flowersArrayList = new ArrayList<>();
        loadFlowerImages();

        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                Point p = e.getPoint();
                Image image = flowerImagesArrayList.get(imageIndex);
                Flower flower = new Flower(image, p);
                flowersArrayList.add(flower);

                // Cycle through the flower images
                imageIndex = (imageIndex + 1) % flowerImagesArrayList.size();

                repaint();
            }
        });
    }

    private void loadFlowerImages() {
        flowerImagesArrayList = new ArrayList<>();
        for (int i = 1; i <= NUMBER_OF_IMAGE_FILES; i++) {
            String imageName = "flower" + i + ".png";
            Image image = new ImageIcon(imageName).getImage();
            flowerImagesArrayList.add(image);
        }
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Flower flower : flowersArrayList) {
            Point p = flower.getPoint();
            g.drawImage(flower.getImage(), p.x, p.y, this);
        }
    }
}
