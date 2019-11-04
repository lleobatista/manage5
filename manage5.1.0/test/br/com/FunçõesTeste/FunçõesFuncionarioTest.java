/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FunçõesTeste;

import br.com.Cadastro.PosteGreJPA.Funcionario;
import br.com.Comprovante_end.Comprovante_end;
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
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void nomeValido(){
        func.setNome("Caio Kera Iwamoto");
        
        try {
            assertTrue(fp.validaNome(func.getNome()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Nome Inválido");
        }
  
    }
    
    @Test
    public void nomeVazio(){
        func.setNome("");
        
        try {
            assertTrue(fp.validaNome(func.getNome()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Nome Inválido");
        }
        
    }
    
    @Test
    public void nomeMenor(){
        func.setNome("Caio");
        
        try {
            assertTrue(fp.validaNome(func.getNome()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Nome Inválido");
        }
        
    }
    
    @Test
    public void nomeMaior(){
        func.setNome("Caio Kera Iwamoto Leandro Cesar do Nascimento Bertoldi Keila Emy Taniguchi");
        
        try {
            assertTrue(fp.validaNome(func.getNome()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Nome Inválido");
        }
        
    }
    
    @Test
    public void nomeSimbolo(){
        func.setNome("Caio Kera@%");
        
        try {
            assertTrue(fp.validaNome(func.getNome()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Nome Inválido");
        }
        
    }
    
    @Test
    public void nomeNumero(){
        func.setNome("Caio Kera55");
        
        try {
            assertTrue(fp.validaNome(func.getNome()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Nome Inválido");
        }
        
    }
    
    @Test
    public void rgValido(){
        func.setRg("10.192.874-7");
        
        try {
            assertTrue(fp.validaRG(func.getRg()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "RG Inválido");
        }
        
    }
    
    @Test
    public void rgVazio(){
        func.setRg("");
        
        try {
            assertTrue(fp.validaRG(func.getRg()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "RG Inválido");
        }
        
    }
    
    @Test
    public void rgMenor(){
        func.setRg("21");
        
        try {
            assertTrue(fp.validaRG(func.getRg()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "RG Inválido");
        }
        
    }
    
    @Test
    public void rgMaior(){
        func.setRg("01.908.098.09-1");
        
        try {
            assertTrue(fp.validaRG(func.getRg()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "RG Inválido");
        }
        
    }
    
    @Test
    public void rgForaEstrutura(){
        func.setRg("098.0980.0-908-9");
        
        try {
            assertTrue(fp.validaRG(func.getRg()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "RG Inválido");
        }
        
    }
    
    @Test
    public void rgSimbolo(){
        func.setRg("39.%%*.@02-&");
        
        try {
            assertTrue(fp.validaRG(func.getRg()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "RG Inválido");
        }
        
    }
    
    @Test
    public void rgLetra(){
        func.setRg("Aa.192.874-7");
        
        try {
            assertTrue(fp.validaRG(func.getRg()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "RG Inválido");
        }
        
    }
    
    @Test
    public void cpfValido(){
        func.setCpf("456.685.987-41");
        
        try {
            assertTrue(fp.validaCPF(func.getCpf()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "CPF Inválido");
        }
        
    }
    
    @Test
    public void cpfVazio(){
        func.setCpf("");
        
        try {
            assertTrue(fp.validaCPF(func.getCpf()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "CPF Inválido");
        }
        
    }
    
    @Test
    public void cpfMenor(){
        func.setCpf("45.");
        
        try {
            assertTrue(fp.validaCPF(func.getCpf()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "CPF Inválido");
        }
        
    }
    
    @Test
    public void cpfMaior(){
        func.setCpf("451.214.698-145");
        
        try {
            assertTrue(fp.validaCPF(func.getCpf()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "CPF Inválido");
        }
        
    }
    
    @Test
    public void cpfForaEstrutura(){
        func.setCpf("1125.41282.654-8");
        
        try {
            assertTrue(fp.validaCPF(func.getCpf()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "CPF Inválido");
        }
        
    }
    
    @Test
    public void cpfSimbolo(){
        func.setCpf("456.685.987-@#");
        
        try {
            assertTrue(fp.validaCPF(func.getCpf()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "CPF Inválido");
        }
        
    }
    
    @Test
    public void cpfLetra(){
        func.setCpf("456.685.987-Aa");
        
        try {
            assertTrue(fp.validaCPF(func.getCpf()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "CPF Inválido");
        }
        
    }
    
    @Test
    public void dataNascimentoValida(){
        func.setDataNasc("27/10/2019");
        
        try {
            assertTrue(fp.validaDataDeNascimento(func.getDataNasc()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Data de Nascimento Inválida");
        }
        
    }
    
    @Test
    public void dataNascimentoVazio(){
        func.setDataNasc("");
        
        try {
            assertTrue(fp.validaDataDeNascimento(func.getDataNasc()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Data de Nascimento Inválida");
        }
        
    }
    
    @Test
    public void dataNascimentoMenor(){
        func.setDataNasc("20/29");
        
        try {
            assertTrue(fp.validaDataDeNascimento(func.getDataNasc()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Data de Nascimento Inválida");
        }
        
    }
    
    @Test
    public void dataNascimentoMaior(){
        func.setDataNasc("27/10/201909");
        
        try {
            assertTrue(fp.validaDataDeNascimento(func.getDataNasc()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Data de Nascimento Inválida");
        }
        
    }
    
    @Test
    public void dataNascimentoForaEstrutura(){
        func.setDataNasc("9898/0/89");
        
        try {
            assertTrue(fp.validaDataDeNascimento(func.getDataNasc()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Data de Nascimento Inválida");
        }
        
    }
    
    @Test
    public void dataNascimentoSimbolo(){
        func.setDataNasc("&*/)0/@#$6");
        
        try {
            assertTrue(fp.validaDataDeNascimento(func.getDataNasc()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Data de Nascimento Inválida");
        }
        
    }
    
    @Test
    public void dataNascimentoLetra(){
        func.setDataNasc("8k/al/o3jo");
        
        try {
            assertTrue(fp.validaDataDeNascimento(func.getDataNasc()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Data de Nascimento Inválida");
        }
        
    }
    
    @Test
    public void carteiraDeTrabalhoValida(){
        func.setCartTrab("1234567-12345");
        
        try {
            assertTrue(fp.validaCarteiraDeTrabalho(func.getCartTrab()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Carteira de Trabalho Inválida");
        }
        
    }
    
    @Test
    public void carteiraDeTrabalhoVazio(){
        func.setCartTrab("");
        
        try {
            assertTrue(fp.validaCarteiraDeTrabalho(func.getCartTrab()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Carteira de Trabalho Inválida");
        }
        
    }
    
    @Test
    public void carteiraDeTrabalhoMenor(){
        func.setCartTrab("1234567-1234");
        
        try {
            assertTrue(fp.validaCarteiraDeTrabalho(func.getCartTrab()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Carteira de Trabalho Inválida");
        }
        
    }
    
    @Test
    public void carteiraDeTrabalhoMaior(){
        func.setCartTrab("1234567-123456");
        
        try {
            assertTrue(fp.validaCarteiraDeTrabalho(func.getCartTrab()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Carteira de Trabalho Inválida");
        }
        
    }
    
    @Test
    public void carteiraDeTrabalhoForaEstrutura(){
        func.setCartTrab("1234-5423");
        
        try {
            assertTrue(fp.validaCarteiraDeTrabalho(func.getCartTrab()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Carteira de Trabalho Inválida");
        }
        
    }
    
    @Test
    public void carteiraDeTrabalhoSimbolo(){
        func.setCartTrab("1234567-123@#");
        
        try {
            assertTrue(fp.validaCarteiraDeTrabalho(func.getCartTrab()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Carteira de Trabalho Inválida");
        }
        
    }
    
    @Test
    public void carteiraDeTrabalhoLetra(){
        func.setCartTrab("1234567-123aA");
        
        try {
            assertTrue(fp.validaCarteiraDeTrabalho(func.getCartTrab()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Carteira de Trabalho Inválida");
        }
        
    }
    
    @Test
    public void cepValido(){
        compEnd.setCep("86300-000");
        
        try {
            assertTrue(fp.validaCEP(compEnd.getCep()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "CEP Inválido");
        }
        
    }
    
    @Test
    public void cepVazio(){
        compEnd.setCep("");
        
        try {
            assertTrue(fp.validaCEP(compEnd.getCep()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "CEP Inválido");
        }
        
    }
    
    @Test
    public void cepMenor(){
        compEnd.setCep("9873");
        
        try {
            assertTrue(fp.validaCEP(compEnd.getCep()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "CEP Inválido");
        }
        
    }
    
    @Test
    public void cepMaior(){
        compEnd.setCep("90822-32908");
        
        try {
            assertTrue(fp.validaCEP(compEnd.getCep()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "CEP Inválido");
        }
        
    }
    
    @Test
    public void cepForaEstrutura(){
        compEnd.setCep("89-3889389");
        
        try {
            assertTrue(fp.validaCEP(compEnd.getCep()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "CEP Inválido");
        }
        
    }
    
    @Test
    public void cepSimbolo(){
        compEnd.setCep("#&092-*&4");
        
        try {
            assertTrue(fp.validaCEP(compEnd.getCep()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "CEP Inválido");
        }
        
    }
    
    @Test
    public void cepLetra(){
        compEnd.setCep("jkldk-8s9");
        
        try {
            assertTrue(fp.validaCEP(compEnd.getCep()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "CEP Inválido");
        }
        
    }
    
    @Test
    public void logradouroValido(){
        compEnd.setLogradouro("Rua Piauí");
        
        try {
            assertTrue(fp.validaLogradouro(compEnd.getLogradouro()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Logradouro Inválido");
        }
        
    }
    
    @Test
    public void logradouroVazio(){
        compEnd.setLogradouro("");
        
        try {
            assertTrue(fp.validaLogradouro(compEnd.getLogradouro()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Logradouro Inválido");
        }
        
    }
    
    @Test
    public void logradouroMenor(){
        compEnd.setLogradouro("a");
        
        try {
            assertTrue(fp.validaLogradouro(compEnd.getLogradouro()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Logradouro Inválido");
        }
        
    }
    
    @Test
    public void logradouroMaior(){
        compEnd.setLogradouro("Rua Piauí Maranhão São Paulo Minas Gerais Amapá Tocantins");
        
        try {
            assertTrue(fp.validaLogradouro(compEnd.getLogradouro()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Logradouro Inválido");
        }
        
    }
    
    @Test
    public void logradouroSimbolo(){
        compEnd.setLogradouro("Rua @");
        
        try {
            assertTrue(fp.validaLogradouro(compEnd.getLogradouro()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Logradouro Inválido");
        }
        
    }
    
    @Test
    public void numeroValido(){
        compEnd.setNumero(123456);
        
        try {
            assertTrue(fp.validaNumero(compEnd.getNumero().toString()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Número Invalido");
        }
        
    }
    
    @Test
    public void numeroVazio(){
        compEnd.setNumero(0);
        
        try {
            assertTrue(fp.validaNumero(compEnd.getNumero().toString()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Número Invalido");
        }
        
    }
    
    @Test
    public void numeroMaior(){
        compEnd.setNumero(1234567);
        
        try {
            assertTrue(fp.validaNumero(compEnd.getNumero().toString()));
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
        
        try {
            assertTrue(fp.validaComplemento(compEnd.getComple()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Complemento Inválido");
        }
        
    }
    
    @Test
    public void complementoMaior(){
        compEnd.setComple("Quarto à Esquerda do Corredor da Cozinha e da Sala em Frente a Porta do Banheiro");
        
        try {
            assertTrue(fp.validaComplemento(compEnd.getComple()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Complemento Inválido");
        }
        
    }
    
    @Test
    public void complementoSimbolo(){
        compEnd.setComple("&*94nk *&((*$&  895 &&$89");
        
        try {
            assertTrue(fp.validaComplemento(compEnd.getComple()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Complemento Inválido");
        }
        
    }
    
    @Test
    public void bairroValido(){
        compEnd.setBairro("Centro");
        
        try {
            assertTrue(fp.validaBairro(compEnd.getBairro()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Bairro Inválido");
        }
        
    }
    
    @Test
    public void bairroVazio(){
        compEnd.setBairro("");
        
        try {
            assertTrue(fp.validaBairro(compEnd.getBairro()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Bairro Inválido");
        }
        
    }
    
    @Test
    public void bairroMenor(){
        compEnd.setBairro("a");
        
        try {
            assertTrue(fp.validaBairro(compEnd.getBairro()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Bairro Inválido");
        }
        
    }
    
    @Test
    public void bairroMaior(){
        compEnd.setBairro("Centro Jardim Bela Vista Congonhas Jardim Veneza Macuco Vila Recreio");
        
        try {
            assertTrue(fp.validaBairro(compEnd.getBairro()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Bairro Inválido");
        }
        
    }
    
    @Test
    public void bairroSimbolo(){
        compEnd.setBairro("Centro@#");
        
        try {
            assertTrue(fp.validaBairro(compEnd.getBairro()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Bairro Inválido");
        }
        
    }
    
    @Test
    public void cidadeValido(){
        compEnd.setCidade("Cornélio Procópio");
        
        try {
            assertTrue(fp.validaCidade(compEnd.getCidade()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Cidade Inválida");
        }
        
    }
    
    @Test
    public void cidadeVazio(){
        compEnd.setCidade("");
        
        try {
            assertTrue(fp.validaCidade(compEnd.getCidade()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Cidade Inválida");
        }
        
    }
    
    @Test
    public void cidadeMenor(){
        compEnd.setCidade("a");
        
        try {
            assertTrue(fp.validaCidade(compEnd.getCidade()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Cidade Inválida");
        }
        
    }
    
    @Test
    public void cidadeMaior(){
        compEnd.setCidade("Cornélio Procópio São Paulo Rio de Janeiro São José do Rio Santo do Jordão");
        
        try {
            assertTrue(fp.validaCidade(compEnd.getCidade()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Cidade Inválida");
        }
        
    }
    
    @Test
    public void cidadeSimbolo(){
        compEnd.setCidade("Corn&lio P387copie**(");
        
        try {
            assertTrue(fp.validaCidade(compEnd.getCidade()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Cidade Inválida");
        }
        
    }
    
    @Test
    public void estadoValido(){
        compEnd.setEstado("SP");
        
        try {
            assertTrue(fp.validaEstado(compEnd.getEstado()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Estado Inválido");
        }
        
    }
    
    @Test
    public void estadoVazio(){
        compEnd.setEstado("");
        
        try {
            assertTrue(fp.validaEstado(compEnd.getEstado()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Estado Inválido");
        }
        
    }
    
    @Test
    public void estadoMenor(){
        compEnd.setEstado("S");
        
        try {
            assertTrue(fp.validaEstado(compEnd.getEstado()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Estado Inválido");
        }
        
    }
    
    @Test
    public void estadoMaior(){
        compEnd.setEstado("SPA");
        
        try {
            assertTrue(fp.validaEstado(compEnd.getEstado()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Estado Inválido");
        }
        
    }
    
    @Test
    public void estadoNumero(){
        compEnd.setEstado("S3");
        
        try {
            assertTrue(fp.validaEstado(compEnd.getEstado()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Estado Inválido");
        }
        
    }
    
    @Test
    public void estadoSimbolo(){
        compEnd.setEstado("@#");
        
        try {
            assertTrue(fp.validaEstado(compEnd.getEstado()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Estado Inválido");
        }
        
    }
    
    @Test
    public void tituloDeEleitorValido(){
        func.setTituloEl("2467 9848 9820");
        
        try {
            assertTrue(fp.validaTituloDeEleitor(func.getTituloEl()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Título de Eleitor Inválido");
        }
        
    }
    
    @Test
    public void tituloDeEleitorVazio(){
        func.setTituloEl("");
        
        try {
            assertTrue(fp.validaTituloDeEleitor(func.getTituloEl()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Título de Eleitor Inválido");
        }
        
    }
    
    @Test
    public void tituloDeEleitorMenor(){
        func.setTituloEl("8276 8973 82");
        
        try {
            assertTrue(fp.validaTituloDeEleitor(func.getTituloEl()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Título de Eleitor Inválido");
        }
        
    }
    
    @Test
    public void tituloDeEleitorMaior(){
        func.setTituloEl("7987 8534 8938 8829");
        
        try {
            assertTrue(fp.validaTituloDeEleitor(func.getTituloEl()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Título de Eleitor Inválido");
        }
        
    }
    
    @Test
    public void tituloDeEleitorForaEstrutura(){
        func.setTituloEl("894889388948");
        
        try {
            assertTrue(fp.validaTituloDeEleitor(func.getTituloEl()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Título de Eleitor Inválido");
        }
        
    }
    
    @Test
    public void tituloDeEleitorSimbolo(){
        func.setTituloEl("%87[ {98} 3*%&");
        
        try {
            assertTrue(fp.validaTituloDeEleitor(func.getTituloEl()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Título de Eleitor Inválido");
        }
        
    }
    
    @Test
    public void tituloDeEleitorLetra(){
        func.setTituloEl("jkas 2899 lsa3");
        
        try {
            assertTrue(fp.validaTituloDeEleitor(func.getTituloEl()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Título de Eleitor Inválido");
        }
        
    }
    
    @Test
    public void cartaoDeProgramaIntegracaoSocialValido(){
        func.setPis("09.67827.27-82");
        
        try {
            assertTrue(fp.validaProgramIntegacaoSocial(func.getPis()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Cartão do Programa Integração Social (PIS) Inválido");
        }
        
    }
    
    @Test
    public void cartaoDeProgramaIntegracaoSocialVazio(){
        func.setPis("");
        
        try {
            assertTrue(fp.validaProgramIntegacaoSocial(func.getPis()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Cartão do Programa Integração Social (PIS) Inválido");
        }
        
    }
    
    @Test
    public void cartaoDeProgramaIntegracaoSocialMenor(){
        func.setPis("89.2897");
        
        try {
            assertTrue(fp.validaProgramIntegacaoSocial(func.getPis()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Cartão do Programa Integração Social (PIS) Inválido");
        }
        
    }
    
    @Test
    public void cartaoDeProgramaIntegracaoSocialMaior(){
        func.setPis("87233.82-29892");
        
        try {
            assertTrue(fp.validaProgramIntegacaoSocial(func.getPis()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Cartão do Programa Integração Social (PIS) Inválido");
        }
        
    }
    
    @Test
    public void cartaoDeProgramaIntegracaoSocialForaEstrutura(){
        func.setPis("91872788935673");
        
        try {
            assertTrue(fp.validaProgramIntegacaoSocial(func.getPis()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Cartão do Programa Integração Social (PIS) Inválido");
        }
        
    }
    
    @Test
    public void cartaoDeProgramaIntegracaoSocialSimbolo(){
        func.setPis("*(.*9%&(*.!@-{7");
        
        try {
            assertTrue(fp.validaProgramIntegacaoSocial(func.getPis()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Cartão do Programa Integração Social (PIS) Inválido");
        }
        
    }
    
    @Test
    public void cartaoDeProgramaIntegracaoSocialLetra(){
        func.setPis("lk.a8j3n.sh-sl");
        
        try {
            assertTrue(fp.validaProgramIntegacaoSocial(func.getPis()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Cartão do Programa Integração Social (PIS) Inválido");
        }
        
    }
}
