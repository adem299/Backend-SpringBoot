package com.adem.springboot.controller;

import lombok.AllArgsConstructor;

import com.adem.springboot.entity.Proyek;
import com.adem.springboot.service.ProyekService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/proyek")
public class ProyekController {

    private ProyekService proyekService;


    @PostMapping
    public ResponseEntity<Proyek> addProyek(@RequestBody Proyek proyek) {
        Proyek savedProyek = proyekService.saveProyek(proyek);
        return new ResponseEntity<>(savedProyek, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Proyek>> getAllProyek() {
        List<Proyek> proyeks = proyekService.getAllProyek();
        return new ResponseEntity<>(proyeks, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Proyek> getProyekById(@PathVariable int id) {
        Proyek proyek = proyekService.getProyekById(id);
        return new ResponseEntity<>(proyek, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Proyek> updateProyek(@PathVariable("id") int id, @RequestBody Proyek proyek) {
        proyek.setId(id);
        Proyek updatedProyek = proyekService.updateProyek(id, proyek);
        return new ResponseEntity<>(updatedProyek, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProyek(@PathVariable("id") int id) {
        proyekService.deleteProyek(id);
        return new ResponseEntity<>("Proyek successfully deleted!", HttpStatus.OK);
    }
}
