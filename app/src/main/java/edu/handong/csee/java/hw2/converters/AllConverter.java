package edu.handong.csee.java.hw2.converters;

/**
 * This is a class of AllConverter.
 */

public class AllConverter {
    private double fromValue;
    private String originalMeasure;
    
    /**Set value that put in. */
    public AllConverter setFromValue(double fromValue){
        this.fromValue = fromValue;
        return this;
    }
    
    /**Set original measure that put in. */
    public AllConverter setOriginalMeasure(String originalMeasure){
        
        this.originalMeasure = originalMeasure;
        return this;
    }
    
    /**Convert all way that value can convert. */
    public void convertAndPrintOut(){
        if(originalMeasure.equals("TON")){
            TONToGConverter ttg=new TONToGConverter();
            TONToKGConverter ttk=new TONToKGConverter();
            ttg.setFromValue(fromValue);
            ttg.convert();
            ttk.setFromValue(fromValue);
            ttk.convert();

            System.out.println(this.fromValue+" TON to "+ttk.getConvertedValue()+" KG");
            System.out.println(this.fromValue+" TON to "+ttg.getConvertedValue()+" G");

        }
        else if(originalMeasure.equals("KM")){
            KMToMConverter ktc=new KMToMConverter();
            KMToMILEConverter ktm=new KMToMILEConverter();
            ktc.setFromValue(fromValue);
            ktc.convert();
            ktm.setFromValue(fromValue);
            ktm.convert();

            System.out.println(this.fromValue+" KM to "+ktc.getConvertedValue()+" M");
            System.out.println(this.fromValue+" KM to "+ktm.getConvertedValue()+" MILE");
        }
        else if(originalMeasure.equals("MILE")){
            MILEToKMConverter mtk=new MILEToKMConverter();
            mtk.setFromValue(fromValue);
            mtk.convert();
            System.out.println(this.fromValue+" MILE to "+mtk.getConvertedValue()+" KM");
        }
    }
    

}
