package mall.domain;

import mall.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="deliveryMngs", path="deliveryMngs")
public interface DeliveryMngRepository extends PagingAndSortingRepository<DeliveryMng, Long>{

}
