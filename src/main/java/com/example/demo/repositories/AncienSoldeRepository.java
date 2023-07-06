package com.example.demo.repositories;
import java.util.List;
import java.util.Optional;
import java.time.LocalDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.AncienSolde;
@Repository
public interface AncienSoldeRepository extends JpaRepository<AncienSolde, String>{
}
