package Dao;

import java.util.List;

import pojo.FeedBack;

public interface FeedBackDao {
	boolean addFeedback(FeedBack fd);
	List<FeedBack>getAllFeedback();
}
