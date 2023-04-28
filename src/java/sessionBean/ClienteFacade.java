/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sessionBean;

import entidades.Cliente;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author john-
 */
@Stateless
public class ClienteFacade extends AbstractFacade<Cliente> implements ClienteFacadeLocal {

    @PersistenceContext(unitName = "Proyecto-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClienteFacade() {
        super(Cliente.class);
    }
    
}
