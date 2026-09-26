package br.com.fiap.api.controller;

import br.com.fiap.api.dao.ImovelDao;
import br.com.fiap.api.exception.EntidadeNaoEncontradaException;
import br.com.fiap.api.model.Imovel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.RequestPredicates;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("imoveis")
public class ImovelController {

    private ImovelDao dao;

    public ImovelController(ImovelDao dao){
        this.dao = dao;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> atualizar(@PathVariable int id,@RequestBody Imovel imovel) throws SQLException, EntidadeNaoEncontradaException {
        imovel.setCodigo(id);
        dao.atualizar(imovel);
        return ResponseEntity.ok().build(); //Retorna o status 200 OK
    }

    @GetMapping("/{id}")
    public ResponseEntity<Imovel> buscar(@PathVariable int id) throws SQLException, EntidadeNaoEncontradaException {
        Imovel imovel = dao.pesquisarPorId(id);
        return ResponseEntity.ok(imovel); //Retorna o imovel com o status HTTP 200 OK
    }

    @GetMapping
    public List<Imovel> listar() throws SQLException{
        return dao.listar();
    }

    //@GetMapping("/{id}")
    //public ResponseEntity<Imovel> buscar(@PathVariable int id) throws SQLException {
    //    Imovel imovel = dao.buscar(id);
    //    return ResponseEntity.ok(imovel);
    //}

    @PostMapping
    public ResponseEntity<Imovel>cadastrar(@RequestBody Imovel imovel,
                                           UriComponentsBuilder uriBuilder) throws SQLException{

        dao.cadastrar(imovel);

        URI uri = uriBuilder.path("/imoveis/{id}")
                .buildAndExpand(imovel.getCodigo())
                .toUri();

        return ResponseEntity.created(uri).body(imovel);
    }



}
