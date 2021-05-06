package edu.handong.csee.java.hw2.converters;

/**
 * This is a class of MILEToKMConverter.
 * You can convert value MILE to KM.
 */

public class MILEToKMConverter implements Convertible {
     private double value;

    /**Set value that put in. */
    @Override
    public void setFromValue(double fromValue) {
        
        value =fromValue;
    }
 
    /**Get converted value.  */ 
    @Override
    public double getConvertedValue() {
        
        return value;
    }

    /**Convert value Mile to KM.  */ 
    @Override
    public void convert() {
        
        value=value*1.60934;
    }
    
}
