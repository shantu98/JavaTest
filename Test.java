
package javacodechecker;

public class Test {
	 
	public static void m() {
		System.exit(1);
		}
	public static void m2() {
		Runtime.exit(1);
		}

        public void notValid() throws Throwable
                {
       
            final String CIPHER_INPUT = "ABCDEFG123456";
            KeyGenerator kG = KeyGenerator.getInstance("AES");
            SecretKey secretKey = kG.generateKey();
            byte[] byteKey = secretKey.getEncoded();
            SecretKeySpec secretKeySpec = new SecretKeySpec(byteKey, "AES");
            Cipher aesCipher = Cipher.getInstance("AES");
            aesCipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            byte[] encrypted = aesCipher.doFinal(CIPHER_INPUT.getBytes("UTF-8"));
            IO.writeLine(IO.toHex(encrypted));
                 }
         private void inValid() throws Throwable
	        {
	        
	            final String CIPHER_INPUT = "ABCDEFG123456";
	            KeyGenerator kGVal = KeyGenerator.getInstance("AES");
	            kGVal.equals(kGVal);
	            SecretKey secretKey = kGVal.generateKey();
	            byte[] byteKey = secretKey.getEncoded();
	            SecretKeySpec secretKeySpec = new SecretKeySpec(byteKey, "AES");
	            Cipher aesCipher = Cipher.getInstance("AES");
	            aesCipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
	            byte[] encrypted = aesCipher.doFinal(CIPHER_INPUT.getBytes("UTF-8"));
	            IO.writeLine(IO.toHex(encrypted));
	        }

         public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		IO.writeLine("doing some more things here after the redirect");
		IO.writeLine("doing some more things here after the redirect");
		response.sendRedirect("/test");
		IO.writeLine("doing some more things here after the redirect");
	}


}	
	
	
