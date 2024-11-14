package GraphicalUserInterface;

import processing.core.*;

public class CircleIcon extends Icon {
    CircleIcon(float x, float y, float radius, int c) {
        super(x, y, radius, c);
    }

    public void draw(PApplet main) {
        //draws an ellipse
        main.ellipse(x, y, size, size);
        main.fill(iconColor);
    }

    float getX() {
        return x;
    }

    float getY() {
        return y;
    }
}