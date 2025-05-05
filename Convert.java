
//abstract class
abstract class Convert{
    double val1;   // initial value
    double val2;  // converted value

     public Convert(double val1){
        this.val1 = val1;
    }
    //abstract method to perform conversion
    public abstract void compute();

public void displayResult(){
    System.out.println("Converted value: " + val2);
}

}
