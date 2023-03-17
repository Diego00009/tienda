/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda_v1.services;

import com.tienda_v1.domain.Cliente;
import java.util.List;

public interface ClienteService {
    
    //Obtiene la lista de registros de la tabla cliente
    //y lo coloca en una lista de objetos cliente
    public List<Cliente> getClientes();
    
    //Obtiene el registro de la tabla cliente
    //que tiene el idCliente pasado por el objeto cleinte
    public Cliente getCliente(Cliente cliente);
    
    //Elimina el registro de la tabla cliente
    //que tiene el idCliente pasado por el objeto cliente
    public void deleteCliente(Cliente cliente);
    
    //Si el idCliente pasado no existe o es nulo se crea
    //un registro nuevo en la tabla cliente
    //si el idCliente existe... se actualiza la informacion
    public void saveCliente(Cliente cliente);
    
}
