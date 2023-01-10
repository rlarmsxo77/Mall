package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class DeliveryCancelled extends AbstractEvent {

    private Long id;

    public DeliveryCancelled(DeliveryMng aggregate){
        super(aggregate);
    }
    public DeliveryCancelled(){
        super();
    }
}
