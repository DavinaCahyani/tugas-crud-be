package com.example.crudbe.repository;

import com.example.crudbe.model.KelasModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KelasRepository extends JpaRepository<KelasModel, Long> {
}
