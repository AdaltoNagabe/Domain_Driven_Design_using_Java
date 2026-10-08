package br.com.fiap.api.controller;

import br.com.fiap.api.dao.TipoImovelDao;
import br.com.fiap.api.model.Imovel;
import br.com.fiap.api.model.TipoImovel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("tipos-imoveis")
public class TipoImovelController {

    private TipoImovelDao dao;

    public TipoImovelController(TipoImovelDao dao) {
        this.dao = dao;
    }

    @PostMapping
    public ResponseEntity<TipoImovel> cadastrar(@RequestBody TipoImovel tipo, UriComponentsBuilder builder) throws SQLException {
        dao.cadastrar(tipo);
        URI uri = builder.path("tipos-imoveis/{id}").buildAndExpand(tipo.getCodigo()).toUri();
        return ResponseEntity.created(uri).body(tipo);
    }
    @GetMapping
    public List<TipoImovel> listar() throws SQLException {
        return dao.listar();
    }

}
