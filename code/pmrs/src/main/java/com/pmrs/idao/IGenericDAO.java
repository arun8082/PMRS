package com.pmrs.idao;

import java.util.List;

public interface IGenericDAO<E, K> {

	public E add(E entity);

	public boolean update(E entity);

	public E get(K key);

	public List<E> listAll();

	public boolean remove(K key);

}
