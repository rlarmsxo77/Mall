package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Ordered extends AbstractEvent {

    private Long id;

    public Ordered(OrderMng aggregate){
        super(aggregate);
    }
    public Ordered(){
        super();
    }
}
