package jaz1servletdemo.repo;

import java.util.*;

public interface IRepository<TEntity> {

	public void save(TEntity entity);
	public void delete(TEntity entity);
	public void update(TEntity entity);
	
	public TEntity get(int id);
	public List<TEntity> getAll();
	
}