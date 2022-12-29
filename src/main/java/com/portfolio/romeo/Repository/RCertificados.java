/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.romeo.Repository;

import com.portfolio.romeo.Entity.Certificados;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RCertificados extends JpaRepository<Certificados, Integer> {
    public Optional<Certificados> findByNombreC(String nombreC);
    
    public boolean existsByNombreC(String nombreC);
}

