package com.adem.springboot.service.impl;

import java.util.List;
import java.util.Optional;

import com.adem.springboot.repository.LokasiRepository;
import com.adem.springboot.service.LokasiService;
import com.adem.springboot.entity.Lokasi;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LokasiServiceImpl implements LokasiService {

    private LokasiRepository lokasiRepository;

    @Override
    public Lokasi saveLokasi(Lokasi lokasi) {
        return lokasiRepository.save(lokasi);
    }

    @Override
    public List<Lokasi> getAllLokasi() {
        return lokasiRepository.findAll();
    }

    @Override
    public Lokasi getLokasiById(int id) {
        Optional<Lokasi> lokasi = lokasiRepository.findById(id);
        if (lokasi.isPresent()) {
            return lokasi.get();
        } else {
            throw new RuntimeException("Lokasi not found with id: " + id);
        }
    }

    @Override
    public Lokasi updateLokasi(int id, Lokasi lokasiDetails) {
        Lokasi lokasi = getLokasiById(id);
        lokasi.setNama_lokasi(lokasiDetails.getNama_lokasi());
        lokasi.setNegara(lokasiDetails.getNegara());
        lokasi.setKota(lokasiDetails.getKota());
        lokasi.setCreated_at(lokasiDetails.getCreated_at());

        return lokasiRepository.save(lokasi);
    }

    @Override
    public void deleteLokasi(int id) {
        lokasiRepository.deleteById(id);
    }
}