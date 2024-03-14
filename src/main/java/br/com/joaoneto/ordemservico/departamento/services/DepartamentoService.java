package br.com.joaoneto.ordemservico.departamento.services;

import br.com.joaoneto.ordemservico.departamento.domain.Departamento;
import br.com.joaoneto.ordemservico.departamento.repositories.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service

public class DepartamentoService {
    @Autowired
    private DepartamentoRepository departamentoRepository;

    public Departamento criarDepartamento(Departamento departamento){
        return departamentoRepository.save(departamento);
    }
    public List<Departamento> listarDepartamento(){
        return departamentoRepository.findAll();
    }

    public Optional<Departamento> buscarDepartamento(Integer idDepartamento){
        return departamentoRepository.findById(idDepartamento);

    }
    public void deletarDepartamento(Integer idDepartamento){
        departamentoRepository.deleteById(idDepartamento);
    }
}


