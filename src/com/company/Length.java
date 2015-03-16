package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vikaspal on 3/13/2015.
 */
public class Length {
    private  double value;
    private  Unit unit;
    private static final Map<Unit,Double> conversionFactor = new HashMap<Unit,Double>();

    static{
        conversionFactor.put(Unit.Foot,12.0);
        conversionFactor.put(Unit.Inches,1.0);
        conversionFactor.put(Unit.Gallen,3.78);
        conversionFactor.put(Unit.Liters,1.0);

    }
    public Length(double value, Unit unit){
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Length length = (Length) o;
        double difference = Math.abs(initilizeValue()-length.initilizeValue());

        if (Double.compare(difference, 0.1) > 0) return false;

        return true;
    }
//    @override
    public double initilizeValue(){
        return conversionFactor.get(unit)*value;
    }


    public Length convertToInches() {
        return new Length(this.value*(conversionFactor.get(this.unit)),Unit.Inches);
    }
}
