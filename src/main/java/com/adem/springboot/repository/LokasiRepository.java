package com.adem.springboot.repository;

import com.adem.springboot.entity.Lokasi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LokasiRepository extends JpaRepository<Lokasi, Integer> {
}
