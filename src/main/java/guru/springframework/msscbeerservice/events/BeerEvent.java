package guru.springframework.msscbeerservice.events;

import guru.springframework.msscbeerservice.web.model.BeerDto;
import lombok.Builder;
import lombok.Data;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.Serializable;

@Data
@RequestMapping
@Builder
public class BeerEvent implements Serializable {

    static final long serialVersionUID = -3469741108493905848L;

    private final BeerDto beerDto;
}
