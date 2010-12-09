package jaunty.rpm.service;

import jaunty.rpm.bean.Paper;

import java.math.BigDecimal;
import java.util.List;

public interface PaperManager {
	public void save(Paper paper);
	
	public List<Paper> getAll();
	
	public Paper getById(BigDecimal id);
	
	public void delete(Paper paper);
	
	public void modify(Paper paper);
}
