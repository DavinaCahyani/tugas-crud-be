package com.example.crudbe.repository;

import com.example.crudbe.model.MapelModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MapelRepository extends JpaRepository<MapelModel, Long> {
}

