package org.example.data;
public class Encrypt {
    private static final String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String encrypt(String message) {

        message = message.toUpperCase();
        String cipherText = "";

        for (int i = 0; i<message.length(); i++){ //membuat looping sepanjang string
            if (message.charAt(i) == ' '){
                cipherText += ' ';
                continue;
            }
            int charPosition = alpha.indexOf(message.charAt(i));
            int keyVal = (10+charPosition) % 26; //membuat caesar cipher memungkinkan untuk kembali ke A setelah Z
            char replaceVal = alpha.charAt(keyVal);
            cipherText += replaceVal;
        }
        return cipherText;
    }
}
