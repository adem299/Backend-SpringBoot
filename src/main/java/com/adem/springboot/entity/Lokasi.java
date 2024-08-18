package com.adem.springboot.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "lokasi")
public class Lokasi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nama_lokasi", nullable = false)
    private String nama_lokasi;
    @Column(name = "kota", nullable = false)
    private String kota;
    @Column(name = "provinsi", nullable = false)
    private String provinsi;
    @Column(name = "negara", nullable = false)
    private String negara;

    private LocalDateTime created_at;
    
}
