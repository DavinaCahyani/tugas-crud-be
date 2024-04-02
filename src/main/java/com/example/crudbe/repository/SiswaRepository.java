package com.example.crudbe.repository;

import com.example.crudbe.model.SiswaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiswaRepository extends JpaRepository<SiswaModel, Long> {
}

