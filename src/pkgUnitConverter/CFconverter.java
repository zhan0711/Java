/*
Student Name: Yuan Zhang
Student Number: 041019474
Course & Section #: 22S_CST8288_021
Declaration: 
This is my own original work and is free from Plagiarism.
*/

package pkgUnitConverter;

/**
 * This class represents a "concrete strategy" in the Strategy Design Pattern.
 * It intends to convert a value from Celsius to Fahrenheit.
 * @author Yuan Zhang
 * @version 1.0
 * @see java.lang.String
 * @since javac 19.0.1
 */
public class CFconverter implements ConversionBehaviour {
    private final double convFactor=1.8;
    private final double convOrigin=32.0;
    
    /**
     * The default constructor
     */
    public CFconverter() {
        
    }
    
    /**
     * Convert a value from Celsius to Fahrenheit.
     * @param celsius The value in Celsius to be converted
     * @return The equivalent in Fahrenheit
     */
    @Override
    public double convert(double celsius)  {
        return celsius * convFactor + convOrigin;
    }
       
    /**
     * Get the unit type in string.
     * @return The unit type
     */
    @Override
    public String unitType() {
        return "temperature";
    }
    
    /**
     * Get the unit of converting from in string.
     * @return The unit of converting from
     */
    @Override
    public String getFromUnit() {
        return "Celsius";
    }

    /**
     * Get the unit of converting to in string.
     * @return The unit of converting from.
     */    
    @Override
    public String getToUnit() {
        return "Fahrenheit";
    }
    
    /**
     * Build the description string.
     * @return The description string
     */
    @Override
    public String toString() {
        return "Celsius to Fahrenheit";
    }
}
