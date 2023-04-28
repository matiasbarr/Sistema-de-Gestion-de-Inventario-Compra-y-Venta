/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sessionBean;

import entidades.CargoEmpleado;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author john-
 */
@Local
public interface CargoEmpleadoFacadeLocal {

    void create(CargoEmpleado cargoEmpleado);

    void edit(CargoEmpleado cargoEmpleado);

    void remove(CargoEmpleado cargoEmpleado);

    CargoEmpleado find(Object id);

    List<CargoEmpleado> findAll();

    List<CargoEmpleado> findRange(int[] range);

    int count();
    
}
