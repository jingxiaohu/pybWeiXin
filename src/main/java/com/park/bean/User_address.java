package com.park.bean;

import java.io.*;
import java.util.*;

//user_address
@SuppressWarnings({"serial"})
public class User_address implements Cloneable , Serializable{

    //public static String[] carrays ={"ua_id","ui_id","name","telephone","area","address","ctime","note"};

    public long ua_id;//bigint(20)    主键ID
    public long ui_id;//bigint(20)    用户ID
    public String name="";//varchar(60)    收件人
    public String telephone="";//varchar(30)    联系电话
    public String area="";//varchar(80)    所在地区（四川省成都市龙泉驿区）
    public String address="";//varchar(200)    详细地址
    public java.util.Date ctime=new java.util.Date();//timestamp    创建时间
    public String note="";//varchar(60)    备注



    public long getUa_id(){
        return ua_id;
    }

    public void setUa_id(long value){
        this.ua_id= value;
    }

    public long getUi_id(){
        return ui_id;
    }

    public void setUi_id(long value){
        this.ui_id= value;
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

    public String getArea(){
        return area;
    }

    public void setArea(String value){
    	if(value == null){
           value = "";
        }
        this.area= value;
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

    public java.util.Date getCtime(){
        return ctime;
    }

    public void setCtime(java.util.Date value){
    	if(value == null){
           value = new java.util.Date();
        }
        this.ctime= value;
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



    public static User_address newUser_address(long ua_id, long ui_id, String name, String telephone, String area, String address, java.util.Date ctime, String note) {
        User_address ret = new User_address();
        ret.setUa_id(ua_id);
        ret.setUi_id(ui_id);
        ret.setName(name);
        ret.setTelephone(telephone);
        ret.setArea(area);
        ret.setAddress(address);
        ret.setCtime(ctime);
        ret.setNote(note);
        return ret;    
    }

    public void assignment(User_address user_address) {
        long ua_id = user_address.getUa_id();
        long ui_id = user_address.getUi_id();
        String name = user_address.getName();
        String telephone = user_address.getTelephone();
        String area = user_address.getArea();
        String address = user_address.getAddress();
        java.util.Date ctime = user_address.getCtime();
        String note = user_address.getNote();

        this.setUa_id(ua_id);
        this.setUi_id(ui_id);
        this.setName(name);
        this.setTelephone(telephone);
        this.setArea(area);
        this.setAddress(address);
        this.setCtime(ctime);
        this.setNote(note);

    }

    @SuppressWarnings("unused")
    public static void getUser_address(User_address user_address ){
        long ua_id = user_address.getUa_id();
        long ui_id = user_address.getUi_id();
        String name = user_address.getName();
        String telephone = user_address.getTelephone();
        String area = user_address.getArea();
        String address = user_address.getAddress();
        java.util.Date ctime = user_address.getCtime();
        String note = user_address.getNote();
    }

    public Map<String,Object> toMap(){
        return toEnMap(this);
    }

    public static Map<String,Object> toEnMap(User_address user_address){
        long ua_id = user_address.getUa_id();
        long ui_id = user_address.getUi_id();
        String name = user_address.getName();
        String telephone = user_address.getTelephone();
        String area = user_address.getArea();
        String address = user_address.getAddress();
        java.util.Date ctime = user_address.getCtime();
        String note = user_address.getNote();
    
        Map<String,Object>  _ret = new HashMap<String,Object>();
        _ret.put("ua_id",ua_id);
        _ret.put("ui_id",ui_id);
        _ret.put("name",name);
        _ret.put("telephone",telephone);
        _ret.put("area",area);
        _ret.put("address",address);
        _ret.put("ctime",ctime);
        _ret.put("note",note);
        return _ret;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public User_address clone2(){
        try{
            return (User_address) this.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
