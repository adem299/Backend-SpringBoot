package com.adem.springboot.service;
import java.util.List;

import com.adem.springboot.entity.Proyek;

public interface ProyekService {
    Proyek saveProyek(Proyek proyek);
    List<Proyek> getAllProyek();
    Proyek getProyekById(int id);
    Proyek updateProyek(int id, Proyek proyek);
    void deleteProyek(int id);
}