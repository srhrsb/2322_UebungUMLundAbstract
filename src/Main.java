import java.awt.*;

public class Main {
    public static void main(String[] args) {

       Circle circle = new Circle(3f);
       circle.setColor(Color.BLUE);

       Rectangle rect = new Rectangle(3f, 5.5f);
       rect.setColor(Color.RED);

       System.out.println("Kreisfläche: " + circle.calculateArea() );
       System.out.println("Rechteckfläche: " + rect.calculateArea() );
    }
}