package com.alura.challenguetopico.service;

import com.alura.challenguetopico.entity.Topico;
import com.alura.challenguetopico.repository.TopicoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicoService {

    private final TopicoRepository topicoRepository;

    public TopicoService(TopicoRepository topicoRepository) {
        this.topicoRepository = topicoRepository;
    }

    public List<Topico> getAllTopicos() {
        return topicoRepository.findAll();
    }

    public Optional<Topico> getTopicoById(Long id) {
        return topicoRepository.findById(id);
    }

    public Topico createTopico(Topico topico) {
        return topicoRepository.save(topico);
    }

    public Topico updateTopico(Long id, Topico topicoDetails) {
        Topico topico = topicoRepository.findById(id).orElseThrow();
        topico.setMensaje(topicoDetails.getMensaje());
        topico.setNombreCurso(topicoDetails.getNombreCurso());
        topico.setTitulo(topicoDetails.getTitulo());
        return topicoRepository.save(topico);
    }

    public void deleteTopico(Long id) {
        topicoRepository.deleteById(id);
    }
}