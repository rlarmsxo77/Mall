package mall.domain;

import mall.domain.DeliveryStarted;
import mall.domain.DeliveryCancelled;
import mall.DeliveryApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="DeliveryMng_table")
@Data

public class DeliveryMng  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String orderId;

    @PostPersist
    public void onPostPersist(){


        DeliveryStarted deliveryStarted = new DeliveryStarted(this);
        deliveryStarted.publishAfterCommit();



        DeliveryCancelled deliveryCancelled = new DeliveryCancelled(this);
        deliveryCancelled.publishAfterCommit();

    }

    public static DeliveryMngRepository repository(){
        DeliveryMngRepository deliveryMngRepository = DeliveryApplication.applicationContext.getBean(DeliveryMngRepository.class);
        return deliveryMngRepository;
    }




    public static void delivery(Ordered ordered){

        /** Example 1:  new item 
        DeliveryMng deliveryMng = new DeliveryMng();
        repository().save(deliveryMng);

        */

        /** Example 2:  finding and process
        
        repository().findById(ordered.get???()).ifPresent(deliveryMng->{
            
            deliveryMng // do something
            repository().save(deliveryMng);


         });
        */

        
    }
    public static void deliveryCancel(OderCancelled oderCancelled){

        /** Example 1:  new item 
        DeliveryMng deliveryMng = new DeliveryMng();
        repository().save(deliveryMng);

        */

        /** Example 2:  finding and process
        
        repository().findById(oderCancelled.get???()).ifPresent(deliveryMng->{
            
            deliveryMng // do something
            repository().save(deliveryMng);


         });
        */

        
    }


}
