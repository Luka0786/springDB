package com.example.demo.Interfaces;

import com.example.demo.Models.ProductModel;

import java.util.List;

public interface ProductRepositoryInterface
{
    ProductModel get(int id);
    List<ProductModel> get();
}
