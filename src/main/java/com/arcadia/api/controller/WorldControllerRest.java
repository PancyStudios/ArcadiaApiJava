package com.arcadia.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arcadia.api.model.World;
import com.arcadia.api.service.api.WorldServiceAPI;

@RestController
@RequestMapping(value = "/api/v1/worlds")
@CrossOrigin("*")
public class WorldControllerRest {

	@Autowired
	private WorldServiceAPI worldServiceAPI;

	@GetMapping(value = "/collections")
	public List<World> getAll() {
		return worldServiceAPI.getAll();
	}
	
	@GetMapping(value = "/find/{id}")
	public World find(@PathVariable Long id) {
		return worldServiceAPI.get(id);
	}

	@PostMapping(value = "/save")
	public ResponseEntity<World> save(@RequestBody @Validated World World) {
		World obj = worldServiceAPI.save(World);
		return new ResponseEntity<World>(obj, HttpStatus.OK);
	}

	@GetMapping(value = "/delete/{id}")
	public ResponseEntity<World> delete(@PathVariable Long id) {
		World World = worldServiceAPI.get(id);
		if (World != null) {
			worldServiceAPI.delete(id);
		} else {
			return new ResponseEntity<World>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<World>(World, HttpStatus.OK);
	}

}