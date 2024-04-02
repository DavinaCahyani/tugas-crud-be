package com.example.crudbe.service;

import com.example.crudbe.model.GuruModel;
import com.example.crudbe.repository.GuruRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GuruService {
    @Autowired
    private GuruRepository guruRepository;
    public List<GuruModel> getAllData() {
        return guruRepository.findAll();
    }

    // untuk getById
    public Optional<GuruModel> getById(Long id) {
        return guruRepository.findById(id);
    }

    // untuk Create Data
    public GuruModel createData(GuruModel guruModel) {
        return guruRepository.save(guruModel);
    }

    // tambah data getById
    public GuruModel updateData(Long id,GuruModel updatedGuru) {
        Optional<GuruModel> exiting = guruRepository.findById(id);
        if (exiting.isPresent()) {
            GuruModel existingGuru = exiting.get();
            existingGuru.setNama(updatedGuru.getNama());
            existingGuru.setEmail(updatedGuru.getEmail());
            existingGuru.setJabatan(updatedGuru.getJabatan());
            existingGuru.setAlamat(updatedGuru.getAlamat());
            existingGuru.setTanggalLahir(updatedGuru.getTanggalLahir());
            existingGuru.setNoTelepon(updatedGuru.getNoTelepon());
            existingGuru.setJenisKelamin(updatedGuru.getJenisKelamin());
            existingGuru.setMapelModel(updatedGuru.getMapelModel());
            return guruRepository.save(existingGuru);
        } else {
            throw new IllegalArgumentException("Id guru" + " tidak di temukan");
        }
    }
    // untuk delete
    public void deleteData(Long id) {
        Optional<GuruModel> hapusGuru = guruRepository.findById(id);
        if (hapusGuru.isPresent()) {
            guruRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("Guru dengan id = " + id + " ,tidak ada!!!");
        }
    }
}

