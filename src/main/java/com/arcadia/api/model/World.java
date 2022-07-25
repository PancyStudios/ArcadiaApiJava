package com.arcadia.api.model;

import org.springframework.data.annotation.Id;

public class World {
    
    @Id
    private Long id;
    private String owner_name;
    private CubePost cube_post;
    private Integer rental_cost;
    private String rental_name;
    private String last_rental_charge;
    private String last_update;

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOwnerName() {
		return owner_name;
	}

	public void setOwnerName(String nombre) {
		this.owner_name = nombre;
	}

	public CubePost getCubePost() {
		return cube_post;
	}

	public void setCubePost(CubePost newCubePost) {
		this.cube_post = newCubePost;
	}

	public Integer getRentalCost() {
		return rental_cost;
	}

	public void setRentalCost(Integer newCost) {
		this.rental_cost = newCost;
	}

	public String getRentalName() {
		return rental_name;
	}

	public void setRentalName(String newName) {
		this.rental_name = newName;
	}

    public String getLastRentalCharge() {
        return last_rental_charge;
    }

    public void setLastRentalCharge(String newCharge) {
        this.last_rental_charge = newCharge;
    }

	public String getLastUpdate() {
		return last_update;
	}

	public void setLastUpdate(String newUpdate) {
		this.last_update = newUpdate;
	}
	
}

class CubePost {
    private String min;
    private String max;
    private String center;

    public String getCenter() {
        return center;
    }

    public String getMax() {
        return max;
    }

    public String getMin() {
        return min;
    }

}
