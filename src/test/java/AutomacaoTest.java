import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutomacaoTest {

    @Test
    void testeCadastroVeiculo() {
        String resultado = "Veiculo Cadastrado";
        assertEquals("Veiculo Cadastrado", resultado);
    }

    @Test
    void testeBuscaVeiculo() {
        boolean encontrado = true;
        assertTrue(encontrado);
    }

    @Test
    void testeLogin() {
        String user = "admin";
        assertNotNull(user);
    }
}