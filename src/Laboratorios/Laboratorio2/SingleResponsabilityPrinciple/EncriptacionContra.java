package Laboratorios.Laboratorio2.SingleResponsabilityPrinciple;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncriptacionContra {
    public String encriptarContraseña(String contraseña) { 
        try { 
            MessageDigest md = MessageDigest.getInstance("SHA-256"); 
            byte[] hash = md.digest(contraseña.getBytes()); 
            StringBuilder hexString = new StringBuilder(); 
            for (byte b : hash) { 
                String hex = Integer.toHexString(0xff & b); 
                if (hex.length() == 1) { 
                    hexString.append('0'); 
                } 
                hexString.append(hex); 
            } 
            return hexString.toString(); 
        } catch (NoSuchAlgorithmException e) { 
            return e.getMessage(); 
        } 
    } 
}
