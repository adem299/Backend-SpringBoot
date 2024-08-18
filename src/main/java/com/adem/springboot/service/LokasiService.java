package com.adem.springboot.service;
import java.util.List;

import com.adem.springboot.entity.Lokasi;

public interface LokasiService {
    Lokasi saveLokasi(Lokasi lokasi);
    List<Lokasi> getAllLokasi();
    Lokasi getLokasiById(int id);
    Lokasi updateLokasi(int id, Lokasi lokasi);
    void deleteLokasi(int id);
}