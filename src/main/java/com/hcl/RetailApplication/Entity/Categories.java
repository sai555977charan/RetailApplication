package com.hcl.RetailApplication.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="categories")
public class Categories {

	
		@Column(name="category_id")
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Id
	private int categoryId;
	
		@Column(name="category_name")
		private String categoryName;
	
		@Column(name="category_count")
		private int categoryCount;
		public void setCategoryCount(int categoryCount) {
			this.categoryCount = categoryCount;
		}
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
		public int getCategoryCount() {
			return categoryCount;
		}
		
}
