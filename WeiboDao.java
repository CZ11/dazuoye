package cn.edu.bjtu.weibo.dao;

import java.util.ArrayList;
import java.util.List;

import cn.edu.bjtu.weibo.model.BaseContentSR;

public class WeiboDao implements WeiboDAOInterface {

	/**
	 * 根据用户ID，遍历出该用户所发表的所有微博
	 * 
	 * @param userId
	 * @return
	 */
	public List<BaseContentSR> queryWeiboList(String userId) {

		List<BaseContentSR> weiboList = new ArrayList<BaseContentSR>();
		/**
		 * 缺少数据库连接 此处应将数据库数据调出，存到weiboList中，传递给service
		 */
		return weiboList;
	}

	@Override
	public String getOwner(String weiboId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getContent(String weiboId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateContent(String weiboId, String content) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getTime(String weiboId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getWeiboPicurlOr(String weiboId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getWeiboPicurlTh(String weiboId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLikeNumber(String weiboId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCommentNumber(String weiboId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getForwardNumber(String weiboId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getLikeLIst(String weiboId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getForwardList(String weiboId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getCommentList(String weiboId) {
		// TODO Auto-generated method stub
		return null;
	}

}
