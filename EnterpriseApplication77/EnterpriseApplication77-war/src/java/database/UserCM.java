/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import beans.User;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Vidar
 */
@Stateless
public class UserCM {

<<<<<<< HEAD
    //@PersistenceContext(unitName = "EnterpriseApplication77PU")
    private EntityManager em;
    
    protected EntityManager getEntityManager() {
        return em;
   }
    
    public void storeUser(User user) {
        em.persist(user);
    }
    
    public User findUser(String username) {
        User foundUser = em.find(User.class, username);
        return foundUser;
    }
    
    public boolean isValidLogin(String username, String password) {
       return true;
    }
=======
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    @PersistenceContext(unitName = "EnterpriseApplication77PU")
    private EntityManager em;
    
    public void addUser(User user){
        em.persist(user);
    }
>>>>>>> 2ee972a9d27c0937ad52ee0d0a7f8eb189c31823
}
