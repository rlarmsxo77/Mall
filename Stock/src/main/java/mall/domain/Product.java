package mall.domain;

import mall.domain.StockDecresed;
import mall.domain.StockIncreased;
import mall.StockApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Product_table")
@Data

public class Product  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String productId;
    
    
    
    
    
    private String productName;
    
    
    
    
    
    private Long qty;

    @PostPersist
    public void onPostPersist(){


        StockDecresed stockDecresed = new StockDecresed(this);
        stockDecresed.publishAfterCommit();



        StockIncreased stockIncreased = new StockIncreased(this);
        stockIncreased.publishAfterCommit();

    }

    public static ProductRepository repository(){
        ProductRepository productRepository = StockApplication.applicationContext.getBean(ProductRepository.class);
        return productRepository;
    }




    public static void decreaseStock(DeliveryStarted deliveryStarted){

        /** Example 1:  new item 
        Product product = new Product();
        repository().save(product);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryStarted.get???()).ifPresent(product->{
            
            product // do something
            repository().save(product);


         });
        */

        
    }
    public static void increaseStock(DeliveryCancelled deliveryCancelled){

        /** Example 1:  new item 
        Product product = new Product();
        repository().save(product);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryCancelled.get???()).ifPresent(product->{
            
            product // do something
            repository().save(product);


         });
        */

        
    }


}
