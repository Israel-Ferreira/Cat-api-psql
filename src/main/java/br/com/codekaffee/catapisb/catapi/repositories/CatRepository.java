package br.com.codekaffee.catapisb.catapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.codekaffee.catapisb.catapi.models.Cat;

/**
 * CatRepository
 */

@Repository
public interface CatRepository extends JpaRepository<Cat, Long>{
    Cat findCatById(Long id);
}