
public abstract class Shape implements Colorable {

    private String color;

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }


    public abstract float getArea();


    public abstract float getPerimeter();
}


