package com.empresa.hangar.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.empresa.hangar.model.Hangar;
import com.empresa.hangar.repository.HangarRepository;

@Component
public class HangarDAOImp implements HangarDAO {
	
	@Autowired
	HangarRepository hangarRepository;

	@Override
	public List<Hangar> getHangars() {
		return hangarRepository.findAll();
	}
	
	@Override
	public List<Hangar> getHangarsStateTrue() {
		return hangarRepository.findByIsStateTrue();
	}
	
	@Override
	public Hangar getHangarById(Long hangarId) {
		return hangarRepository.getOne(hangarId);
	}
	
	public Hangar save(Hangar hangar) {
		return hangarRepository.save(hangar);
	}
	
	/*
	@Override
	public void addProductToHangar(Product product) {
		Hangar hangar = hangarRepository.getOne(product.getHangar().getId());
		hangarRepository.save(hangar);
	}
	*/
	
	@Override
	public Hangar getHangarById(long id) {
		return hangarRepository.findById(id).get();
	}
	
	@Override
	public Boolean existsById(long id) {
		return hangarRepository.existsById(id);
	}
	
	@Override
	public Boolean existsHangarByName(String name) {
		return hangarRepository.existsHangarByName(name);
	}

	@Override
	public Page<Hangar> getActiveHangarsPage(Pageable pageRequest) {
		return hangarRepository.findByIsStateTrue(pageRequest);
	}

	@Override
	public List<Hangar> getProductsMatchingSearch(String search) {
		return hangarRepository.findByIsStateTrueAndNameContaining(search);
	}

}