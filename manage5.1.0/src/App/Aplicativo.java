/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import br.com.Cadastro.PosteGreJPA.FuncionarioJpaController;
import br.com.Comprovante_end.Comprovante_endJpaController;
import br.com.DomainMode.PostGresJPA.LoginSenha;
import br.com.DomainMode.PostGresJPA.LoginSenhaJpaController;
import br.com.Produtos.ProdutosJpaController;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import br.com.Cadastro.PosteGreJPA.Funcionario;
import br.com.Comprovante_end.Comprovante_end;
import br.com.Produtos.Produtos;

/**
 *
 * @author Keila Emy
 */
public class Aplicativo {
    
    EntityManagerFactory objFactory = Persistence.createEntityManagerFactory("manage5PU");
    EntityManager manager = objFactory.createEntityManager();
    LoginSenhaJpaController loginJpa = new LoginSenhaJpaController(objFactory);
    FuncionarioJpaController funcJpa = new FuncionarioJpaController(objFactory);
    ProdutosJpaController prodJpa = new ProdutosJpaController(objFactory);

    //Método validar Login com Banco de Dados
    public boolean validaLoginBD(LoginSenha login) throws Exception{
        List<LoginSenha> lista = loginJpa.findLoginSenhaEntities();
        for(LoginSenha l : lista){
            if(l.getNome().equals(login.getNome())){
                if(l.getSenha().equals(Criptografar.encriptografar(login.getSenha())))
                    return true;
            }
        }
        throw new Exception("Usuário inválido!");
    }
    
    //Metodo Lista Funcionarios
    public List<Funcionario> selectFuncionario(){
        List<Funcionario> lista = funcJpa.findFuncionarioEntities();
        return lista;
    }
    
    //Metodo Lista Produtos
    public List<Produtos> selectProduto(){
        List<Produtos> lista = prodJpa.findProdutosEntities();
        return lista;
    }
    
    //Método Cadastra Produto
    public void cadProduto(Produtos prod){
        prodJpa.create(prod);
    }
}
