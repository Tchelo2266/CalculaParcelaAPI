package calculaParcelas.api.interfaces;

import calculaParcelas.api.domain.Selic;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "bcbClient", url = "https://api.bcb.gov.br")
public interface SelicInterface {
    @GetMapping("/dados/serie/bcdata.sgs.11/dados/ultimos/30?formato=json")
    List<Selic> getUltimos30Dias();

}
