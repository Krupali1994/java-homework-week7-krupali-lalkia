package homeworkweek7;

/**
 * Wall Area
 */
public class Programme15 {
    private double width;
    private double height;

    //First constructor does not have any parameters (no-arg  constructor)
    public Programme15() {
        this.width = 0;
        this.height = 0;
    }

    //Second constructor - parameters width and height of type double
    public Programme15(double width, double height) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    //Method to getWidth without any parameters
    public double getWidth() {
        return width;
    }

    //Method to getHeight without any parameters
    public double getHeight() {
        return height;
    }

    //Method to setWidth with one parameter of type double
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    //Method to setHeight with one parameter of type double
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    //Method to getArea
    public double getArea() {
        return width * height;
    }

    //Main method
    public static void main(String[] args) {
        Programme15 wall = new Programme15(5, 4);
        System.out.println("Area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("Width= " + wall.getWidth());
        System.out.println("Height= " + wall.getHeight());
        System.out.println("Area= " + wall.getArea());
    }
}

