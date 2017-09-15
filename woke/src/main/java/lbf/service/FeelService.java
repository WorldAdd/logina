package lbf.service;



import java.util.List;

import lbf.bean.Feel;
import lbf.bean.User;

public interface FeelService {
	public Integer insertFeel (Feel feel);
	public List<Feel> selectFeel(Integer userid);
	public Integer deleteFeel(Integer fid);
}
