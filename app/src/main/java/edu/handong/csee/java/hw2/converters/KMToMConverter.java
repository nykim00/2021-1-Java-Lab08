package edu.handong.csee.java.hw2.converters;

/**
 * This is a class of KMToMConverter.
 * You can convert value KM to M.
 */

public class KMToMConverter implements Convertible{
    private double value;

    /**Set value that put in. */
    @Override
    public void setFromValue(double fromValue) {

        value = fromValue;
    }

    
    /**
         *Get converted value.  
         */ 
    @Override
    public double getConvertedValue() {
        
        return value;
    }

    
    /**
         *Convert value KM to M. 
     */ 
    @Override
    public void convert() {
        
        value=value*1000;
    }
    
}
