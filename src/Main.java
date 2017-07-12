import java.util.List;

public class Main {

    public static void main(String[] args) {
        Square mySquare = new Square("Czerwony", 6);
        Circle myCircle = new Circle("Zielony", 4);
        System.out.println(myCircle.getArea());
        System.out.println(myCircle.getPerimeter());
        System.out.println(mySquare.getArea());
        System.out.println(mySquare.getPerimeter());
    }



    public static boolean Contains(Colorable[] array, String kolor){
        for (int i=0; i<array.length; i++){
            if(array[i].getColor().equals(kolor)){
                return  true;
            }
        }
        return false;

    }



}
