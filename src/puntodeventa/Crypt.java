/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntodeventa;

/**
 *
 * @author PC
 */
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Crypt {
  

    public byte[] cifra(String pass) throws Exception {
            final byte[] bytes = pass.getBytes("UTF-8");
            final Cipher aes = obtieneCipher(true);
            final byte[] cifrado = aes.doFinal(bytes);
            return cifrado;
    }

    public String descifra(byte[] cifrado) throws Exception {
            final Cipher aes = obtieneCipher(false);
            final byte[] bytes = aes.doFinal(cifrado);
            final String sinCifrar = new String(bytes, "UTF-8");
            return sinCifrar;
    }

    private Cipher obtieneCipher(boolean paraCifrar) throws Exception {
            final String frase = "FraseLargaConDiferentesLetrasNumerosYCaracteresEspeciales_áÁéÉíÍóÓúÚüÜñÑ1234567890!#%$&()=%_NO_USAR_ESTA_FRASE!_";
            final MessageDigest digest = MessageDigest.getInstance("SHA");
            digest.update(frase.getBytes("UTF-8"));
            final SecretKeySpec key = new SecretKeySpec(digest.digest(), 0, 16, "AES");

            final Cipher aes = Cipher.getInstance("AES/ECB/PKCS5Padding");
            if (paraCifrar) {
                    aes.init(Cipher.ENCRYPT_MODE, key);
            } else {
                    aes.init(Cipher.DECRYPT_MODE, key);
            }

            return aes;
    }
    
    /*public static void main(String[] args) throws Exception{
        Crypt cr = new Crypt();
        
        String pass="admin";
        byte[] p = cr.cifra(pass);
        String s = Base64.getEncoder().encodeToString(p);
        System.out.println(s);
    }*/
}
