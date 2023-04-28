/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sessionBean;

import entidades.TipoEstadoVenta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author john-
 */
@Local
public interface TipoEstadoVentaFacadeLocal {

    void create(TipoEstadoVenta tipoEstadoVenta);

    void edit(TipoEstadoVenta tipoEstadoVenta);

    void remove(TipoEstadoVenta tipoEstadoVenta);

    TipoEstadoVenta find(Object id);

    List<TipoEstadoVenta> findAll();

    List<TipoEstadoVenta> findRange(int[] range);

    int count();
    
}
