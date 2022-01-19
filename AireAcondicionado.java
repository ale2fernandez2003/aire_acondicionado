
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
    private double min;
    private double max;
    private double incremento;

    /**
     * Constructor for objects of class AireAcondicionado
     */
    public AireAcondicionado (){
        temperatura = 15.0;
        subirTemperatura = incremento;
        bajarTemperatura = incremento;
        incremento = 5.0;
    }
    
    public double getmin (){
        return min;
    }
    
    public double getmax (){
        return max;
    }
    
    public void subirTemperatura (){
        if (max >= subirTemperatura){
            temperatura = temperatura + subirTemperatura;
        }
        else {
        }
    }
    public void bajarTemperatura (){
        if (min >= bajarTemperatura){
            temperatura = temperatura + bajarTemperatura;
        }
        else {
        }
    }
    
    public double getTemperatura (){
        return temperatura;
    }
    
    public void setIncremento (double nuevoIncremento){
        if (incremento <= 0) {
            incremento = nuevoIncremento;
        }
        else {
        }
    }
}
