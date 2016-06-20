package security;

import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author edwinlambregts
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String string = "sjwek";
        try {
            System.out.println("MD5 hash: " + Hasher.generateMd5String(string));
            System.out.println("SHA256 hash: " + Hasher.generateSha256String(string));
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
