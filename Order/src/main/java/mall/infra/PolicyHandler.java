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
    @Autowired OrderMngRepository orderMngRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='DeliveryStarted'")
    public void wheneverDeliveryStarted_UpdateStatus(@Payload DeliveryStarted deliveryStarted){

        DeliveryStarted event = deliveryStarted;
        System.out.println("\n\n##### listener UpdateStatus : " + deliveryStarted + "\n\n");


        // Comments // 
		//1. 배송상태가 바뀌면 주문상태가 업데이트된다
		// 2. 주문/배송상태가 바뀔때마다 해당 고객에세 문자메세지 발송

        // Sample Logic //
        OrderMng.updateStatus(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='DeliveryCancelled'")
    public void wheneverDeliveryCancelled_UpdateStatus(@Payload DeliveryCancelled deliveryCancelled){

        DeliveryCancelled event = deliveryCancelled;
        System.out.println("\n\n##### listener UpdateStatus : " + deliveryCancelled + "\n\n");


        // Comments // 
		//1. 배송상태가 바뀌면 주문상태가 업데이트된다
		// 2. 주문/배송상태가 바뀔때마다 해당 고객에세 문자메세지 발송

        // Sample Logic //
        OrderMng.updateStatus(event);
        

        

    }

}


