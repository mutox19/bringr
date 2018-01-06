package com.example.danilo.testingmap;

import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBAttribute;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBAutoGeneratedKey;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBHashKey;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBTable;

/**
 * Created by Danilo on 2016-12-10.
 */
@DynamoDBTable(tableName = "fooddelivery-mobilehub-1629399668-Ratings")
public class RatingsDB {


    private  String ratingID;
    private String CustomerID;
    private String DeliveredAllItems;
    private String DeliveredInTime;
    private String DriverID;
    private String OrderID;
    private String Description;
    private int StarRating;

    public RatingsDB()
    {

    }


    @DynamoDBHashKey(attributeName = "ratingID")
    @DynamoDBAutoGeneratedKey
    public String getRatingID() {
        return ratingID;
    }

    public void setRatingID(String ratingID) {
        this.ratingID = ratingID;
    }

    @DynamoDBAttribute(attributeName = "CustomerID")
    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String customerID) {
        CustomerID = customerID;
    }

    @DynamoDBAttribute(attributeName = "DeliveredAllItems")
    public String getDeliveredAllItems() {
        return DeliveredAllItems;
    }

    public void setDeliveredAllItems(String deliveredAllItems) {
        DeliveredAllItems = deliveredAllItems;
    }

    @DynamoDBAttribute(attributeName = "DeliveredInTime")
    public String getDeliveredInTime() {
        return DeliveredInTime;
    }

    public void setDeliveredInTime(String deliveredInTime) {
        DeliveredInTime = deliveredInTime;
    }

    @DynamoDBAttribute(attributeName = "DriverID")
    public String getDriverID() {
        return DriverID;
    }

    public void setDriverID(String driverID) {
        DriverID = driverID;
    }

    @DynamoDBAttribute(attributeName = "OrderID")
    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String orderID) {
        OrderID = orderID;
    }

    @DynamoDBAttribute(attributeName = "Description")
    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    @DynamoDBAttribute(attributeName = "StarRating")
    public int getStarRating() {
        return StarRating;
    }

    public void setStarRating(int starRating) {
        StarRating = starRating;
    }


}
