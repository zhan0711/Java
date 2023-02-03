/*
Student Name: Yuan Zhang
Student Number: 041019474
Course & Section #: 22S_CST8288_021
Declaration: 
This is my own original work and is free from Plagiarism.
*/

package pkgUnitConverterTest;

import pkgUnitConverter.*;

/**
 * This class intends to test 2 classes for converting Fahrenheit to Celsius and the reverse
 * and 2 classes for converting Kilogram to Pound and the reverse.
 * @author Yuan Zhang
 * @version 1.0
 * @see java.lang.String
 * @since javac 19.0.1
 */
public class UnitConverterTest {
    /**
     * The default constructor
     */
    public UnitConverterTest() {
        
    }
    
    /**
     * The main method
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Instantiate the UnitConverter.
        UnitConverter unitConverter = new UnitConverter();
        
        // Define the list of test values.
        double testValues[] = {70.0, 20.0, 30.0, 40.0};
        // Define the list of strategies to be tested.
        ConversionBehaviour converters[] = {
            new FCconverter(),
            new CFconverter(),
            new KgToLbConverter(),
            new LbToKgConverter()};
        
        // Loop through the test cases.
        for (int index = 0; index < testValues.length; index++) {
            // Change the conversion behaviour according to the index.
            unitConverter.changeBehaviourTo(converters[index]);
            // Convert and print the result.
            System.out.printf("%s %5.2f in %s is %5.2f %s\n",
                unitConverter.toString(),
                testValues[index],
                unitConverter.getFromUnit(),
                unitConverter.convert(testValues[index]),
                unitConverter.getToUnit());
        }
    }
}
