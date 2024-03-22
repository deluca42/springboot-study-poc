package net.study.springbootstudypoc.controller;

import net.study.springbootstudypoc.dto.ParticipanteDTO;
import net.study.springbootstudypoc.entity.Participante;
import net.study.springbootstudypoc.service.ParticipanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//CONTROLLER LAYER FALAR DE LAYER ARCH
// responsabilidade > lidar com as requisicoes http


@RestController
@RequestMapping("api/v1/participante/")
public class ParticipanteController {

    @Autowired
    private ParticipanteService participanteService;


    @GetMapping("/consultarParticipante")
    public ResponseEntity<ParticipanteDTO> consultarParticipante(@RequestBody ParticipanteDTO participante){

        participanteService.consultarParticipante(participante);

        ResponseEntity<ParticipanteDTO> responseEntity = new ResponseEntity<>(participante, HttpStatusCode.valueOf(200));

        return responseEntity;
    }

    @GetMapping("/consultarTodosParticipante")
    public ResponseEntity<List<ParticipanteDTO>> consultarTodosParticipante(@RequestBody ParticipanteDTO participante){

        List<ParticipanteDTO> listaParticipantes = participanteService.consultarTodosParticipantes();

        ResponseEntity<List<ParticipanteDTO>> responseEntity = new ResponseEntity<>(listaParticipantes , HttpStatusCode.valueOf(200));

        return responseEntity;
    }


    @PostMapping("/editarParticipante")
    public ResponseEntity<ParticipanteDTO> editarParticipante(@RequestBody ParticipanteDTO participante){

        participanteService.editarParticipante(participante);

        ResponseEntity<ParticipanteDTO> responseEntity = new ResponseEntity<>(participante, HttpStatusCode.valueOf(200));

        return responseEntity;
    }

    @PostMapping("/desabilitarParticipante")
    public ResponseEntity<ParticipanteDTO>  desabilitarParticipante(@RequestBody ParticipanteDTO participante){

        participanteService.desabilitarParticipante(participante);

        ResponseEntity<ParticipanteDTO> responseEntity = new ResponseEntity<>(participante, HttpStatusCode.valueOf(200));

        return responseEntity;
    }


    @PostMapping("/inserirParticipante")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<ParticipanteDTO> inserirParticipante(@RequestBody ParticipanteDTO participante) {

        participanteService.inserirParticipante(participante);

        ResponseEntity<ParticipanteDTO> responseEntity = new ResponseEntity<>(participante, HttpStatusCode.valueOf(200));

        return responseEntity;
    }



}
