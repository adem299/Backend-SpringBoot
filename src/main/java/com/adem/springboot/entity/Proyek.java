package com.adem.springboot.entity;

import java.sql.Date;
import java.sql.Timestamp;

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
@Table(name = "proyek")
public class Proyek {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nama_proyek", nullable = false)
    private String nama_proyek;
    @Column(name = "client", nullable = false)
    private String client;
    @Column(name = "tgl_mulai", nullable = false)
    private Date tgl_mulai;
    @Column(name = "tgl_selesai", nullable = false)
    private Date tgl_selesai;
    @Column(name = "pimpimnan_proyek", nullable = false)
    private String pimpimnan_proyek;
    @Column(name = "keterangan", nullable = false)
    private String keterangan;
    @Column(name = "created_at", nullable = false)
    private Timestamp created_at;
    @ManyToOne
    @JoinColumn(name = "lokasi_id")
    private Lokasi lokasi;

}
