package com.qg.fangrui.JavaDesignPattern.facade;

/**
 * 外观模式：外观
 * Created by FunriLy on 2017/7/22.
 * From small beginnings comes great things.
 */
public enum  ProductSalesman {

    instance;

    Stock stock = new Stock();
    FinalPrice finalPrice = new FinalPrice();

    Object buy(String product, String addr, String discountCode) {
        if(!stock.hasStock(product)) {
            return "库存不足";
        }

        int price = finalPrice.getFinalPrice(product, addr, discountCode);
        return "订单信息：" + product + "-" + addr + "-" +discountCode + "-" + price;
    }
}
