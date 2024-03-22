
import java.util.Scanner;

public class Shape_Calculator {
    public Shape_Calculator() {
    }

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

        while(true) {
            while(true) {
                int selection = sc.nextInt();
                double length;
                double radius;
                double r;
                double rad;
                double rd;
                switch (selection) {
                    case 1:
                        System.out.println("Cube is selected as per your choice");
                        System.out.println("Enter side of cube: ");
                        double side = sc.nextDouble();
                        System.out.println("Enter 10 for finding Surface Area & 100 for Volume :");
                        int choiceCub = sc.nextInt();
                        if (choiceCub == 10) {
                            length = side * side;
                            System.out.println("The Surface Area of this cube is = " + length);
                        }

                        if (choiceCub == 100) {
                            length = side * side * side;
                            System.out.println("The Volume of this cube is = " + length);
                        }
                        break;
                    case 2:
                        System.out.println("Cuboid is selected as per your choice");
                        System.out.println("Enter length of cuboid: ");
                        length = sc.nextDouble();
                        System.out.println("Enter breadth of cuboid: ");
                        double breadth = sc.nextDouble();
                        System.out.println("Enter height of cuboid: ");
                        double height = sc.nextDouble();
                        System.out.println("Enter 10 for finding Surface Area & 100 for Volume :");
                        int choiceCbd = sc.nextInt();
                        if (choiceCbd == 10) {
                            radius = 2.0 * (length * breadth + breadth * height + height * length);
                            System.out.println("The Surface Area of this cube is = " + radius);
                        }

                        if (choiceCbd == 100) {
                            radius = length * breadth * height;
                            System.out.println("The Volume of this cube is = " + radius);
                        }
                        break;
                    case 3:
                        System.out.println("Sphere is selected as per your choice");
                        System.out.println("Enter radius of sphere: ");
                        radius = sc.nextDouble();
                        System.out.println("Enter 10 for finding Surface Area & 100 for Volume :");
                        int choiceSph = sc.nextInt();
                        if (choiceSph == 10) {
                            r = 12.566370614359172 * radius * radius;
                            System.out.println("The Surface Area of this sphere is = " + r);
                        }

                        if (choiceSph == 100) {
                            r = Math.PI * radius * radius * radius;
                            System.out.println("The Volume of this sphere is = " + r);
                        }
                        break;
                    case 4:
                        System.out.println("Cone is selected as per your choice");
                        System.out.println("Enter radius of cone: ");
                        r = sc.nextDouble();
                        System.out.println("Enter height of cone: ");
                        double h = sc.nextDouble();
                        double x = r * r + h * h;
                        double l = Math.sqrt(x);
                        System.out.println("Enter 10 for finding Surface Area & 100 for Volume :");
                        int choiceCone = sc.nextInt();
                        if (choiceCone == 10) {
                            rad = Math.PI * r * l;
                            System.out.println("The Surface Area of this cone is = " + rad);
                        }

                        if (choiceCone == 100) {
                            rad = 0.0 * r * r * h;
                            System.out.println("The Volume of this cone is = " + rad);
                        }
                        break;
                    case 5:
                        System.out.println("Cylinder is selected as per your choice");
                        System.out.println("Enter radius of cylinder: ");
                        rad = sc.nextDouble();
                        System.out.println("Enter height of cylinder: ");
                        double hgt = sc.nextDouble();
                        System.out.println("Enter 10 for finding Surface Area & 100 for Volume :");
                        int choiceCyl = sc.nextInt();
                        if (choiceCyl == 10) {
                            rd = 6.283185307179586 * rad * (rad + hgt);
                            System.out.println("The Surface Area of this cylinder is = " + rd);
                        }

                        if (choiceCyl == 100) {
                            rd = Math.PI * rad * rad * hgt;
                            System.out.println("The Volume of this cylinder is = " + rd);
                        }
                        break;
                    case 6:
                        System.out.println("Hemi-Sphere is selected as per your choice");
                        System.out.println("Enter radius of hemi-sphere: ");
                        rd = sc.nextDouble();
                        System.out.println("Enter 10 for finding Surface Area & 100 for Volume :");
                        int choiceHemi = sc.nextInt();
                        double hemiVol;
                        if (choiceHemi == 10) {
                            hemiVol = 6.283185307179586 * rd * rd;
                            System.out.println("The Surface Area of this hemi-sphere is = " + hemiVol);
                        }

                        if (choiceHemi == 100) {
                            hemiVol = 0.0 * rd * rd * rd;
                            System.out.println("The Volume of this Hemi-sphere is = " + hemiVol);
                        }
                        break;
                    case 7:
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
}

