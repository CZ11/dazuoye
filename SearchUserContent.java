package cn.edu.bjtu.weibo.service;

import java.util.ArrayList;
import java.util.List;

import cn.edu.bjtu.weibo.dao.WeiboDao;
import cn.edu.bjtu.weibo.model.BaseContentSR;

public class SearchUserContent implements SearchUserContentService {

	@Override
	public List<BaseContentSR> getSearchedUserWeiboList(String userId,
			String keyword, int pageIndex, int numberPerPage) {

		// 从数据库中调出该用户发表的所有微博
		WeiboDao weiboDao = new WeiboDao();
		List<BaseContentSR> myWeibo = weiboDao.queryWeiboList(userId);

		// 新建weiboList对象，用于存储含有搜索关键字的微博
		List<BaseContentSR> weiboList = new ArrayList<BaseContentSR>();

		for (int i = 0; i < myWeibo.size(); i++) {
			if (myWeibo.get(i).getBaseContent().getContent().contains(keyword)) {
				// 将微博内容含有关键字的微博存入weiboList对象
				weiboList.add(myWeibo.get(i));
			}
		}

		return weiboList;
	}
}
