package DaoImp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import DButility.DataConnect;
import Dao.FeedBackDao;
import Dao.FeedBackDao;
import pojo.FeedBack;

public class FeedbackDaoImp implements FeedBackDao{
   
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	int row;

	@Override
	public boolean addFeedback(FeedBack fd) {
		try {
			con=DataConnect.getConnection();
			ps=con.prepareStatement("insert into Feedback(Name,EmailId,Review,Ranking,Suggestion)values(?,?,?,?,?)");
			ps.setString(1,fd.getName() );
			ps.setString(2,fd.getEmailId());
			ps.setString(3,fd.getReview());
			ps.setInt(4, fd.getRank());
			ps.setString(5,fd.getSuggestion());
			row=ps.executeUpdate();
			if(row>0) {
				return true;
			}else {
				return false;
			}
		}catch (Exception e) {
			e.printStackTrace();		}
		return false;
	}

	@Override
	public List<FeedBack> getAllFeedback() {
		List<FeedBack>l=new ArrayList<>();
		try {
			con=DataConnect.getConnection();
			ps=con.prepareStatement("select * from Feedback");
			rs=ps.executeQuery();
			while(rs.next()) {
				FeedBack f=new FeedBack();
				f.setName(rs.getString("Name"));
				f.setEmailId(rs.getString("EmailId"));
				f.setReview(rs.getString("Review"));
				f.setRank(rs.getInt("Ranking"));
				f.setSuggestion(rs.getString("Suggestion"));
				
				l.add(f);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return l;
	}

}
