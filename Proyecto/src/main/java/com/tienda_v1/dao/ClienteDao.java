package com.tienda_v1.dao;

import com.tienda_v1.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteDao extends JpaRepository<Cliente,Long> {
    
}
