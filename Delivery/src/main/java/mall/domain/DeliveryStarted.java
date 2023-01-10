package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;

    public DeliveryStarted(DeliveryMng aggregate){
        super(aggregate);
    }
    public DeliveryStarted(){
        super();
    }
}
