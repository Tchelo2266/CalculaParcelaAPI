package calculaParcelas.api.service;

import calculaParcelas.api.domain.Selic;
import calculaParcelas.api.interfaces.SelicInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaxaSelicService {

    @Autowired
    private SelicInterface selic;

    public List<Selic> RecuperaSelicAcumulado(){
        return this.selic.getUltimos30Dias();
    }
}
