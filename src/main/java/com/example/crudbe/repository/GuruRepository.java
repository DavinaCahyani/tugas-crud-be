package com.example.crudbe.repository;

import com.example.crudbe.model.GuruModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuruRepository extends JpaRepository<GuruModel, Long> {
}

