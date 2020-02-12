package encryptdecrypt;

import java.io.*;
import java.util.logging.*;
import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class EncryptDecrypt{

   public static String encrypt(String input) {
    String encrypted = null;
    try {
        MessageDigest msdDigest = MessageDigest.getInstance("SHA-1");
        msdDigest.update(input.getBytes("UTF-8"), 0, input.length());
        encrypted = DatatypeConverter.printHexBinary(msdDigest.digest());
    } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
        
        System.out.println(e.toString());
    }
        return encrypted;
    }
   public static void main(String args[])
   {
       
       
   }

}