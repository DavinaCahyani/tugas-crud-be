package com.example.crudbe.model;

import javax.persistence.*;

@Entity
@Table(name = "mapel")
public class MapelModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // untuk MySQL
    private Long id;

    @Column(name = "nama_mapel")
    private String namaMapel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaMapel() {
        return namaMapel;
    }

    public void setNamaMapel(String namaMapel) {
        this.namaMapel = namaMapel;
    }
}
