package edu.handong.csee.java.hw2.converters;

/**
 * This is a class of KMToMILEConverter.
 * You can convert value KM to Mile.
 */

public class KMToMILEConverter implements Convertible{
    private double value;

    /**Set value that put in. */ 
    @Override
    public void setFromValue(double fromValue) {
        
        value =fromValue;
    }

    /**
         *Get converted value. */ 
    @Override
    public double getConvertedValue() {
        
        return value;
    }

    /**
         *Convert value KM to MILE. */
    @Override    
    public void convert() {
        
        value=value*0.621371;
    }
    
}
