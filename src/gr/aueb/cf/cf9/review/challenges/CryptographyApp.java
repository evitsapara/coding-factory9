package gr.aueb.cf.cf9.review.challenges;

/**
 * Encryption with conversion of characters
 * into ints
 */
public class CryptographyApp {

    public static void main(String[] args) {
        String s = "Coding Factory#";
        final int KEY = 256;
        System.out.println(encrypt(s, KEY));
        System.out.println(decrypt(encrypt(s, KEY), KEY));
    }

    public static String encrypt(String s, int key) {
        int prevEncrypt;
        int encrypt;
        StringBuilder encryptArray = new StringBuilder();

        prevEncrypt = s.charAt(0);
        encryptArray.append(prevEncrypt);
        encryptArray.append(" ");

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                encryptArray.append("-1");
                break;
            }
            encrypt = (s.charAt(i) + prevEncrypt) % key;
            encryptArray.append(encrypt);
            encryptArray.append(" ");
            prevEncrypt = encrypt;
        }
        return encryptArray.toString();
    }

    public static String decrypt(String s, int key) {
        StringBuilder decryptArray = new StringBuilder();
        String[] tokens = s.split(" ");
        char decrypt;
        int encrypt;

        int prevDecrypt = Integer.parseInt(tokens[0]);
        decrypt = (char) prevDecrypt;
        decryptArray.append(decrypt);

        for (int i = 1; i < tokens.length; i++) {
            if (tokens[i].equals("-1")) {
//                decryptArray.append("#");
                break;
        }
            encrypt = Integer.parseInt(tokens[i]);
            decrypt = (char) ((encrypt - prevDecrypt + key) % key);
            decryptArray.append(decrypt);
            prevDecrypt = encrypt;
        }
        return decryptArray.toString();
    }
}
