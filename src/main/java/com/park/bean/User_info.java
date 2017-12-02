package com.park.bean;

import java.io.*;
import java.util.*;

//user_info
@SuppressWarnings({"serial"})
public class User_info implements Cloneable , Serializable{

    //public static String[] carrays ={"ui_id","avatar","nickname","weixin_no","weixin_id","vc","score","level","recommend_num","is_partner","ctime","utime","is_forbidden","note"};

    public long ui_id;//bigint(20)    用户主键ID
    public String avatar="";//varchar(150)    用户头像
    public String nickname="";//varchar(80)    用户昵称
    public String weixin_no="";//varchar(80)    用户微信号
    public String weixin_id="";//varchar(80)    用户微信ID
    public int vc;//int(11)    余额单位分
    public int score;//int(11)    积分
    public int level;//int(11)    用户等级
    public int recommend_num;//int(11)    用户推荐人数
    public int is_partner;//int(11)    是否是合伙人0：不是1：是
    public java.util.Date ctime=new java.util.Date();//timestamp    创建时间
    public java.util.Date utime=new java.util.Date();//timestamp    修改时间
    public int is_forbidden;//int(11)    是否禁用0：不1：禁用
    public byte[] note;//varbinary(60)    备注



    public long getUi_id(){
        return ui_id;
    }

    public void setUi_id(long value){
        this.ui_id= value;
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

    public String getNickname(){
        return nickname;
    }

    public void setNickname(String value){
    	if(value == null){
           value = "";
        }
        this.nickname= value;
    }

    public String getWeixin_no(){
        return weixin_no;
    }

    public void setWeixin_no(String value){
    	if(value == null){
           value = "";
        }
        this.weixin_no= value;
    }

    public String getWeixin_id(){
        return weixin_id;
    }

    public void setWeixin_id(String value){
    	if(value == null){
           value = "";
        }
        this.weixin_id= value;
    }

    public int getVc(){
        return vc;
    }

    public void setVc(int value){
        this.vc= value;
    }

    public int getScore(){
        return score;
    }

    public void setScore(int value){
        this.score= value;
    }

    public int getLevel(){
        return level;
    }

    public void setLevel(int value){
        this.level= value;
    }

    public int getRecommend_num(){
        return recommend_num;
    }

    public void setRecommend_num(int value){
        this.recommend_num= value;
    }

    public int getIs_partner(){
        return is_partner;
    }

    public void setIs_partner(int value){
        this.is_partner= value;
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

    public java.util.Date getUtime(){
        return utime;
    }

    public void setUtime(java.util.Date value){
    	if(value == null){
           value = new java.util.Date();
        }
        this.utime= value;
    }

    public int getIs_forbidden(){
        return is_forbidden;
    }

    public void setIs_forbidden(int value){
        this.is_forbidden= value;
    }

    public byte[] getNote(){
        return note;
    }

    public void setNote(byte[] value){
        this.note= value;
    }



    public static User_info newUser_info(long ui_id, String avatar, String nickname, String weixin_no, String weixin_id, int vc, int score, int level, int recommend_num, int is_partner, java.util.Date ctime, java.util.Date utime, int is_forbidden, byte[] note) {
        User_info ret = new User_info();
        ret.setUi_id(ui_id);
        ret.setAvatar(avatar);
        ret.setNickname(nickname);
        ret.setWeixin_no(weixin_no);
        ret.setWeixin_id(weixin_id);
        ret.setVc(vc);
        ret.setScore(score);
        ret.setLevel(level);
        ret.setRecommend_num(recommend_num);
        ret.setIs_partner(is_partner);
        ret.setCtime(ctime);
        ret.setUtime(utime);
        ret.setIs_forbidden(is_forbidden);
        ret.setNote(note);
        return ret;    
    }

    public void assignment(User_info user_info) {
        long ui_id = user_info.getUi_id();
        String avatar = user_info.getAvatar();
        String nickname = user_info.getNickname();
        String weixin_no = user_info.getWeixin_no();
        String weixin_id = user_info.getWeixin_id();
        int vc = user_info.getVc();
        int score = user_info.getScore();
        int level = user_info.getLevel();
        int recommend_num = user_info.getRecommend_num();
        int is_partner = user_info.getIs_partner();
        java.util.Date ctime = user_info.getCtime();
        java.util.Date utime = user_info.getUtime();
        int is_forbidden = user_info.getIs_forbidden();
        byte[] note = user_info.getNote();

        this.setUi_id(ui_id);
        this.setAvatar(avatar);
        this.setNickname(nickname);
        this.setWeixin_no(weixin_no);
        this.setWeixin_id(weixin_id);
        this.setVc(vc);
        this.setScore(score);
        this.setLevel(level);
        this.setRecommend_num(recommend_num);
        this.setIs_partner(is_partner);
        this.setCtime(ctime);
        this.setUtime(utime);
        this.setIs_forbidden(is_forbidden);
        this.setNote(note);

    }

    @SuppressWarnings("unused")
    public static void getUser_info(User_info user_info ){
        long ui_id = user_info.getUi_id();
        String avatar = user_info.getAvatar();
        String nickname = user_info.getNickname();
        String weixin_no = user_info.getWeixin_no();
        String weixin_id = user_info.getWeixin_id();
        int vc = user_info.getVc();
        int score = user_info.getScore();
        int level = user_info.getLevel();
        int recommend_num = user_info.getRecommend_num();
        int is_partner = user_info.getIs_partner();
        java.util.Date ctime = user_info.getCtime();
        java.util.Date utime = user_info.getUtime();
        int is_forbidden = user_info.getIs_forbidden();
        byte[] note = user_info.getNote();
    }

    public Map<String,Object> toMap(){
        return toEnMap(this);
    }

    public static Map<String,Object> toEnMap(User_info user_info){
        long ui_id = user_info.getUi_id();
        String avatar = user_info.getAvatar();
        String nickname = user_info.getNickname();
        String weixin_no = user_info.getWeixin_no();
        String weixin_id = user_info.getWeixin_id();
        int vc = user_info.getVc();
        int score = user_info.getScore();
        int level = user_info.getLevel();
        int recommend_num = user_info.getRecommend_num();
        int is_partner = user_info.getIs_partner();
        java.util.Date ctime = user_info.getCtime();
        java.util.Date utime = user_info.getUtime();
        int is_forbidden = user_info.getIs_forbidden();
        byte[] note = user_info.getNote();
    
        Map<String,Object>  _ret = new HashMap<String,Object>();
        _ret.put("ui_id",ui_id);
        _ret.put("avatar",avatar);
        _ret.put("nickname",nickname);
        _ret.put("weixin_no",weixin_no);
        _ret.put("weixin_id",weixin_id);
        _ret.put("vc",vc);
        _ret.put("score",score);
        _ret.put("level",level);
        _ret.put("recommend_num",recommend_num);
        _ret.put("is_partner",is_partner);
        _ret.put("ctime",ctime);
        _ret.put("utime",utime);
        _ret.put("is_forbidden",is_forbidden);
        _ret.put("note",note);
        return _ret;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public User_info clone2(){
        try{
            return (User_info) this.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
