package blocklist.utils;

import java.security.MessageDigest;

public class HashUtil {
	private final static String INSTANCE_TYPE 	= "SHA-256";
	private final static String CHAR_SET 		= "UTF-8";
	
	public static String calculateHashValue(String input){		
		try {
			MessageDigest md = MessageDigest.getInstance(HashUtil.INSTANCE_TYPE);	        
			byte[] hash = md.digest(input.getBytes(HashUtil.CHAR_SET));	        
			StringBuffer hexString = new StringBuffer(); // This will contain hash as hexidecimal
			for(int i = 0; i < hash.length; i++) {
				String hex = Integer.toHexString(0xff & hash[i]);
				if(hex.length() == 1) hexString.append('0');
				hexString.append(hex);
			}
			return hexString.toString();
		}
		catch(Exception e) {
			throw new RuntimeException(e);
		}
	} 
}
