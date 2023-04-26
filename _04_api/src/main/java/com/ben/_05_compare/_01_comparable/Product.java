package com.ben._05_compare._01_comparable;

/**
 * @author 廖新平
 * @version 1.0.0
 * @decription TODO
 * @create 2023-03-16 11:36
 */
public class Product implements Comparable<Product> {
    private double price;
    private String goodsName;

    public Product(double price, String goodsName) {
        this.price = price;
        this.goodsName = goodsName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", goodsName='" + goodsName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        int value = Double.compare(this.price, o.price);
        if (value == 0) {
            return this.goodsName.compareTo(o.goodsName);
        } else {
            return value;
        }
    }


//    @Override
//    public int compareTo(Product o) {
//        //比较大小的规则
//        if (this == o) {
//            return 0;
//        }
//        return Double.compare(this.price, o.price);
//    }
}
