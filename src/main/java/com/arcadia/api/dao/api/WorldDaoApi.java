package com.arcadia.api.dao.api;


import org.springframework.data.repository.CrudRepository;

import com.arcadia.api.model.World;

public interface WorldDaoApi extends CrudRepository<World, Long> {

}