package lbf.mapper;



import java.util.List;

import lbf.bean.Feel;

public interface FeelMapper {
	//添加说说
   Integer insertFeel(Feel feel);
   //查询说说
   public List<Feel> selectFeel(Integer userid);
   //删除说说
   public Integer deleteFeel(Integer fid);
}
