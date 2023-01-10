package mall.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import mall.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import mall.domain.*;

@Service
@Transactional
public class PolicyHandler{
    @Autowired DeliveryMngRepository deliveryMngRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Ordered'")
    public void wheneverOrdered_Delivery(@Payload Ordered ordered){

        Ordered event = ordered;
        System.out.println("\n\n##### listener Delivery : " + ordered + "\n\n");


        

        // Sample Logic //
        DeliveryMng.delivery(event);
        

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OderCancelled'")
    public void wheneverOderCancelled_DeliveryCancel(@Payload OderCancelled oderCancelled){

        OderCancelled event = oderCancelled;
        System.out.println("\n\n##### listener DeliveryCancel : " + oderCancelled + "\n\n");


        

        // Sample Logic //
        DeliveryMng.deliveryCancel(event);
        

        

    }

}


