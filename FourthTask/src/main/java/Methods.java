import java.util.Scanner;

public class Methods {
    private Rectangle rectangle;

    public double square() {
        while (!isRectangle()) {
            isRectangle();
        }
        int x1 = rectangle.getX1();
        int y1 = rectangle.getY1();
        int x2 = rectangle.getX2();
        int y2 = rectangle.getY2();
        int x3 = rectangle.getX3();
        int y3 = rectangle.getY3();
        int x4 = rectangle.getX4();
        int y4 = rectangle.getY4();

        double result = 0;
        if (x1 > 0 && y2 > 0 && x3 > 0 && y1 > 0) {
            result = (x3 - x2) * (y2 - y1);
        } else if (x1 <= 0 && y1 <= 0 && y2 > 0 && x3 > 0) {
            result = x3 * y3;
        } else if (x1 <= 0 && y1 > 0 && y2 > 0 && x3 > 0) {
            result = x3 * (y2 - y1);
        } else if (x1 > 0 && y1 <= 0 && y2 > 0 && x3 > 0) {
            result = (x3 - x2) * y2;
        } else {
            System.out.println("Rectangle is not in 1 coordinate quadrant");
        }
        return result;
    }

    public boolean isRectangle() {
        enterRectangle();
        double firstDiagonal = Math.sqrt(Math.pow(rectangle.getX3() - rectangle.getX1(), 2) + Math.pow(rectangle.getY3() - rectangle.getY1(), 2));
        double secondDiagonal = Math.sqrt(Math.pow(rectangle.getX4() - rectangle.getX2(), 2) + Math.pow(rectangle.getY4() - rectangle.getY2(), 2));
        double expression1 = Math.sqrt(Math.pow(rectangle.getX4() - rectangle.getX1(), 2) + Math.pow(rectangle.getY4() - rectangle.getY1(), 2));
        double expression2 = Math.sqrt(Math.pow(rectangle.getX3() - rectangle.getX4(), 2) + Math.pow(rectangle.getY3() - rectangle.getY4(), 2));
        if (firstDiagonal == secondDiagonal) {
            System.out.println("Diagonals are equals");
            if (Math.pow(firstDiagonal, 2) == Math.pow(expression1, 2) + Math.pow(expression2, 2)) {
                System.out.println("This figure is rectangle!");
            } else {
                System.out.println("This figure is not a rectangle! Please, try again.");
                return false;
            }
        } else {
            System.out.println("This figure is not a rectangle! Please, try again.");
            return false;
        }
//            if (rectangle.getX1() == rectangle.getX2() && rectangle.getY2() == rectangle.getY3()
//                    && rectangle.getX3() == rectangle.getX4() && rectangle.getY1() == rectangle.getY4()) {
//                System.out.println("This figure is rectangle!");
//            } else if (rectangle.getX1() == rectangle.getX3() || rectangle.getX2() == rectangle.getX1()
//                    || rectangle.getY1() == rectangle.getY3() || rectangle.getY2() == rectangle.getY4()) {
//                System.out.println("This figure is not a rectangle! Please, try again.");
//                return false;
//            } else {
//                return false;
//            }
        return true;
    }

    public void enterRectangle() {
        rectangle = new Rectangle();
        System.out.println("Enter the coordinates of the rectangle. Entering of coordinates starts from the left lower corner" +
                "and goes clockwise");
        System.out.println("Enter coordinate (x1;y1): ");
        Scanner in = new Scanner(System.in);
        rectangle.setX1(in.nextInt());
        rectangle.setY1(in.nextInt());
        System.out.println("Enter coordinate (x2;y2): ");
        rectangle.setX2(in.nextInt());
        rectangle.setY2(in.nextInt());
        System.out.println("Enter coordinate (x3;y3): ");
        rectangle.setX3(in.nextInt());
        rectangle.setY3(in.nextInt());
        System.out.println("Enter coordinate (x4;y4): ");
        rectangle.setX4(in.nextInt());
        rectangle.setY4(in.nextInt());

        System.out.println("We've got a figure with the coordinates: (" + rectangle.getX1() + ";" +
                rectangle.getY1() + "),(" + rectangle.getX2() + ";" + rectangle.getY2() + "),(" +
                rectangle.getX3() + ";" + rectangle.getY3() + "),(" + rectangle.getX4() + ";" +
                rectangle.getY4() + ").");
    }
}
