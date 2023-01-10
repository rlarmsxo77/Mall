package mall.domain;

import mall.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="orderMngs", path="orderMngs")
public interface OrderMngRepository extends PagingAndSortingRepository<OrderMng, Long>{

}
