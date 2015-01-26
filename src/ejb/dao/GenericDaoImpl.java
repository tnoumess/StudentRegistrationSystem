package ejb.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * @author root
 *
 * @param <T>
 */
public abstract class GenericDaoImpl<T extends Serializable> implements GenericDao<T> {
	
	private Class<T> type;	
	
	@SuppressWarnings("unchecked")
	public GenericDaoImpl() {
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		type = (Class<T>) pt.getActualTypeArguments()[0];
	}
	@Inject
	protected EntityManager em;
	
	public long count() {
		String entity = type.getSimpleName();
		final StringBuffer queryString = new StringBuffer(
				"select count(ent) from " + entity + " ent");
		final Query query = this.em.createQuery(queryString.toString());
		return (Long) query.getSingleResult();
	}

	
	public void create(final T t) {
		em.persist(t);
		
	}
	public void createS(final T t) {
		System.out.println(this.getClass());
		em.persist(t);
		
	}
	
	public void delete(final Object id) {
		em.remove(em.getReference(type, id));
	}

	
	public T find(final Object id) {
		return em.find(type, id);
	}

	
	public T update(final T t) {
				return em.merge(t);
	}

	@SuppressWarnings("unchecked")
	
	public List<T> getAll() {
		Query query = em.createQuery("from " + type.getName());
		return query.getResultList();
	}

	public EntityManager getEm() {
		return em;
	}


}
