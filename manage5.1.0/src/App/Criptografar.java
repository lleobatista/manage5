/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import java.math.BigInteger;
import java.security.MessageDigest;
import br.com.DomainMode.PostGresJPA.LoginSenha;

/**
 *
 * @author Keila Emy
 */
public class Criptografar {
    
    public static String encriptografar(String senha){
        
        String retorno = "";
        MessageDigest md;
        try{
            md = MessageDigest.getInstance("MD5");
            BigInteger hash = new BigInteger(1,md.digest(senha.getBytes()));
            retorno = hash.toString(16); //vai retornar um hexadecimal
        }catch(Exception e){}
        return retorno;
        
        
        
    }
    
    
}
