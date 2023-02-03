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
 * It intends to convert a value from Pound to Kilogram.
 * @author Yuan Zhang
 * @version 1.0
 * @see java.lang.String
 * @since javac 19.0.1
 */
public class LbToKgConverter implements ConversionBehaviour{
    private final double kilogramsPerPound = 0.45359237;
    
    /**
     * The default constructor
     */
    public LbToKgConverter() {
        
    }
    
    /**
     * Convert a value from Pound to Kilogram.
     * @param value The value in Pound to be converted
     * @return The equivalent in Kilogram
     */
    @Override
    public double convert(double value) {
        return value * kilogramsPerPound;
    }
 
    /**
     * Get the unit type in string.
     * @return The unit type
     */
    @Override
    public String unitType() {
        return "weight";
    }
    
    /**
     * Get the unit of converting from in string.
     * @return The unit of converting from
     */
    @Override
    public String getFromUnit() {
        return "Pound";
    }

    /**
     * Get the unit of converting to in string.
     * @return The unit of converting from.
     */    
    @Override
    public String getToUnit() {
        return "Kilogram";
    }
    
    /**
     * Build the description string.
     * @return The description string
     */
    @Override
    public String toString() {
        return "Pound to Kilogram";
    }
}
