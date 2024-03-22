package net.study.springbootstudypoc.service;


import net.study.springbootstudypoc.dto.ParticipanteDTO;
import net.study.springbootstudypoc.entity.Participante;
import java.util.List;

public interface ParticipanteService {
    List<ParticipanteDTO> consultarTodosParticipantes();
    Participante consultarParticipante(ParticipanteDTO participanteDTO);
    Participante inserirParticipante(ParticipanteDTO participanteDTO);
    Participante editarParticipante(ParticipanteDTO participanteDTO);
    Participante desabilitarParticipante(ParticipanteDTO participanteDTO);

}
