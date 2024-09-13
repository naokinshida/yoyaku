package com.example.nagoyameshi.entity;

import java.time.LocalDateTime;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

@EntityScan
public class Favorite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String memberinfoId;
    private String itemId;
    private LocalDateTime createdAt;
	public void setMemberinfo(Memberinfo memberinfo) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	public void setStoreinfo(Storeinfo storeinfo) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

    // Getters and Setters
}