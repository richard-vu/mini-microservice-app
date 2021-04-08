/**
 * @Nickname: Richard
 * @Email: richardvu.work@gmail.com
 * @Skype: richardvu.work@gmail.com
 * @Phone: (+84) 0935710974 - (+84) 0935810974
 * @Country: Viet Nam
 * @Year: 2021
 * @LICENSE: DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 */
package com.richard.application.models;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author admin
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PriceEntity implements Serializable {

  /** serialVersionUID: */
  private static final long serialVersionUID = -7854543517803330254L;

  /** priceID: */
  private int priceId;
  
  /** productID: */
  private int productID;
  
  /** priceDesc: */
  private String priceDesc;
  
  /** oginalPrice: */
  private Integer oginalPrice;
  
  /** discountPrice: */
  private Integer discountPrice;
  
}
