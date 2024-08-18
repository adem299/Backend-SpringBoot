package com.adem.springboot.repository;

import com.adem.springboot.entity.Proyek;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProyekRepository extends JpaRepository<Proyek, Integer> {
}