/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sessionBean;

import entidades.Venta;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author john-
 */
@Stateless
public class VentaFacade extends AbstractFacade<Venta> implements VentaFacadeLocal {

    @PersistenceContext(unitName = "Proyecto-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VentaFacade() {
        super(Venta.class);
    }
    
}
