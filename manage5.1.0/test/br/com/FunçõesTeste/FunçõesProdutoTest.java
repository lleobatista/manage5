/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FunçõesTeste;

import br.com.Produtos.Produtos;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author igorb
 */
public class FunçõesProdutoTest {

    Produtos pd;
    TestesFuncionais fp;

    public FunçõesProdutoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        pd = new Produtos();
        fp = new TestesFuncionais();
        
        pd.setNome("Pão");
        pd.setDescr("Pão Integral");
        pd.setQtd(1);
        pd.setPreco(2.0);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of validaNomeProduto method, of class TestesFuncionais.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void nomeValido() throws Exception {
        pd.setNome("Pao de sal com gergilim");
        assertTrue(fp.validaProduto(pd));
    }

    @Test
    public void nomeValidoMinimo() throws Exception {
        pd.setNome("Pao");

        assertTrue(fp.validaProduto(pd));
    }

    @Test
    public void nomeValidoMaximo() throws Exception {
        pd.setNome("PaoooPaoooPaoooPaoooPaoooPaoooPaoooPaoooPaoooPaooo");

        assertTrue(fp.validaProduto(pd));
    }

    @Test
    public void nomeNulo() throws Exception {
        pd.setNome("");
        try {
            assertTrue(fp.validaProduto(pd));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Nome Inválido");
        }
    }

    @Test
    public void nomePequeno() throws Exception {
        pd.setNome("la");
        try {
            assertTrue(fp.validaProduto(pd));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Nome Inválido");
        }
    }

    @Test
    public void nomeGrande() throws Exception {
        pd.setNome("Refrigerantedeváriossaboresfantacocacolaguaranásauhsauhuhsauhsauhsauas");

        try {
            assertTrue(fp.validaProduto(pd));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Nome Inválido");
        }
    }

    @Test
    public void nomeSimbolo() throws Exception {
        pd.setNome("Pao!#");
        try {
            assertTrue(fp.validaProduto(pd));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Nome Inválido");
        }
    }

    @Test
    public void nomeNumero() throws Exception {
        pd.setNome("Pao123");
        try {
            assertTrue(fp.validaProduto(pd));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Nome Inválido");
        }
    }

    @Test
    public void descrValido() throws Exception {
        pd.setDescr("Paooo 123 !#@# ");
        try {
            assertTrue(fp.validaProduto(pd));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Descrição Inválida");
        }
    }

    @Test
    public void descrInvalida() throws Exception {
        pd.setDescr("PaoooPaoooPaoooPaoooPaoooPaoooPaoooPaoooPaoooPaoooPaoooPaoooPaoooPaoooPaoooPaoooPaoooPaoooPaoooPaooo sadkjsdhsabhdkjbsad");
        try {
            assertTrue(fp.validaProduto(pd));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Descrição Inválida");
        }
    }

    @Test
    public void qtdValido(){
        pd.setQtd(12333);
        try {
            assertTrue(fp.validaProduto(pd));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Quantidade Inválida");
        }
    }

    @Test
    public void qtdValidoMinimo(){
        pd.setQtd(1);
        try {
            assertTrue(fp.validaProduto(pd));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Quantidade Inválida");
        }
    }

    @Test
    public void qtdValidoMaximo(){
        pd.setQtd(99999);
        try {
            assertTrue(fp.validaProduto(pd));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Quantidade Inválida");
        }
    }

    @Test
    public void qtdLetra(){
        try {
            assertTrue(fp.validaQuantidadeProduto("1qw23"));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Quantidade Inválida");
        }
    }

    @Test
    public void qtdSimbolo(){
        try {
            assertTrue(fp.validaQuantidadeProduto("1##23"));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Quantidade Inválida");
        }

    }

    @Test
    public void qtdEspaco(){
        String aux;
        aux = "1 123";
        try {
            assertTrue(fp.validaQuantidadeProduto(aux));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Quantidade Inválida");
        }
    }

    @Test
    public void qtdNull(){
        String aux;
        aux = "";
        try {
            assertTrue(fp.validaQuantidadeProduto(aux));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Quantidade Inválida");
        }

    }

    @Test
    public void qtdNegativo(){
        pd.setQtd(-1);
        try {
            assertTrue(fp.validaProduto(pd));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Quantidade Inválida");
        }
    }

    @Test
    public void qtdMaior(){
        pd.setQtd(100001);
        try {
            assertTrue(fp.validaProduto(pd));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Quantidade Inválida");
        }
    }
    
    @Test
    public void qtdMenor(){
        try {
            assertTrue(fp.validaQuantidadeProduto(""));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Quantidade Inválida");
        }
    }
    
    @Test
    public void qtdMaior2(){
        try {
            assertTrue(fp.validaQuantidadeProduto("akdjfhef"));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Quantidade Inválida");
        }
    }
    
    @Test
    public void precoValido(){
        pd.setPreco(246.00);
        try {
            assertTrue(fp.validaProduto(pd));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Preço Inválido");
        }
    }
    
    @Test
    public void precoInvalidoMaior2(){
        pd.setPreco(24600000.00);
        try {
            assertTrue(fp.validaProduto(pd));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Preço Inválido");
        }
    }

    @Test
    public void precoValidoMaior(){
        pd.setPreco(1000000.00);
        try {
            assertTrue(fp.validaProduto(pd));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Preço Inválido");
        }
    }

    @Test
    public void precoInvalidoLetra() throws Exception {
        try {
            assertTrue(fp.validaPreco("jksa3"));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Preço Inválido");
        }
    }

    @Test
    public void precoInvalidoSimbolo(){
        try {
            assertTrue(fp.validaPreco("%87&"));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Preço Inválido");
        }
    }
    
    @Test
    public void precoInvalidoMenor(){
        try {
            assertTrue(fp.validaPreco(""));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Preço Inválido");
        }
    }

    @Test
    public void precoInvalidoEspaço(){
        try {
            assertTrue(fp.validaPreco("123234 123231.98"));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Preço Inválido");
        }
    }

    @Test
    public void precoInvalidoNegativo() throws Exception {
        pd.setPreco(-2.00);
        try {
            assertTrue(fp.validaProduto(pd));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Preço Inválido");
        }
    }

    @Test
    public void precoInvalidoMaior() throws Exception {
        pd.setPreco(1000001.00);
        try {
            assertTrue(fp.validaProduto(pd));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Preço Inválido");
        }
    }
}
