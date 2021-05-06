package edu.handong.csee.java.hw2.converters;

/**
 * This is a class of TONToKGConverter.
 * You can convert value Ton to KG.
 */

public class TONToKGConverter implements Convertible {
    private double value;

    /**Set value that put in. */
    @Override
    public void setFromValue(double fromValue) {
        
        value=fromValue;
    }

    
    /**
         *Get converted value. */
    @Override
    public double getConvertedValue() {
         
        return value;
    }

    
    /**
         *Convert value Ton to KG. */
    @Override
    public void convert() {
         
        value=value*1000;
    }
}
