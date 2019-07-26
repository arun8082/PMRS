package com.pmrs.dao;

/**
 * @author ash
 * This is an abstract generic class that implements IGenericDAO interface.
 * This class is made to implement redundant CRUD functions of this project.
 * By defining this class as abstract, we prevent Spring from creating instance
 * of this class If not defined as abstract, getClass().getGenericSuperClass()
 * would return Object. There would be exception because Object class does not
 * have a constructor with parameters.
 */

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import com.pmrs.idao.IGenericDAO;

@SuppressWarnings("unchecked")
@Repository
public abstract class AbstractGenericDAOImpl<E, K extends Serializable> implements IGenericDAO<E, K> {

	@PersistenceContext
	private EntityManager entityManager;

	protected Class<? extends E> daoType;

	public AbstractGenericDAOImpl() {
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		daoType = (Class<? extends E>) pt.getActualTypeArguments()[0];
	}

	@Override
	public E add(E entity) {
		entityManager.persist(entity);
		return entity;
	}

	@Override
	public boolean update(E entity) {
		try {
			entityManager.merge(entity);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public E get(K key) {
		return entityManager.find(daoType, key);
	}

	public List<E> listAll() {
		return entityManager.createQuery("from " + daoType.getName()).getResultList();
	}

	public boolean remove(K key) {
		try {
			entityManager.remove(get(key));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
