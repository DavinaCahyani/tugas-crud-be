package com.example.crudbe.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "data_guru")
public class GuruModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // untuk MySQL
    private Long id;

    @ManyToOne
    @JoinColumn(name = "mapel_id")
    private MapelModel mapelModel;

    public MapelModel getMapelModel() {
        return mapelModel;
    }

    public void setMapelModel(MapelModel mapelModel) {
        this.mapelModel = mapelModel;
    }

    @Column(name = "nama")
    private String nama;

    @Column(name = "alamat")
    private String alamat;

    @Column(name = "tanggal_lahir")
    private Date tanggalLahir;

    @Column(name = "jenis_kelamin")
    private String jenisKelamin;

    @Column(name = "no_telepon")
    private String noTelepon;

    @Column(name = "email")
    private String email;

    @Column(name = "jabatan")
    private String jabatan;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

}
