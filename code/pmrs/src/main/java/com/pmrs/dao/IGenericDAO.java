package com.pmrs.dao;

import java.util.List;

public interface IGenericDAO<E, K> {

	public E add(E entity);

	public boolean update(E entity);

	public E getEntity(K key);

	public List<E> listAll();

	public boolean remove(E entity);

}
