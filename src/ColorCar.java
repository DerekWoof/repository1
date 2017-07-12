
public class ColorCar implements Colorable {

    private String car;
    private String color;
    private int wheels;


    public ColorCar(String car, String color, int wheels) {
        this.car = car;
        this.color = color;
        this.wheels = wheels;
    }

    @Override
    public String getColor() {
        return color;
    }
}
