package jaunty.rpm.service;

import jaunty.rpm.bean.Paper;

import java.util.List;

public interface PaperManager {
	public void save(Paper paper);
	
	public List<Paper> getAll();
}
