/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FunçõesTeste;

import br.com.Cadastro.PosteGreJPA.Funcionario;
import java.util.ArrayList;

/**
 *
 * @author leandrocnb
 */
public class TestesFuncionais {
    
    //Método verifica cargo
    public boolean verificaCargo(String cargo){
        ArrayList<String> cargos = new ArrayList();
        cargos.add("Gerente"); cargos.add("Garçom"); cargos.add("Garçonete"); 
        cargos.add("Cozinheiro(a)"); cargos.add("Aux. Cozinha");
        cargos.add("Atend. Caixa"); cargos.add("Aux. Copa"); 
        cargos.add("Faxineiro(a)");
        int i = 0, n = cargos.size();
        for (i=0; i<n; i++) {
            if(cargos.get(i).equals(cargo))
                return true;
        }
        return false;
    }
    
    //Método verifica estado
    public boolean verificaEstado(String estado){
        ArrayList<String> estados = new ArrayList();
        estados.add("AC"); estados.add("AL"); estados.add("AP"); estados.add("AM"); 
        estados.add("BA"); estados.add("CE"); estados.add("DF"); estados.add("ES"); 
        estados.add("GO"); estados.add("MA"); estados.add("MT"); estados.add("MS"); 
        estados.add("MG"); estados.add("PA"); estados.add("PB"); estados.add("PR"); 
        estados.add("PE"); estados.add("PI"); estados.add("RJ"); estados.add("RN");
        estados.add("RS"); estados.add("RO"); estados.add("RR"); estados.add("SC"); 
        estados.add("SP"); estados.add("SE"); estados.add("TO");
        int i = 0, n = estados.size();
        for(i=0; i<n; i++){
            if(estados.get(i).equals(estado))
                return true;
        }
        return false;
    }
    
    //Método valida E-mail
    public boolean validaEmail(String email) throws Exception {
        if (email.length() >= 5 && email.length() <= 100 && email != null){
            String ex = "^(\\w[\\w\\.\\-]+){3,}@(\\w[\\w\\-]+\\.)+[a-z]{2,4}$";
            if(email.matches(ex)){
                return true;
            } else {
                throw new Exception("E-mail inválido");
            }    
        }else {
                throw new Exception("E-mail inválido");
        }
    }
    
    //Método valida Senha
    public boolean validaSenha (String senha) throws Exception {
        if(senha.length() >= 8){
            return true;
        } else {
            throw new Exception("Senha inválida");
        }    
    }
    
    //Método valida Nome do Produto
    public boolean validaNomeProduto(String nome) throws Exception {
        if (nome.length() > 2 && nome.length() < 51) {
            if (nome.matches("([a-zA-Z]+\\ ?)+")) {
                return true;
            } else {
                throw new Exception("Nome invalido");
            }
        } else {
            throw new Exception("Nome invalido");
        }
    }
    
    //Método validar Descrição do Produto
    public boolean validaDescriçãoProduto(String descr) throws Exception {
        if (descr.length() < 101) {
            return true;
        } else {
            throw new Exception("Descrição invalida");
        }
    }

    //Método validar Quantidade do Produto
    public boolean quantidadeProduto(String aux) throws Exception {
        if (aux.length() < 6) {
            if (aux.matches("[1-9][0-9]{0,4}")) {
                return true;
            } else {
                throw new Exception("Quantidade invalida");
            }
        } else {
            throw new Exception("Quantidade invalida");
        }
    }

    //Método para validar Código Produto
    public boolean validaIdProduto(int idProduto) throws Exception {
        if (idProduto >= 1 && idProduto <= 1000000) {
            return true;
        } else {
            throw new Exception("Codigo Produto invalido");
        }
    }

    //Método para validar Preço
    public boolean validaPreco(double preco) throws Exception {
        if (preco >= 0 && preco <= 1000000) {
            return true;
        } else {
            throw new Exception("Preço invalido");
        }
    }
    
    //Método para validar Cargo
    public boolean validaCargo(String cargo) throws Exception{
        if(cargo.length() > 50){
            throw new Exception("Cargo Inválido");
        }
        else if(cargo.matches(".*[!|@|#|$|%|&|*|(|)|=|+|;].*")){
            throw new Exception("Cargo Inválido");
        }
        else if(!verificaCargo(cargo)){
            throw new Exception("Cargo Inválido");
        }
        return true;
    }

