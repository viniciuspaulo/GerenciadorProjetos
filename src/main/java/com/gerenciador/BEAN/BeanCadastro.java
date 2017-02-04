/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gerenciador.BEAN;

import com.gerenciador.GENERIC.GenericACTION;
import com.gerenciador.MODEL.Tblempresas;
import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author vinicius
 */
@Named
@ViewScoped
public class BeanCadastro extends GenericACTION implements Serializable {

    private Tblempresas empresa = new Tblempresas();

    public void cadastrarEmpresa() {
        if(empresa.getNome() == null){
            mensagemErro("Problemas", "Digite um nome para a empresa !!");
        }else{
            empresa.setAtivo(true);
            //cadastrar(empresa);
            executarJavaScript("cadastro(1)");
        }
    }
   
    public Tblempresas getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Tblempresas empresa) {
        this.empresa = empresa;
    }

}
