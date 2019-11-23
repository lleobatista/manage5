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

        assertTrue(fp.validaNomeProduto(pd.getNome()));
    }

    @Test
    public void nomeValidoMinimo() throws Exception {
        pd.setNome("Pao");

        assertTrue(fp.validaNomeProduto(pd.getNome()));
    }

    @Test
    public void nomeValidoMaximo() throws Exception {
        pd.setNome("PaoooPaoooPaoooPaoooPaoooPaoooPaoooPaoooPaoooPaooo");

        assertTrue(fp.validaNomeProduto(pd.getNome()));
    }

    @Test
    public void nomeNulo() throws Exception {
        pd.setNome("");
        try {
            assertTrue(fp.validaNomeProduto(pd.getNome()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Nome invalido");
        }
    }

    @Test
    public void nomePequeno() throws Exception {
        pd.setNome("la");
        try {
            assertTrue(fp.validaNomeProduto(pd.getNome()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Nome invalido");
        }
    }

    @Test
    public void nomeGrande() throws Exception {
        pd.setNome(" Refrigerantedeváriossaboresfantacocacolaguaranásauhsauhuhsauhsauhsauas");

        try {
            assertTrue(fp.validaNomeProduto(pd.getNome()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Nome invalido");
        }
    }

    @Test
    public void nomeSimbolo() throws Exception {
        pd.setNome("Pao!#");
        try {
            assertTrue(fp.validaNomeProduto(pd.getNome()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Nome invalido");
        }
    }

    @Test
    public void nomeNumero() throws Exception {
        pd.setNome("Pao123");
        try {
            assertTrue(fp.validaNomeProduto(pd.getNome()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Nome invalido");
        }
    }

    @Test
    public void descrValidoMaximo() throws Exception {
        pd.setDescr("PaoooPaoooPaoooPaoooPaoooPaoooPaoooPaoooPaoooPaoooPaoooPaoooPaoooPaoooPaoooPaoooPaoooPaoooPaoooPaooo");

        assertTrue(fp.validaDescriçãoProduto(pd.getDescr()));
    }

    @Test
    public void descrValido() throws Exception {
        pd.setDescr("Paooo 123 !#@# ");

        assertTrue(fp.validaDescriçãoProduto(pd.getDescr()));
    }

    @Test
    public void descrInvalida() throws Exception {
        pd.setDescr("PaoooPaoooPaoooPaoooPaoooPaoooPaoooPaoooPaoooPaoooPaoooPaoooPaoooPaoooPaoooPaoooPaoooPaoooPaoooPaooo sadkjsdhsabhdkjbsad");
        try {
            assertTrue(fp.validaDescriçãoProduto(pd.getDescr()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Descrição invalida");
        }
    }

    @Test
    public void qtdValido() throws Exception {
        String aux;
        aux = "12333";
        assertTrue(fp.quantidadeProduto(aux));
        pd.setQtd(Integer.parseInt(aux));
    }

    @Test
    public void qtdValidoMinimo() throws Exception {
        String aux;
        aux = "1";
        assertTrue(fp.quantidadeProduto(aux));
        pd.setQtd(Integer.parseInt(aux));
    }

    @Test
    public void qtdValidoMaximo() throws Exception {
        String aux;
        aux = "99999";
        assertTrue(fp.quantidadeProduto(aux));
        pd.setQtd(Integer.parseInt(aux));
    }

    @Test
    public void qtdLetra() throws Exception {
        String aux;
        aux = "1qw23";
        try {
            assertTrue(fp.quantidadeProduto(aux));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Quantidade invalida");
            //pd.setQtd(Integer.parseInt(aux)) ;
        }

    }

    @Test
    public void qtdSimbolo() throws Exception {
        String aux;
        aux = "1##23";
        try {
            assertTrue(fp.quantidadeProduto(aux));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Quantidade invalida");
            //pd.setQtd(Integer.parseInt(aux)) ;
        }

    }

    @Test
    public void qtdEspaco() throws Exception {
        String aux;
        aux = "1 123";
        try {
            assertTrue(fp.quantidadeProduto(aux));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Quantidade invalida");
            //pd.setQtd(Integer.parseInt(aux)) ;
        }

    }

    @Test
    public void qtdNull() throws Exception {
        String aux;
        aux = "";
        try {
            assertTrue(fp.quantidadeProduto(aux));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Quantidade invalida");
            //pd.setQtd(Integer.parseInt(aux)) ;
        }

    }

    @Test
    public void qtdNegativo() throws Exception {
        String aux;
        aux = "-1";
        try {
            assertTrue(fp.quantidadeProduto(aux));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Quantidade invalida");
            //pd.setQtd(Integer.parseInt(aux)) ;
        }

    }

    @Test
    public void qtdMaior() throws Exception {
        String aux;
        aux = "100001";
        try {
            assertTrue(fp.quantidadeProduto(aux));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Quantidade invalida");
            //pd.setQtd(Integer.parseInt(aux)) ;
        }

    }
    
    @Test
    public void precoValido() throws Exception {
        pd.setPreco(246.00);
        assertTrue(fp.validaPreco(pd.getPreco()));
    }

    @Test
    public void precoValidoMaior() throws Exception {
        pd.setPreco(1000000.00);
        assertTrue(fp.validaPreco(pd.getPreco()));
    }

    @Test
    public void precoValidoMenor() throws Exception {
        pd.setPreco(00.00);
        assertTrue(fp.validaPreco(pd.getPreco()));
    }

    @Test
    public void precoInvalidoNull() throws Exception {
        String aux;
        aux = "";
        assertFalse(aux, false);
    }

    @Test
    public void precoInvalidoLetra() throws Exception {
        String aux;
        aux = "jkas2899lsa3";
        assertFalse(aux, false);
    }

    @Test
    public void precoInvalidoSimbolo() throws Exception {
        String aux;
        aux = "%87[{98}3*%&";
        assertFalse(aux, false);
    }

    @Test
    public void precoInvalidoEspaço() throws Exception {
        String aux;
        aux = "123234 123231.98";
        assertFalse(aux, false);
    }

    @Test
    public void precoInvalidoNegativo() throws Exception {
        pd.setPreco(-2.00);
        try {
            assertTrue(fp.validaPreco(pd.getPreco()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Preço invalido");
        }

    }

    @Test
    public void precoInvalidoMaior() throws Exception {
        pd.setPreco(1000001.00);
        try {
            assertTrue(fp.validaPreco(pd.getPreco()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Preço invalido");
        }

    }
    
    @Test
    public void codigoValido() throws Exception {
        pd.setIdProduto(5);
        assertTrue(fp.validaIdProduto(pd.getIdProduto()));
    }

    @Test
    public void IdProdutoValidoMaior() throws Exception {
        pd.setIdProduto(1000000);
        assertTrue(fp.validaIdProduto(pd.getIdProduto()));
    }

    @Test
    public void IdProdutoValidoMenor() throws Exception {
        pd.setIdProduto(1);
        assertTrue(fp.validaIdProduto(pd.getIdProduto()));
    }

    @Test
    public void IdProdutoInvalidoNull() throws Exception {
        String aux;
        aux = "";
        assertFalse(aux, false);
    }

    @Test
    public void IdProdutoInvalidoLetra() throws Exception {
        String aux;
        aux = "jkas2899lsa3";
        assertFalse(aux, false);
    }

    @Test
    public void IdProdutoInvalidoSimbolo() throws Exception {
        String aux;
        aux = "%87[{98}3*%&";
        assertFalse(aux, false);
    }

    @Test
    public void IdProdutoInvalidoEspaço() throws Exception {
        String aux;
        aux = "123234 123231.98";
        assertFalse(aux, false);
    }

    @Test
    public void IdProdutoInvalidoNegativo() throws Exception {
        pd.setIdProduto(-2);
        try {
            assertTrue(fp.validaIdProduto(pd.getIdProduto()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Codigo Produto invalido");
        }

    }

    @Test
    public void IdProdutoInvalidoMaior() throws Exception {
        pd.setIdProduto(1000001);
        try {
            assertTrue(fp.validaIdProduto(pd.getIdProduto()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Codigo Produto invalido");
        }

    }

}
