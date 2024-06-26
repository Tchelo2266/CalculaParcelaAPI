package calculaParcelas.api.domain.parcela;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Parcela {
    private int numeroParcela;
    private double valor;
    private double taxaJurosAoMes;

    public Parcela(Parcela dados){
        this.numeroParcela = dados.numeroParcela;
        this.valor = dados.valor;
        this.taxaJurosAoMes = dados.taxaJurosAoMes;
    }
}
