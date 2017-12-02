package com.park.bean;

import java.io.*;
import java.util.*;

//evaluate
@SuppressWarnings({"serial"})
public class Evaluate implements Cloneable , Serializable{

    //public static String[] carrays ={"e_id","order_id","g_id","ui_id","nickname","avatar","content","father_e_id","big_img_url","small_img_url","is_show","type","img_num","ctime","note","is_del"};

    public long e_id;//bigint(20)    主键ID
    public String order_id="";//varchar(80)    订单号
    public long g_id;//bigint(20)    商品主键ID
    public long ui_id;//bigint(20)    用户ID
    public String nickname="";//varchar(60)    用户昵称
    public String avatar="";//varchar(150)    用户头像
    public String content="";//varchar(255)    评价内容
    public long father_e_id;//bigint(20)    追加父评价ID
    public String big_img_url="";//varchar(500)    大图片URL逗号分割
    public String small_img_url="";//varchar(500)    小图片URL逗号分割
    public int is_show;//int(11)    是否显示0：显示1：不显示
    public int type;//int(11)    评价类型0：好评1：中评2：差评
    public int img_num;//int(11)    图片张数
    public java.util.Date ctime=new java.util.Date();//timestamp    创建时间
    public String note="";//varchar(60)    备注
    public int is_del;//int(11)    是否逻辑删除:0：不删除1：删除



    public long getE_id(){
        return e_id;
    }

    public void setE_id(long value){
        this.e_id= value;
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

    public String getNickname(){
        return nickname;
    }

    public void setNickname(String value){
    	if(value == null){
           value = "";
        }
        this.nickname= value;
    }

    public String getAvatar(){
        return avatar;
    }

    public void setAvatar(String value){
    	if(value == null){
           value = "";
        }
        this.avatar= value;
    }

    public String getContent(){
        return content;
    }

    public void setContent(String value){
    	if(value == null){
           value = "";
        }
        this.content= value;
    }

    public long getFather_e_id(){
        return father_e_id;
    }

    public void setFather_e_id(long value){
        this.father_e_id= value;
    }

    public String getBig_img_url(){
        return big_img_url;
    }

    public void setBig_img_url(String value){
    	if(value == null){
           value = "";
        }
        this.big_img_url= value;
    }

    public String getSmall_img_url(){
        return small_img_url;
    }

    public void setSmall_img_url(String value){
    	if(value == null){
           value = "";
        }
        this.small_img_url= value;
    }

    public int getIs_show(){
        return is_show;
    }

    public void setIs_show(int value){
        this.is_show= value;
    }

    public int getType(){
        return type;
    }

    public void setType(int value){
        this.type= value;
    }

    public int getImg_num(){
        return img_num;
    }

    public void setImg_num(int value){
        this.img_num= value;
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

    public int getIs_del(){
        return is_del;
    }

    public void setIs_del(int value){
        this.is_del= value;
    }



    public static Evaluate newEvaluate(long e_id, String order_id, long g_id, long ui_id, String nickname, String avatar, String content, long father_e_id, String big_img_url, String small_img_url, int is_show, int type, int img_num, java.util.Date ctime, String note, int is_del) {
        Evaluate ret = new Evaluate();
        ret.setE_id(e_id);
        ret.setOrder_id(order_id);
        ret.setG_id(g_id);
        ret.setUi_id(ui_id);
        ret.setNickname(nickname);
        ret.setAvatar(avatar);
        ret.setContent(content);
        ret.setFather_e_id(father_e_id);
        ret.setBig_img_url(big_img_url);
        ret.setSmall_img_url(small_img_url);
        ret.setIs_show(is_show);
        ret.setType(type);
        ret.setImg_num(img_num);
        ret.setCtime(ctime);
        ret.setNote(note);
        ret.setIs_del(is_del);
        return ret;    
    }

    public void assignment(Evaluate evaluate) {
        long e_id = evaluate.getE_id();
        String order_id = evaluate.getOrder_id();
        long g_id = evaluate.getG_id();
        long ui_id = evaluate.getUi_id();
        String nickname = evaluate.getNickname();
        String avatar = evaluate.getAvatar();
        String content = evaluate.getContent();
        long father_e_id = evaluate.getFather_e_id();
        String big_img_url = evaluate.getBig_img_url();
        String small_img_url = evaluate.getSmall_img_url();
        int is_show = evaluate.getIs_show();
        int type = evaluate.getType();
        int img_num = evaluate.getImg_num();
        java.util.Date ctime = evaluate.getCtime();
        String note = evaluate.getNote();
        int is_del = evaluate.getIs_del();

        this.setE_id(e_id);
        this.setOrder_id(order_id);
        this.setG_id(g_id);
        this.setUi_id(ui_id);
        this.setNickname(nickname);
        this.setAvatar(avatar);
        this.setContent(content);
        this.setFather_e_id(father_e_id);
        this.setBig_img_url(big_img_url);
        this.setSmall_img_url(small_img_url);
        this.setIs_show(is_show);
        this.setType(type);
        this.setImg_num(img_num);
        this.setCtime(ctime);
        this.setNote(note);
        this.setIs_del(is_del);

    }

    @SuppressWarnings("unused")
    public static void getEvaluate(Evaluate evaluate ){
        long e_id = evaluate.getE_id();
        String order_id = evaluate.getOrder_id();
        long g_id = evaluate.getG_id();
        long ui_id = evaluate.getUi_id();
        String nickname = evaluate.getNickname();
        String avatar = evaluate.getAvatar();
        String content = evaluate.getContent();
        long father_e_id = evaluate.getFather_e_id();
        String big_img_url = evaluate.getBig_img_url();
        String small_img_url = evaluate.getSmall_img_url();
        int is_show = evaluate.getIs_show();
        int type = evaluate.getType();
        int img_num = evaluate.getImg_num();
        java.util.Date ctime = evaluate.getCtime();
        String note = evaluate.getNote();
        int is_del = evaluate.getIs_del();
    }

    public Map<String,Object> toMap(){
        return toEnMap(this);
    }

    public static Map<String,Object> toEnMap(Evaluate evaluate){
        long e_id = evaluate.getE_id();
        String order_id = evaluate.getOrder_id();
        long g_id = evaluate.getG_id();
        long ui_id = evaluate.getUi_id();
        String nickname = evaluate.getNickname();
        String avatar = evaluate.getAvatar();
        String content = evaluate.getContent();
        long father_e_id = evaluate.getFather_e_id();
        String big_img_url = evaluate.getBig_img_url();
        String small_img_url = evaluate.getSmall_img_url();
        int is_show = evaluate.getIs_show();
        int type = evaluate.getType();
        int img_num = evaluate.getImg_num();
        java.util.Date ctime = evaluate.getCtime();
        String note = evaluate.getNote();
        int is_del = evaluate.getIs_del();
    
        Map<String,Object>  _ret = new HashMap<String,Object>();
        _ret.put("e_id",e_id);
        _ret.put("order_id",order_id);
        _ret.put("g_id",g_id);
        _ret.put("ui_id",ui_id);
        _ret.put("nickname",nickname);
        _ret.put("avatar",avatar);
        _ret.put("content",content);
        _ret.put("father_e_id",father_e_id);
        _ret.put("big_img_url",big_img_url);
        _ret.put("small_img_url",small_img_url);
        _ret.put("is_show",is_show);
        _ret.put("type",type);
        _ret.put("img_num",img_num);
        _ret.put("ctime",ctime);
        _ret.put("note",note);
        _ret.put("is_del",is_del);
        return _ret;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public Evaluate clone2(){
        try{
            return (Evaluate) this.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
