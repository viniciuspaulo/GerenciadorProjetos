/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gerenciador.GENERIC;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vinicius
 */
public abstract class GenericDAO<T> extends GenericACTION implements Serializable {
    
    private Class<?> persisteGeneric;
    protected T registro;
    
    public GenericDAO(){
        try {
            this.persisteGeneric = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
            registro = (T) this.persisteGeneric.newInstance();
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(GenericDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public T getRegistro() {
        return this.registro;
    }
   
    public void setRegistro(T registro) {
        this.registro = registro;
    }

    public Class<?> getPersisteGeneric() {
        return persisteGeneric;
    }

    public void setPersisteGeneric(Class<?> persisteGeneric) {
        this.persisteGeneric = persisteGeneric;
    }

}
