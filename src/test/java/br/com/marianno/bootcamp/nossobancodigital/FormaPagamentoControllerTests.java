//package br.com.marianno.bootcamp.nossobancodigital;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.ArgumentMatchers.anyLong;
//import static org.mockito.ArgumentMatchers.anyString;
//import static org.mockito.Mockito.when;
//
//@SpringBootTest
//public class FormaPagamentoControllerTests {
//
//    @Mock
//    UsuarioRepository usuarioRepository;
//
//    @Mock
//    RestauranteRepository restauranteRepository;
//
//    @InjectMocks
//    FormaPagamentoController formaPagamentoController;
//
//    @BeforeEach
//    void init() {
//
//        final FormaPagamento credito_master = new FormaPagamento("Credito Master");
//        final FormaPagamento debito_master = new FormaPagamento("Debito Master");
//        final FormaPagamento debito_visa = new FormaPagamento("Debito Visa");
//
//        List<FormaPagamento> formaPagamentosUsuario = new ArrayList<>();
//        formaPagamentosUsuario.add(credito_master);
//        formaPagamentosUsuario.add(debito_master);
//
//        Usuario usuario = new Usuario("felipe.sanchez@zup.com.br", formaPagamentosUsuario);
//
//        List<FormaPagamento> formaPagamentosRestaurante = new ArrayList<>();
//        formaPagamentosRestaurante.add(debito_master);
//        formaPagamentosRestaurante.add(debito_visa);
//
//        Restaurante restaurantes = new Restaurante(1L, "Coco Bambu Anhembi", formaPagamentosRestaurante);
//
//        when(usuarioRepository.getByEmail(anyString())).thenReturn(usuario);
//        when(restauranteRepository.getOne(anyLong())).thenReturn(restaurantes);
//
//    }
//
//    @Test
//    void deveBuscarPorUsuarioEmailERestauranteId() {
//
//        final FormaPagamento formaPagamentoEsperada = new FormaPagamento("Debito Master");
//
//        final List<FormaPagamentoDto> result = formaPagamentoController
//                .buscarPor("felipe.sanchez@zup.com.br", 1L).getBody();
//
//        assert result != null;
//        assertEquals(1, result.size());
//        assertEquals(formaPagamentoEsperada.getDescricao(), result.get(0).getDescricao());
//    }
//
//}
