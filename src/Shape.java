import java.awt.*;

public abstract class Shape {

    private Color color;

    public abstract float calculateArea();

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

}
