/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FunçõesTeste;

/**
 *
 * @author igorb
 */
public class FunçõesProduto {

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

    public boolean validaDescriçãoProduto(String descr) throws Exception {

        if (descr.length() < 101) {
            return true;
        } else {
            throw new Exception("Descrição invalida");
        }
    }

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

    //Método para valida RG
    public boolean validaRG(String rg) {
        String RG = "\\d\\d.\\d\\d\\d.\\d\\d\\d-\\d";
        if (rg.matches(".*\\D^.^-.*")) {
            return false;
        } else if (rg.length() < 12 || rg.length() > 12) {
            return false;
        } else if (!rg.matches(RG)) {
            return false;
        }
        return true;
    }

    //Método para validar Carteira de Trabalho
    public boolean validaCarteiraDeTrabalho(String carteiraDeTrabalho) {
        String Cdt = "\\d\\d\\d\\d\\d\\d\\d-\\d\\d\\d\\d\\d";
        if (carteiraDeTrabalho.matches(".*\\D^-.*")) {
            return false;
        } else if (carteiraDeTrabalho.length() < 13 || carteiraDeTrabalho.length() > 13) {
            return false;
        } else if (!carteiraDeTrabalho.matches(Cdt)) {
            return false;
        }
        return true;
    }

    //Método para validar Logradouro
    public boolean validaLogradouro(String logradouro) {
        if (logradouro.length() < 2 || logradouro.length() > 50) {
            return false;
        } else if (logradouro.matches(".*[!|@|#|$|%|&|*|(|)|=|+|;].*")) {
            return false;
        }
        return true;
    }

    //Método para validar Complemento
    public boolean validaComplemento(String complemento) {
        if (complemento.length() > 50) {
            return false;
        } else if (complemento.matches(".*[!|@|#|$|%|&|*|(|)|=|+|;].*")) {
            return false;
        }
        return true;
    }

    //Método para validar Cidade
    public boolean validaCidade(String cidade) {
        if (cidade.length() < 2 || cidade.length() > 50) {
            return false;
        } else if (cidade.matches(".*[!|@|#|$|%|&|*|(|)|=|+|;].*")) {
            return false;
        }
        return true;
    }

    //Método para validar Titulo de Eleitor
    public boolean validaTituloDeEleitor(String tituloDeEleitor) {
        String Tde = "\\d\\d\\d\\d \\d\\d\\d\\d \\d\\d\\d\\d";
        if (tituloDeEleitor.length() < 14 || tituloDeEleitor.length() > 14) {
            return false;
        } else if (tituloDeEleitor.matches(".*\\D^-.*")) {
            return false;
        } else if (!tituloDeEleitor.matches(Tde)) {
            return false;
        }
        return true;
    }

    //Método para validar Cartão do Programa Integração Social (PIS)
    public boolean validaProgramIntegacaoSocila(String programaIntegracaoSocial) {
        String Pis = "\\d\\d.\\d\\d\\d\\d\\d.\\d\\d-\\d.\\d";
        if (programaIntegracaoSocial.length() < 14 || programaIntegracaoSocial.length() > 14) {
            return false;
        } else if (programaIntegracaoSocial.matches(".*\\D^-.*")) {
            return false;
        } else if (!programaIntegracaoSocial.matches(Pis)) {
            return false;
        }
        return true;
    }

}
