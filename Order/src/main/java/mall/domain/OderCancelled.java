package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OderCancelled extends AbstractEvent {

    private Long id;

    public OderCancelled(OrderMng aggregate){
        super(aggregate);
    }
    public OderCancelled(){
        super();
    }
}
