package com.example.danilo.testingmap;

import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBAttribute;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBAutoGeneratedKey;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBHashKey;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBIndexHashKey;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBIndexRangeKey;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBTable;

/**
 * Created by Danilo on 2016-08-30.
 */
@DynamoDBTable(tableName = "fooddelivery-mobilehub-1629399668-Customers")
public class Customers {

    private String userId;
    private String FIRSTNAME;
    private String LASTNAME;
    private String EMAIL;
    private String USERNAME;
    private String UID;
    private String FID;
    private String CREATED_AT;
    private String phoneNum;

    @DynamoDBAttribute(attributeName = "PhoneNum")
    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }



    public Customers()
    {

    }
    @DynamoDBHashKey(attributeName = "userId")
    @DynamoDBAutoGeneratedKey
    public String getUserId()
    {
        return userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    @DynamoDBAttribute(attributeName = "FirstName")
    public String getFIRSTNAME()
    {
        return FIRSTNAME;
    }

    public void setFIRSTNAME(String FIRSTNAME)
    {
        this.FIRSTNAME = FIRSTNAME;
    }

    @DynamoDBAttribute(attributeName = "LastName")
    public String getLASTNAME()
    {
        return LASTNAME;
    }

    public void setLASTNAME(String LASTNAME)
    {
        this.LASTNAME = LASTNAME;
    }

    @DynamoDBIndexHashKey (attributeName = "Email",globalSecondaryIndexNames ={  "email-finder", "Email-FID-index"})
    public String getEMAIL()
    {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL)
    {
        this.EMAIL = EMAIL;
    }

    /*
    @DynamoDBAttribute(attributeName = "username")
    public String getUSERNAME()
    {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME)
    {
        this.USERNAME = USERNAME;
    }
*/
    @DynamoDBIndexRangeKey(attributeName = "UID", globalSecondaryIndexName = "email-finder")
    public String getUID()
    {
        return UID;
    }

    public void setUID(String UID)
    {
        this.UID = UID;
    }

    @DynamoDBIndexRangeKey(attributeName = "FID", globalSecondaryIndexName = "Email-FID-index")
    public String getFID()
    {
        return FID;
    }

    public void setFID(String FID)
    {
        this.FID = FID;
    }

    @DynamoDBAttribute(attributeName = "created_At")
    public String getCREATED_AT()
    {
        return CREATED_AT;
    }

    public void setCREATED_AT(String CREATED_AT)
    {
        this.CREATED_AT = CREATED_AT;
    }


}
