package pl.Rextens.Main.Figures;

import org.jsfml.graphics.RectangleShape;
import org.jsfml.graphics.RenderWindow;
import org.jsfml.system.Vector2f;

/**
 * Created by dell on 19.08.2016.
 */
public class Figure
{
    public RectangleShape rectangle;
    public Figure(float x /* size */, float y /* size */, float xPos, float yPos)
    {
        rectangle = new RectangleShape(new Vector2f(x, y));
        rectangle.setOrigin(x / 2, y / 2);
        rectangle.setPosition(xPos, yPos);
    }
    public void draw(RenderWindow window)
    {
        window.draw(rectangle);
    }
}
