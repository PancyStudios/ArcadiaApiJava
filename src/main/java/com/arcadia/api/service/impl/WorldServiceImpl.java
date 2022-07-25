package com.arcadia.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.arcadia.api.commons.GenericServiceImpl;
import com.arcadia.api.dao.api.WorldDaoApi;
import com.arcadia.api.model.World;
import com.arcadia.api.service.api.WorldServiceAPI;

@Service
public class WorldServiceImpl extends GenericServiceImpl<World, Long> implements WorldServiceAPI {

	@Autowired
	private WorldDaoApi worldDaoApi;
	
	@Override
	public CrudRepository<World, Long> getDao() {
		return worldDaoApi;
	}

}