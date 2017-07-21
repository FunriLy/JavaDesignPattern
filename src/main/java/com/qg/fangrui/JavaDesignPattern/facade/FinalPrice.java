package com.qg.fangrui.JavaDesignPattern.facade;

/**
 * 外观模式：计费子系统
 * Created by FunriLy on 2017/7/22.
 * From small beginnings comes great things.
 */
public class FinalPrice {

    ProductPrice productPrice;
    Postage postage;
    Discount discount;

    public FinalPrice(){
        this.productPrice = new ProductPrice();
        this.postage = new Postage();
        this.discount = new Discount();
    }

    int getFinalPrice(String product, String addr, String discountCode) {
        return productPrice.getProductPrice(product)
                + postage.getPostage(addr)
                + discount.getDiscount(discountCode);
    }
}
