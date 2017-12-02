package com.park.bean;

import java.io.*;
import java.util.*;

//goods_order
@SuppressWarnings({"serial"})
public class Goods_order implements Cloneable , Serializable{

    //public static String[] carrays ={"go_id","order_id","g_id","ui_id","price","num","express_info","express_time","address","name","telephone","subtotal","freight_price","money","ctime","ptime","stime","is_after_sale","is_pay","state","is_send","is_evaluate","note","is_del"};

    public long go_id;//bigint(20)    主键ID
    public String order_id="";//varchar(80)    订单号
    public long g_id;//bigint(20)    商品表主键ID
    public long ui_id;//bigint(20)    用户ID
    public int price;//int(11)    商品单价
    public int num;//int(11)    商品数量
    public String express_info="";//varchar(255)    快递信息（例如：已经签收收发室代收投递员：宋李鹏15608194018）
    public java.util.Date express_time=new java.util.Date();//timestamp    快递签收时间（2017-12-0116：49：35）
    public String address="";//varchar(255)    收货地址（四川省成都市青羊区四川省成都市青羊区金丝街22号）
    public String name="";//varchar(30)    收货人姓名
    public String telephone="";//varchar(20)    收货人手机号码
    public int subtotal;//int(11)    商品小计金额单位分
    public int freight_price;//int(11)    运费单位分
    public int money;//int(11)    实付金额（含运费）单位分
    public java.util.Date ctime=new java.util.Date();//timestamp    创建时间
    public java.util.Date ptime=new java.util.Date();//timestamp    支付时间
    public java.util.Date stime=new java.util.Date();//timestamp    发货时间
    public int is_after_sale;//int(11)    是否申请了售后0：没有1：有
    public int is_pay;//int(11)    是否支付成功0：没有1：支付成功
    public int state;//int(11)    订单状态0：待付款1：待发货2：待收货3：已完成
    public int is_send;//int(11)    卖家是否发货0：没有1：已经发货
    public int is_evaluate;//int(11)    是否待评价0：待评价1：已评价
    public String note="";//varchar(60)    备注
    public int is_del;//int(11)    是否逻辑删除:0：不删除1：删除



    public long getGo_id(){
        return go_id;
    }

    public void setGo_id(long value){
        this.go_id= value;
    }

    public String getOrder_id(){
        return order_id;
    }

    public void setOrder_id(String value){
    	if(value == null){
           value = "";
        }
        this.order_id= value;
    }

    public long getG_id(){
        return g_id;
    }

    public void setG_id(long value){
        this.g_id= value;
    }

    public long getUi_id(){
        return ui_id;
    }

    public void setUi_id(long value){
        this.ui_id= value;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int value){
        this.price= value;
    }

    public int getNum(){
        return num;
    }

    public void setNum(int value){
        this.num= value;
    }

    public String getExpress_info(){
        return express_info;
    }

    public void setExpress_info(String value){
    	if(value == null){
           value = "";
        }
        this.express_info= value;
    }

    public java.util.Date getExpress_time(){
        return express_time;
    }

    public void setExpress_time(java.util.Date value){
    	if(value == null){
           value = new java.util.Date();
        }
        this.express_time= value;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String value){
    	if(value == null){
           value = "";
        }
        this.address= value;
    }

    public String getName(){
        return name;
    }

    public void setName(String value){
    	if(value == null){
           value = "";
        }
        this.name= value;
    }

    public String getTelephone(){
        return telephone;
    }

    public void setTelephone(String value){
    	if(value == null){
           value = "";
        }
        this.telephone= value;
    }

    public int getSubtotal(){
        return subtotal;
    }

    public void setSubtotal(int value){
        this.subtotal= value;
    }

    public int getFreight_price(){
        return freight_price;
    }

    public void setFreight_price(int value){
        this.freight_price= value;
    }

    public int getMoney(){
        return money;
    }

    public void setMoney(int value){
        this.money= value;
    }

    public java.util.Date getCtime(){
        return ctime;
    }

    public void setCtime(java.util.Date value){
    	if(value == null){
           value = new java.util.Date();
        }
        this.ctime= value;
    }

