/*
Student Name: Yuan Zhang
Student Number: 041019474
Course & Section #: 22S_CST8288_021
Declaration: 
This is my own original work and is free from Plagiarism.
*/

package pkgUnitConverter;

/**
 * This class represents the "context" in the Strategy Design Pattern.
 * It intends to convert the value from one unit to the other according
 * to the conversion behaviour configured.
 * @author Yuan Zhang
 * @version 1.0
 * @see java.lang.String
 * @since javac 19.0.1
 */
public class UnitConverter {
    private ConversionBehaviour conversionBehaviour;
    
    /**
     * The default constructor
     * Will use 'Fahrenheit to Celsius' as the default conversion behaviour.
     */
    public UnitConverter() {
        this.conversionBehaviour = new FCconverter();
    }
    
    /**
     * Change the conversion behaviour to the one specified.
     * @param conversionBehaviour The specified conversion behaviour
     */
    public void changeBehaviourTo(ConversionBehaviour conversionBehaviour){
        // Detect and prevent nulls
        if (conversionBehaviour != null) {
            this.conversionBehaviour = conversionBehaviour;
        } else {
            System.out.println("[Error] The conversion behaviour is null.");
        }
    }
    
    /**
     * Convert the value from one unit to the other.
     * @param value The value to be converted
     * @return The equivalent in the other unit
     */
    public double convert(double value)  {
        return this.conversionBehaviour.convert(value);
    }
    
    /**
     * Get the unit of converting from in string.
     * @return The unit of converting from
     */
    public String getFromUnit() {
        return this.conversionBehaviour.getFromUnit();
    }

    /**
     * Get the unit of converting to in string.
     * @return The unit of converting from.
     */    
    public String getToUnit() {
        return this.conversionBehaviour.getToUnit();
    }
    
    /**
     * Build the description string.
     * @return The description string
     */
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("[")
               .append("unit type: ")
               .append(this.conversionBehaviour.unitType())
               .append(", description: ")
               .append(this.conversionBehaviour.toString())
               .append("]");
        return builder.toString();
    }
}
