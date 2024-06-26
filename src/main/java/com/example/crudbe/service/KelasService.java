package com.example.crudbe.service;

import com.example.crudbe.model.KelasModel;
import com.example.crudbe.repository.KelasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KelasService {
    @Autowired
    private KelasRepository kelasRepository;
    public List<KelasModel> getAllData() {
        return kelasRepository.findAll();
    }

    // untuk getById
    public Optional<KelasModel> getById(Long id) {
        return kelasRepository.findById(id);
    }
    // untuk Create Data
    public KelasModel createData(KelasModel kelasModel) {
        return kelasRepository.save(kelasModel);
    }
    // tambah data getById
    public KelasModel updateData(Long id, KelasModel updatedKelas) {
        Optional<KelasModel> exiting = kelasRepository.findById(id);
        if (exiting.isPresent()) {
            KelasModel existingSiswa = exiting.get();
            existingSiswa.setNama_kelas(updatedKelas.getNama_kelas());
            existingSiswa.setNama_jurusan(updatedKelas.getNama_jurusan());
            return kelasRepository.save(existingSiswa);
        } else {
            throw new IllegalArgumentException("Id Kelas" + " tidak di temukan");
        }
    }
    // untuk delete
    public void deleteData(Long id) {
        Optional<KelasModel> hapusKelas = kelasRepository.findById(id);
        if (hapusKelas.isPresent()) {
            kelasRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("Kelas dengan id = " + id + " ,tidak ada!!!");
        }
    }
}

