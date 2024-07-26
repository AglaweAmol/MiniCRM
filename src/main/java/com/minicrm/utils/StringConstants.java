package com.minicrm.utils;

public class StringConstants {

    //Text
    public static final String TEXT_COUNTRY_CODE = "+91";
    public static final String TEXT_REGEX_CONTACT_VALIDATOR = "^[+](91)?\\d{10}";
    public static final String TEXT_REGEX_SYMBOL_REMOVAL = "[^0-9]";
    public static final String TEXT_SPACE = "";
    public static final String TEXT_ADD = "+";
    public static final String TEXT_REGEX_SYMBOL_CONVERT_NUMBER_INTO_SIX_DIGIT = "%06d";
    public static final String TEXT_EMPTY = "";
    public static final String TEXT_COLON = ":";
    public static final String MEETING_TIME_FORMAT = "HH:mm";
    public static final String API_ROOT_ROUTE = "/**";
    public static final String API_AUTH_ROUTE = "/auth/**";
    public static final String API_FILE_PATH = "/file/**";
    public static final String TEXT_EMPTY_SPACE = " ";

    public static final String TEXT_DEMO_USER_MOBILE_NUMBER = "9999999999";
    public static final String TEXT_DEMO_USER_OTP_NUMBER = "123456";

    public static final Boolean FALSE = false;
    public static final Boolean TRUE = true;

    //Language Constants
    public static final String LANG_DEFAULT = "default";
    public static final String LANG_ENGLISH = "en";

    //Date Time Format
    public static final String DATE_TIME_FORMAT_YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
    public static final String DATE_FORMAT_YYYY_MM_DD = "yyyy-MM-dd";

    public static final String ROLE_CAPTAIN = "CAPTAIN";
    public static final String ROLE_MEMBER = "MEMBER";
    public static final String TEXT_CREDIT = " credits.";

    public static final String TEXT_USER_ADDITION_TO_GROUP_FORMAT = "%s:%s,";


    //Path Variables
    public static final String PATH_VARIABLE_ID = "id";

    //Label Classes Controller constants
    public static final String REQUEST_SUCCESS_MESSAGE_LABEL_CLASS_CREATED = "Labels class Created Successfully!!";
    public static final String REQUEST_SUCCESS_MESSAGE_LABEL_CLASS_UPDATED = "Labels class Updated Successfully!!";
    public static final String REQUEST_SUCCESS_MESSAGE_LABEL_CLASS_DELETED = "Labels class Deleted Successfully!!";
    public static final String REQUEST_SUCCESS_MESSAGE_LABEL_CLASS_FETCHED = "Labels class Fetched Successfully!!";
    public static final String REQUEST_SUCCESS_MESSAGE_SELECTED_LABEL_CLASS_FETCHED = "Labels class by id: ";
    public static final String REQUEST_FAILURE_MESSAGE_NO_LABEL_CLASS_FOUND = "No Labels class Found";
    public static final String REQUEST_FAILURE_MESSAGE_LABEL_CLASS_CANT_BE_CREATED = "Labels class cant be created";
    public static final String REQUEST_FAILURE_MESSAGE_NO_LABEL_CLASS_FOUND_FOR_SELECTED_ID = "No Labels class found with selected Labels class id :";

    //Label Classes Controller constants
    public static final String REQUEST_SUCCESS_MESSAGE_LABEL_CONSTANTS_CREATED = "Labels Constants Created Successfully!!";
    public static final String REQUEST_SUCCESS_MESSAGE_LABEL_CONSTANTS_UPDATED = "Labels Constants Updated Successfully!!";
    public static final String REQUEST_SUCCESS_MESSAGE_LABEL_CONSTANTS_DELETED = "Labels Constants Deleted Successfully!!";
    public static final String REQUEST_SUCCESS_MESSAGE_LABEL_CONSTANTS_FETCHED = "Labels Constants Fetched Successfully!!";
    public static final String REQUEST_SUCCESS_MESSAGE_SELECTED_LABEL_CONSTANTS_FETCHED = "Labels Constants by id: ";
    public static final String REQUEST_FAILURE_MESSAGE_NO_LABEL_CONSTANTS_FOUND = "No Labels Constants Found";
    public static final String REQUEST_FAILURE_MESSAGE_LABEL_CONSTANTS_CANT_BE_CREATED = "Labels class cant be created";
    public static final String REQUEST_FAILURE_MESSAGE_NO_LABEL_CONSTANTS_FOUND_FOR_SELECTED_ID = "No Labels class found with selected Labels class id :";


