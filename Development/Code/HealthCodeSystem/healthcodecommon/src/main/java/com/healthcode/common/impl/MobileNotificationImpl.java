package com.healthcode.common.impl;

import com.healthcode.common.NotificationService;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class MobileNotificationImpl implements NotificationService {

    //Replace your site2sms username and password below
    static final String _userName = "8897339213";
    static final String _password = "healthcode333";
    static final String _url = "http://smsapi.cikly.in/index.php";  
    //static final String _url = "http://smsapi.cikly.in/index.php";
    //static final String _url = "http://www.site2sms.com/user/send_sms_next.asp";
    static final String charset = "UTF-8";

    
	public void sendNotification(String destIdOrNumbder) {
		
		
	}
	
	 //to build the query string that will send a message
    private static String buildRequestString(String targetPhoneNo, String message) throws UnsupportedEncodingException
    {
        String [] params = new String [5];
        params[0] = _userName;
        params[1] = _password;
        params[2] = message;
        params[3] = targetPhoneNo;
        params[4] = "site2sms";

        String query = String.format("uid=%s&pwd=%s&msg=%s&phone=%s&provider=%s",
        URLEncoder.encode(params[0],charset),
        URLEncoder.encode(params[1],charset),
        URLEncoder.encode(params[2],charset),
        URLEncoder.encode(params[3],charset),
        URLEncoder.encode(params[4],charset)
        );
    return query;
    }

    public static void sendMessage(String reciever, String message) throws Exception
    {

        System.out.println("hi!hello");
        //To establish the connection and perform the post request
        URLConnection connection = new URL(_url + "?" + buildRequestString(reciever,message)).openConnection();
        connection.setRequestProperty("Accept-Charset", charset);

        //This automatically fires the request and we can use it to determine the response status
        InputStream response = connection.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(response));
        //System.out.println(br);

        System.out.println(br.readLine());
    }

    public static void main(String [] args) throws Exception
    {
        System.out.println("enter Mobile No:");
        Scanner scanIn = new Scanner(System.in);

        String testPhoneNo = scanIn.nextLine();
        scanIn.close();            
        String testMessage = "Sending Messages From java is not too hard";
        sendMessage(testPhoneNo,testMessage);
    }
} 
   