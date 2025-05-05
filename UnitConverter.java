public class UnitConverter {
    public static void main(String[] args) {
        //// Converting 10 Liters to Gallons
        Convert c1 = new LiterToGallon(10);
        c1.compute();
        System.out.print("10 Liters in Gallons: ");
        c1.displayResult();

 // Convertinng 100 Fahrenheit to Celsius
 Convert c2 = new FahrenheightToCelsius(100);
 c2.compute();
 System.out.print("100 Fahrenheit in Celsius: ");
 c2.displayResult();

 // Converting 20 Feet to Meters
 Convert c3 = new FeetToMeters(20);
 c3.compute();
 System.out.print("20 Feet in Meters: ");
 c3.displayResult();
    }
}
