/*package com.example.nagoyameshi.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.nagoyameshi.entity.Favorite;
import com.example.nagoyameshi.entity.Memberinfo;
import com.example.nagoyameshi.repository.FavoriteRepository;
import com.example.nagoyameshi.security.UserDetailsImpl;
import com.example.nagoyameshi.service.FavoriteService;

@Controller
public class FavoriteController {
	private final FavoriteRepository favoriteRepository;
	private final FavoriteService favoriteService;

	public FavoriteController(FavoriteRepository favoriteRepository, FavoriteService favoriteService) {
		this.favoriteRepository = favoriteRepository;
		this.favoriteService = favoriteService;
	}

	@GetMapping("/favorites")
	public String index(@AuthenticationPrincipal UserDetailsImpl userDetailsImpl, Model model,
			@PageableDefault(page = 0, size = 10, sort = "id", direction = Direction.ASC) Pageable pageable) {
		Memberinfo memberinfo = userDetailsImpl.getMemberinfo();
		Page<Favorite> favoritePage = favoriteRepository.findByUserId(memberinfo.getId(), pageable);
		model.addAttribute("favoritePage", favoritePage);
		return "favorites/index";
	}

	/* お気に入り追加機能 
	@PostMapping("/storeinfo/{id}/favorites/add")
	public String add(@PathVariable("id") Integer id,
			@AuthenticationPrincipal UserDetailsImpl userDetailsImpl, Model model) {
		Memberinfo user = userDetailsImpl.getMemberinfo();
		favoriteService.add(id, user.getId());
		return "redirect:/houses/" + id;
	}

	 お気に入り解除機能 
	@PostMapping("/storeinfo/{id}/favorites/delete")
	public String delete(@PathVariable("id") Integer id,
			@AuthenticationPrincipal UserDetailsImpl userDetailsImpl, Model model) {
		Memberinfo memberinfo = userDetailsImpl.getMemberinfo();
		favoriteService.delete(id, memberinfo.getId());
		return "redirect:/houses/" + id;
	}
}*/