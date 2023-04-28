/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sessionBean;

import entidades.SubCategoria;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author john-
 */
@Local
public interface SubCategoriaFacadeLocal {

    void create(SubCategoria subCategoria);

    void edit(SubCategoria subCategoria);

    void remove(SubCategoria subCategoria);

    SubCategoria find(Object id);

    List<SubCategoria> findAll();

    List<SubCategoria> findRange(int[] range);

    int count();
    
}
