
public class Rectangle extends Shape {

        public float high;
        public float high2;

        public Rectangle(String color, float high, float high2) {
            super(color);
            this.high = high;
            this.high2 = high2;
       }


    @Override
    public float getArea() {
        return high * high2;
    }

    @Override
    public float getPerimeter() {
        return 9;
    }

}
