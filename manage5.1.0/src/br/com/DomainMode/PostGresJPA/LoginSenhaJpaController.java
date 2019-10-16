/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DomainMode.PostGresJPA;

import br.com.DomainMode.PostGresJPA.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Keila Emy
 */
public class LoginSenhaJpaController implements Serializable {

    public LoginSenhaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(LoginSenha loginSenha) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(loginSenha);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(LoginSenha loginSenha) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            loginSenha = em.merge(loginSenha);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = loginSenha.getId();
                if (findLoginSenha(id) == null) {
                    throw new NonexistentEntityException("The loginSenha with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            LoginSenha loginSenha;
            try {
                loginSenha = em.getReference(LoginSenha.class, id);
                loginSenha.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The loginSenha with id " + id + " no longer exists.", enfe);
            }
            em.remove(loginSenha);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<LoginSenha> findLoginSenhaEntities() {
        return findLoginSenhaEntities(true, -1, -1);
    }

    public List<LoginSenha> findLoginSenhaEntities(int maxResults, int firstResult) {
        return findLoginSenhaEntities(false, maxResults, firstResult);
    }

    private List<LoginSenha> findLoginSenhaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(LoginSenha.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public LoginSenha findLoginSenha(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(LoginSenha.class, id);
        } finally {
            em.close();
        }
    }

    public int getLoginSenhaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<LoginSenha> rt = cq.from(LoginSenha.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
