package edu.handong.csee.java.hw2.converters;
/**
 * This is a interface of Convertible.
 */
public interface Convertible {

    /**Set value that put in. */
    public void setFromValue(double fromValue);

    /**
         *Get converted value.  
         */ 
    public double getConvertedValue();

    /**
         *Convert value. 
     */ 
    public void convert();

}