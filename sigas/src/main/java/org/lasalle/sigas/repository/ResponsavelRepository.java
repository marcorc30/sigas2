package org.lasalle.sigas.repository;

import org.lasalle.sigas.model.Responsavel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponsavelRepository extends JpaRepository<Responsavel, Long>{

}
