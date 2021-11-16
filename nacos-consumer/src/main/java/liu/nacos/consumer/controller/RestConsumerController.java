package liu.nacos.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ljl
 * @date 2021/11/16 17:47
 */
@RestController()
public class RestConsumerController {

    @Value("${provider.address}")
    private String providerAddress;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer")
    private String consumerInfo(){
        String message = null;
        message = restTemplate.getForObject(providerAddress, String.class);
        return message;
    }

}
