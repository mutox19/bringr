package com.example.danilo.testingmap;

import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBAttribute;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBAutoGeneratedKey;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBHashKey;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBTable;

/**
 * Created by Danilo on 2016-12-10.
 */

@DynamoDBTable(tableName = "fooddelivery-mobilehub-1629399668-ReportDriver")
public class ReportDriversDB {


    private String reportID;
    private String customerID;
    private String driverID;
    private String subject;
    private String complaint;
    private String orderID;

    public ReportDriversDB()
    {

    }

    @DynamoDBHashKey(attributeName = "reportID")
    @DynamoDBAutoGeneratedKey
    public String getReportID() {
        return reportID;
    }

    public void setReportID(String reportID) {
        this.reportID = reportID;
    }
    @DynamoDBAttribute(attributeName = "orderID")
    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }
    @DynamoDBAttribute(attributeName = "customerID")
    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    @DynamoDBAttribute(attributeName = "driverID")
    public String getDriverID() {
        return driverID;
    }

    public void setDriverID(String driverID) {
        this.driverID = driverID;
    }

    @DynamoDBAttribute(attributeName = "subject")
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @DynamoDBAttribute(attributeName = "complaint")
    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }


}
