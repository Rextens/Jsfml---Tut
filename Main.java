package pl.Rextens.Main;

import org.jsfml.graphics.RenderWindow;
import org.jsfml.window.Keyboard;
import org.jsfml.window.VideoMode;
import org.jsfml.window.event.Event;
import pl.Rextens.Main.Figures.Figure;

/**
 * Created by dell on 19.08.2016.
 */
public class Main
{
    public static void main(String []args)
    {
        RenderWindow window = new RenderWindow(new VideoMode(640 /*x*/, 480 /*y*/), "Jsfml Tutrial");
        Figure figure = new Figure(10, 10, 100, 100);

        while (window.isOpen())
        {
            for (Event event : window.pollEvents())
            {
            }

            if(Keyboard.isKeyPressed(Keyboard.Key.ESCAPE))
            {
                window.close();
            }

            if(Keyboard.isKeyPressed(Keyboard.Key.W))
            {
                figure.rectangle.move(0, -1);
            }
            if(Keyboard.isKeyPressed(Keyboard.Key.S))
            {
                figure.rectangle.move(0, 1);
            }
            if(Keyboard.isKeyPressed(Keyboard.Key.A))
            {
                figure.rectangle.move(-1, 0);
            }
            if(Keyboard.isKeyPressed(Keyboard.Key.D))
            {
                figure.rectangle.move(1, 0);
            }


            window.clear();
            figure.draw(window);
            window.display();
        }
    }
}
