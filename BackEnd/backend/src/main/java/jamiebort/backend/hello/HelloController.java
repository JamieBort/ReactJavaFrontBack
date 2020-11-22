// package io.javabrains.courseapidata.hello;
package jamiebort.backend.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @RequestMapping("/hello")
    public String sayHi(){
        return "hi";
    }
}