    public java.util.Date getPtime(){
        return ptime;
    }

    public void setPtime(java.util.Date value){
    	if(value == null){
           value = new java.util.Date();
        }
        this.ptime= value;
    }

    public java.util.Date getStime(){
        return stime;
    }

    public void setStime(java.util.Date value){
    	if(value == null){
           value = new java.util.Date();
        }
        this.stime= value;
    }

    public int getIs_after_sale(){
        return is_after_sale;
    }

    public void setIs_after_sale(int value){
        this.is_after_sale= value;
    }

    public int getIs_pay(){
        return is_pay;
    }

    public void setIs_pay(int value){
        this.is_pay= value;
    }

    public int getState(){
        return state;
    }

    public void setState(int value){
        this.state= value;
    }

    public int getIs_send(){
        return is_send;
    }

    public void setIs_send(int value){
        this.is_send= value;
    }

    public int getIs_evaluate(){
        return is_evaluate;
    }

    public void setIs_evaluate(int value){
        this.is_evaluate= value;
    }

    public String getNote(){
        return note;
    }

    public void setNote(String value){
    	if(value == null){
           value = "";
        }
        this.note= value;
    }

    public int getIs_del(){
        return is_del;
    }

    public void setIs_del(int value){
        this.is_del= value;
    }



    public static Goods_order newGoods_order(long go_id, String order_id, long g_id, long ui_id, int price, int num, String express_info, java.util.Date express_time, String address, String name, String telephone, int subtotal, int freight_price, int money, java.util.Date ctime, java.util.Date ptime, java.util.Date stime, int is_after_sale, int is_pay, int state, int is_send, int is_evaluate, String note, int is_del) {
        Goods_order ret = new Goods_order();
        ret.setGo_id(go_id);
        ret.setOrder_id(order_id);
        ret.setG_id(g_id);
        ret.setUi_id(ui_id);
        ret.setPrice(price);
        ret.setNum(num);
        ret.setExpress_info(express_info);
        ret.setExpress_time(express_time);
        ret.setAddress(address);
        ret.setName(name);
        ret.setTelephone(telephone);
        ret.setSubtotal(subtotal);
        ret.setFreight_price(freight_price);
        ret.setMoney(money);
        ret.setCtime(ctime);
        ret.setPtime(ptime);
        ret.setStime(stime);
        ret.setIs_after_sale(is_after_sale);
        ret.setIs_pay(is_pay);
        ret.setState(state);
        ret.setIs_send(is_send);
        ret.setIs_evaluate(is_evaluate);
        ret.setNote(note);
        ret.setIs_del(is_del);
        return ret;    
    }

    public void assignment(Goods_order goods_order) {
        long go_id = goods_order.getGo_id();
        String order_id = goods_order.getOrder_id();
        long g_id = goods_order.getG_id();
        long ui_id = goods_order.getUi_id();
        int price = goods_order.getPrice();
        int num = goods_order.getNum();
        String express_info = goods_order.getExpress_info();
        java.util.Date express_time = goods_order.getExpress_time();
        String address = goods_order.getAddress();
        String name = goods_order.getName();
        String telephone = goods_order.getTelephone();
        int subtotal = goods_order.getSubtotal();
        int freight_price = goods_order.getFreight_price();
        int money = goods_order.getMoney();
        java.util.Date ctime = goods_order.getCtime();
        java.util.Date ptime = goods_order.getPtime();
        java.util.Date stime = goods_order.getStime();
        int is_after_sale = goods_order.getIs_after_sale();
        int is_pay = goods_order.getIs_pay();
        int state = goods_order.getState();
        int is_send = goods_order.getIs_send();
        int is_evaluate = goods_order.getIs_evaluate();
        String note = goods_order.getNote();
        int is_del = goods_order.getIs_del();

        this.setGo_id(go_id);
        this.setOrder_id(order_id);
        this.setG_id(g_id);
        this.setUi_id(ui_id);
        this.setPrice(price);
        this.setNum(num);
        this.setExpress_info(express_info);
        this.setExpress_time(express_time);
        this.setAddress(address);
        this.setName(name);
        this.setTelephone(telephone);
        this.setSubtotal(subtotal);
        this.setFreight_price(freight_price);
        this.setMoney(money);
        this.setCtime(ctime);
        this.setPtime(ptime);
        this.setStime(stime);
        this.setIs_after_sale(is_after_sale);
        this.setIs_pay(is_pay);
        this.setState(state);
        this.setIs_send(is_send);
        this.setIs_evaluate(is_evaluate);
        this.setNote(note);
        this.setIs_del(is_del);

    }

