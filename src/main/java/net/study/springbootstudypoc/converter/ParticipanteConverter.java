package net.study.springbootstudypoc.converter;

import net.study.springbootstudypoc.dto.ParticipanteDTO;
import net.study.springbootstudypoc.entity.Participante;
import org.springframework.stereotype.Component;

@Component
public class ParticipanteConverter {

    public Participante convertDTOtoEntity(ParticipanteDTO participanteDTO){

        Participante part  = new Participante();
        part.setNome(participanteDTO.getNome());
        part.setNomeSimplificado(participanteDTO.getNomeSimplificado());
        part.setIspb(participanteDTO.getIspb());
        part.setTipo(participanteDTO.getTipo());
        part.setHabilitado(participanteDTO.getHabilitado());
        part.setDnsMq(participanteDTO.getDnsMq());

        return part;
    }
}