    //User Controller
    public static final String REQUEST_SUCCESS_MESSAGE_USER_CREATED = "User Created Successfully!!";
    public static final String REQUEST_FAILURE_MESSAGE_USER_NOT_CREATED = "Failed to Create User";
    public static final String REQUEST_SUCCESS_MESSAGE_USER_UPDATED = "User Updated Successfully!!";
    public static final String REQUEST_SUCCESS_MESSAGE_USER_DELETED = "User Deleted Successfully!!";
    public static final String REQUEST_SUCCESS_MESSAGE_USER_FETCHED = "User Fetched Successfully!!";
    public static final String REQUEST_SUCCESS_MESSAGE_SELECTED_USER_FETCHED = "Fetched User by id: ";
    public static final String REQUEST_FAILURE_MESSAGE_NO_USER_FOUND = "No User Found";


    //Role Controller
    public static final String REQUEST_SUCCESS_MESSAGE_ROLE_CREATED = "Role Created Successfully!!";
    public static final String REQUEST_FAILURE_MESSAGE_ROLE_NOT_CREATED = "Failed to Create Role";
    public static final String REQUEST_SUCCESS_MESSAGE_ROLE_UPDATED = "Role Updated Successfully!!";
    public static final String REQUEST_SUCCESS_MESSAGE_ROLE_DELETED = "Role Deleted Successfully!!";
    public static final String REQUEST_SUCCESS_MESSAGE_ROLE_FETCHED = "Role Fetched Successfully!!";
    public static final String REQUEST_SUCCESS_MESSAGE_SELECTED_ROLE_FETCHED = "Fetched Role by id: ";
    public static final String REQUEST_FAILURE_MESSAGE_NO_ROLE_FOUND = "No Role Found";

    //Group Settings Controller
    public static final String REQUEST_SUCCESS_MESSAGE_GROUP_SETTINGS_CREATED = "Group Settings Created Successfully!!";
    public static final String REQUEST_FAILURE_MESSAGE_GROUP_SETTINGS_NOT_CREATED = "Failed to Create Group Settings";
    public static final String REQUEST_SUCCESS_MESSAGE_GROUP_SETTINGS_UPDATED = "Group Settings Updated Successfully!!";
    public static final String REQUEST_SUCCESS_MESSAGE_GROUP_SETTINGS_DELETED = "Group Settings Deleted Successfully!!";
    public static final String REQUEST_SUCCESS_MESSAGE_GROUP_SETTINGS_FETCHED = "Group Settings Fetched Successfully!!";
    public static final String REQUEST_SUCCESS_MESSAGE_SELECTED_GROUP_SETTINGS_FETCHED = "Fetched Group Settings by id: ";
    public static final String REQUEST_FAILURE_MESSAGE_NO_GROUP_SETTINGS_FOUND = "No Group Settings Found";
    public static final String REQUEST_FAILURE_MESSAGE_SETTING_ALREADY_PRESENT = "Group settings already exists for group id: ";

    //Swagger Constant
    public static final String TEXT_SWAGGER_TITLE = "All meet mate APIs";
    public static final String TEXT_SWAGGER_DESC = "REST APIs reference for developers";
    public static final String TEXT_SWAGGER_CONTACT_EMAIL = "rishabhkukkar28@gmail.com";
    public static final String TEXT_SWAGGER_LICENCE = "http://licence-url.com";
    public static final String TEXT_APP_NAME = "Laundro core service";
    public static final String TEXT_SWAGGER_API_VERSION = "1.0";
    public static final String TEXT_SWAGGER_REGEX_PATH = "/*.*";


    public static final String USER_ID = "user_id";
    public static final String AUTHORIZATION_HEADER = "authorization";
    public static final String BEARER = "Bearer ";
    public static final String INVALID_TOKEN_FORMAT = "Invalid token format";
    public static final String INVALID_TOKEN = "Invalid token";

