package mall.infra;

import mall.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="orderSelects", path="orderSelects")
public interface OrderSelectRepository extends PagingAndSortingRepository<OrderSelect, Long> {

    

    
}
