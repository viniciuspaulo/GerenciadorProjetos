/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gerenciador.CDI;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author vinicius
 */
@ApplicationScoped
public class DatabaseProducer {
     
    @PersistenceContext
    private EntityManager em;
    
    @Produces
    @RequestScoped
    public EntityManager em() {
        return em;
    }
    
    public void dispose(@Disposes EntityManager em) {
        // em.close();
    }
}
