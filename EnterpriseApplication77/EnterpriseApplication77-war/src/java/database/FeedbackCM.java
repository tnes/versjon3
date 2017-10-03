/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import beans.Feedback;

/**
 *
 * @author Vidar
 */
@Stateless
public class FeedbackCM {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    @PersistenceContext(unitName = "EnterpriseApplication77PU")
    private EntityManager em;
    
    public void addFeedback(Feedback feedback){
        em.persist(feedback);
    }
    
    protected EntityManager getEntityManager(){
        return em;
    }
    
    
}
