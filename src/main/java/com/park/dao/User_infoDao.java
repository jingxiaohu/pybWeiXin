package com.park.dao;

import org.slf4j.Logger;import org.slf4j.LoggerFactory;
import java.util.*;

import java.sql.*;
import org.springframework.jdbc.core.*;
import org.springframework.jdbc.core.namedparam.*;
import org.springframework.jdbc.support.*;
import com.park.bean.*;
import org.springframework.stereotype.Repository;
import com.highbeauty.text.EasyTemplate;

//user_info

@Repository("user_infoDao")
public class User_infoDao extends BaseDao{

    Logger log = LoggerFactory.getLogger(User_infoDao.class);



    private  String TABLE = "user_info";

    private  String TABLENAME = "user_info";

    public  String getTABLE(){
        return  TABLE;
    }

    public  String getTABLENAME(){
        return  TABLENAME;
    }

    public  String TABLEMM(){
        return TABLE + sdfMm.format(new java.util.Date());
    }

    public  String TABLEDD(){
        return TABLE + sdfDd.format(new java.util.Date());
    }


    private  String[] carrays ={"ui_id","avatar","nickname","weixin_no","weixin_id","vc","score","level","recommend_num","is_partner","ctime","utime","is_forbidden","note"};
    private  String coulmns ="ui_id,avatar,nickname,weixin_no,weixin_id,vc,score,level,recommend_num,is_partner,ctime,utime,is_forbidden,note";
    private  String coulmns2 ="avatar,nickname,weixin_no,weixin_id,vc,score,level,recommend_num,is_partner,ctime,utime,is_forbidden,note";

    public  String[] getCarrays(){
        return  carrays;
    }

    public  String getCoulmns(){
        return  coulmns;
    }

    public  String getCoulmns2(){
        return  coulmns2;
    }

    //添加数据
    public int insert(User_info bean) throws SQLException{
        return insert(bean, TABLENAME);
    }

    //添加数据
    public int insert(User_info bean, String TABLENAME2) throws SQLException{
        String sql;
        try{
            sql = "INSERT INTO "+TABLENAME2+" (avatar,nickname,weixin_no,weixin_id,vc,score,level,recommend_num,is_partner,ctime,utime,is_forbidden,note) VALUES (:avatar,:nickname,:weixin_no,:weixin_id,:vc,:score,:level,:recommend_num,:is_partner,:ctime,:utime,:is_forbidden,:note)";
            SqlParameterSource ps = new BeanPropertySqlParameterSource(bean);
            KeyHolder keyholder = new GeneratedKeyHolder();
            _np.update(sql, ps, keyholder);
            return keyholder.getKey().intValue();
        }catch(Exception e){
            //createTable(TABLENAME2);
            log.error("insert", e);
            throw new SQLException("insert is error", e);
        }
    }

    //添加数据
    public int insert_primarykey(User_info bean) throws SQLException{
        return insert_primarykey(bean, TABLENAME);
    }

    //添加数据
    public int insert_primarykey(User_info bean, String TABLENAME2) throws SQLException{
        String sql;
        try{
            sql = "INSERT INTO "+TABLENAME2+" (ui_id,avatar,nickname,weixin_no,weixin_id,vc,score,level,recommend_num,is_partner,ctime,utime,is_forbidden,note) VALUES (:ui_id,:avatar,:nickname,:weixin_no,:weixin_id,:vc,:score,:level,:recommend_num,:is_partner,:ctime,:utime,:is_forbidden,:note)";
            SqlParameterSource ps = new BeanPropertySqlParameterSource(bean);
            return _np.update(sql, ps);
        }catch(Exception e){
            //createTable(TABLENAME2);
            log.error("insert_primarykey", e);
            throw new SQLException("insert2 is error", e);
        }
    }

    //批量添加数据
    public int[] insert(List<User_info> beans) throws SQLException{
        return insert(beans, TABLENAME);
    }

