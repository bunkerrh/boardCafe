package com.bunkware.bc.boardCafe.Implementation.Query;

public class CustomerQuery {

    public static String GET_ALL_CUSTOMERS = "select  CUSTOMER_ID, FIRST_NAME, LAST_NAME, EMAIL, AREA_CODE, PHONE_NUMBER, LOYALTY_POINTS from customer";

    public static  String GET_CUSTOMER_BY_ID = "SELECT CUSTOMER_ID, FIRST_NAME, LAST_NAME, EMAIL, AREA_CODE, PHONE_NUMBER, LOYALTY_POINTS FROM customer WHERE CUSTOMER_ID = ? ";

    public static  String GET_CUSTOMER_BY_NAME = "SELECT CUSTOMER_ID, FIRST_NAME, LAST_NAME, EMAIL, AREA_CODE, PHONE_NUMBER, LOYALTY_POINTS FROM customer WHERE FIRST_NAME = ? and LAST_NAME = ? ";

    public static  String GET_CUSTOMER_BY_EMAIL = "SELECT CUSTOMER_ID, FIRST_NAME, LAST_NAME, EMAIL, AREA_CODE, PHONE_NUMBER, LOYALTY_POINTS FROM customer WHERE EMAIL = ? ";

    public static String UPDATE_LOYALTY_POINTS = "UPDATE customer SET LOYALTY_POINTS = ? WHERE CUSTOMER_ID = ? ";

    public static String UPDATE_EMAIL_BY_ID = "UPDATE customer SET EMAIL = ? WHERE CUSTOMER_ID = ? ";

    public static String UPDATE_PHONE_NUMBER_BY_ID = "UPDATE customer SET AREA_CODE = ?, PHONE_NUMBER = ? WHERE CUSTOMER_ID = ? ";

    public static String INSERT_NEW_CUSTOMER = "INSERT INTO customer(FIRST_NAME, LAST_NAME, EMAIL, AREA_CODE, PHONE_NUMBER, LOYALTY_POINTS)\n" +
            "VALUES(?, ?, ?, ?, ?, ?) ";

}
