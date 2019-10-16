/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import br.com.DomainMode.PostGresJPA.LoginSenha;
import br.com.DomainMode.PostGresJPA.LoginSenhaJpaController;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Keila Emy
 */
public class Aplicativo {

    public static void main(String args[]) {

        EntityManagerFactory objFactory = Persistence.createEntityManagerFactory("PostGresJPAPU");
        EntityManager manager = objFactory.createEntityManager();

        LoginSenhaJpaController jpa = new LoginSenhaJpaController(objFactory);
        List<LoginSenha> lista = jpa.findLoginSenhaEntities();
        

        LoginSenha ls = new LoginSenha();
        
        ls.setNome("leandro");
        ls.setSenha("leandro123vai");
        ls.setSenha(Criptografar.encriptografar(ls.getSenha()));
        
        
        jpa.create(ls);
        for(LoginSenha l : lista){
            System.out.println("Cod.:"+l.getId()+"Nome:"+l.getNome()+"Senha:"+l.getSenha());
        }

    }

}
