package calculaParcelas.api.domain.parcela;

import calculaParcelas.api.domain.condicaoPagamento.CondicaoPagamento;
import calculaParcelas.api.domain.produto.Produto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DadosCalculaParcela {
    private Produto produto;
    private CondicaoPagamento condicaoPagamento;
}
