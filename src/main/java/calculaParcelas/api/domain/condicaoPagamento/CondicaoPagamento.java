package calculaParcelas.api.domain.condicaoPagamento;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CondicaoPagamento {
    private double valorEntrada;
    private int qtdeParcelas;
}
