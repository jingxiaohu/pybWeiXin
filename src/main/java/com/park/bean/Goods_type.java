package com.park.bean;

import java.io.*;
import java.util.*;

//goods_type
@SuppressWarnings({"serial"})
public class Goods_type implements Cloneable , Serializable{

    //public static String[] carrays ={"gt_id","gt_name","gt_code","ctime","note"};

    public long gt_id;//bigint(20)    主键ID
    public String gt_name="";//varchar(60)    商品类型名称(例如：农产品)
    public String gt_code="";//varchar(30)    商品类型英文
    public java.util.Date ctime=new java.util.Date();//timestamp    创建时间
    public String note="";//varchar(60)    备注



    public long getGt_id(){
        return gt_id;
    }

    public void setGt_id(long value){
        this.gt_id= value;
    }

    public String getGt_name(){
        return gt_name;
    }

    public void setGt_name(String value){
    	if(value == null){
           value = "";
        }
        this.gt_name= value;
    }

    public String getGt_code(){
        return gt_code;
    }

    public void setGt_code(String value){
    	if(value == null){
           value = "";
        }
        this.gt_code= value;
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



    public static Goods_type newGoods_type(long gt_id, String gt_name, String gt_code, java.util.Date ctime, String note) {
        Goods_type ret = new Goods_type();
        ret.setGt_id(gt_id);
        ret.setGt_name(gt_name);
        ret.setGt_code(gt_code);
        ret.setCtime(ctime);
        ret.setNote(note);
        return ret;    
    }

    public void assignment(Goods_type goods_type) {
        long gt_id = goods_type.getGt_id();
        String gt_name = goods_type.getGt_name();
        String gt_code = goods_type.getGt_code();
        java.util.Date ctime = goods_type.getCtime();
        String note = goods_type.getNote();

        this.setGt_id(gt_id);
        this.setGt_name(gt_name);
        this.setGt_code(gt_code);
        this.setCtime(ctime);
        this.setNote(note);

    }

    @SuppressWarnings("unused")
    public static void getGoods_type(Goods_type goods_type ){
        long gt_id = goods_type.getGt_id();
        String gt_name = goods_type.getGt_name();
        String gt_code = goods_type.getGt_code();
        java.util.Date ctime = goods_type.getCtime();
        String note = goods_type.getNote();
    }

    public Map<String,Object> toMap(){
        return toEnMap(this);
    }

    public static Map<String,Object> toEnMap(Goods_type goods_type){
        long gt_id = goods_type.getGt_id();
        String gt_name = goods_type.getGt_name();
        String gt_code = goods_type.getGt_code();
        java.util.Date ctime = goods_type.getCtime();
        String note = goods_type.getNote();
    
        Map<String,Object>  _ret = new HashMap<String,Object>();
        _ret.put("gt_id",gt_id);
        _ret.put("gt_name",gt_name);
        _ret.put("gt_code",gt_code);
        _ret.put("ctime",ctime);
        _ret.put("note",note);
        return _ret;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public Goods_type clone2(){
        try{
            return (Goods_type) this.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
