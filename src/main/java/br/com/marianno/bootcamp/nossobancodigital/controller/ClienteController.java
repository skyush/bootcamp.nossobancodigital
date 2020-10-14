package br.com.marianno.bootcamp.nossobancodigital.controller;

import br.com.marianno.bootcamp.nossobancodigital.dto.ClienteDto;
import br.com.marianno.bootcamp.nossobancodigital.entity.Cliente;
import br.com.marianno.bootcamp.nossobancodigital.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.net.URI;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteController(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    @PostMapping
    public ResponseEntity<ClienteDto> salvar(@RequestBody @Valid ClienteDto clienteDto) {
        Cliente cliente = clienteRepository.save(clienteDto.toEntity());
        return ResponseEntity.created(URI.create("/cliente/" + cliente.getId())).body(ClienteDto.toDto(cliente));
    }

}
