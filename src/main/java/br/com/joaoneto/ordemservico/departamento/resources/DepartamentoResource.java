package br.com.joaoneto.ordemservico.departamento.resources;

import br.com.joaoneto.ordemservico.departamento.domain.Departamento;
import br.com.joaoneto.ordemservico.departamento.services.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/departamentos")
public class DepartamentoResource {
    @Autowired
    private DepartamentoService departamentoService;
    @PostMapping
    public ResponseEntity<Departamento> criarDepartamento(@RequestBody Departamento departamento){

      var novodepartamento = departamentoService.criarDepartamento(departamento);
        return new ResponseEntity<>(novodepartamento, HttpStatus.CREATED);


        }
    @GetMapping
    public ResponseEntity<List<Departamento>> listarDepartamento(){
        var departamentos = departamentoService.listarDepartamento();
        return new ResponseEntity<>(departamentos, HttpStatus.OK);


    }
    @DeleteMapping("/{idDepartamento}")
    public ResponseEntity<Void> deletarDepartamento(@PathVariable Integer idDepartamento){
        departamentoService.deletarDepartamento(idDepartamento);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
}
