package com.pmrs.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@SuppressWarnings("unchecked")
@Repository
@Transactional
public abstract class AbstractGenericDaoImpl<E, K extends Serializable> implements IGenericDAO<E, K> {

	@PersistenceContext
	private EntityManager entityManager;

	protected Class<? extends E> daoType;

	/**
	 * By defining this class as abstract, we prevent Spring from creating instance
	 * of this class If not defined as abstract, getClass().getGenericSuperClass()
	 * would return Object. There would be exception because Object class does not
	 * have a constructor with parameters.
	 */

	public AbstractGenericDaoImpl() {
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

	public E getEntity(K key) {
		return entityManager.find(daoType, key);
	}

	public List<E> listAll() {
		return entityManager.createQuery("from" + daoType).getResultList();
	}

	public boolean remove(E entity) {
		try {
			entityManager.remove(entity);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
