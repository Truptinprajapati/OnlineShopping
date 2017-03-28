package com.example.modern.onlineshopping.pojo;

import java.util.List;

/**
 * Created by Lenovo on 24-03-2017.
 */

public class Pojoproductlist {


    /**
     * status : 1
     * Message : ProductList fetched successfully
     * productList : [{"productName":"first","productId":2,"categoryId":1,"productDesc":"this is first product","price":200,"subProductList":"","productImage":"192.168.1.29/core/FLAT_TEST/ecart/admin/upload_product_image/2/aa2913d293ec969e4b92415c5eeb8746e4990d75.png"},{"productName":"first","productId":4,"categoryId":1,"productDesc":"this is first product","price":200,"subProductList":[{"productName":"first","productId":2,"categoryId":1,"productDesc":"this is first product","price":200,"productImage":"192.168.1.29/core/FLAT_TEST/ecart/admin/upload_product_image/2/aa2913d293ec969e4b92415c5eeb8746e4990d75.png"}],"productImage":"192.168.1.29/core/FLAT_TEST/ecart/admin/upload_product_image/4/ce571a729887527f719dc2057a7bdd0d84c7198c.png"},{"productName":"first","productId":5,"categoryId":1,"productDesc":"this is second product","price":200,"subProductList":{"1":{"productName":"first","productId":2,"categoryId":1,"productDesc":"this is first product","price":200,"productImage":"192.168.1.29/core/FLAT_TEST/ecart/admin/upload_product_image/2/aa2913d293ec969e4b92415c5eeb8746e4990d75.png"}},"productImage":"192.168.1.29/core/FLAT_TEST/ecart/admin/upload_product_image/5/3e0ed35b54bcfdb2ad5f232d9ce6ed79945b0bd4.png"},{"productName":"first","productId":6,"categoryId":1,"productDesc":"this is third product","price":200,"subProductList":{"2":{"productName":"first","productId":2,"categoryId":1,"productDesc":"this is first product","price":200,"productImage":"192.168.1.29/core/FLAT_TEST/ecart/admin/upload_product_image/2/aa2913d293ec969e4b92415c5eeb8746e4990d75.png"}},"productImage":"192.168.1.29/core/FLAT_TEST/ecart/admin/upload_product_image/6/895d7d9740d141d07f2facb446d06b46a7e9c757.png"},{"productName":"first","productId":7,"categoryId":1,"productDesc":"this is fourth product","price":200,"subProductList":{"3":{"productName":"first","productId":2,"categoryId":1,"productDesc":"this is first product","price":200,"productImage":"192.168.1.29/core/FLAT_TEST/ecart/admin/upload_product_image/2/aa2913d293ec969e4b92415c5eeb8746e4990d75.png"}},"productImage":"192.168.1.29/core/FLAT_TEST/ecart/admin/upload_product_image/7/cca81c2f28bd7572759cfc1bd404d47056142864.png"},{"productName":"first","productId":8,"categoryId":1,"productDesc":"this is first product","price":200,"subProductList":{"4":{"productName":"first","productId":4,"categoryId":1,"productDesc":"this is first product","price":200,"productImage":"192.168.1.29/core/FLAT_TEST/ecart/admin/upload_product_image/4/ce571a729887527f719dc2057a7bdd0d84c7198c.png"}},"productImage":"192.168.1.29/core/FLAT_TEST/ecart/admin/upload_product_image/8/1803b1844e0fbd836f2030f2597f823623f9bf1f.png"},{"productName":"first","productId":9,"categoryId":1,"productDesc":"this is first product","price":200,"subProductList":{"5":{"productName":"first","productId":4,"categoryId":1,"productDesc":"this is first product","price":200,"productImage":"192.168.1.29/core/FLAT_TEST/ecart/admin/upload_product_image/4/ce571a729887527f719dc2057a7bdd0d84c7198c.png"}},"productImage":"192.168.1.29/core/FLAT_TEST/ecart/admin/upload_product_image/9/2d304d86cde5e6e254cf1fd8477fa3b8da6c8f37.png"},{"productName":"first","productId":10,"categoryId":1,"productDesc":"this is first product","price":200,"subProductList":{"6":{"productName":"first","productId":4,"categoryId":1,"productDesc":"this is first product","price":200,"productImage":"192.168.1.29/core/FLAT_TEST/ecart/admin/upload_product_image/4/ce571a729887527f719dc2057a7bdd0d84c7198c.png"}},"productImage":"192.168.1.29/core/FLAT_TEST/ecart/admin/upload_product_image/10/a55a3d6bbc8bb7de1d8166c5a88b84061fb19f32.png"},{"productName":"first","productId":11,"categoryId":1,"productDesc":"this is first product","price":200,"subProductList":{"7":{"productName":"first","productId":4,"categoryId":1,"productDesc":"this is first product","price":200,"productImage":"192.168.1.29/core/FLAT_TEST/ecart/admin/upload_product_image/4/ce571a729887527f719dc2057a7bdd0d84c7198c.png"}},"productImage":"192.168.1.29/core/FLAT_TEST/ecart/admin/upload_product_image/11/7a7ff9e35cdb6966aa80749c1090afa0d69cc8f2.png"},{"productName":"first","productId":12,"categoryId":1,"productDesc":"this is first product","price":200,"subProductList":"","productImage":"192.168.1.29/core/FLAT_TEST/ecart/admin/upload_product_image/12/f574820352d37ea7d6d0e3f96d19d3aa0c49ed24.png"}]
     */

    private int status;
    private String Message;
    private List<ProductListBean> productList;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public List<ProductListBean> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductListBean> productList) {
        this.productList = productList;
    }

    public static class ProductListBean {
        /**
         * productName : first
         * productId : 2
         * categoryId : 1
         * productDesc : this is first product
         * price : 200
         * subProductList :
         * productImage : 192.168.1.29/core/FLAT_TEST/ecart/admin/upload_product_image/2/aa2913d293ec969e4b92415c5eeb8746e4990d75.png
         */

        private String productName;
        private int productId;
        private int categoryId;
        private String productDesc;
        private int price;
        private String subProductList;
        private String productImage;

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public int getProductId() {
            return productId;
        }

        public void setProductId(int productId) {
            this.productId = productId;
        }

        public int getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(int categoryId) {
            this.categoryId = categoryId;
        }

        public String getProductDesc() {
            return productDesc;
        }

        public void setProductDesc(String productDesc) {
            this.productDesc = productDesc;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public String getSubProductList() {
            return subProductList;
        }

        public void setSubProductList(String subProductList) {
            this.subProductList = subProductList;
        }

        public String getProductImage() {
            return productImage;
        }

        public void setProductImage(String productImage) {
            this.productImage = productImage;
        }
    }
}
