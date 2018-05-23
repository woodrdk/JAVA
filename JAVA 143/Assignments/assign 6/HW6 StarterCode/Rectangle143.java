import java.awt.*;

// file: Rectangle143.java
// author: Ken Meerdink
// description: Rectangle with added Color field

public class Rectangle143 extends Rectangle{

    private Color color;
    
    public Rectangle143( int x, int y, int width, int height, Color color ) {
        super( x, y, width, height );
        this.color = color;
    }
    
    public Color getColor() {
        return color;
    }
}