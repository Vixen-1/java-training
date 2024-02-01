package effigo.ayushi.training.function;

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println("Thank you for using the area calculator");
        System.out.println("This calculator lets you get the area of: ");
        System.out.println("1 - Square\n2 - Rectangle\n3 - Triangle\n4 - Circle\n");

        // double square = area of square with a side of 2.
        double square = areaSquare(2);
        // double rectangle = area of rectangle with a length of 1, and a width of 2. 
        double rectangle = areaRectangle(1, 2);
        // double triangle = area of triangle with a base of 1, and a width of 2.
        double triangle = areaTriangle(1, 2) ;
        // double circle = area of circle with a radius of 2. 
        double circle = areaCircle(2);

        //Task 7 – Call a function that prints all the areas. 
        printAreas(square, rectangle, triangle, circle);
    }
    public static double areaSquare(double s){
        double area = 0;
        if(s>=0){
            area = s*s;
        }
        else{
            System.out.println("Error! impossible");
            System.exit(0);
        }
        return area;
    }
    public static double areaRectangle(double length, double width) {
        double area = 0;
        if(length >= 0 && width >= 0){
            area = length * width;
        }
        else{
            System.out.println("Error: impossible");
            System.exit(0);
        }
        return area;  
    } 
    public static double areaTriangle(double base, double height) {
        double area = 0;
        if(base >= 0 && height >= 0){
            area = (base*height)/2;
        }
        else{
            System.out.println("Error: impossible");
            System.exit(0);
        }
        return area; 
    }
    public static double areaCircle(double radius) {
        double area = 0;
        if(radius >= 0){
            area = Math.PI * radius * radius;
        }
        else{
            System.out.println("Error: impossible");
            System.exit(0);
        }
        return area;
    }



    //Task 6: Write a function that prints every area.


    /**
     * Function name: printAreas – it prints four areas
     * @param square – square area (double)
     * @param rectangle – rectangle area (double)
     * @param triangle – triangle area (double)
     * @param circle – circle area (double)
     * 
     * Inside the function:
     *  1. print: ("Square area: <square area>")
     *  2. print: ("Rectangle area: <rectangle area>")
     *  3. print: ("Triangle area: <triangle area>")
     *  4. print: ("Circle area: <circle area>")
     * 
     */
    public static void printAreas(double s,double  r,double t, double c){
        System.out.println("area of square: " + s);
        System.out.println("area of rectangle: " + r);
        System.out.println("area of triangle: " + t);
        System.out.println("area of circle: " + c);
    }

}
