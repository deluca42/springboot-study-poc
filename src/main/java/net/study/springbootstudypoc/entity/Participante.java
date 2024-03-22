package net.study.springbootstudypoc.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "participante_table")
@Getter
@Setter
@NoArgsConstructor
public class Participante {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String nomeSimplificado;
    private String tipo;
    private String ispb;
    private Boolean habilitado;
    private String dnsMq;

}