    //Método para valida Nome
    public boolean validaNome(String nome) throws Exception{
        if(nome.length() < 5 || nome.length() > 50){
            throw new Exception("Nome Inválido");
        }
        else if(nome.matches(".*[!|@|#|$|%|&|*|(|)|=|+|;].*")){
            throw new Exception("Nome Inválido");
        }
        else if(nome.matches(".*[0|1|2|3|4|5|6|7|8|9].*")){
            throw new Exception("Nome Inválido");
        }
        return true;
    }
    
    //Método para valida RG
    public boolean validaRG(String rg) throws Exception{
        String RG = "\\d\\d.\\d\\d\\d.\\d\\d\\d-\\d";
        if(rg.matches(".*\\D^.^-.*")){
            throw new Exception("RG Inválido");
        }
        else if(rg.length() < 12 || rg.length() > 12){
            throw new Exception("RG Inválido");
        }
        else if(!rg.matches(RG)){
            throw new Exception("RG Inválido");
        }
        return true;
    }
    
    //Método para valida CPF
    public boolean validaCPF(String cpf) throws Exception{
        String CPF = "\\d\\d\\d.\\d\\d\\d.\\d\\d\\d-\\d\\d";
        if(cpf.matches(".*\\D^.^-.*")){
            throw new Exception("CPF Inválido");
        }
        else if(cpf.length() < 14 || cpf.length() > 14){
            throw new Exception("CPF Inválido");
        }
        else if(!cpf.matches(CPF)){
            throw new Exception("CPF Inválido");
        }
        return true;
    }
    
    //Método para valida Data de Nascimento
    public boolean validaDataDeNascimento(String dataDeNascimento) throws Exception{
        String Ddn = "\\d\\d/\\d\\d/\\d\\d\\d\\d";
        if(dataDeNascimento.matches(".*\\D^/.*")){
            throw new Exception("Data de Nascimento Inválida");
        }
        else if(dataDeNascimento.length() < 10 || dataDeNascimento.length() > 10){
            throw new Exception("Data de Nascimento Inválida");
        }
        else if(!dataDeNascimento.matches(Ddn)){
            throw new Exception("Data de Nascimento Inválida");
        }
        return true;
    }
    
    //Método para validar Carteira de Trabalho
    public boolean validaCarteiraDeTrabalho(String carteiraDeTrabalho) throws Exception{
        String Cdt = "\\d\\d\\d\\d\\d\\d\\d-\\d\\d\\d\\d\\d";
        if(carteiraDeTrabalho.matches(".*\\D^-.*")){
            throw new Exception("Carteira de Trabalho Inválida");
        }
        else if(carteiraDeTrabalho.length() < 13 || carteiraDeTrabalho.length() > 13){
            throw new Exception("Carteira de Trabalho Inválida");
        }
        else if(!carteiraDeTrabalho.matches(Cdt)){
            throw new Exception("Carteira de Trabalho Inválida");
        }
        return true;
    }
    
    //Método para validar CEP
    public boolean validaCEP(String cep) throws Exception{
        String CEP = "\\d\\d\\d\\d\\d-\\d\\d\\d";
        if(cep.matches(".*\\D^-.*")){
            throw new Exception("CEP Inválido");
        }
        else if(cep.length() < 9 || cep.length() > 9){
            throw new Exception("CEP Inválido");
        }
        else if(!cep.matches(CEP)){
            throw new Exception("CEP Inválido");           
        }
        return true;
    }
    
    //Método para validar Logradouro
    public boolean validaLogradouro(String logradouro) throws Exception{
        if(logradouro.length() < 2 || logradouro.length() > 50){
            throw new Exception("Logradouro Inválido");
        }
        else if(logradouro.matches(".*[!|@|#|$|%|&|*|(|)|=|+|;].*")){
            throw new Exception("Logradouro Inválido");
        }
        return true;
    }
    
    //Método para validar Numero
    public boolean validaNumero(String numero) throws Exception{
        if(numero.length() < 1 || numero.length() > 6){
            throw new Exception("Número Invalido");
        }
        else if(numero.matches(".*[!|@|#|$|%|&|*|(|)|=|+|;].*")){
            throw new Exception("Número Invalido");
        }
        return true;
    }
    
