package com.fullwish.mode;

/**
 * Created by ok on 14-5-2.
 */
public class ProductServer {

    public ProductServer() {
        setProductId("field1_str");
        setProductImg("field2_str");
        setProductName("field3_str");
        setCurrentCnt(1000);
        setDetail("this is detail");
        setPrice(5555.0f);
        setTotalCnt(3000);
        setMyObject(new MyObject("myfirst ob"));
    }

    public ProductServer(String productId, String productImg, String productName, Integer totalCnt, String detail, Integer currentCnt, Float price, MyObject myObject) {
        this.productId = productId;
        this.productImg = productImg;
        this.productName = productName;
        this.totalCnt = totalCnt;
        this.detail = detail;
        this.currentCnt = currentCnt;
        this.price = price;
        this.myObject = myObject;
    }

    // 封装请求参数的三个属性 　　
    private String productId; //null

    public String getProductImg() {
        return productImg;
    }

    public void setProductImg(String productImg) {
        this.productImg = productImg;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    private transient String productImg;

    private String productName;

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getTotalCnt() {
        return totalCnt;
    }

    public void setTotalCnt(Integer totalCnt) {
        this.totalCnt = totalCnt;
    }

    private Integer totalCnt;

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    private String detail;
    public Integer getCurrentCnt() {
        return currentCnt;
    }

    public void setCurrentCnt(Integer currentCnt) {
        this.currentCnt = currentCnt;
    }

    private Integer currentCnt;

    private Float price;

    public MyObject getMyObject() {
        return myObject;
    }

    public void setMyObject(MyObject myObject) {
        this.myObject = myObject;
    }

    private MyObject myObject;

    // 封装处理结果的属性
//    private int[] ints = {10, 20};

//    private Map map = new HashMap();

//    private String customName = "custom";

    // 三个请求参数对应的setter和getter方法
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    // 此处省略了field1和field2两个字段的setter和getter方法
    // 封装处理结果的属性的setter和getter方法
//    public int[] getInts() {
//        return ints;
//    }
//
//    public void setInts(int[] ints) {
//        this.ints = ints;
//    }
//
//    public Map getMap() {
//        return map;
//    }

//    private String testField = "myfield";

//    public void setMap(Map map) {
//        this.map = map;
//    }

    // 使用注释语法来改变该属性序列化后的属性名
    //总是会在第一行显示,其余出现位置按顺序排列
//    @JSON(name = "newName")
//    public String getCustomName() {
//        return this.customName;
//    }

}
