package net.study.springbootstudypoc.converter;

import net.study.springbootstudypoc.dto.ParticipanteDTO;
import net.study.springbootstudypoc.entity.Participante;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParticipanteConverterUnitTest {


    private ParticipanteConverter participanteConverter = new ParticipanteConverter();

    @Test
    public void quandoConverterParticipanteDTOParaParticipanteEntidade_enquantoCorreto(){

        // mock
        ParticipanteDTO partDTO  = new ParticipanteDTO();
        partDTO.setNome("Banco do Brasil");
        partDTO.setNomeSimplificado("BB");
        partDTO.setIspb("00000000");
        partDTO.setTipo("Banco");
        partDTO.setHabilitado(true);
        partDTO.setDnsMq("mqs01.bb.rsfn.net.br");

        //when
        Participante participante = participanteConverter.convertDTOtoEntity(partDTO);

        //entäo
        assertEquals(partDTO.getNome(), participante.getNome());
        assertEquals(partDTO.getNomeSimplificado(), participante.getNomeSimplificado());
        assertEquals(partDTO.getIspb(), participante.getIspb());
        assertEquals(partDTO.getTipo(), participante.getTipo());
        assertEquals(partDTO.getHabilitado(), participante.getHabilitado());
        assertEquals(partDTO.getDnsMq(), participante.getDnsMq());
    }
}
