package com.alura.challenge_foro_hub.dto;

import com.alura.challenge_foro_hub.modelo.Curso;
import com.alura.challenge_foro_hub.modelo.Topico;

public record DatosListaTopico(Long id, String titulo, String mensaje, Curso curso) {
    public DatosListaTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getCurso());
    }
}
