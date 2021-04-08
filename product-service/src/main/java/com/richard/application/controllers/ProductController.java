/**
 * @Nickname: Richard
 * @Email: richardvu.work@gmail.com
 * @Skype: richardvu.work@gmail.com
 * @Phone: (+84) 0935710974 - (+84) 0935810974
 * @Country: Viet Nam
 * @Year: 2021
 * @LICENSE: DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 */
package com.richard.application.controllers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.richard.application.models.ProductEntity;

/**
 * @author admin
 */
@RestController
@RequestMapping("/product")
public class ProductController {

  @Autowired
  private RestTemplate restTemplate;

  /** listProduct: */
  List<ProductEntity> listProduct = new ArrayList<>();

  /**
   * @param listProduct
   */
  public ProductController() {
    listProduct.add(new ProductEntity(1, "MACBOOK", "MACBOOK AIR", 999, true));
    listProduct.add(new ProductEntity(2, "Noki A", "Noki A", 777, false));
    listProduct.add(new ProductEntity(3, "SAMSUNG", "SAMSUNG", 666, true));
    listProduct.add(new ProductEntity(1, "LG", "LG", 555, false));
    listProduct.add(new ProductEntity(5, "VINSMART", "VINSMART", 444, true));
  }

  /**
   * @param productId
   * @return
   */
  @GetMapping("/details/{productId}")
  public List<ProductEntity> getProductInfo(@PathVariable int productId) {
    List<ProductEntity> products = new ArrayList<>();
    Iterator<ProductEntity> iterator = listProduct.iterator();
    while (iterator.hasNext()){
      ProductEntity product = iterator.next();
      if (product.getProductID() == productId){
        products.add(product);
      }
    }
    return products;
  }

  /**
   * @return
   */
  @GetMapping("/")
  public List<ProductEntity> getAllProduct() {
    return listProduct;
  }

  /**
   * @return
   */
  @GetMapping("/checkingRestTemplate")
  public String checkingRestTemplate() {
    return restTemplate.getForObject("http://localhost:8082/price/checkingRestTemplate", String.class);
  }

}
