package net.study.springbootstudypoc.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParticipanteDTO {

    private String nome;
    private String nomeSimplificado;
    private String tipo;
    private String ispb;
    private Boolean habilitado;
    private String dnsMq;

}
