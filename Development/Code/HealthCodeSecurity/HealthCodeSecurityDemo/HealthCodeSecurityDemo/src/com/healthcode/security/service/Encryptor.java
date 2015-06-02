package com.healthcode.security.service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import com.healthcode.security.entity.UserProfile;


public class Encryptor {

	   private final static int NUM_HASH_ITERATIONS=1200;
	   public static boolean validateCredentials(String digest, String salt, String password)
	           throws NoSuchAlgorithmException, IOException{
	       try {
	           byte[] bDigest = base64ToByte(digest);
	           byte[] bSalt = base64ToByte(salt);
	 
	           // Compute the new DIGEST
	           byte[] currentDigest = getHash(NUM_HASH_ITERATIONS, password, bSalt);
	           return Arrays.equals(currentDigest, bDigest);
	       }finally{
	       
	       }
	   }
	   
	   public static UserProfile getUserWithEncryptedPasswordAndSalt(String userName, String password) throws NoSuchAlgorithmException, UnsupportedEncodingException
	   {
		   		   UserProfile userProfile = new UserProfile();
	               SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
	               //Random generation of 64-bit salt
	               byte[] bSalt = new byte[8];
	               random.nextBytes(bSalt);
	               byte[] bDigest = getHash(NUM_HASH_ITERATIONS,password,bSalt);
	               String encryptedPassword = byteToBase64(bDigest);
	               String sSalt = byteToBase64(bSalt);
	               
	               userProfile.setUserName(userName);
	               userProfile.setPassword(encryptedPassword);
	               userProfile.setSalt(sSalt);
	               return userProfile; 
	   }
	   
	   public static byte[] getHash(int numHashIterations, String password, byte[] salt) throws NoSuchAlgorithmException, UnsupportedEncodingException {
	       MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
	       messageDigest.reset();
	       messageDigest.update(salt);
	       byte[] input = messageDigest.digest(password.getBytes("UTF-8"));
	       for (int i = 0; i < numHashIterations; i++) {
	    	   messageDigest.reset();
	           input = messageDigest.digest(input);
	       }
	       return input;
	   }
	   
	   public static byte[] base64ToByte(String data) throws IOException {
	       BASE64Decoder decoder = new BASE64Decoder();
	       return decoder.decodeBuffer(data);
	   }
	 
	   /**
	    * From a byte[] returns a base 64 representation
	    * @param data byte[]
	    * @return String
	    * @throws IOException
	    */
	   public static String byteToBase64(byte[] data){
	       BASE64Encoder endecoder = new BASE64Encoder();
	       return endecoder.encode(data);
	   }
	 	   
	public static void main(String[] args) throws NoSuchAlgorithmException, IOException {
		// TODO Auto-generated method stub
		//System.out.println(encryptPassword("Welcome12"));
		//System.out.println((authenticate("Welcome12"))? "Success" : "Failure");
	}


}
