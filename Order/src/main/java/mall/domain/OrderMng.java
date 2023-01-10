package mall.domain;

import mall.domain.Ordered;
import mall.domain.OderCancelled;
import mall.OrderApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="OrderMng_table")
@Data

public class OrderMng  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String orderId;
    
    
    
    
    
    private String customerId;
    
    
    
    
    
    private String orderDate;
    
    
    
    
    
    private String deliveryAddress;
    
    
    
    @Embedded
    
    private Money orderAm;

    @PostPersist
    public void onPostPersist(){


        Ordered ordered = new Ordered(this);
        ordered.publishAfterCommit();



        OderCancelled oderCancelled = new OderCancelled(this);
        oderCancelled.publishAfterCommit();

    }

    public static OrderMngRepository repository(){
        OrderMngRepository orderMngRepository = OrderApplication.applicationContext.getBean(OrderMngRepository.class);
        return orderMngRepository;
    }




    public static void updateStatus(DeliveryStarted deliveryStarted){

        /** Example 1:  new item 
        OrderMng orderMng = new OrderMng();
        repository().save(orderMng);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryStarted.get???()).ifPresent(orderMng->{
            
            orderMng // do something
            repository().save(orderMng);


         });
        */

        
    }
    public static void updateStatus(DeliveryCancelled deliveryCancelled){

        /** Example 1:  new item 
        OrderMng orderMng = new OrderMng();
        repository().save(orderMng);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryCancelled.get???()).ifPresent(orderMng->{
            
            orderMng // do something
            repository().save(orderMng);


         });
        */

        
    }


}
