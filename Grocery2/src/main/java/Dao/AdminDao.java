package Dao;

public interface AdminDao {
	boolean adminLogin(String aEmailId,String aPassword);
	boolean adminChangePassword(String aEmailId,String aPassword);
	boolean userLogin(String cEmailId,String cPassword);
	boolean userChangePassword(String cEmailId,String cPassword);
	
}
