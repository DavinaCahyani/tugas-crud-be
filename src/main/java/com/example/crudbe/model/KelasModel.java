package com.example.crudbe.model;

import javax.persistence.*;

@Entity
@Table(name = "data_kelas")
public class KelasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // untuk MySQL
    private Long id;

    @Column(name = "nama_kelas")
    private  String nama_kelas;
    @Column(name = "nama_jurusan")
    private String nama_jurusan;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNama_kelas() {
        return nama_kelas;
    }
    public void setNama_kelas(String nama_kelas) {
        this.nama_kelas = nama_kelas;
    }

    public String getNama_jurusan() {
        return nama_jurusan;
    }
    public void setNama_jurusan(String nama_jurusan) {
        this.nama_jurusan = nama_jurusan;
    }
}