    //批量添加数据
    public int[] insert(final List<User_info> beans, String TABLENAME2) throws SQLException{
        String sql;
        try{
            sql = "INSERT INTO "+TABLENAME2+" (avatar,nickname,weixin_no,weixin_id,vc,score,level,recommend_num,is_partner,ctime,utime,is_forbidden,note) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            return _np.getJdbcOperations().batchUpdate(sql, new BatchPreparedStatementSetter() {
                //@Override
                public int getBatchSize() {
                    return beans.size();
                }
                //@Override
                public void setValues(PreparedStatement ps, int i) throws SQLException {
                    User_info bean = beans.get(i);
                    ps.setString(1, bean.avatar);
                    ps.setString(2, bean.nickname);
                    ps.setString(3, bean.weixin_no);
                    ps.setString(4, bean.weixin_id);
                    ps.setInt(5, bean.vc);
                    ps.setInt(6, bean.score);
                    ps.setInt(7, bean.level);
                    ps.setInt(8, bean.recommend_num);
                    ps.setInt(9, bean.is_partner);
                    ps.setTimestamp(10, new Timestamp(bean.ctime.getTime()));
                    ps.setTimestamp(11, new Timestamp(bean.utime.getTime()));
                    ps.setInt(12, bean.is_forbidden);
                    ps.setBytes(13, bean.note);
                }
            });
        }catch(Exception e){
            //createTable(TABLENAME2);
            log.error("int[] insert", e);
            throw new SQLException("insert is error", e);
        }
    }

    //查询所有数据
    public List<User_info> selectAll() {
        return selectAll(TABLENAME);
    }

    //查询所有数据
    public List<User_info> selectAll(String TABLENAME2) {
        String sql;
        try{
            sql = "SELECT ui_id,avatar,nickname,weixin_no,weixin_id,vc,score,level,recommend_num,is_partner,ctime,utime,is_forbidden,note FROM "+TABLENAME2+" ORDER BY ui_id";
            return _np.getJdbcOperations().query(sql, new BeanPropertyRowMapper<User_info>(User_info.class));
        }catch(Exception e){
            //createTable(TABLENAME2);
            log.error("selectAll", e);
            return new ArrayList<User_info>();
        }
    }

    //查询最新数据
    public List<User_info> selectLast(int num) {
        return selectLast(num, TABLENAME);
    }

    //查询所有数据
    public List<User_info> selectLast(int num ,String TABLENAME2) {
        String sql;
        try{
            sql = "SELECT ui_id,avatar,nickname,weixin_no,weixin_id,vc,score,level,recommend_num,is_partner,ctime,utime,is_forbidden,note FROM "+TABLENAME2+" ORDER BY ui_id DESC LIMIT "+num+"" ;
            return _np.getJdbcOperations().query(sql, new BeanPropertyRowMapper<User_info>(User_info.class));
        }catch(Exception e){
            //createTable(TABLENAME2);
            log.error("selectLast", e);
            return new ArrayList<User_info>();
        }
    }

    //根据主键查询
    public List<User_info> selectGtKey(long ui_id) {
        return selectGtKey(ui_id, TABLENAME);
    }

    //根据主键查询
    public List<User_info> selectGtKey(long ui_id, String TABLENAME2) {
        String sql;
        try{
            sql="SELECT ui_id,avatar,nickname,weixin_no,weixin_id,vc,score,level,recommend_num,is_partner,ctime,utime,is_forbidden,note FROM "+TABLENAME2+" WHERE ui_id>:ui_id";
            Map<String,Object> param = new HashMap<String,Object>();
            param.put("ui_id", ui_id);
            return _np.query(sql, param, new BeanPropertyRowMapper<User_info>(User_info.class));
        }catch(Exception e){
            //createTable(TABLENAME2);
            log.error("selectGtKey", e);
            return new ArrayList<User_info>();
        }
    }

    //根据主键查询
    public User_info selectByKey(long ui_id) {
        return selectByKey(ui_id, TABLENAME);
    }

    //根据主键查询
    public User_info selectByKey(long ui_id, String TABLENAME2) {
        String sql;
        try{
            sql="SELECT ui_id,avatar,nickname,weixin_no,weixin_id,vc,score,level,recommend_num,is_partner,ctime,utime,is_forbidden,note FROM "+TABLENAME2+" WHERE ui_id=:ui_id";
            Map<String,Object> param = new HashMap<String,Object>();
            param.put("ui_id", ui_id);
            List<User_info> list =  _np.query(sql, param, new BeanPropertyRowMapper<User_info>(User_info.class));
            return (list == null || list.size() == 0) ? null : list.get(0);
        }catch(Exception e){
            //createTable(TABLENAME2);
            log.error("selectByKey ui_id="+ui_id,e);
            return null;
        }
    }

    //所有数据总数
    public int count() {
        return count(TABLENAME);
    }

    //所有数据总数
    public int count(String TABLENAME2) {
        String sql;
        try{
            sql="SELECT COUNT(*) FROM "+TABLENAME2+"";
            return _np.getJdbcOperations().queryForObject(sql,Integer.class);
        }catch(Exception e){
            //createTable(TABLENAME2);
            log.error("count",e);
            return 0;
        }
    }

    //分页查询
    public List<User_info> selectByPage(int begin, int num) {
        return selectByPage(begin, num, TABLENAME);
    }

    //分页查询
    public List<User_info> selectByPage(int begin, int num, String TABLENAME2) {
        try{
            String sql;
            sql = "SELECT ui_id,avatar,nickname,weixin_no,weixin_id,vc,score,level,recommend_num,is_partner,ctime,utime,is_forbidden,note FROM "+TABLENAME2+" LIMIT "+begin+", "+num+"";
            return _np.getJdbcOperations().query(sql,new BeanPropertyRowMapper<User_info>(User_info.class));
        }catch(Exception e){
            //createTable(TABLENAME2);
            log.error("selectByPage",e);
            return new ArrayList<User_info>();
        }
    }

    //修改数据
    public int updateByKey(User_info bean) {
        return updateByKey(bean, TABLENAME);
    }

    //修改数据
    public int updateByKey(User_info bean, String TABLENAME2) {
        try{
            String sql;
            sql = "UPDATE "+TABLENAME2+" SET avatar=:avatar,nickname=:nickname,weixin_no=:weixin_no,weixin_id=:weixin_id,vc=:vc,score=:score,level=:level,recommend_num=:recommend_num,is_partner=:is_partner,ctime=:ctime,utime=:utime,is_forbidden=:is_forbidden,note=:note WHERE ui_id=:ui_id";
            SqlParameterSource ps = new BeanPropertySqlParameterSource(bean);
            return _np.update(sql, ps);
        }catch(Exception e){
            log.error("updateByKey",e);
            return 0;
        }
    }

    //批量修改数据
    public int[] updateByKey (final List<User_info> beans) throws SQLException{
        return updateByKey(beans, TABLENAME);
    }

    //批量修改数据
    public int[] updateByKey (final List<User_info> beans, String TABLENAME2) throws SQLException{
        try{
            String sql;
            sql = "UPDATE "+TABLENAME2+" SET avatar=?,nickname=?,weixin_no=?,weixin_id=?,vc=?,score=?,level=?,recommend_num=?,is_partner=?,ctime=?,utime=?,is_forbidden=?,note=? WHERE ui_id=?";
            return _np.getJdbcOperations().batchUpdate(sql, new BatchPreparedStatementSetter() {
                //@Override
                public int getBatchSize() {
                    return beans.size();
                }
                //@Override
                public void setValues(PreparedStatement ps, int i) throws SQLException {
                    User_info bean = beans.get(i);
                    ps.setString(1, bean.avatar);
                    ps.setString(2, bean.nickname);
                    ps.setString(3, bean.weixin_no);
                    ps.setString(4, bean.weixin_id);
                    ps.setInt(5, bean.vc);
                    ps.setInt(6, bean.score);
                    ps.setInt(7, bean.level);
                    ps.setInt(8, bean.recommend_num);
                    ps.setInt(9, bean.is_partner);
                    ps.setTimestamp(10, new Timestamp(bean.ctime.getTime()));
                    ps.setTimestamp(11, new Timestamp(bean.utime.getTime()));
                    ps.setInt(12, bean.is_forbidden);
                    ps.setBytes(13, bean.note);
                    ps.setLong(14, bean.ui_id);
                }
            });
        }catch(Exception e){
            log.error("int[] updateByKey",e);
            throw new SQLException("updateByKey is error", e);
        }
    }

    //删除单条数据
    public int deleteByKey(long ui_id) throws SQLException{
        return deleteByKey(ui_id, TABLENAME);
    }

    //删除单条数据
    public int deleteByKey(long ui_id, String TABLENAME2) throws SQLException{
        String sql;
        try{
            sql = "DELETE FROM "+TABLENAME2+" WHERE ui_id=:ui_id";
            Map<String,Object> param = new HashMap<String,Object>();
            param.put("ui_id", ui_id);
            return _np.update(sql, param);
        }catch(Exception e){
            log.error("deleteByKey", e);
            throw new SQLException("deleteByKey is error", e);
        }
    }

    //批量删除数据
    public int[] deleteByKey(long[] keys) throws SQLException{
        return deleteByKey(keys, TABLENAME);
    }

    //批量删除数据
    public int[] deleteByKey(final long[] keys, String TABLENAME2) throws SQLException{
        String sql;
        try{
            sql = "DELETE FROM "+TABLENAME2+" WHERE ui_id=?";
            return _np.getJdbcOperations().batchUpdate(sql, new BatchPreparedStatementSetter() {
                //@Override
                public int getBatchSize() {
                    return keys.length;
                }
                //@Override
                public void setValues(PreparedStatement ps, int i) throws SQLException {
                    ps.setLong(1 , keys[i]);
                }
            });
        }catch(Exception e){
            log.error("int[] deleteByKey", e);
            throw new SQLException("deleteByKey is error", e);
        }
    }

    //创建表
    public void createTable(String TABLENAME2) throws SQLException{
        try{
            String sql;
            sql = "CREATE TABLE IF NOT EXISTS `${TABLENAME}` (" +
                 "	`ui_id`  BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '//bigint(20)    用户主键ID'," +
                 "	`avatar`  VARCHAR(150) COMMENT '//varchar(150)    用户头像'," +
                 "	`nickname`  VARCHAR(80) COMMENT '//varchar(80)    用户昵称'," +
                 "	`weixin_no`  VARCHAR(80) COMMENT '//varchar(80)    用户微信号'," +
                 "	`weixin_id`  VARCHAR(80) COMMENT '//varchar(80)    用户微信ID'," +
                 "	`vc`  INT(11) COMMENT '//int(11)    余额单位分'," +
                 "	`score`  INT(11) COMMENT '//int(11)    积分'," +
                 "	`level`  INT(11) COMMENT '//int(11)    用户等级'," +
                 "	`recommend_num`  INT(11) COMMENT '//int(11)    用户推荐人数'," +
                 "	`is_partner`  INT(11) COMMENT '//int(11)    是否是合伙人0：不是1：是'," +
                 "	`ctime`  TIMESTAMP COMMENT '//timestamp    创建时间'," +
                 "	`utime`  TIMESTAMP COMMENT '//timestamp    修改时间'," +
                 "	`is_forbidden`  INT(11) COMMENT '//int(11)    是否禁用0：不1：禁用'," +
                 "	`note`  VARBINARY(60) COMMENT '//varbinary(60)    备注'," +
                 "	PRIMARY KEY (`ui_id`)" +
                 ") ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 AUTO_INCREMENT=1 ;";
            Map<String,String> params = new HashMap<String,String>();
            params.put("TABLENAME", TABLENAME2);
            sql  = EasyTemplate.make(sql, params);
            _np.getJdbcOperations().execute(sql);
        }catch(Exception e){
            log.error("createTable",e);
            throw new SQLException("createTable is error", e);
        }
    }

    //清空表
    public void truncate() throws SQLException{
        truncate(TABLENAME);
    }

    //清空表
    public void truncate(String TABLENAME2) throws SQLException{
        try{
            String sql;
            sql="TRUNCATE TABLE "+TABLENAME2+"";
            _np.getJdbcOperations().execute(sql);
        }catch(Exception e){
            log.error("truncate",e);
            throw new SQLException("truncate is error", e);
        }
    }

    //修复表
    public void repair(){
        repair(TABLENAME);
    }

    //修复表
    public void repair(String TABLENAME2){
        try{
            String sql;
            sql="REPAIR TABLE "+TABLENAME2+"";
            _np.getJdbcOperations().execute(sql);
        }catch(Exception e){
            log.error("repair",e);
        }
    }

    //优化表
    public void optimize(){
        optimize(TABLENAME);
    }

    //优化表
    public void optimize(String TABLENAME2){
        try{
            String sql;
            sql="OPTIMIZE TABLE "+TABLENAME2+"";
            _np.getJdbcOperations().execute(sql);
        }catch(Exception e){
            log.error("optimize",e);
        }
    }

    //执行sql
    public void execute(String sql) throws SQLException{
        try{
            _np.getJdbcOperations().execute(sql);
        }catch(Exception e){
            log.error("execute",e);
            throw new SQLException("execute is error", e);
        }
    }

}
