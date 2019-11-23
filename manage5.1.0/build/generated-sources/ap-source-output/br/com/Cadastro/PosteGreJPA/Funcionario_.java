package br.com.Cadastro.PosteGreJPA;

import br.com.Comprovante_end.Comprovante_end;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-22T23:16:06")
@StaticMetamodel(Funcionario.class)
public class Funcionario_ { 

    public static volatile SingularAttribute<Funcionario, String> dataNasc;
    public static volatile SingularAttribute<Funcionario, String> rg;
    public static volatile SingularAttribute<Funcionario, String> cpf;
    public static volatile SingularAttribute<Funcionario, String> nome;
    public static volatile SingularAttribute<Funcionario, Integer> id;
    public static volatile SingularAttribute<Funcionario, String> pis;
    public static volatile SingularAttribute<Funcionario, Comprovante_end> comprovante_end;
    public static volatile SingularAttribute<Funcionario, String> cartTrab;
    public static volatile SingularAttribute<Funcionario, String> tituloEl;

}