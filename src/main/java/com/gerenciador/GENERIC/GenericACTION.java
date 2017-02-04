/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gerenciador.GENERIC;


import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;
import org.primefaces.context.RequestContext;

/**
 *
 * @author vinicius
 */
public class GenericACTION implements Serializable {
    
    private @Resource
    UserTransaction tx;
   
    @Inject
    protected EntityManager em;
    
    
    public void mensagemErro(String titulo, String mensagem) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, titulo, mensagem));
    }
    
    public void executarJavaScript(String funcao){
        RequestContext.getCurrentInstance().execute(funcao);
    }
    
    protected void cadastrar(Object obj){
         try {
             tx.begin();
             em.persist(obj);
             tx.commit();
         } catch (IllegalStateException | SecurityException | HeuristicRollbackException | HeuristicMixedException | RollbackException | SystemException | NotSupportedException ex) {
             Logger.getLogger(GenericDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
   }

}
