import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PessoaServiceTest {

    private PessoaService pessoaService;
    private List<Pessoa> pessoas;

    @BeforeEach
    public void setUp() {
        pessoaService = new PessoaService();
        pessoas = Arrays.asList(
                new Pessoa("João", "M"),
                new Pessoa("Maria", "F"),
                new Pessoa("Pedro", "M"),
                new Pessoa("Ana", "F"),
                new Pessoa("Carlos", "M"),
                new Pessoa("Clara", "F"));
    }

    @Test
    public void testFiltrarHomens() {
        List<Pessoa> homens = pessoaService.filtrarHomens(pessoas);
        assertEquals(3, homens.size());
        assertEquals("João", homens.get(0).getNome());
        assertEquals("Pedro", homens.get(1).getNome());
        assertEquals("Carlos", homens.get(2).getNome());
    }

    @Test
    public void testFiltrarMulheres() {
        List<Pessoa> mulheres = pessoaService.filtrarMulheres(pessoas);
        assertEquals(3, mulheres.size());
        assertEquals("Maria", mulheres.get(0).getNome());
        assertEquals("Ana", mulheres.get(1).getNome());
        assertEquals("Clara", mulheres.get(2).getNome());
    }
}
