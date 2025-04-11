public class ScienceLibrary {
    public void calculateArea(double base, double height) {
        double area = base * height;
        System.out.println("The area is: " + area);
    }

    public static void main(String[] args) {
        ScienceLibrary library = new ScienceLibrary();
        library.calculateArea(5.0, 3.0); // Example usage
    }
}
