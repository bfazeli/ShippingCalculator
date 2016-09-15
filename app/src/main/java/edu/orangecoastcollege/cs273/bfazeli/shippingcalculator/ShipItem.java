package edu.orangecoastcollege.cs273.bfazeli.shippingcalculator;

/**
 * Created by bijanfazeli on 9/14/16.
 */
public class ShipItem {
    private double mWeight;
    private double mBaseCost;
    private double mAddedCost;
    private double mTotalCost;

    public ShipItem() {
        mWeight = 0.0;
        mBaseCost = 3.0;
        mAddedCost = 0.0;
        mTotalCost = 0.0;
    }

    public double getWeight() {
        return mWeight;
    }

    public double getBaseCost() {
        return mBaseCost;
    }

    public double getAddedCost() {
        return mAddedCost;
    }

    public double getTotalCost() {
        return mTotalCost;
    }

    public void setWeight(double weight) {
        mWeight = weight;
        double tempWeight = mWeight;

        while (Double.compare(tempWeight, 16.0) > 0) {
            mAddedCost += .50;
            tempWeight -= 4;
        }

        mTotalCost += mAddedCost;
    }
}
