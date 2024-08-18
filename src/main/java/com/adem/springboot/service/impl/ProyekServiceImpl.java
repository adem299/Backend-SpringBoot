package com.adem.springboot.service.impl;

import org.springframework.stereotype.Service;

import com.adem.springboot.entity.Lokasi;
import com.adem.springboot.entity.Proyek;
import com.adem.springboot.repository.ProyekRepository;
import com.adem.springboot.service.ProyekService;

import java.util.List;
import java.util.Optional;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProyekServiceImpl implements ProyekService {

    private ProyekRepository proyekRepository;
    

    @Override
    public Proyek saveProyek(Proyek proyek) {
        return proyekRepository.save(proyek);
    }

    @Override
    public List<Proyek> getAllProyek() {
        return proyekRepository.findAll();
    }

    @Override
    public Proyek getProyekById(int id) {
        Optional<Proyek> proyek = proyekRepository.findById(id);
        if (proyek.isPresent()) {
            return proyek.get();
        } else {
            throw new RuntimeException("Proyek not found with id: " + id);
        }
    }

    @Override
    public Proyek updateProyek(int id, Proyek proyekDetails) {
        Proyek proyek = getProyekById(id);
        proyek.setNama_proyek(proyekDetails.getNama_proyek());
        proyek.setClient(proyekDetails.getClient());
        proyek.setTgl_mulai(proyekDetails.getTgl_mulai());
        proyek.setTgl_selesai(proyekDetails.getTgl_selesai());
        proyek.setPimpimnan_proyek(proyekDetails.getPimpimnan_proyek());
        proyek.setKeterangan(proyekDetails.getKeterangan());
        proyek.setCreated_at(proyekDetails.getCreated_at());
        proyek.setLokasi(proyekDetails.getLokasi());
        return proyekRepository.save(proyek);
    }

    @Override
    public void deleteProyek(int id) {
        proyekRepository.deleteById(id);
    }
}
