
//liters to gallons ( 1 liter = 0.264172 gallons)

class LiterToGallon extends Convert {
    
    LiterToGallon(double val1){
        super(val1);
    }
    @Override
    public void compute(){

        val2 = val1 * 0.264172;
    }
}
