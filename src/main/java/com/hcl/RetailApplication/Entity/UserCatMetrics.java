package com.hcl.RetailApplication.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usercatmetrics")
public class UserCatMetrics {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="metrics_id")
	private int metricsId;

	@Column(name="user_id")

	private int userId;

	@Column(name="cat_id")
	private int catId;

	@Column(name="cat_count")
	private int catCount;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public int getCatCount() {
		return catCount;
	}
	public void setCatCount(int catCount) {
		this.catCount = catCount;
	}

}
