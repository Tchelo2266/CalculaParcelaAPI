package calculaParcelas.api.service;

import calculaParcelas.api.domain.Selic;
import calculaParcelas.api.domain.parcela.Parcela;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ParcelaService {
    @Autowired
    private TaxaSelicService taxaSelicService;

    public List<Parcela> CalculaParcelas(int qtdParcelas, double valorTotal, int numParcelasAcimaCobraJuros){

        double taxaJurosMes = 0.0;
        List<Parcela> parcelas = new ArrayList<Parcela>();
        double valorParcela = valorTotal / qtdParcelas;

        if(qtdParcelas > numParcelasAcimaCobraJuros){
            List<Selic> ultimosTrintaDias = taxaSelicService.RecuperaSelicAcumulado();
            Selic ultimoRegistro = ultimosTrintaDias.get(1);
            taxaJurosMes = ultimoRegistro.getValor();
            /*double valorAcrescido = valorTotal *  taxaJurosMes;
            valorParcela += valorAcrescido;*/
        }
//        valorParcela = arredondar(valorParcela);
        for (int i = 1; i <= qtdParcelas; i++){
            valorParcela = valorTotal * Math.pow(1+taxaJurosMes, i) / qtdParcelas;
            parcelas.add(new Parcela(i, valorParcela, taxaJurosMes));
        }
        return parcelas;
    }

    double arredondar(double valor) {
        double arredondado = valor;
        arredondado *= (Math.pow(10, 2));
        arredondado = Math.ceil(arredondado);
        arredondado /= (Math.pow(10, 2));
        return arredondado;
    }
}
