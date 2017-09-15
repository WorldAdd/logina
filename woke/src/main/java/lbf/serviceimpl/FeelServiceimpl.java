package lbf.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lbf.bean.Feel;
import lbf.mapper.FeelMapper;
import lbf.service.FeelService;

@Service
public class FeelServiceimpl implements FeelService{
	@Autowired
     private FeelMapper feelMapper;
	public FeelMapper getFeelMapper() {
		return feelMapper;
	}
	public void setFeelMapper(FeelMapper feelMapper) {
		this.feelMapper = feelMapper;
	}
	@Override
	public Integer insertFeel(Feel feel) {
		return feelMapper.insertFeel(feel);
	}
	@Override
	public Integer deleteFeel(Integer fid) {
		return feelMapper.deleteFeel(fid);
	}
	@Override
	public List<Feel> selectFeel(Integer userid) {
		return feelMapper.selectFeel(userid);
	}
     
}
