/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FunçõesTeste;

import br.com.Cadastro.PosteGreJPA.Funcionario;
import br.com.Comprovante_end.Comprovante_end;
import javax.swing.JOptionPane;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author leandrocnb
 */
public class FunçõesFuncionarioTest {
    
    Funcionario func;
    Comprovante_end compEnd;
    TestesFuncionais fp;
    
    public FunçõesFuncionarioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        func = new Funcionario();
        compEnd = new Comprovante_end();
        fp = new TestesFuncionais();
        compEnd.setBairro("Centro");
        compEnd.setCep("86300-000");
        compEnd.setCidade("Cornélio Procópio");
        compEnd.setComple("Apartamento 03");
        compEnd.setEstado("PR");
        compEnd.setLogradouro("Rua Piauí");
        compEnd.setNumero(78);             
        func.setCartTrab("1234567-12345");
        func.setComprovante_end(compEnd);
        func.setCpf("456.685.987-41");
        func.setDataNasc("27/10/2019");
        func.setNome("Caio Kera Iwamoto");
        func.setPis("09.67827.27-82");
        func.setRg("10.192.874-7");
        func.setTituloEl("2467 9848 9820");
        func.setCargo("Gerente");
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void cargoValido(){
        func.setCargo("Gerente");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Cargo Inválido");
        }
  
    }
   
    @Test
    public void cargoMenor(){
        func.setCargo("Gari");
        
        try {
            assertTrue(fp.validaCargo(func.getCargo()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Cargo Inválido");
        }
  
    }
    
    @Test
    public void cargoMaior(){
        func.setCargo("CozinheiroCozinheiroCozinheiroCozinheiroCozinheiroCozinheiroCozinheiroCozinheiroCozinheiroCozinheiroCozinheiroCozinheiroCozinheiroCozinheiroCozinheiroCozinheiro");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Cargo Inválido");
        }
  
    }
    
    @Test
    public void cargoSímbolo(){
        func.setCargo("Gerente!");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Cargo Inválido");
        }
  
    }
    
    @Test
    public void cargoNumero(){
        func.setCargo("Gerente2");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Cargo Inválido");
        }
  
    }
    
    @Test
    public void nomeValido(){
        func.setNome("Caio Kera Iwamoto");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Nome Inválido");
        }
  
    }
    
    @Test
    public void nomeVazio(){
        func.setNome("");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Nome Inválido");
        }
        
    }
    
    @Test
    public void nomeMenor(){
        func.setNome("Caio");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Nome Inválido");
        }
        
    }
    
    @Test
    public void nomeMaior(){
        func.setNome("Caio Kera Iwamoto Leandro Cesar do Nascimento Bertoldi Keila Emy Taniguchi");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Nome Inválido");
        }
        
    }
    
    @Test
    public void nomeSimbolo(){
        func.setNome("Caio Kera@%");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Nome Inválido");
        }
        
    }
    
    @Test
    public void nomeNumero(){
        func.setNome("Caio Kera55");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Nome Inválido");
        }
        
    }
    
    @Test
    public void rgValido(){
        func.setRg("10.192.874-7");
       
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "RG Inválido");
        }
        
    }
    
    @Test
    public void rgVazio(){
        func.setRg("");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "RG Inválido");
        }
        
    }
    
    @Test
    public void rgMenor(){
        func.setRg("21");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "RG Inválido");
        }
        
    }
    
    @Test
    public void rgMaior(){
        func.setRg("01.908.098.09-1");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "RG Inválido");
        }
        
    }
    
    @Test
    public void rgForaEstrutura(){
        func.setRg("098.0980.0-908-9");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "RG Inválido");
        }
        
    }
    
    @Test
    public void rgSimbolo(){
        func.setRg("39.%%*.@02-&");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "RG Inválido");
        }
        
    }
    
    @Test
    public void rgLetra(){
        func.setRg("Aa.192.874-7");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "RG Inválido");
        }
        
    }
    
    @Test
    public void cpfValido(){
        func.setCpf("456.685.987-41");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "CPF Inválido");
        }
        
    }
    
    @Test
    public void cpfVazio(){
        func.setCpf("");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "CPF Inválido");
        }
        
    }
    
    @Test
    public void cpfMenor(){
        func.setCpf("45.");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "CPF Inválido");
        }
        
    }
    
    @Test
    public void cpfMaior(){
        func.setCpf("451.214.698-145");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "CPF Inválido");
        }
        
    }
    
    @Test
    public void cpfForaEstrutura(){
        func.setCpf("1125.41282.654-8");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "CPF Inválido");
        }
        
    }
    
    @Test
    public void cpfSimbolo(){
        func.setCpf("456.685.987-@#");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "CPF Inválido");
        }
        
    }
    
    @Test
    public void cpfLetra(){
        func.setCpf("456.685.987-Aa");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "CPF Inválido");
        }
        
    }
    
    @Test
    public void dataNascimentoValida(){
        func.setDataNasc("27/10/2019");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Data de Nascimento Inválida");
        }
        
    }
    
    @Test
    public void dataNascimentoVazio(){
        func.setDataNasc("");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Data de Nascimento Inválida");
        }
        
    }
    
    @Test
    public void dataNascimentoMenor(){
        func.setDataNasc("20/29");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Data de Nascimento Inválida");
        }
        
    }
    
    @Test
    public void dataNascimentoMaior(){
        func.setDataNasc("27/10/201909");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Data de Nascimento Inválida");
        }
        
    }
    
    @Test
    public void dataNascimentoForaEstrutura(){
        func.setDataNasc("9898/0/89");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Data de Nascimento Inválida");
        }
        
    }
    
    @Test
    public void dataNascimentoSimbolo(){
        func.setDataNasc("&*/)0/@#$6");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Data de Nascimento Inválida");
        }
        
    }
    
    @Test
    public void dataNascimentoLetra(){
        func.setDataNasc("8k/al/o3jo");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Data de Nascimento Inválida");
        }
        
    }
    
    @Test
    public void carteiraDeTrabalhoValida(){
        func.setCartTrab("1234567-12345");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Carteira de Trabalho Inválida");
        }
        
    }
    
    @Test
    public void carteiraDeTrabalhoVazio(){
        func.setCartTrab("");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Carteira de Trabalho Inválida");
        }
        
    }
    
    @Test
    public void carteiraDeTrabalhoMenor(){
        func.setCartTrab("1234567-1234");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Carteira de Trabalho Inválida");
        }
        
    }
    
    @Test
    public void carteiraDeTrabalhoMaior(){
        func.setCartTrab("1234567-123456");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Carteira de Trabalho Inválida");
        }
        
    }
    
    @Test
    public void carteiraDeTrabalhoForaEstrutura(){
        func.setCartTrab("1234-5423");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Carteira de Trabalho Inválida");
        }
        
    }
    
    @Test
    public void carteiraDeTrabalhoSimbolo(){
        func.setCartTrab("1234567-123@#");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Carteira de Trabalho Inválida");
        }
        
    }
    
    @Test
    public void carteiraDeTrabalhoLetra(){
        func.setCartTrab("1234567-123aA");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Carteira de Trabalho Inválida");
        }
        
    }
    
    @Test
    public void cepValido(){
        compEnd.setCep("86300-000");
        func.setComprovante_end(compEnd);
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "CEP Inválido");
        }
        
    }
    
    @Test
    public void cepVazio(){
        compEnd.setCep("");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "CEP Inválido");
        }
        
    }
    
    @Test
    public void cepMenor(){
        compEnd.setCep("9873");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "CEP Inválido");
        }
        
    }
    
    @Test
    public void cepMaior(){
        compEnd.setCep("90822-32908");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "CEP Inválido");
        }
        
    }
    
    @Test
    public void cepForaEstrutura(){
        compEnd.setCep("89-3889389");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "CEP Inválido");
        }
        
    }
    
    @Test
    public void cepSimbolo(){
        compEnd.setCep("#&092-*&4");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "CEP Inválido");
        }
        
    }
    
    @Test
    public void cepLetra(){
        compEnd.setCep("jkldk-8s9");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "CEP Inválido");
        }
        
    }
    
    @Test
    public void logradouroValido(){
        compEnd.setLogradouro("Rua Piauí");
        func.setComprovante_end(compEnd);
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Logradouro Inválido");
        }
        
    }
    
    @Test
    public void logradouroVazio(){
        compEnd.setLogradouro("");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Logradouro Inválido");
        }
        
    }
    
    @Test
    public void logradouroMenor(){
        compEnd.setLogradouro("a");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Logradouro Inválido");
        }
        
    }
    
    @Test
    public void logradouroMaior(){
        compEnd.setLogradouro("Rua Piauí Maranhão São Paulo Minas Gerais Amapá Tocantins");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Logradouro Inválido");
        }
        
    }
    
    @Test
    public void logradouroSimbolo(){
        compEnd.setLogradouro("Rua @");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Logradouro Inválido");
        }
        
    }
    
    @Test
    public void numeroValido(){
        compEnd.setNumero(123456);
        func.setComprovante_end(compEnd);
        try {
            assertTrue(fp.validaNumero(func.getComprovante_end().getNumero().toString()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Número Invalido");
        }
        
    }
    
    @Test
    public void numeroVazio(){
        
        try {
            assertTrue(fp.validaNumero(""));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Número Invalido");
        }
    }
    
    @Test
    public void numeroMaior(){
        compEnd.setNumero(1234567);
        func.setComprovante_end(compEnd);
        try {
            assertTrue(fp.validaNumero(func.getComprovante_end().getNumero().toString()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Número Invalido");
        }
        
    }
    
    @Test
    public void numeroMenor(){
        compEnd.setNumero(-6);
        func.setComprovante_end(compEnd);
        try {
            assertTrue(fp.validaNumero(func.getComprovante_end().getNumero().toString()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Número Invalido");
        }
        
    }
    
    @Test
    public void numeroSimbolo(){
                
        try {
            assertTrue(fp.validaNumero("1@#"));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Número Invalido");
        }
        //voltar aqui
    }
    
    @Test
    public void numeroLetra(){
                
        try {
            assertTrue(fp.validaNumero("1Aa"));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Número Invalido");
        }
        
    }
    
    @Test
    public void complementoValido(){
        compEnd.setComple("Apartamento 03");
        func.setComprovante_end(compEnd);
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Complemento Inválido");
        }
        
    }
    
    @Test
    public void complementoMaior(){
        compEnd.setComple("Quarto à Esquerda do Corredor da Cozinha e da Sala em Frente a Porta do Banheiro");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Complemento Inválido");
        }
        
    }
    
    @Test
    public void complementoSimbolo(){
        compEnd.setComple("&*94nk *&((*$&  895 &&$89");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Complemento Inválido");
        }
        
    }
    
    @Test
    public void bairroValido(){
        compEnd.setBairro("Centro");
        func.setComprovante_end(compEnd);
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Bairro Inválido");
        }
        
    }
    
    @Test
    public void bairroVazio(){
        compEnd.setBairro("");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Bairro Inválido");
        }
        
    }
    
    @Test
    public void bairroMenor(){
        compEnd.setBairro("a");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Bairro Inválido");
        }
        
    }
    
    @Test
    public void bairroMaior(){
        compEnd.setBairro("Centro Jardim Bela Vista Congonhas Jardim Veneza Macuco Vila Recreio");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Bairro Inválido");
        }
        
    }
    
    @Test
    public void bairroSimbolo(){
        compEnd.setBairro("Centro@#");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Bairro Inválido");
        }
        
    }
    
    @Test
    public void cidadeValido(){
        compEnd.setCidade("Cornélio Procópio");
        func.setComprovante_end(compEnd);
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Cidade Inválida");
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }
    
    @Test
    public void cidadeVazio(){
        compEnd.setCidade("");
        func.setComprovante_end(compEnd);
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Cidade Inválida");
        }
        
    }
    
    @Test
    public void cidadeMenor(){
        compEnd.setCidade("a");
        func.setComprovante_end(compEnd);
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Cidade Inválida");
        }
        
    }
    
    @Test
    public void cidadeMaior(){
        compEnd.setCidade("Cornélio Procópio São Paulo Rio de Janeiro São José do Rio Santo do Jordão");
        func.setComprovante_end(compEnd);
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Cidade Inválida");
        }
        
    }
    
    @Test
    public void cidadeSimbolo(){
        compEnd.setCidade("Corn&lio P387copie**(");
        func.setComprovante_end(compEnd);
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Cidade Inválida");
        }
        
    }
    
    @Test
    public void estadoValido(){
        compEnd.setEstado("SP");
        func.setComprovante_end(compEnd);
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Estado Inválido");
        }
        
    }
    
    @Test
    public void estadoVazio(){
        compEnd.setEstado("");
        func.setComprovante_end(compEnd);
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Estado Inválido");
        }
        
    }
    
    @Test
    public void estadoMenor(){
        compEnd.setEstado("S");
        func.setComprovante_end(compEnd);
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Estado Inválido");
        }
        
    }
    
    @Test
    public void estadoMaior(){
        compEnd.setEstado("SPA");
        func.setComprovante_end(compEnd);
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Estado Inválido");
        }
        
    }
    
    @Test
    public void estadoNumero(){
        compEnd.setEstado("S3");
        func.setComprovante_end(compEnd);
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Estado Inválido");
        }
        
    }
    
    @Test
    public void estadoSimbolo(){
        compEnd.setEstado("@#");
        func.setComprovante_end(compEnd);
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Estado Inválido");
        }
        
    }
    
    @Test
    public void tituloDeEleitorValido(){
        func.setTituloEl("2467 9848 9820");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Título de Eleitor Inválido");
        }
        
    }
    
    @Test
    public void tituloDeEleitorVazio(){
        func.setTituloEl("");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Título de Eleitor Inválido");
        }
        
    }
    
    @Test
    public void tituloDeEleitorMenor(){
        func.setTituloEl("8276 8973 82");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Título de Eleitor Inválido");
        }
        
    }
    
    @Test
    public void tituloDeEleitorMaior(){
        func.setTituloEl("7987 8534 8938 8829");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Título de Eleitor Inválido");
        }
        
    }
    
    @Test
    public void tituloDeEleitorForaEstrutura(){
        func.setTituloEl("894889388948");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Título de Eleitor Inválido");
        }
        
    }
    
    @Test
    public void tituloDeEleitorSimbolo(){
        func.setTituloEl("%87[ {98} 3*%&");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Título de Eleitor Inválido");
        }
        
    }
    
    @Test
    public void tituloDeEleitorLetra(){
        func.setTituloEl("jkas 2899 lsa3");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Título de Eleitor Inválido");
        }
        
    }
    
    @Test
    public void cartaoDeProgramaIntegracaoSocialValido(){
        func.setPis("09.67827.27-82");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Cartão do Programa Integração Social (PIS) Inválido");
        }
        
    }
    
    @Test
    public void cartaoDeProgramaIntegracaoSocialVazio(){
        func.setPis("");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Cartão do Programa Integração Social (PIS) Inválido");
        }
        
    }
    
    @Test
    public void cartaoDeProgramaIntegracaoSocialMenor(){
        func.setPis("89.2897");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Cartão do Programa Integração Social (PIS) Inválido");
        }
        
    }
    
    @Test
    public void cartaoDeProgramaIntegracaoSocialMaior(){
        func.setPis("87233.82-29892");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Cartão do Programa Integração Social (PIS) Inválido");
        }
        
    }
    
    @Test
    public void cartaoDeProgramaIntegracaoSocialForaEstrutura(){
        func.setPis("91872788935673");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Cartão do Programa Integração Social (PIS) Inválido");
        }
        
    }
    
    @Test
    public void cartaoDeProgramaIntegracaoSocialSimbolo(){
        func.setPis("*(.*9%&(*.!@-{7");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Cartão do Programa Integração Social (PIS) Inválido");
        }
        
    }
    
    @Test
    public void cartaoDeProgramaIntegracaoSocialLetra(){
        func.setPis("lk.a8j3n.sh-sl");
        
        try {
            assertTrue(fp.validaFuncionario(func));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Cartão do Programa Integração Social (PIS) Inválido");
        }
        
    }/*
    @Test
    public void validaFuncionario() throws Exception {
        compEnd.setBairro("Centro");
        compEnd.setCep("86300-000");
        compEnd.setCidade("Cornélio Procópio");
        compEnd.setComple("Apartamento 03");
        compEnd.setEstado("PR");
        compEnd.setLogradouro("Rua Piauí");
        compEnd.setNumero(78);             
        func.setCartTrab("1234567-12345");
       // func.setComprovante_end(compEnd);
       // func.setCpf("456.685.987-41");
       // func.setDataNasc("27/10/2019");
       // func.setNome("Caio Kera Iwamoto");
        //func.setPis("09.67827.27-82");
        //func.setRg("10.192.874-7");
       // func.setTituloEl("2467 9848 9820");
        assertTrue(fp.validaFuncionario(func));
    }*/
}
