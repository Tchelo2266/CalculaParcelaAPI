package calculaParcelas.api.controller;

import calculaParcelas.api.domain.Selic;
import calculaParcelas.api.domain.condicaoPagamento.CondicaoPagamento;
import calculaParcelas.api.domain.parcela.DadosCalculaParcela;
import calculaParcelas.api.domain.parcela.Parcela;
import calculaParcelas.api.domain.produto.Produto;
import calculaParcelas.api.service.ParcelaService;
import calculaParcelas.api.service.TaxaSelicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/compra")
public class CompraController {
    @Autowired
    ParcelaService parcelaService;

    @PostMapping
    public ResponseEntity<List<Parcela>> Post(@RequestBody DadosCalculaParcela dados){
        Produto produto = dados.getProduto();
        CondicaoPagamento condicaoPagamento = dados.getCondicaoPagamento();

        List<Parcela> parcelas = parcelaService.CalculaParcelas(condicaoPagamento.getQtdeParcelas(), (produto.getValor() - condicaoPagamento.getValorEntrada()),6);
        return ResponseEntity.ok(parcelas);
    }


}
