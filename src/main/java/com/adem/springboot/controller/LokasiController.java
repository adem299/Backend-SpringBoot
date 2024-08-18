package com.adem.springboot.controller;

import lombok.AllArgsConstructor;
import com.adem.springboot.entity.Lokasi;
import com.adem.springboot.service.LokasiService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/lokasi")
public class LokasiController {

    private LokasiService lokasiService;

    @PostMapping
    public ResponseEntity<Lokasi> addLokasi(@RequestBody Lokasi lokasi) {
        Lokasi savedLokasi = lokasiService.saveLokasi(lokasi);
        return new ResponseEntity<>(savedLokasi, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Lokasi>> getAllLokasi() {
        List<Lokasi> lokasis = lokasiService.getAllLokasi();
        return new ResponseEntity<>(lokasis, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Lokasi> getLokasiById(@PathVariable int id) {
        Lokasi lokasi = lokasiService.getLokasiById(id);
        return new ResponseEntity<>(lokasi, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Lokasi> updateLokasi(@PathVariable("id") int id, @RequestBody Lokasi lokasi) {
        lokasi.setId(id);
        Lokasi updatedLokasi = lokasiService.updateLokasi(id, lokasi);
        return new ResponseEntity<>(updatedLokasi, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteLokasi(@PathVariable("id") int id) {
        lokasiService.deleteLokasi(id);
        return new ResponseEntity<>("Lokasi successfully deleted!", HttpStatus.OK);
    }
}
