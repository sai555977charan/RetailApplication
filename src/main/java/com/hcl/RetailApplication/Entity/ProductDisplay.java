package com.hcl.RetailApplication.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="productdisplay")
public class ProductDisplay {
	
	@Column(name="category_id")
	private int categoryId;
	@Column(name="product_id")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int productId;
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	@Column(name="productName")
	private String productName;

}
