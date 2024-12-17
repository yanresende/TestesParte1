import java.util.List;
import java.util.stream.Collectors;

public class PessoaService {

    public List<Pessoa> filtrarHomens(List<Pessoa> pessoas) {
        return pessoas.stream()
                .filter(pessoa -> "M".equalsIgnoreCase(pessoa.getSexo()))
                .collect(Collectors.toList());
    }

    public List<Pessoa> filtrarMulheres(List<Pessoa> pessoas) {
        return pessoas.stream()
                .filter(pessoa -> "F".equalsIgnoreCase(pessoa.getSexo()))
                .collect(Collectors.toList());
    }
}
