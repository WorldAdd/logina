package lbf.mapper;



import java.util.List;

import lbf.bean.Feel;

public interface FeelMapper {
	//���˵˵
   Integer insertFeel(Feel feel);
   //��ѯ˵˵
   public List<Feel> selectFeel(Integer userid);
   //ɾ��˵˵
   public Integer deleteFeel(Integer fid);
}
