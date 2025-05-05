class FahrenheightToCelsius extends Convert{
    
    FahrenheightToCelsius(double val1){
        super(val1);
    }
    @Override
    public void compute(){
        val2 = (val1 - 32) * 5/9;
    }
}