    //Método para validar Complemento
    public boolean validaComplemento(String complemento) throws Exception{
        if(complemento.length() > 50){
            throw new Exception("Complemento Inválido");
        }
        else if(complemento.matches(".*[!|@|#|$|%|&|*|(|)|=|+|;].*")){
            throw new Exception("Complemento Inválido");
        }
        return true;
    }
    
    //Método para validar Bairro
    public boolean validaBairro(String bairro) throws Exception{
        if(bairro.length() < 2 || bairro.length() > 50){
            throw new Exception("Bairro Inválido");
        }
        else if(bairro.matches(".*[!|@|#|$|%|&|*|(|)|=|+|;].*")){
            throw new Exception("Bairro Inválido");
        }
        return true;
    }
    
    //Método para validar Cidade
    public boolean validaCidade(String cidade) throws Exception{
        if(cidade.length() < 2 || cidade.length() > 50){
            throw new Exception("Cidade Inválida");
        }
        else if(cidade.matches(".*[!|@|#|$|%|&|*|(|)|=|+|;].*")){
            throw new Exception("Cidade Inválida");
        }
        return true;
    }
    
    //Método para validar Estado
    public boolean validaEstado(String estado) throws Exception{
        if(estado.length() < 2 || estado.length() > 2){
            throw new Exception("Estado Inválido");
        }
        else if(estado.matches(".*[!|@|#|$|%|&|*|(|)|=|+|;].*")){
            throw new Exception("Estado Inválido");
        }
        else if(!verificaEstado(estado)){
            throw new Exception("Estado Inválido");
        }
        return true;
    }
    
    //Método para validar Título de Eleitor
    public boolean validaTituloDeEleitor(String tituloDeEleitor) throws Exception{
        String Tde = "\\d\\d\\d\\d \\d\\d\\d\\d \\d\\d\\d\\d";
        if(tituloDeEleitor.length() < 14 || tituloDeEleitor.length() > 14){
            throw new Exception("Título de Eleitor Inválido");
        }
        else if(tituloDeEleitor.matches(".*\\D^-.*")){
            throw new Exception("Título de Eleitor Inválido");
        }
        else if(!tituloDeEleitor.matches(Tde)){
            throw new Exception("Título de Eleitor Inválido");
        }
        return true;
    }
    
    //Método para validar Cartão do Programa Integração Social (PIS)
    public boolean validaProgramaIntegacaoSocial(String programaIntegracaoSocial) throws Exception{
        String Pis = "\\d\\d.\\d\\d\\d\\d\\d.\\d\\d-\\d.\\d";
        if(programaIntegracaoSocial.length() < 14 || programaIntegracaoSocial.length() > 14){
            throw new Exception("Cartão do Programa Integração Social (PIS) Inválido");
        }
        else if(programaIntegracaoSocial.matches(".*\\D^-.*")){
            throw new Exception("Cartão do Programa Integração Social (PIS) Inválido");
        }
        else if(!programaIntegracaoSocial.matches(Pis)){
            throw new Exception("Cartão do Programa Integração Social (PIS) Inválido");
        }
        return true;
    }
    
    //Método trata valores inteiros
    public int trataInt(String num) throws Exception{
        if(num.matches("[0-9]*")){
        return Integer.parseInt(num);
        }else{
         throw new Exception("Número Invalido");
        }
    }
    
    //Método para validar todos os campos de Funcionário
    public boolean validaFuncionario(Funcionario fnr)throws Exception{
        try{
            validaNome(fnr.getNome());
            validaRG(fnr.getRg());
            validaCPF(fnr.getCpf());
            validaDataDeNascimento(fnr.getDataNasc());        
            validaCarteiraDeTrabalho(fnr.getCartTrab());        
            validaCEP(fnr.getComprovante_end().getCep());       
            validaLogradouro(fnr.getComprovante_end().getLogradouro());       
            validaNumero(Integer.toString(fnr.getComprovante_end().getNumero()));
            validaComplemento(fnr.getComprovante_end().getComple());  
            validaBairro(fnr.getComprovante_end().getBairro());
            validaCidade(fnr.getComprovante_end().getCidade());
            validaEstado(fnr.getComprovante_end().getEstado());
            validaTituloDeEleitor(fnr.getTituloEl());
            validaProgramaIntegacaoSocial(fnr.getPis());
            //validaCargo(fnr.getCargo());
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
        return true;
    }
}
