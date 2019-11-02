/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Check;

/**
 *
 * @author leandrocnb
 */
public class Validacao {
    
    public boolean validaRG(String rg){
        if(rg.contains("^[a-Z]")){
            return false;
        }
        else if(rg.contains("“”!@#$%&*(),=+;")){
            return false;
        }
        else return !(rg.length() < 12 || rg.length() > 12);
    }    

    
    
    public static void main(String args[]) {
        Validacao valida = new Validacao();
        if(valida.validaRG("8723kahs893j")){
            System.out.println("RG Válido");
        }
        else{
            System.out.println("RG Inválido");
        }
    }
}
