/*
Student Name: Yuan Zhang
Student Number: 041019474
Course & Section #: 22S_CST8288_021
Declaration: 
This is my own original work and is free from Plagiarism.
*/

package pkgUnitConverter;

/**
 * This class represents the "strategy" in the Strategy Design Pattern.
 * @author Yuan Zhang
 * @version 1.0
 * @see java.lang.String
 * @since javac 19.0.1
 */
public interface ConversionBehaviour {
    /**
     * Convert the value from one unit to the other.
     * @param value The value to be converted
     * @return The equivalent in the other unit
     */
    public double convert(double value);
    
    /**
     * Get the unit type in string.
     * @return The unit type
     */
    public String unitType();
    
    /**
     * Get the unit of converting from in string.
     * @return The unit of converting from
     */
    public String getFromUnit();
    
    /**
     * Get the unit of converting to in string.
     * @return The unit of converting from.
     */
    public String getToUnit();
}
