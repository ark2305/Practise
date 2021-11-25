import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Building building = new Building();

         Scanner sc = new Scanner(System.in);
         System.out.println("enter the length of the plot");
         building.setLength(sc.nextDouble());
         System.out.println("enter the breadth of the plot");
         building.setBreadth(sc.nextDouble());
         building.setArea();
         System.out.println("area of the plot is"+ building.getArea());
         System.out.println("enter the number of floors");
         building.setFloors(sc.nextDouble());
         building.setFloorArea();
         System.out.println("floor area of the building is"+ building.getFloorArea());

    }
}
