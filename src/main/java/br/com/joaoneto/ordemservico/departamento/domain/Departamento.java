package br.com.joaoneto.ordemservico.departamento.domain;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "DEPARTAMENTO")
public class Departamento {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_DEPARTAMENTO")
    private Integer idDepartamento;
    @Column(name = "NOME_DEPARTAMENTO")
    private String nomeDepartamento;

    public Departamento() {
    }

    public Departamento(Integer idDepartamento, String nomeDepartamento) {
        this.idDepartamento = idDepartamento;
        this.nomeDepartamento = nomeDepartamento;
    }
}
