package com.jdc.mkt.dto;

public enum MaharboteSign {
	Binga("ဘဂ်"), Mayana("မရဏ"), Ahtun("အထွန်း"), Thike("သိုက်"), Yaza("ရာဇ"), Puti("ပုတိ"), Adipati("အဓိပတိ");
	private String myanmar;
	
	private MaharboteSign(String myanmar) {
		this.myanmar = myanmar;
	}
	
	public String getMyanmar(String font) {
		return font.equals("myan") ? myanmar :name();
	}
}
