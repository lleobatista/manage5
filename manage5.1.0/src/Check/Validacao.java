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
    
    //Método para valida RG
    public boolean validaRG(String rg){
        String RG = "\\d\\d.\\d\\d\\d.\\d\\d\\d-\\d";
        if(rg.matches(".*\\D^.^-.*")){
            return false;
        }
        else if(rg.length() < 12 || rg.length() > 12){
            return false;
        }
        else if(!rg.matches(RG)){
            return false;
        }
        return true;
    }

    //Método para validar Carteira de Trabalho
    public boolean validaCarteiraDeTrabalho(String carteiraDeTrabalho){
        String Cdt = "\\d\\d\\d\\d\\d\\d\\d-\\d\\d\\d\\d\\d";
        if(carteiraDeTrabalho.matches(".*\\D^-.*")){
            return false;
        }
        else if(carteiraDeTrabalho.length() < 13 || carteiraDeTrabalho.length() > 13){
            return false;
        }
        else if(!carteiraDeTrabalho.matches(Cdt)){
            return false;
        }
        return true;
    }
    
    //Método para validar Logradouro
    public boolean validaLogradouro(String logradouro){
        if(logradouro.length() < 2 || logradouro.length() > 50){
            return false;
        }
        else if(logradouro.matches(".*[!|@|#|$|%|&|*|(|)|=|+|;].*")){
            return false;
        }
        return true;
    }
    
    //Método para validar Complemento
    public boolean validaComplemento(String complemento){
        if(complemento.length() > 50){
            return false;
        }
        else if(complemento.matches(".*[!|@|#|$|%|&|*|(|)|=|+|;].*")){
            return false;
        }
        return true;
    }
    
    //Método para validar Cidade
    public boolean validaCidade(String cidade){
        if(cidade.length() < 2 || cidade.length() > 50){
            return false;
        }
        else if(cidade.matches(".*[!|@|#|$|%|&|*|(|)|=|+|;].*")){
            return false;
        }
        return true;
    }
    
    //Método para validar Titulo de Eleitor
    public boolean validaTituloDeEleitor(String tituloDeEleitor){
        String Tde = "\\d\\d\\d\\d \\d\\d\\d\\d \\d\\d\\d\\d";
        if(tituloDeEleitor.length() < 14 || tituloDeEleitor.length() > 14){
            return false;
        }
        else if(tituloDeEleitor.matches(".*\\D^-.*")){
            return false;
        }
        else if(!tituloDeEleitor.matches(Tde)){
            return false;
        }
        return true;
    }
    
    //Método para validar Cartão do Programa Integração Social (PIS)
    public boolean validaProgramIntegacaoSocila(String programaIntegracaoSocial){
        String Pis = "\\d\\d.\\d\\d\\d\\d\\d.\\d\\d-\\d.\\d";
        if(programaIntegracaoSocial.length() < 14 || programaIntegracaoSocial.length() > 14){
            return false;
        }
        else if(programaIntegracaoSocial.matches(".*\\D^-.*")){
            return false;
        }
        else if(!programaIntegracaoSocial.matches(Pis)){
            return false;
        }
        return true;
    }
    
    public static void main(String args[]) {
        Validacao valida = new Validacao();
        
        if(valida.validaLogradouro("")){
            System.out.println("Logradouro Válido");
        }
        else{
            System.out.println("Logradouro Inválido");
        }
         
    }
}
