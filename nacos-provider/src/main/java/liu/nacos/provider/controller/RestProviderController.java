package liu.nacos.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ljl
 * @date 2021/11/16 17:28
 */
@RestController()
public class RestProviderController {

    @GetMapping("/provider")
    public String providerRestfulInfo(){
        String info = "hello world";
        System.out.println(info);
        return info;
    }
}
