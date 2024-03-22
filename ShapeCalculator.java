
import java.util.Scanner;

public class ShapeCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to Shape Calculator!");
        System.out.println("Here you can calculate Surface Area & Volume of any shape of your choice");
        System.out.println("Select the shape according to the given button instructions:-");
        System.out.println("1 -> Cube");
        System.out.println("2 -> Cuboid");
        System.out.println("3 -> Sphere");
        System.out.println("4 -> Cone");
        System.out.println("5 -> Cylinder");
        System.out.println("6 -> Hemi-Sphere");
        System.out.println("7 -> EXIT");

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Enter your choice: ");
            int selection = sc.nextInt();
            switch (selection){
                case 1:
                    //Cube
                    System.out.println("Cube is selected as per your choice");
                    System.out.println("Enter side of cube: ");
                    double side = sc.nextDouble();
                    System.out.println("Enter 10 for finding Surface Area & 100 for Volume :");
                    int choiceCub = sc.nextInt();
                    if(choiceCub == 10) {
                        double cubArea = side * side;
                        System.out.println("The Surface Area of this cube is = " + cubArea);
                    }
                    if (choiceCub == 100) {
                        double cubVol = side*side*side;
                        System.out.println("The Volume of this cube is = "+ cubVol);
                    }
                    break;

                case 2:
                    //Cuboid
                    System.out.println("Cuboid is selected as per your choice");
                    System.out.println("Enter length of cuboid: ");
                    double length = sc.nextDouble();
                    System.out.println("Enter breadth of cuboid: ");
                    double breadth = sc.nextDouble();
                    System.out.println("Enter height of cuboid: ");
                    double height = sc.nextDouble();
                    System.out.println("Enter 10 for finding Surface Area & 100 for Volume :");
                    int choiceCbd = sc.nextInt();
                    if(choiceCbd == 10) {
                        double cbdArea = 2 * (length * breadth + breadth * height + height * length);
                        System.out.println("The Surface Area of this cube is = " + cbdArea);
                    }
                    if (choiceCbd == 100) {
                        double cbdVolume = length * breadth * height;
                        System.out.println("The Volume of this cube is = " + cbdVolume);
                    }
                    break;

                case 3:
                    //Sphere
                    System.out.println("Sphere is selected as per your choice");
                    System.out.println("Enter radius of sphere: ");
                    double radius = sc.nextDouble();
                    System.out.println("Enter 10 for finding Surface Area & 100 for Volume :");
                    int choiceSph = sc.nextInt();
                    if(choiceSph == 10) {
                        double sphArea = 4*Math.PI*radius*radius;
                        System.out.println("The Surface Area of this sphere is = " + sphArea);
                    }
                    if (choiceSph == 100) {
                        double sphVol = 1.33*Math.PI*radius*radius*radius;
                        System.out.println("The Volume of this sphere is = "+ sphVol);
                    }
                    break;

                case 4:
                    //Cube
                    System.out.println("Cone is selected as per your choice");
                    System.out.println("Enter radius of cone: ");
                    double r = sc.nextDouble();
                    System.out.println("Enter height of cone: ");
                    double h = sc.nextDouble();
                    double x = (r*r)+(h*h);
                    double l = Math.sqrt(x);
                    System.out.println("Enter 10 for finding Surface Area & 100 for Volume :");
                    int choiceCone = sc.nextInt();
                    if(choiceCone == 10) {
                        double coneArea = Math.PI*r*l;
                        System.out.println("The Surface Area of this cone is = " + coneArea);
                    }
                    if (choiceCone == 100) {
                        double coneVol = 0.33*Math.PI*r*r*h;
                        System.out.println("The Volume of this cone is = "+ coneVol);
                    }
                    break;

                case 5:
                    //Cylinder
                    System.out.println("Cylinder is selected as per your choice");
                    System.out.println("Enter radius of cylinder: ");
                    double rad = sc.nextDouble();
                    System.out.println("Enter height of cylinder: ");
                    double hgt = sc.nextDouble();
                    System.out.println("Enter 10 for finding Surface Area & 100 for Volume :");
                    int choiceCyl = sc.nextInt();
                    if(choiceCyl == 10) {
                        double cylArea = 2 * Math.PI * rad * (rad + hgt);
                        System.out.println("The Surface Area of this cylinder is = " + cylArea);
                    }
                    if (choiceCyl == 100) {
                        double cylVolume = Math.PI * rad * rad * hgt;
                        System.out.println("The Volume of this cylinder is = " + cylVolume);
                    }
                    break;

                case 6:
                    //Hemi-Sphere
                    System.out.println("Hemi-Sphere is selected as per your choice");
                    System.out.println("Enter radius of hemi-sphere: ");
                    double rd = sc.nextDouble();
                    System.out.println("Enter 10 for finding Surface Area & 100 for Volume :");
                    int choiceHemi = sc.nextInt();
                    if(choiceHemi == 10) {
                        double hemiArea = 2*Math.PI* rd * rd;
                        System.out.println("The Surface Area of this hemi-sphere is = " + hemiArea);
                    }
                    if (choiceHemi == 100) {
                        double hemiVol = 0.66*Math.PI*rd*rd*rd;
                        System.out.println("The Volume of this Hemi-sphere is = "+ hemiVol);
                    }
                    break;

                case 7:
                    //EXIT
                    System.out.println("You decided to Exit!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice!!");
                    System.out.println("Please select according to the given manual");

            }
        }

    }
}

