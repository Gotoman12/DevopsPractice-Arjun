
package com.example.clothing;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "*")
public class ProductController {

    @GetMapping
    public List<Product> getProducts() {
        return List.of(
            new Product(1L, "T-Shirt", 499.0),
            new Product(2L, "Jeans", 1299.0),
            new Product(3L, "Jacket", 2499.0)
        );
    }
}