    //Ciity
    public static final String REQUEST_SUCCESS_MESSAGE_CITY_CREATED = "City created successfully";
    public static final String REQUEST_SUCCESS_MESSAGE_CITY_FETCHED = "City fetched successfully";
    public static final String REQUEST_SUCCESS_MESSAGE_CITY_DELETED = "City deleted successfully";
    public static final String REQUEST_SUCCESS_MESSAGE_CITY_UPDATED = "City updated successfully";
    public static final String REQUEST_FAILURE_MESSAGE_CITY_NOT_CREATED = "Failed to create City";
    public static final String REQUEST_FAILURE_MESSAGE_NO_CITY_FOUND = "No City found";

    //Country
    public static final String REQUEST_SUCCESS_MESSAGE_COUNTRY_CREATED = "Country created successfully";
    public static final String REQUEST_SUCCESS_MESSAGE_COUNTRY_FETCHED = "Country fetched successfully";
    public static final String REQUEST_SUCCESS_MESSAGE_COUNTRY_DELETED = "Country deleted successfully";
    public static final String REQUEST_SUCCESS_MESSAGE_COUNTRY_UPDATED = "Country updated successfully";
    public static final String REQUEST_FAILURE_MESSAGE_COUNTRY_NOT_CREATED = "Failed to create Country";
    public static final String REQUEST_FAILURE_MESSAGE_NO_COUNTRY_FOUND = "No Country found";

    //Category Master
    public static final String REQUEST_SUCCESS_MESSAGE_CATEGORY_MASTER_CREATED = "Category master created successfully";
    public static final String REQUEST_SUCCESS_MESSAGE_CATEGORY_MASTER_FETCHED = "Category master fetched successfully";
    public static final String REQUEST_SUCCESS_MESSAGE_CATEGORY_MASTER_DELETED = "Category master deleted successfully";
    public static final String REQUEST_SUCCESS_MESSAGE_CATEGORY_MASTER_UPDATED = "Category master updated successfully";
    public static final String REQUEST_FAILURE_MESSAGE_CATEGORY_MASTER_NOT_CREATED = "Failed to create Category mastery";
    public static final String REQUEST_FAILURE_MESSAGE_NO_CATEGORY_MASTER_FOUND = "No Category master found";

    //Delivery Type
    public static final String REQUEST_SUCCESS_MESSAGE_DELIVERY_TYPE_CREATED = "Delivery Type created successfully";
    public static final String REQUEST_SUCCESS_MESSAGE_DELIVERY_TYPE_FETCHED = "Delivery Type fetched successfully";
    public static final String REQUEST_SUCCESS_MESSAGE_DELIVERY_TYPE_DELETED = "Delivery Type deleted successfully";
    public static final String REQUEST_SUCCESS_MESSAGE_DELIVERY_TYPE_UPDATED = "Delivery Type updated successfully";
    public static final String REQUEST_FAILURE_MESSAGE_DELIVERY_TYPE_NOT_CREATED = "Failed to create Delivery Type";
    public static final String REQUEST_FAILURE_MESSAGE_NO_DELIVERY_TYPE_FOUND = "No Delivery Type found";

    //Process Mater
    public static final String REQUEST_SUCCESS_MESSAGE_PROCESS_MASTER_CREATED = "Process master created successfully";
    public static final String REQUEST_SUCCESS_MESSAGE_PROCESS_MASTER_FETCHED = "Process master fetched successfully";
    public static final String REQUEST_SUCCESS_MESSAGE_PROCESS_MASTER_DELETED = "Process master deleted successfully";
    public static final String REQUEST_SUCCESS_MESSAGE_PROCESS_MASTER_UPDATED = "Process master updated successfully";
    public static final String REQUEST_FAILURE_MESSAGE_PROCESS_MASTER_NOT_CREATED = "Failed to create Process master";
    public static final String REQUEST_FAILURE_MESSAGE_NO_PROCESS_MASTER_FOUND = "No Process master found";

