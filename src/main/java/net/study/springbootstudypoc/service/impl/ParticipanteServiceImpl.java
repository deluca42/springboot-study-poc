package net.study.springbootstudypoc.service.impl;

import net.study.springbootstudypoc.converter.ParticipanteConverter;
import net.study.springbootstudypoc.dto.ParticipanteDTO;
import net.study.springbootstudypoc.entity.Participante;
import net.study.springbootstudypoc.repository.ParticipanteRepository;
import net.study.springbootstudypoc.service.ParticipanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

// falar da anotacao @Service e padrao singleton.
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Repository;

// service layer bussiness logic
// dominio do nosso sistema falar do DDD

@Service
public class ParticipanteServiceImpl implements ParticipanteService {

    @Autowired
    private ParticipanteRepository particiapnteRepository;

    @Autowired
    private ParticipanteConverter participanteConverter;

    @Override
    public Participante consultarParticipante(ParticipanteDTO participanteDTO) {
        return null;
    }
    @Override
    public List<ParticipanteDTO> consultarTodosParticipantes() {

        List<Participante> listaDeParticipantes = (List<Participante>)particiapnteRepository.findAll();
        List<ParticipanteDTO> ListaDeParticipanteDTO = new ArrayList<>();


        for (Participante part : listaDeParticipantes){
        //    ParticipanteDTO dto = propertyConverter.convertEntityToDTO(part);
        //    ListaDeParticipanteDTO.add(dto);
        }
        return ListaDeParticipanteDTO;
    }
    @Override
    public Participante editarParticipante(ParticipanteDTO participanteDTO) {
        return null;
    }
    @Override
    public Participante desabilitarParticipante(ParticipanteDTO participanteDTO) {
        return null;
    }
    @Override
    public Participante inserirParticipante(ParticipanteDTO participanteDTO) {

        Participante part = participanteConverter.convertDTOtoEntity(participanteDTO);

        particiapnteRepository.save(part);

        return part;
    }
    // Implementação concreta consulta s1trf -> criando um singleton de consulta sistema s1trf
}
