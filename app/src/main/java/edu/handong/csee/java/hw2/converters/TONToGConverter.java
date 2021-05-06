package edu.handong.csee.java.hw2.converters;

/**
 * This is a class of TONToGConverter.
 * You can convert value Ton to G.
 */

public class TONToGConverter implements Convertible {
    private double value;
    
    /**Set value that put in. */
    @Override
    public void setFromValue(double fromValue) {
        
        value=fromValue;
    }
 
    /**Get converted value.  */ 
    @Override
    public double getConvertedValue() {
        
        return value;
    }
 
    /**Convert value Ton to G.  */ 
    @Override
    public void convert() {
        
        value*=1000000;
    }
    
}
