
import java.awt.Image;
import java.awt.Point;

public class Flower {
    private Image image;
    private Point point;

    public Flower(Image image, Point point) {
        this.image = image;
        this.point = point;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
}
