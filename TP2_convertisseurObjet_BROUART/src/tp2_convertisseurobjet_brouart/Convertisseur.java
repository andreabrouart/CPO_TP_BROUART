/*BROUART ANDREA TDB 28/10/22 */
package tp2_convertisseurobjet_brouart;

/**
 *
 * @author Asus
 */
public class Convertisseur {
    


 public double CelciusVersKelvin(double celcius){ 
    double Kelvin = celcius + 273.15;
    return Kelvin;
 }
 
 public double KelvinVersCelcius(double kelvin){
     double Celcius = kelvin - 273.15;
     return Celcius;
 }
 
  public double FarenheitVersCelcius(double farenheit){
      double Celcius = (farenheit - 32)/1.8;
      return Celcius;
  }
  
   public double CelsiusVersFarenheit(double celcius){
       double Farenheit = (celcius*1.8)+32;
       return Farenheit;
   }
   
    public double KelvinVersFarenheit(double kelvin){
        double Farenheit = CelsiusVersFarenheit(KelvinVersCelcius(kelvin));
        return Farenheit;
    }
    
     public double FarenheitVersKelvin(double farenheit){
        double Kelvin = CelciusVersKelvin(FarenheitVersCelcius(farenheit));
        return Kelvin;
     }
    }
