package edu.orangecoastcollege.cs273.bfazeli.shippingcalculator;

/**
 * Created by bijanfazeli on 9/14/16.
 */
public class ShipItem {
    private double mWeight;
    private double mBaseCost;
    private double mAddedCost;
    private double mTotalCost;

    public ShipItem(double weight, double baseCost, double addedCost, double totalCost) {
        mWeight = weight;
        mBaseCost = baseCost;
        mAddedCost = addedCost;
        mTotalCost = totalCost;
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
    }
}
