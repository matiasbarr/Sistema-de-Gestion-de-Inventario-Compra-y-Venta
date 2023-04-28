/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sessionBean;

import entidades.TipoPago;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author john-
 */
@Local
public interface TipoPagoFacadeLocal {

    void create(TipoPago tipoPago);

    void edit(TipoPago tipoPago);

    void remove(TipoPago tipoPago);

    TipoPago find(Object id);

    List<TipoPago> findAll();

    List<TipoPago> findRange(int[] range);

    int count();
    
}
