/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sessionBean;

import entidades.TipoDocumentoTransaccion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author john-
 */
@Local
public interface TipoDocumentoTransaccionFacadeLocal {

    void create(TipoDocumentoTransaccion tipoDocumentoTransaccion);

    void edit(TipoDocumentoTransaccion tipoDocumentoTransaccion);

    void remove(TipoDocumentoTransaccion tipoDocumentoTransaccion);

    TipoDocumentoTransaccion find(Object id);

    List<TipoDocumentoTransaccion> findAll();

    List<TipoDocumentoTransaccion> findRange(int[] range);

    int count();
    
}
