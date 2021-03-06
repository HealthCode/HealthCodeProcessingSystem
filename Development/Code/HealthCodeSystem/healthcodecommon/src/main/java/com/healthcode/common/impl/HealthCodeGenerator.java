package com.healthcode.common.impl;

import java.util.HashMap;
import java.util.Map;

//Sample class that acts like a DB with sequece values for the Name Key
// Since we can have the key for each name and gender combination
// We can have key ranging from AA0000 to ZZ9999 for rach AAM to ZZM and AAF to ZZF
// Total we will get 26*26*2   * 26*26*10000 sequences generated, 9139520000.
//                   A*A*(M/F) *  A*A * 9999 

class DBMap{
	
	private static Map<String,SeqHolder> seqMap = new HashMap<String,SeqHolder>();
	
	public static Integer getNumSeqForKey(String key)
	{
		if(!seqMap.containsKey(key))
		{
			seqMap.put(key, new SeqHolder());
		}
		return seqMap.get(key).numSeq;
		
	}
	
	public static String getAlphaSeqForKey(String key)
	{
		if(!seqMap.containsKey(key))
		{
			seqMap.put(key, new SeqHolder());
		}
		return seqMap.get(key).alhpaSeq;
		
	}
	
	public static void updateSeqValues(String key, String alpha,Integer num)
	{
		SeqHolder s = seqMap.get(key);
		s.alhpaSeq = alpha;
		s.numSeq= num;
	}
}

class SeqHolder{
	
	public String alhpaSeq;
	public Integer numSeq;
	SeqHolder()
	{
		alhpaSeq="AA";
		numSeq=0;
		
	}
}

public class HealthCodeGenerator {
	
	private static String alphaSeq;
	
	private static Integer numSeq;
	
	public HealthCodeGenerator()
	{
		alphaSeq="AA";
		numSeq = new Integer(0);
	}
	
	private static void getLastSequenceNumber(String keyValue)
	{
		//Connect to DB and get the Seq for now get it from DBMap
		
		alphaSeq = DBMap.getAlphaSeqForKey(keyValue);
		numSeq = DBMap.getNumSeqForKey(keyValue);
		
		if( alphaSeq.charAt(1) =='Z' && numSeq.intValue() == 9999)
		{
			char firstChar = alphaSeq.charAt(0);
			firstChar++;
			alphaSeq = firstChar+"A";
			numSeq = 0;
			
		}
		else if( numSeq.intValue() == 9999 )
		{
			char firstChar = alphaSeq.charAt(1);
			firstChar++;
			alphaSeq = new Character(alphaSeq.charAt(0)).toString() + new Character(firstChar);
			numSeq = 0;
		}
		else
		{
			numSeq++;
		}
		
		DBMap.updateSeqValues(keyValue,alphaSeq,numSeq);
	
	}
	//Sample Health Code : AA1234
	public static String getHealthCode(String keyValue)
	{
		if(keyValue.length() != 3 )
		{
			return null;
		}
		char x = keyValue.charAt(2);
		if(keyValue.charAt(2) !='M' && keyValue.charAt(2)!='F')
		{
			return null;
		}
		getLastSequenceNumber(keyValue);
		String temp = String.format("%s-%04d", alphaSeq,numSeq);
		return temp;
	}
	/*public static void main(String args[])
	{
		for(int i=0; i< 10; i++)
		{
			System.out.println("PBM-"+ HealthCodeGenerator.getHealthCode("PBM"));
		}
		for(int i=0; i< 10; i++)
		{
			System.out.println("SDM-"+ HealthCodeGenerator.getHealthCode("SDM"));
		}
		for(int i=0; i< 10; i++)
		{
			System.out.println("PBM-" + HealthCodeGenerator.getHealthCode("PBM"));
		}
		System.out.println("PBM-"+ HealthCodeGenerator.getHealthCode("PBD"));
		System.out.println("PBM-"+ HealthCodeGenerator.getHealthCode("PB"));
	}*/
}
