/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import beans.Product;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Vidar
 */
@Stateless
public class ProductCM {

<<<<<<< Updated upstream
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    @PersistenceContext(unitName = "EnterpriseApplication77PU")
    private EntityManager em;
    
    public void addProduct(Product product){
        em.persist(product);
    }
=======
    @PersistenceContext(unitName = "EnterpriseApplication77PU")
    private EntityManager em;

    public void createProduct(Product product) {
        em.persist(product);
    }

    public void find(long id) {
        em.find(Product.class, id);
    }
    
    public void deleteProduct(Product product) {
        em.remove(product);
    }
    
    public void updateProduct(Product product) {
        em.refresh(product);
    }

>>>>>>> Stashed changes
}
