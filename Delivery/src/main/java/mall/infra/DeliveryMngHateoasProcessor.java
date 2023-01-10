package mall.infra;
import mall.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class DeliveryMngHateoasProcessor implements RepresentationModelProcessor<EntityModel<DeliveryMng>>  {

    @Override
    public EntityModel<DeliveryMng> process(EntityModel<DeliveryMng> model) {

        
        return model;
    }
    
}
