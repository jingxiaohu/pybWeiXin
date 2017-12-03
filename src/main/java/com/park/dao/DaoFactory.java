package com.park.dao;


import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;

//DAO Factory

@Repository("daoFactory")
public class DaoFactory{

@Autowired
protected User_infoDao user_infoDao;
@Autowired
protected After_saleDao after_saleDao;
@Autowired
protected EvaluateDao evaluateDao;
@Autowired
protected GoodsDao goodsDao;
@Autowired
protected Goods_detailsDao goods_detailsDao;
@Autowired
protected Goods_orderDao goods_orderDao;
@Autowired
protected Goods_typeDao goods_typeDao;
@Autowired
protected User_addressDao user_addressDao;
@Autowired
protected Request_params_logDao request_params_logDao;
@Autowired
protected China_areaDao china_areaDao;
@Autowired
protected Apply_cashDao apply_cashDao;
@Autowired
protected Recommend_userDao recommend_userDao;
@Autowired
protected Recommend_earningsDao recommend_earningsDao;

/*******************************下面是GET方法**************************************/
public User_infoDao getUser_infoDao() {
	return user_infoDao;
}
public After_saleDao getAfter_saleDao() {
	return after_saleDao;
}
public EvaluateDao getEvaluateDao() {
	return evaluateDao;
}
public GoodsDao getGoodsDao() {
	return goodsDao;
}
public Goods_detailsDao getGoods_detailsDao() {
	return goods_detailsDao;
}
public Goods_orderDao getGoods_orderDao() {
	return goods_orderDao;
}
public Goods_typeDao getGoods_typeDao() {
	return goods_typeDao;
}
public User_addressDao getUser_addressDao() {
	return user_addressDao;
}
public Request_params_logDao getRequest_params_logDao() {
	return request_params_logDao;
}
public China_areaDao getChina_areaDao() {
	return china_areaDao;
}
public Apply_cashDao getApply_cashDao() {
	return apply_cashDao;
}
public Recommend_userDao getRecommend_userDao() {
	return recommend_userDao;
}
public Recommend_earningsDao getRecommend_earningsDao() {
	return recommend_earningsDao;
}


}
