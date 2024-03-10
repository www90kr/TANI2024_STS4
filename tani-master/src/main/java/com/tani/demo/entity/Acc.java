package com.tani.demo.entity;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Acc {
	   private Integer code;
	   private String name;
	   private String mainImg; 
	   private String detailImg;
	   private Double starAvg;
	   private Integer price;
	   private String cateCode;
	   
}


