class FeetToMeters extends Convert {
    FeetToMeters(double val1){
        super(val1);
    }
    @Override
    public void compute(){
        val2 = val1 * 0.3048; //Feet to Meters (1 foot = 0.3048 meters)
        
    }
}
