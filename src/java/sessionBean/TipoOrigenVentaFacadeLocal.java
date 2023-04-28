/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sessionBean;

import entidades.TipoOrigenVenta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author john-
 */
@Local
public interface TipoOrigenVentaFacadeLocal {

    void create(TipoOrigenVenta tipoOrigenVenta);

    void edit(TipoOrigenVenta tipoOrigenVenta);

    void remove(TipoOrigenVenta tipoOrigenVenta);

    TipoOrigenVenta find(Object id);

    List<TipoOrigenVenta> findAll();

    List<TipoOrigenVenta> findRange(int[] range);

    int count();
    
}
