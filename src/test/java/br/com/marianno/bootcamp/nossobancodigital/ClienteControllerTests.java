package br.com.marianno.bootcamp.nossobancodigital;

import br.com.marianno.bootcamp.nossobancodigital.controller.ClienteController;
import br.com.marianno.bootcamp.nossobancodigital.dto.ClienteDto;
import br.com.marianno.bootcamp.nossobancodigital.repository.ClienteRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteControllerTests {
    @Mock
    ClienteRepository clienteRepository;

    @InjectMocks
    ClienteController clienteController;

    @Test
    public void deveSalvar() {
        final ClienteDto clienteDto = new ClienteDto();
        clienteDto.setNome("Paulo");
        clienteDto.setSobrenome("Marianno");
        clienteDto.setEmail("sky.marianno@gmail.com");
        clienteDto.setNascimento("29/03/1988");
        clienteDto.setCpf("111.111.111-11");

        ResponseEntity<ClienteDto> responseEntity = clienteController.salvar(clienteDto);
        assertNotNull(responseEntity);
    }


    @Test
    public void deveSalvarException() {
}
}