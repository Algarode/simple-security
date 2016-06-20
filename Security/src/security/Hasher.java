package security;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author edwinlambregts
 */
public class Hasher {
    
    public static String generateMd5String(String input) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(StandardCharsets.UTF_8.encode(input));
        return String.format("%032x", new BigInteger(1, md.digest()));
    }
    
    public static String generateSha256String(String input) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(StandardCharsets.UTF_8.encode(input));
        return String.format("%032x", new BigInteger(1, md.digest()));
    }
    
}
