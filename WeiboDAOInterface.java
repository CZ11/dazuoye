package cn.edu.bjtu.weibo.dao;

import java.util.List;

import cn.edu.bjtu.weibo.model.BaseContentSR;

public interface WeiboDAOInterface {
	public String getOwner(String weiboId);

	public String getContent(String weiboId);

	public boolean updateContent(String weiboId, String content);

	public String getTime(String weiboId);

	public List<String> getWeiboPicurlOr(String weiboId);

	public List<String> getWeiboPicurlTh(String weiboId);

	public String getLikeNumber(String weiboId);

	public String getCommentNumber(String weiboId);

	public String getForwardNumber(String weiboId);

	public List<String> getLikeLIst(String weiboId);

	public List<String> getForwardList(String weiboId);

	public List<String> getCommentList(String weiboId);

	public List<BaseContentSR> queryWeiboList(String userId);
}
