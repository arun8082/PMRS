package com.pmrs.iservice;

import java.util.List;

public interface IGenericService<E, K> {
	//return id formal args entity
	public E add(E entity);

	//return id formal args entity
	public boolean update(E entity);

	public E get(K key);

	public List<E> listAll();

	public boolean remove(K key);
}
