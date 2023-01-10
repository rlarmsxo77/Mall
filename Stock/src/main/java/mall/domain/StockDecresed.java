package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class StockDecresed extends AbstractEvent {

    private Long id;

    public StockDecresed(Product aggregate){
        super(aggregate);
    }
    public StockDecresed(){
        super();
    }
}
