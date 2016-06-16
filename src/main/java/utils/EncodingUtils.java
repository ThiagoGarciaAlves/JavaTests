package utils;

import java.io.UnsupportedEncodingException;

public class EncodingUtils {

    public void printStringCodesByEncodings(String string, String[] encodings) throws UnsupportedEncodingException {
        System.out.println();
        System.out.println("Codes of \""+string+"\" by encodings: ");
        System.out.println("ENCODING\tSIZE\tCODE");
        for (String encoding : encodings) {
            byte[] b = string.getBytes(encoding);
            System.out.printf("%10s\t%d\t\t", encoding, b.length);
            for (int k = 0; k < b.length; k++) {
                String hex = Integer.toHexString((b[k] + 256) % 256);
                if (hex.length() == 1)
                    hex = "0" + hex;
                System.out.print(hex);
            }
            System.out.println();
        }
        System.out.println();
    }

    public String convertEncoding(String string, String sourceEncoding, String resultEncoding) throws UnsupportedEncodingException {
        return new String(string.getBytes(sourceEncoding), resultEncoding);
    }

}
