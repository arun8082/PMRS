package com.pmrs.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.pmrs.idao.IGenericDAO;
import com.pmrs.iservice.IGenericService;

@Service
@Transactional
public abstract class GenericServiceImpl<E, K> implements IGenericService<E, K> {

	private IGenericDAO<E, K> genericDAO;

	public GenericServiceImpl() {
		System.out.println("GenericServiceImpl ctor");
	}

	public GenericServiceImpl(IGenericDAO<E, K> genericDAO) {
		this.genericDAO = genericDAO;
	}

	public E add(E entity) {
		return genericDAO.add(entity);
	}

	public boolean update(E entity) {
		try {
			genericDAO.update(entity);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public E get(K key) {
		return genericDAO.get(key);
	}

	public List<E> listAll() {
		return genericDAO.listAll();
	}

	public boolean remove(K key) {
		try {
			genericDAO.remove(key);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
