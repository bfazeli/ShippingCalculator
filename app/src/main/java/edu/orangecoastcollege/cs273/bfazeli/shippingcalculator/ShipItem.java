package edu.orangecoastcollege.cs273.bfazeli.shippingcalculator;

import android.util.Log;
import android.util.StringBuilderPrinter;

/**
 * ShipItem:    Calculates the shipping cost of a package.
 * @author bijanfazeli
 *
 * Created by Bijan Fazeli on 9/14/16.
 */
public class ShipItem {
    private static final double BASE_COST = 3.0;
    private static final double BASE_WEIGHT = 16.0;

    private double mWeight;
    private double mBaseCost;
    private double mAddedCost;
    private double mTotalCost;

    /**
     * ShipItem default constructor
     */
    public ShipItem() {
        mWeight = 0.0;
        mBaseCost = BASE_COST;
        mAddedCost = 0.0;
        mTotalCost = 0.0;
    }

    /**
     * getWeight:   Returns the weight of the current object.
     *
     * @return: The weight
     */
    public double getWeight() {
        return mWeight;
    }

    /**
     * getBaseCost: Returns the base cost of the current object.
     * @return: Base cost
     */
    public double getBaseCost() {
        return mBaseCost;
    }

    /**
     * getAddedCost:    Returns the added cost
     * @return: Added cost
     */
    public double getAddedCost() {
        return mAddedCost;
    }

    /**
     * getTotalCost:    Returns the total cost
     * @return: Total cost.
     */
    public double getTotalCost() {
        return mTotalCost;
    }

    /**
     * setWeight:   Sets the weight of the object, and performs calculations
     *
     * @param weight
     */
    public void setWeight(double weight) {
        mWeight = weight;

        mAddedCost = 0.0;
        mBaseCost = BASE_COST;

        if (mWeight <= 0)
            mBaseCost = 0.0;
        if (mWeight > BASE_WEIGHT)
            mAddedCost = Math.ceil((mWeight - BASE_WEIGHT) / 4.0) * .50;

        mTotalCost = mBaseCost + mAddedCost;
    }
}
