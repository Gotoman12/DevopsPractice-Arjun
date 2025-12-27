
package com.example.clothing;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@CrossOrigin
@RequestMapping("/api/clothes")
public class ClothingController {

    @GetMapping
    public List<Map<String, String>> getClothes() {
        List<Map<String, String>> list = new ArrayList<>();
        list.add(Map.of("id","1","name","T-Shirt","price","499"));
        list.add(Map.of("id","2","name","Jeans","price","1299"));
        return list;
    }
}
