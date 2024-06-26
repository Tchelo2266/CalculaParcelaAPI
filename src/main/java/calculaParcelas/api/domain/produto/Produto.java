package calculaParcelas.api.domain.produto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Produto {
    private int codigo;
    private String nome;
    private double valor;
}
