package Lesson14.classWork.Ex4;

public class Rectangle implements MutableShapes {
    private float x;
    private  float y;
    private float width;
    private float height;

    public Rectangle(float x, float y, float width, float height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    @Override
    public void move(float dx, float dy) {
        x += dx;
        y += dy;

    }

    @Override
    public void scale(float factor) {
        width *= factor;
        height *= factor;

    }
}
