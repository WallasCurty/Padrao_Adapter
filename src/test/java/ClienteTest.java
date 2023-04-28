import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {
    @Test
    void deveRetornarProdutosCliente() {
        Cliente cliente = new Cliente();
        cliente.setProduto("Feijão");

        assertEquals("Feijão", cliente.getProduto());
    }

    @Test
    void deveRetornarPreco() {
        Cliente cliente = new Cliente();
        cliente.setProduto("Feijão");

        assertEquals(12.0f, cliente.getPreco());
    }

}