    @SuppressWarnings("unused")
    public static void getGoods_order(Goods_order goods_order ){
        long go_id = goods_order.getGo_id();
        String order_id = goods_order.getOrder_id();
        long g_id = goods_order.getG_id();
        long ui_id = goods_order.getUi_id();
        int price = goods_order.getPrice();
        int num = goods_order.getNum();
        String express_info = goods_order.getExpress_info();
        java.util.Date express_time = goods_order.getExpress_time();
        String address = goods_order.getAddress();
        String name = goods_order.getName();
        String telephone = goods_order.getTelephone();
        int subtotal = goods_order.getSubtotal();
        int freight_price = goods_order.getFreight_price();
        int money = goods_order.getMoney();
        java.util.Date ctime = goods_order.getCtime();
        java.util.Date ptime = goods_order.getPtime();
        java.util.Date stime = goods_order.getStime();
        int is_after_sale = goods_order.getIs_after_sale();
        int is_pay = goods_order.getIs_pay();
        int state = goods_order.getState();
        int is_send = goods_order.getIs_send();
        int is_evaluate = goods_order.getIs_evaluate();
        String note = goods_order.getNote();
        int is_del = goods_order.getIs_del();
    }

    public Map<String,Object> toMap(){
        return toEnMap(this);
    }

    public static Map<String,Object> toEnMap(Goods_order goods_order){
        long go_id = goods_order.getGo_id();
        String order_id = goods_order.getOrder_id();
        long g_id = goods_order.getG_id();
        long ui_id = goods_order.getUi_id();
        int price = goods_order.getPrice();
        int num = goods_order.getNum();
        String express_info = goods_order.getExpress_info();
        java.util.Date express_time = goods_order.getExpress_time();
        String address = goods_order.getAddress();
        String name = goods_order.getName();
        String telephone = goods_order.getTelephone();
        int subtotal = goods_order.getSubtotal();
        int freight_price = goods_order.getFreight_price();
        int money = goods_order.getMoney();
        java.util.Date ctime = goods_order.getCtime();
        java.util.Date ptime = goods_order.getPtime();
        java.util.Date stime = goods_order.getStime();
        int is_after_sale = goods_order.getIs_after_sale();
        int is_pay = goods_order.getIs_pay();
        int state = goods_order.getState();
        int is_send = goods_order.getIs_send();
        int is_evaluate = goods_order.getIs_evaluate();
        String note = goods_order.getNote();
        int is_del = goods_order.getIs_del();
    
        Map<String,Object>  _ret = new HashMap<String,Object>();
        _ret.put("go_id",go_id);
        _ret.put("order_id",order_id);
        _ret.put("g_id",g_id);
        _ret.put("ui_id",ui_id);
        _ret.put("price",price);
        _ret.put("num",num);
        _ret.put("express_info",express_info);
        _ret.put("express_time",express_time);
        _ret.put("address",address);
        _ret.put("name",name);
        _ret.put("telephone",telephone);
        _ret.put("subtotal",subtotal);
        _ret.put("freight_price",freight_price);
        _ret.put("money",money);
        _ret.put("ctime",ctime);
        _ret.put("ptime",ptime);
        _ret.put("stime",stime);
        _ret.put("is_after_sale",is_after_sale);
        _ret.put("is_pay",is_pay);
        _ret.put("state",state);
        _ret.put("is_send",is_send);
        _ret.put("is_evaluate",is_evaluate);
        _ret.put("note",note);
        _ret.put("is_del",is_del);
        return _ret;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public Goods_order clone2(){
        try{
            return (Goods_order) this.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
