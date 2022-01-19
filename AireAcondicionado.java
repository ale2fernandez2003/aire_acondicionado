
/**
 * Write a description of class AireAcondicionado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AireAcondicionado
{
    // instance variables - replace the example below with your own
    private double temperatura;
    private double subirTemperatura;
    private double bajarTemperatura;

    /**
     * Constructor for objects of class AireAcondicionado
     */
    public AireAcondicionado (){
        temperatura = 15.0;
        subirTemperatura = 5.0;
        bajarTemperatura = 5.0;
    }
    
    public void subirTemperatura (){
        temperatura = temperatura + subirTemperatura;
    }
    
    public void bajarTemperatura (){
        temperatura = temperatura - bajarTemperatura;
    }
    
    public double getTemperatura (){
        return temperatura;
    }
}
