/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FunçõesTeste;

import br.com.DomainMode.PostGresJPA.LoginSenha;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author leonardo
 */
public class FunçõesLoginTest {
    
    LoginSenha login;
    TestesFuncionais fp;
    
    public FunçõesLoginTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        login = new LoginSenha();
        fp = new TestesFuncionais();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void emailValido(){
        login.setNome("leandrobertoldi@alunos.utfpr.edu.br");
        
         try {
            assertTrue(fp.validaEmail(login.getNome()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "E-mail inválido");
        }
    }
    
    @Test
    public void emailVazio(){
        login.setNome("");
        
        try {
            assertTrue(fp.validaEmail(login.getNome()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "E-mail inválido");
        }
    }
    
    @Test
    public void emailSemPonto(){
        login.setNome("lea@com");
        
        try {
            assertTrue(fp.validaEmail(login.getNome()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "E-mail inválido");
        }
    }
    
    @Test
    public void emailComEspaco(){
        login.setNome("lea @gmail.com");
        
        try {
            assertTrue(fp.validaEmail(login.getNome()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "E-mail inválido");
        }
    }
    
    @Test
    public void emailSemArroba(){
        login.setNome("leandrobertoldigmail.com.br");
        
        try {
            assertTrue(fp.validaEmail(login.getNome()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "E-mail inválido");
        }
    }
    
    @Test
    public void semCaracAntes(){
        login.setNome("@gmail.com.br");
        
        try {
            assertTrue(fp.validaEmail(login.getNome()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "E-mail inválido");
        }
    }
    
    @Test
    public void semCaracDepois(){
        login.setNome("leandrobertold@");
        
        try {
            assertTrue(fp.validaEmail(login.getNome()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "E-mail inválido");
        }
    }
    
    @Test
    public void semCaractAposPonto(){
        login.setNome("leandro@alinos.");
        
        try {
            assertTrue(fp.validaEmail(login.getNome()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "E-mail inválido");
        }
    }
    
    @Test
    public void conterSimbolosAntes(){
        login.setNome("$%#$%()leandrobertoldi@alunos.utfpr.edu.br");
        
        try {
            assertTrue(fp.validaEmail(login.getNome()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "E-mail inválido");
        }
    }
    
    @Test
    public void conterSimbolosDepois(){
        login.setNome("leandrobertoldi@alunos.!@#$&().com");
        
        try {
            assertTrue(fp.validaEmail(login.getNome()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "E-mail inválido");
        }
    }
    
    @Test
    public void menorEmail(){
        login.setNome("le@a");
        
        try {
            assertTrue(fp.validaEmail(login.getNome()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "E-mail inválido");
        }
    }
    
    @Test
    public void maiorEmail(){
        login.setNome("leandrobertoldi@alunos.utfpr.edu.br.gmail.hotmail.outlook.oul.gov.utfpr.edu.br.gmail.hotmail.outlook.oul.gov");
        
        try {
            assertTrue(fp.validaEmail(login.getNome()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "E-mail inválido");
        }
    }
    
    @Test
    public void senhaValida(){
        login.setSenha("1234E&qç");
        
        try {
            assertTrue(fp.validaSenha(login.getSenha()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Senha inválida");
        }
    }
    
    @Test
    public void senhaInavalida(){
        login.setSenha("1234");
        
        try {
            assertTrue(fp.validaSenha(login.getSenha()));
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Senha inválida");
        }
    }
    
}