    //Product Master
    public static final String REQUEST_SUCCESS_MESSAGE_PRODUCT_MASTER_CREATED = "Product master created successfully";
    public static final String REQUEST_SUCCESS_MESSAGE_PRODUCT_MASTER_FETCHED = "Product Master Fetched Successfully!!";
    public static final String REQUEST_FAILURE_MESSAGE_NO_PRODUCT_MASTER_FOUND = "No Product Master found";
    public static final String REQUEST_SUCCESS_MESSAGE_PRODUCT_MASTER_SAVED = "Product Master saved Successfully!!";
    public static final String REQUEST_FAILURE_MESSAGE_FAILED_T0_SAVE_PRODUCT_MASTER = "Failed to save Product Master";
    public static final String REQUEST_SUCCESS_MESSAGE_PRODUCT_MASTER_UPDATED = "Product Master Updated Successfully!!";
    public static final String REQUEST_SUCCESS_MESSAGE_PRODUCT_MASTER_DELETED = "Product Master Deleted Successfully!!";
    public static final String REQUEST_FAILURE_NO_CREATED_BY_USER_FOUND = "Created by user not found.";

    //Role master
    public static final String REQUEST_SUCCESS_MESSAGE_ROLE_MASTER_CREATED = "Role master created successfully";
    public static final String REQUEST_SUCCESS_MESSAGE_ROLE_MASTER_FETCHED = "Role master Fetched Successfully!!";
    public static final String REQUEST_FAILURE_MESSAGE_NO_ROLE_MASTER_FOUND = "No Role master found";
    public static final String REQUEST_SUCCESS_MESSAGE_ROLE_MASTER_SAVED = "Role master saved Successfully!!";
    public static final String REQUEST_FAILURE_MESSAGE_FAILED_T0_SAVE_ROLE_MASTER = "Failed to save Role master";
    public static final String REQUEST_SUCCESS_MESSAGE_ROLE_MASTER_DELETED = "Role master Deleted Successfully!!";
    public static final String REQUEST_FAILURE_MESSAGE_FAILED_T0_DELETE_ROLE_MASTER = "Failed to delete Role master";

    //State Service
    public static final String REQUEST_SUCCESS_MESSAGE_STATE_CREATED = "state created successfully";
    public static final String REQUEST_SUCCESS_MESSAGE_STATE_FETCHED = "state Fetched Successfully!!";
    public static final String REQUEST_FAILURE_MESSAGE_NO_STATE_FOUND = "No state found";
    public static final String REQUEST_SUCCESS_MESSAGE_STATE_SAVED = "state saved Successfully!!";
    public static final String REQUEST_FAILURE_MESSAGE_FAILED_T0_SAVE_STATE = "Failed to save state";
    public static final String REQUEST_SUCCESS_MESSAGE_STATE_DELETED = "state Deleted Successfully!!";
    public static final String REQUEST_FAILURE_MESSAGE_FAILED_T0_DELETE_STATE = "Failed to delete state";

    //State Service
    public static final String REQUEST_SUCCESS_MESSAGE_SUBSCRIPTION_PLAN_CREATED = "Subscription Plan created successfully";
    public static final String REQUEST_SUCCESS_MESSAGE_SUBSCRIPTION_PLAN_FETCHED = "Subscription Plan Fetched Successfully!!";
    public static final String REQUEST_FAILURE_MESSAGE_NO_SUBSCRIPTION_PLAN_FOUND = "No Subscription Plan found";
    public static final String REQUEST_SUCCESS_MESSAGE_SUBSCRIPTION_PLAN_SAVED = "Subscription Plan saved Successfully!!";
    public static final String REQUEST_FAILURE_MESSAGE_FAILED_T0_SAVE_SUBSCRIPTION_PLAN = "Failed to save Subscription Plan";
    public static final String REQUEST_SUCCESS_MESSAGE_SUBSCRIPTION_PLAN_DELETED = "Subscription Plan Deleted Successfully!!";
    public static final String REQUEST_FAILURE_MESSAGE_FAILED_T0_DELETE_SUBSCRIPTION_PLAN = "Failed to delete Subscription Plan";

    //App Version Constants
    public static final String REQUEST_SUCCESS_MESSAGE_APP_VERSION_FETCHED = "App version Fetched Successfully!!";
    public static final String REQUEST_SUCCESS_MESSAGE_APP_VERSION_CREATED = "App version Created Successfully!!";
    public static final String REQUEST_SUCCESS_MESSAGE_APP_VERSION_DELETED = "App version Deleted Successfully!!";
    public static final String REQUEST_FAILURE_MESSAGE_NO_APP_VERSION_FOUND = "No App version Found";


}
