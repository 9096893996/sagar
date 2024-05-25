package sagar.example.sagar;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Study {
    @GetMapping("/study")
    public String getData() {return  "please do study daily" ; }
}