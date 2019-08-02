package com.hcl.RetailApplication.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="userprodmetrics")
public class UserProdMetrics {
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public int getProdCount() {
		return prodCount;
	}
	public void setProdCount(int prodCount) {
		this.prodCount = prodCount;
	}

	@Column(name="user_id")

	private int userId;
	@Column(name="prod_id")
	@Id
	private int prodId;
	@Column(name="prod_count")
	private int prodCount;

}
