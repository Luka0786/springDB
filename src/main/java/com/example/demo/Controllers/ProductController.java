package com.example.demo.Controllers;

import com.example.demo.Interfaces.ProductRepositoryInterface;
import com.example.demo.Models.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController
{
    @Autowired
    private ProductRepositoryInterface repository = new ProductRepository();

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("product", repository.get(1));
        return "product";
    }
}
