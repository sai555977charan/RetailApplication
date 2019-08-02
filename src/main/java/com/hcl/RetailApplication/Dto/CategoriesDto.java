package com.hcl.RetailApplication.Dto;

import javax.persistence.Column;
import javax.persistence.Id;

public class CategoriesDto {
	private int categoryId;

	private String categoryName;

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryCount() {
		return categoryCount;
	}

	public void setCategoryCount(String categoryCount) {
		this.categoryCount = categoryCount;
	}

	private String categoryCount;
}
