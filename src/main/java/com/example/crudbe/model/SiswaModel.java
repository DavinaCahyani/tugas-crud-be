package com.example.crudbe.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "data_siswa")
public class SiswaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // untuk MySQL
    private Long id;

    @ManyToOne
    @JoinColumn(name = "kelas_id")
    private KelasModel kelasModel;

    public KelasModel getKelasModel() {
        return kelasModel;
    }

    public void setKelasModel(KelasModel kelasModel) {
        this.kelasModel = kelasModel;
    }

    @Column(name = "nama_siswa")
    private String nama_siswa;
    @Column(name = "nisn")
    private Long nisn;

    @Column(name = "jurusan")
    private String jurusan;
    @Column(name = "alamat")
    private String alamat;
    @Column(name = "umur")
    private int umur;

    @Column(name = "jenis_kelamin")
    private String jenisKelamin;



    @Column(name = "tanggal_lahir")
    private Date tanggalLahir;




    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }
    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
    public String getNama_siswa() {
        return nama_siswa;
    }
    public void setNama_siswa(String nama_siswa) {
        this.nama_siswa = nama_siswa;
    }

    public Long getNisn() {
        return nisn;
    }
    public void setNisn(Long nisn) {
        this.nisn = nisn;
    }

    public String getJurusan() {
        return jurusan;
    }
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}


