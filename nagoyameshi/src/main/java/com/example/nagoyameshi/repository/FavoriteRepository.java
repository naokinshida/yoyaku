package com.example.nagoyameshi.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.nagoyameshi.entity.Favorite;

public interface FavoriteRepository {

	Page<Favorite> findByUserId(Integer id, Pageable pageable);

	void save(Favorite favorite);

	List<Favorite> findByUserId(Integer houseId, Integer userId);

}
