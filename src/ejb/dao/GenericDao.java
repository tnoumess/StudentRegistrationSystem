/**
 * 
 */
package ejb.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

/**
 * @author root
 *
 */
public interface GenericDao<T extends Serializable> {
	
	public long count();

	public void create(T t);
	public void createS(T t);

	public void delete(Object id);

	public T find(Object id);

	public List<T> getAll();

	public T update(T t);
	
	public EntityManager getEm();	
	
	

}
