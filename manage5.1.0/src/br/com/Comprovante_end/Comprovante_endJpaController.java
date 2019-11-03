/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Comprovante_end;

import br.com.Comprovante_end.exceptions.NonexistentEntityException;
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
 * @author igorb
 */
public class Comprovante_endJpaController implements Serializable {

    public Comprovante_endJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Comprovante_end comprovante_end) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(comprovante_end);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Comprovante_end comprovante_end) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            comprovante_end = em.merge(comprovante_end);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = comprovante_end.getId();
                if (findComprovante_end(id) == null) {
                    throw new NonexistentEntityException("The comprovante_end with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Comprovante_end comprovante_end;
            try {
                comprovante_end = em.getReference(Comprovante_end.class, id);
                comprovante_end.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The comprovante_end with id " + id + " no longer exists.", enfe);
            }
            em.remove(comprovante_end);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Comprovante_end> findComprovante_endEntities() {
        return findComprovante_endEntities(true, -1, -1);
    }

    public List<Comprovante_end> findComprovante_endEntities(int maxResults, int firstResult) {
        return findComprovante_endEntities(false, maxResults, firstResult);
    }

    private List<Comprovante_end> findComprovante_endEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Comprovante_end.class));
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

    public Comprovante_end findComprovante_end(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Comprovante_end.class, id);
        } finally {
            em.close();
        }
    }

    public int getComprovante_endCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Comprovante_end> rt = cq.from(Comprovante_end.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
