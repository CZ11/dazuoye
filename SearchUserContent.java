package cn.edu.bjtu.weibo.service;

import java.util.ArrayList;
import java.util.List;

import cn.edu.bjtu.weibo.dao.WeiboDao;
import cn.edu.bjtu.weibo.model.BaseContentSR;

public class SearchUserContent implements SearchUserContentService {

	@Override
	public List<BaseContentSR> getSearchedUserWeiboList(String userId,
			String keyword, int pageIndex, int numberPerPage) {

		// �����ݿ��е������û����������΢��
		WeiboDao weiboDao = new WeiboDao();
		List<BaseContentSR> myWeibo = weiboDao.queryWeiboList(userId);

		// �½�weiboList�������ڴ洢���������ؼ��ֵ�΢��
		List<BaseContentSR> weiboList = new ArrayList<BaseContentSR>();

		for (int i = 0; i < myWeibo.size(); i++) {
			if (myWeibo.get(i).getBaseContent().getContent().contains(keyword)) {
				// ��΢�����ݺ��йؼ��ֵ�΢������weiboList����
				weiboList.add(myWeibo.get(i));
			}
		}

		for (int j = 0; j < weiboList.size(); j++) {
			int date1 = Integer.parseInt(weiboList.get(j).getBaseContent()
					.getDate());
			int date2 = Integer.parseInt(weiboList.get(j + 1).getBaseContent()
					.getDate());

			// ������������
			if (date2 > date1) {
				BaseContentSR temp = weiboList.get(j);
				weiboList.remove(j);
				weiboList.add(j + 1, temp);
			}
		}

		return weiboList;
	}
}
