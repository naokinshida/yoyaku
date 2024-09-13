/*package com.example.nagoyameshi.service;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.*;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.nagoyameshi.entity.Favorite;
import com.example.nagoyameshi.entity.Memberinfo;
import com.example.nagoyameshi.entity.Storeinfo;
import com.example.nagoyameshi.repository.FavoriteRepository;
import com.example.nagoyameshi.repository.MemberinfoRepository;
import com.example.nagoyameshi.repository.StoreinfoRepository;

@Service
public class FavoriteService {
	private final FavoriteRepository favoriteRepository;
	private final StoreinfoRepository storeinfoRepository;
	private final MemberinfoRepository memberinfoRepository;

	public FavoriteService(FavoriteRepository favoriteRepository, StoreinfoRepository storeinfoRepository,
			MemberinfoRepository memberinfoRepository, MemberinfoRepository memberinfoRepository2) {
		this.favoriteRepository = favoriteRepository;
		this.storeinfoRepository = storeinfoRepository;
		this.memberinfoRepository = memberinfoRepository2;
		
	}

	 お気に入り追加機能
	@Transactional
	public void add(Integer houseId, Integer userId) {
		Favorite favorite = new Favorite();
		Memberinfo memberinfo = memberinfoRepository.getReferenceById(userId);
		Storeinfo storeinfo = storeinfoRepository.getReferenceById(houseId);
		favorite.setMemberinfo(memberinfo);
		favorite.setStoreinfo(storeinfo);
		favoriteRepository.save(favorite);
	}

	お気に入り削除機能
	@Transactional
	public void delete(Integer houseId, Integer userId) {
		List<Favorite> favorites = favoriteRepository.findByUserId(houseId, userId);
		if (favorites != null && !favorites.isEmpty()) {
			favoriteRepository.delete(favorites.get(0));
		}
	}
}*/