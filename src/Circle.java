public class Circle extends Shape{
    private float radius;

    public Circle( float radius ){
        this.radius = radius;
    }
    public float calculateArea(){
        return (float)Math.PI * radius * radius;
    }
}
