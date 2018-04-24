package com.example.demo.Models.Repositories;

import com.example.demo.Interfaces.ProductRepositoryInterface;
import com.example.demo.Models.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository implements ProductRepositoryInterface
{
    @Autowired
    private JdbcTemplate jdbc;

    @Override
    public ProductModel get(int id) {
        String sql = "select * from Products where productId = " + id;

        SqlRowSet rs = jdbc.queryForRowSet(sql);

        rs.next();

        ProductModel product =
                new ProductModel(rs.getInt(1), rs.getInt(3),
                        rs.getInt(5), rs.getString(2),
                        rs.getDouble(4));

        return product;
    }

    @Override
    public List<ProductModel> get() {
        return null;
    }
}
