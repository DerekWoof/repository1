
public class Circle extends Shape {

        public float r;


        
		
		
		public Circle (String color, float r){
            super (color);
            this.r = r;

        }

    
	
	
	@Override
    public float getArea() {
        return 3.14f * r * r;
    }

   



   @Override
    public float getPerimeter() {
        return r;
    }
}
